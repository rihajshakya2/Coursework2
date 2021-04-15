package CourseWork3;

import java.awt.Color; 
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BookManageDash {
	public static void main(String[] args) {
        Dash log = new Dash();
    }
}
class Dash {
    Dash() {
        JFrame f=new JFrame("Dashboard");
        JButton btnAdd,btnView,btnViewS;
        
        JLabel lZean;    
        btnAdd = new JButton("Add books");
        f.add(btnAdd);
        btnAdd.setBounds(50,150,150,50); 
        btnAdd.setBackground(Color.green);   
        btnView = new JButton("View Available Books");
        f.add(btnView);
        btnView.setBounds(50,250,170,50); 
        btnView.setBackground(Color.yellow);
        
        btnViewS = new JButton("View Sold Books");
        f.add(btnViewS);
        btnViewS.setBounds(50,350,150,50); 
        btnViewS.setBackground(Color.cyan);
        
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new bookSt();
                f.dispose();
                
            }
        });
        btnView.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new View();
                f.dispose();
                
            }
        });
        
        btnViewS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new SoldBooks();
                f.dispose();
                
            }
        });
        ImageIcon background_image=new ImageIcon("C:\\Users\\Lenovo\\eclipse-workspace\\CourseWork2\\src\\CourseWork3\\homepage.jpg");
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(1500,800, Image.SCALE_SMOOTH);
		background_image=new ImageIcon(temp_img);
		JLabel background=new JLabel("", background_image,JLabel.CENTER);
		f.add(background);
		JLabel jreg=new JLabel("Dashboard");
		background.add(jreg);
		jreg.setBounds(50, 10, 1500, 70);
		jreg.setFont(new Font("Serif",Font.BOLD, 60));
		jreg.setForeground(Color.cyan);	
		background.setBounds(0, 0, 1500, 800);
    
        f.setLayout(null);
        f.setSize(1500,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);  
    }

}
