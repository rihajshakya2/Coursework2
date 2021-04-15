-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 14, 2021 at 06:31 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coursework2`
--

-- --------------------------------------------------------

--
-- Table structure for table `bookies`
--

CREATE TABLE `bookies` (
  `BookName` varchar(100) NOT NULL,
  `PublisherName` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Field` varchar(100) NOT NULL,
  `BookCode` int(11) NOT NULL,
  `Quantity` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bookies`
--

INSERT INTO `bookies` (`BookName`, `PublisherName`, `Date`, `Field`, `BookCode`, `Quantity`) VALUES
('Hey Jude', 'The Beatles', '1990', 'Rock and Roll', 5, 198),
('Patient', 'Peter Drury', '1990', 'Thriller and Romance', 6, 200);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `name` varchar(100) NOT NULL,
  `user` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `psw` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`name`, `user`, `email`, `psw`) VALUES
('rihaj', 'rihaj', 'rihaj', 'rihaj'),
('riu', 'riu', 'riu', 'riu'),
('asd', 'asd', 'asd', 'asd'),
('shakya', 'shakya', 'shakya', 'shakya'),
('Rihaj Shakya', 'rihajshakya', 'rihajshakya2@gmail.com', 'Thedevil@123');

-- --------------------------------------------------------

--
-- Table structure for table `sold`
--

CREATE TABLE `sold` (
  `BookName` varchar(100) NOT NULL,
  `PublisherName` varchar(100) NOT NULL,
  `Date` varchar(100) NOT NULL,
  `Field` varchar(100) NOT NULL,
  `BookCode` int(11) NOT NULL,
  `Quantity` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sold`
--

INSERT INTO `sold` (`BookName`, `PublisherName`, `Date`, `Field`, `BookCode`, `Quantity`) VALUES
('rihaj', 'rihaJ', 'ruihaj', 'thriller', 1, 2),
('the woods', 'woodburn', '2020', 'romance', 2, 1),
('Hey Jude', 'The Beatles', '1990', 'Rock and Roll', 3, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bookies`
--
ALTER TABLE `bookies`
  ADD PRIMARY KEY (`BookCode`);

--
-- Indexes for table `sold`
--
ALTER TABLE `sold`
  ADD PRIMARY KEY (`BookCode`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bookies`
--
ALTER TABLE `bookies`
  MODIFY `BookCode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `sold`
--
ALTER TABLE `sold`
  MODIFY `BookCode` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
