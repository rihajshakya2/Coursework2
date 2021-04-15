package CourseWork3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class Home {
	public static void main(String[] args) {
        Login log = new Login();
        
    }
}
class Login {
	ConnectionC db= new ConnectionC();
    Login() {
        JFrame f = new JFrame("Library");
        JLabel lUser, lpsw,lhead,lneed;
        JTextField tfUser;
        JPasswordField tfpsw;
        JButton btnLogin,btnSignUp;
        
        //user label
        lUser = new JLabel("Username");
        f.add(lUser);
        lUser.setBounds(50, 115, 100, 100);
             
        lpsw = new JLabel("Password");
        f.add(lpsw);
        lpsw.setBounds(50, 165, 100, 100);
           
        lneed = new JLabel("Don't Have An Account?");
        f.add(lneed);
        lneed.setBounds(50, 250, 150, 150);
         
        tfUser = new JTextField(30);
        f.add(tfUser);
        tfUser.setBounds(150, 150,200,30);
         
        tfpsw = new JPasswordField(30);
        f.add(tfpsw);
        tfpsw.setBounds(150, 200,200,30);
          
        btnLogin = new JButton("Login");
        f.add(btnLogin);
        btnLogin.setBounds(200,250,100,40);
        btnLogin.setBackground(Color.green);
        
        btnSignUp = new JButton("SignUp");
        f.add(btnSignUp);
        btnSignUp.setBounds(200,300,100,40);
        btnSignUp.setBackground(Color.cyan);
        
        
        btnLogin.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
//            	String query="Select Username from signup";
//            	String query1="Select Password from signup";
                String user = tfUser.getText();
                String psw = tfpsw.getText();
                int value=userLogin(user,psw);
         
					if (value==1) {
						new Dash();
						f.dispose();
					}else if (value==2){
						JOptionPane.showMessageDialog(f, "Password Not Matched ");
						
					}else {
						JOptionPane.showMessageDialog(f, "Username/Password Not Valid ");
					}
        
            }
            
        });
        
        btnSignUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reg();
                f.dispose();
                
            }
        });
        
        ImageIcon background_image=new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\CourseWork2\\src\\CourseWork3\\background2.jpg");	
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1500,800, Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("", background_image,JLabel.CENTER);
		f.add(background);
		
		JLabel jreg=new JLabel("Bookstore Login ");
		background.add(jreg);
		jreg.setBounds(50, 50, 1500, 70);
		jreg.setFont(new Font("Serif",Font.BOLD, 60));
		jreg.setForeground(Color.cyan);
		
		
		background.setBounds(0, 0, 1500, 800);
        f.setLayout(null);
        f.setSize(1500, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
    
    public int userLogin(String username, String psw) {
    	String query="Select * from signup where user='"+username+"'";
    	
        try {
			ResultSet result=  db.connection().executeQuery(query);
			if (result.next() && result.getString(4).equals(psw)) {
				return 1;
			}else if (!result.getString(4).equals(psw)){
				return 2;
				
			}	
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		return 0;
    	
    }

}
