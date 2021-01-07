-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 01, 2021 at 07:28 AM
-- Server version: 10.4.16-MariaDB
-- PHP Version: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fot_sys`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` varchar(10) NOT NULL,
  `admin_nic` char(10) NOT NULL,
  `admin_name` varchar(20) NOT NULL,
  `admin_dob` date DEFAULT NULL,
  `admin_gender` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_nic`, `admin_name`, `admin_dob`, `admin_gender`) VALUES
('10', '123456', 'ravindu', '1998-02-03', 'male'),
('123', '456', 'lki', '1999-06-10', 'male'),
('ad01', '123456', 'Bandara', '1990-02-23', 'Male'),
('ad02', '963852', 'perera', '1991-02-28', 'Male'),
('tg001', '123456', 'lakshitha', '1998-10-28', 'Male'),
('tg002', '123456', 'vaxin', '1998-10-25', 'Male'),
('tg003', '123456', 'maximo', '1998-10-05', 'male');

-- --------------------------------------------------------

--
-- Table structure for table `admin_course`
--

CREATE TABLE `admin_course` (
  `admin_id` varchar(10) DEFAULT NULL,
  `course_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_course`
--

INSERT INTO `admin_course` (`admin_id`, `course_id`) VALUES
('ad01', 'achi1'),
('ad01', 'cp1'),
('ad01', 'dbms1'),
('ad01', 'eng1'),
('ad02', 'lab1'),
('ad02', 'mis1'),
('ad02', 'sad1');

-- --------------------------------------------------------

--
-- Table structure for table `admin_notice`
--

CREATE TABLE `admin_notice` (
  `notice_id` int(5) NOT NULL,
  `notice_date` date NOT NULL,
  `notice` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin_notice`
--

INSERT INTO `admin_notice` (`notice_id`, `notice_date`, `notice`) VALUES
(1, '2020-12-01', 'fsdfs'),
(2, '2020-12-02', 'vdfvd'),
(3, '2020-12-08', 'jhbmjb');

-- --------------------------------------------------------

--
-- Table structure for table `attendence`
--

CREATE TABLE `attendence` (
  `std_id` varchar(10) DEFAULT NULL,
  `course_id` varchar(10) DEFAULT NULL,
  `Date` date DEFAULT NULL,
  `type` varchar(3) DEFAULT NULL,
  `att_status` varchar(3) DEFAULT NULL,
  `hours` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `attendence`
--

INSERT INTO `attendence` (`std_id`, `course_id`, `Date`, `type`, `att_status`, `hours`) VALUES
('tg001', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg002', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg003', 'mis1', '2019-12-16', 'T', 'M', 2),
('tg004', 'mis1', '2019-12-16', 'T', 'A', 0),
('tg005', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg006', 'mis1', '2019-12-16', 'T', 'A', 0),
('tg007', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg008', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg009', 'mis1', '2019-12-16', 'T', 'A', 0),
('tg010', 'mis1', '2019-12-16', 'T', 'P', 2),
('tg001', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg002', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg003', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg004', 'mis1', '2019-12-23', 'T', 'M', 2),
('tg005', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg006', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg007', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg008', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg009', 'mis1', '2019-12-23', 'T', 'A', 0),
('tg010', 'mis1', '2019-12-23', 'T', 'P', 2),
('tg001', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg002', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg003', 'mis1', '2019-12-30', 'T', 'A', 0),
('tg004', 'mis1', '2019-12-30', 'T', 'A', 0),
('tg005', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg006', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg007', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg008', 'mis1', '2019-12-30', 'T', 'M', 2),
('tg009', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg010', 'mis1', '2019-12-30', 'T', 'P', 2),
('tg001', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg002', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg003', 'dbms1', '2019-12-18', 'T', 'M', 2),
('tg004', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg005', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg006', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg007', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg008', 'dbms1', '2019-12-18', 'T', 'A', 0),
('tg009', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg010', 'dbms1', '2019-12-18', 'T', 'P', 2),
('tg001', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg002', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg003', 'dbms1', '2019-12-19', 'P', 'M', 3),
('tg004', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg005', 'dbms1', '2019-12-19', 'P', 'M', 3),
('tg006', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg007', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg008', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg009', 'dbms1', '2019-12-19', 'P', 'A', 0),
('tg010', 'dbms1', '2019-12-19', 'P', 'P', 3),
('tg001', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg002', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg003', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg004', 'dbms1', '2019-12-25', 'T', 'M', 2),
('tg005', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg006', 'dbms1', '2019-12-25', 'T', 'A', 0),
('tg007', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg008', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg009', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg010', 'dbms1', '2019-12-25', 'T', 'P', 2),
('tg001', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg002', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg003', 'dbms1', '2019-12-26', 'P', 'A', 0),
('tg004', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg005', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg006', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg007', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg008', 'dbms1', '2019-12-26', 'P', 'M', 3),
('tg009', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg010', 'dbms1', '2019-12-26', 'P', 'P', 3),
('tg001', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg002', 'dbms1', '2020-01-01', 'T', 'M', 2),
('tg003', 'dbms1', '2020-01-01', 'T', 'A', 0),
('tg004', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg005', 'dbms1', '2020-01-01', 'T', 'A', 0),
('tg006', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg007', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg008', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg009', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg010', 'dbms1', '2020-01-01', 'T', 'P', 2),
('tg001', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg002', 'dbms1', '2020-01-02', 'P', 'M', 3),
('tg003', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg004', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg005', 'dbms1', '2020-01-02', 'P', 'A', 0),
('tg006', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg007', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg008', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg009', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg010', 'dbms1', '2020-01-02', 'P', 'P', 3),
('tg001', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg002', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg003', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg004', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg005', 'sad1', '2019-12-19', 'T', 'M', 2),
('tg006', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg007', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg008', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg009', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg010', 'sad1', '2019-12-19', 'T', 'P', 2),
('tg001', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg002', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg003', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg004', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg005', 'sad1', '2019-12-20', 'P', 'M', 3),
('tg006', 'sad1', '2019-12-20', 'P', 'A', 0),
('tg007', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg008', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg009', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg010', 'sad1', '2019-12-20', 'P', 'P', 3),
('tg001', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg002', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg003', 'sad1', '2019-12-26', 'T', 'A', 0),
('tg004', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg005', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg006', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg007', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg008', 'sad1', '2019-12-26', 'T', 'A', 0),
('tg009', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg010', 'sad1', '2019-12-26', 'T', 'P', 2),
('tg001', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg002', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg003', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg004', 'sad1', '2019-12-27', 'P', 'A', 0),
('tg005', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg006', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg007', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg008', 'sad1', '2019-12-27', 'P', 'A', 0),
('tg009', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg010', 'sad1', '2019-12-27', 'P', 'P', 3),
('tg001', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg002', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg003', 'achi1', '2019-12-16', 'T', 'M', 2),
('tg004', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg005', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg006', 'achi1', '2019-12-16', 'T', 'A', 0),
('tg007', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg008', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg009', 'achi1', '2019-12-16', 'T', 'A', 2),
('tg010', 'achi1', '2019-12-16', 'T', 'P', 2),
('tg001', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg002', 'achi1', '2019-12-23', 'T', 'A', 0),
('tg003', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg004', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg005', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg006', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg007', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg008', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg009', 'achi1', '2019-12-23', 'T', 'A', 0),
('tg010', 'achi1', '2019-12-23', 'T', 'P', 3),
('tg001', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg002', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg003', 'achi1', '2019-12-30', 'T', 'A', 0),
('tg004', 'achi1', '2019-12-30', ',T', 'P', 2),
('tg005', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg006', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg007', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg008', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg009', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg010', 'achi1', '2019-12-30', 'T', 'P', 2),
('tg001', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg002', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg003', 'cp1', '2019-12-17', 'T', 'M', 2),
('tg004', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg005', 'cp1', '2019-12-17', 'T', 'A', 0),
('tg006', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg007', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg008', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg009', 'cp1', '2019-12-17', 'T', 'A', 0),
('tg010', 'cp1', '2019-12-17', 'T', 'P', 2),
('tg001', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg002', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg003', 'cp1', '2019-12-19', 'P', 'M', 3),
('tg004', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg005', 'cp1', '2019-12-19', 'P', 'M', 3),
('tg006', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg007', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg008', 'cp1', '2019-12-19', 'P', 'A', 0),
('tg009', 'cp1', '2019-12-19', 'P', 'P', 3),
('tg010', 'cp1', '2019-12-19', 'P', 'A', 0),
('tg001', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg002', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg003', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg004', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg005', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg006', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg007', 'cp1', '2019-12-24', 'T', 'A', 0),
('tg008', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg009', 'cp1', '2019-12-24', 'T', 'A', 2),
('tg010', 'cp1', '2019-12-24', 'T', 'P', 2),
('tg001', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg002', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg003', 'cp1', '2019-12-26', 'P', 'A', 0),
('tg004', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg005', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg006', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg007', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg008', 'cp1', '2019-12-26', 'P', 'M', 3),
('tg009', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg010', 'cp1', '2019-12-26', 'P', 'P', 3),
('tg001', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg002', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg003', 'cp1', '2019-12-31', 'T', 'A', 0),
('tg004', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg005', 'cp1', '2019-12-31', 'T', 'A', 0),
('tg006', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg007', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg008', 'cp1', '2019-12-31', 'T', 'M', 2),
('tg009', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg010', 'cp1', '2019-12-31', 'T', 'P', 2),
('tg001', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg002', 'cp1', '2020-01-02', 'P', 'A', 0),
('tg003', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg004', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg005', 'cp1', '2020-01-02', 'P', 'A', 0),
('tg006', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg007', 'cp1', '2020-01-02', 'P', 'A', 0),
('tg008', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg009', 'cp1', '2020-01-02', 'P', 'A', 0),
('tg010', 'cp1', '2020-01-02', 'P', 'P', 3),
('tg001', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg002', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg003', 'Lab1', '2019-12-16', 'T', 'M', 2),
('tg004', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg005', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg006', 'Lab1', '2019-12-16', 'T', 'A', 0),
('tg007', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg008', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg009', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg010', 'Lab1', '2019-12-16', 'T', 'P', 2),
('tg001', 'Lab1', '2019-12-23', 'P', 'P', 3),
('tg002', 'Lab1', '2019-12-24', 'P', 'A', 0),
('tg003', 'Lab1', '2019-12-25', 'P', 'A', 0),
('tg004', 'Lab1', '2019-12-26', 'P', 'M', 3),
('tg005', 'Lab1', '2019-12-27', 'P', 'P', 3),
('tg006', 'Lab1', '2019-12-28', 'P', 'P', 3),
('tg007', 'Lab1', '2019-12-29', 'P', 'P', 3),
('tg008', 'Lab1', '2019-12-30', 'P', 'P', 3),
('tg009', 'Lab1', '2019-12-31', 'P', 'A', 0),
('tg010', 'Lab1', '2020-01-01', 'P', 'P', 3),
('tg001', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg002', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg003', 'Lab1', '2019-12-30', 'T', 'A', 0),
('tg004', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg005', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg006', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg007', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg008', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg009', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg010', 'Lab1', '2019-12-30', 'T', 'P', 2),
('tg001', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg002', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg003', 'eng1', '2019-12-17', 'T', 'M', 2),
('tg004', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg005', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg006', 'eng1', '2019-12-17', 'T', 'A', 0),
('tg007', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg008', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg009', 'eng1', '2019-12-17', 'T', 'P', 2),
('tg010', 'eng1', '2019-12-17', 'T', 'A', 0),
('tg001', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg002', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg003', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg004', 'eng1', '2019-12-24', 'P', 'M', 2),
('tg005', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg006', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg007', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg008', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg009', 'eng1', '2019-12-24', 'P', 'A', 0),
('tg010', 'eng1', '2019-12-24', 'P', 'P', 2),
('tg001', 'eng1', '2019-12-31', 'T', 'P', 2),
('tg002', 'eng1', '2019-12-31', 'T', 'M', 2),
('tg003', 'eng1', '2019-12-31', 'T', 'A', 0),
('tg004', 'eng1', '2019-12-31', 'T', 'P', 2),
('tg005', 'eng1', '2019-12-31', 'T', 'P', 2),
('tg006', 'eng1', '2019-12-31', 'T', 'P', 2),
('tg007', 'eng1', '2019-12-31', 'T', 'A', 0),
('tg008', 'eng1', '2019-12-31', 'T', 'A', 0),
('tg009', 'eng1', '2019-12-31', 'T', 'P', 2),
('tg010', 'eng1', '2019-12-31', 'T', 'P', 2);

-- --------------------------------------------------------

--
-- Table structure for table `bsttimetable`
--

CREATE TABLE `bsttimetable` (
  `Time` varchar(20) NOT NULL,
  `Monday` varchar(20) NOT NULL,
  `Tuesday` varchar(20) NOT NULL,
  `Wednesday` varchar(20) NOT NULL,
  `Thursday` varchar(20) NOT NULL,
  `Friday` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_all`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_all` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg001`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg001` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg002`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg002` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg003`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg003` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg004`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg004` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg005`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg005` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg006`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg006` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg007`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg007` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg008`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg008` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg009`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg009` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ca_marks_tg010`
-- (See below for the actual view)
--
CREATE TABLE `ca_marks_tg010` (
`std_id` varchar(10)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
);

-- --------------------------------------------------------

--
-- Table structure for table `course_module`
--

CREATE TABLE `course_module` (
  `course_id` varchar(10) NOT NULL,
  `name` char(15) DEFAULT NULL,
  `theory` char(4) DEFAULT NULL,
  `practical` char(4) DEFAULT NULL,
  `lec_id` varchar(10) DEFAULT NULL,
  `dep_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `course_module`
--

INSERT INTO `course_module` (`course_id`, `name`, `theory`, `practical`, `lec_id`, `dep_id`) VALUES
('achi1', 'Architecture', 'Y', 'N', 'rt005', 'd1'),
('cp1', 'C Program', 'Y', 'N', 'rt002', 'd1'),
('dbms1', 'database', 'Y', 'Y', 'rt001', 'd1'),
('eng1', 'english', 'Y', 'Y', 'rt003', 'd1'),
('IAD1', 'PHP', 'Y', 'Y', 'rt002', 'd1'),
('java1', 'OOD', 'Y', 'Y', 'rt003', 'd1'),
('Lab1', 'Laboratory', 'Y', 'Y', 'rt006', 'd1'),
('mis1', 'management_is', 'Y', 'N', 'rt001', 'd1'),
('sad1', 'system analysis', 'Y', 'Y', 'rt003', 'd1'),
('sf1', 'SOFT SKILL', 'Y', 'N', 'rt005', 'd1');

-- --------------------------------------------------------

--
-- Table structure for table `demostrator`
--

CREATE TABLE `demostrator` (
  `demo_id` varchar(10) NOT NULL,
  `f_name` char(10) DEFAULT NULL,
  `l_name` char(10) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` char(7) DEFAULT NULL,
  `dep_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `dep_id` varchar(10) NOT NULL,
  `dep_name` char(10) DEFAULT NULL,
  `location` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`dep_id`, `dep_name`, `location`) VALUES
('d1', 'ict', 'lab11'),
('d2', 'et', 'lab36'),
('d3', 'bst', 'lab45');

-- --------------------------------------------------------

--
-- Table structure for table `ettimetable`
--

CREATE TABLE `ettimetable` (
  `Time` varchar(20) NOT NULL,
  `Monday` varchar(20) NOT NULL,
  `Tuesday` varchar(20) NOT NULL,
  `Wednesday` varchar(20) NOT NULL,
  `Thursday` varchar(20) NOT NULL,
  `Friday` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ettimetable`
--

INSERT INTO `ettimetable` (`Time`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`) VALUES
('8.00', 'PRODUCTION', 'OOD', 'NO', 'ENGLISH', 'SOFTSKILL');

-- --------------------------------------------------------

--
-- Table structure for table `icttimetable`
--

CREATE TABLE `icttimetable` (
  `Time` varchar(20) NOT NULL,
  `Monday` varchar(20) NOT NULL,
  `Tuesday` varchar(20) NOT NULL,
  `Wednesday` varchar(20) NOT NULL,
  `Thursday` varchar(20) NOT NULL,
  `Friday` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `icttimetable`
--

INSERT INTO `icttimetable` (`Time`, `Monday`, `Tuesday`, `Wednesday`, `Thursday`, `Friday`) VALUES
('10.00', 'ECON', 'SOFT SKILLS', 'OODA', 'MANAGEMENT', 'IAD'),
('8.00', 'IAD', 'ODD', 'OODA', 'ENGLISH', 'NO');

-- --------------------------------------------------------

--
-- Table structure for table `instructor`
--

CREATE TABLE `instructor` (
  `instruct_id` varchar(10) NOT NULL,
  `name` char(10) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` char(7) DEFAULT NULL,
  `dep_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `instructor`
--

INSERT INTO `instructor` (`instruct_id`, `name`, `contact_no`, `dob`, `gender`, `dep_id`) VALUES
('ti001', 'sadun', 15697878, '1985-11-13', 'male', 'd1'),
('ti002', 'kumara', 412286515, '1988-04-13', 'male', 'd2'),
('ti003', 'thivani', 778963120, '1995-09-14', 'female', 'd3'),
('ti004', 'lakshi', 712356789, '1993-10-17', 'female', 'd1');

-- --------------------------------------------------------

--
-- Table structure for table `lecture`
--

CREATE TABLE `lecture` (
  `lec_id` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `f_name` varchar(10) DEFAULT NULL,
  `gender` varchar(7) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lecture`
--

INSERT INTO `lecture` (`lec_id`, `username`, `f_name`, `gender`, `dob`, `contact_no`, `password`) VALUES
('rt001', 'nuwanuser', 'nuwan', 'male', '1990-10-02', 717126567, 'zxasqw'),
('rt002', 'rt002', 'subash', 'male', '1985-10-02', 717526567, 'subash123'),
('rt003', '', 'dinithi', 'female', NULL, 716526567, 'dinithi123'),
('rt004', '', 'deno', 'female', NULL, 779526567, ''),
('rt005', '', 'Dinithi', 'Female', NULL, 112365478, ''),
('rt006', '', 'Hnasila', 'Female', NULL, 112365478, '');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `std_id` varchar(10) DEFAULT NULL,
  `course_id` varchar(10) DEFAULT NULL,
  `mid_p` int(11) DEFAULT NULL,
  `mid_t` int(11) DEFAULT NULL,
  `Ass1` int(11) DEFAULT NULL,
  `Ass2` int(11) DEFAULT NULL,
  `quiz1` int(11) DEFAULT NULL,
  `quiz2` int(11) DEFAULT NULL,
  `quiz3` int(11) DEFAULT NULL,
  `quiz4` int(11) DEFAULT NULL,
  `end_exm_p` int(11) DEFAULT NULL,
  `end_exm_t` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`std_id`, `course_id`, `mid_p`, `mid_t`, `Ass1`, `Ass2`, `quiz1`, `quiz2`, `quiz3`, `quiz4`, `end_exm_p`, `end_exm_t`) VALUES
('tg001', 'eng1', 30, 60, 75, 63, 55, 82, 40, 59, 79, 73),
('tg001', 'mis1', NULL, 25, 45, 73, 65, 64, 90, 35, NULL, 97),
('tg001', 'cp1', 75, 50, 65, 48, 85, 66, 33, 76, 74, 45),
('tg001', 'achi1', NULL, 25, 35, 60, 75, 56, 45, 65, NULL, 34),
('tg001', 'Lab1', 69, 45, 66, 75, 45, 95, 90, 88, 69, 45),
('tg001', 'sad1', 87, 55, 75, 36, 59, 66, 36, 95, 89, 62),
('tg002', 'dbms1', 65, 67, 55, 45, 87, 56, 23, 68, 78, 79),
('tg002', 'eng1', 67, 81, 56, 89, 56, 89, 90, 61, 68, 89),
('tg002', 'mis1', NULL, 90, 87, 71, 61, 51, 67, 90, NULL, 65),
('tg002', 'cp1', 56, 59, 63, 48, 77, 59, 88, 70, 65, 50),
('tg002', 'achi1', NULL, 45, 85, 0, 85, 62, 0, 75, NULL, 34),
('tg002', 'Lab1', 79, 85, 96, 65, 15, 45, 72, 99, 43, 65),
('tg002', 'sad1', 67, 75, 85, 88, 49, 56, 66, 75, 89, 92),
('tg003', 'dbms1', 56, 60, 73, 66, 69, 80, 63, 79, 36, 65),
('tg003', 'eng1', 96, 89, 85, 93, 95, 82, 90, 79, 69, 73),
('tg003', 'mis1', NULL, 65, 75, 63, 75, 84, 80, 75, NULL, 87),
('tg003', 'cp1', 69, 70, 73, 58, 89, 65, 78, 71, 73, 65),
('tg003', 'achi1', NULL, 59, 74, 70, 80, 81, 65, 56, NULL, 43),
('tg003', 'Lab1', 89, 87, 76, 89, 62, 51, 74, 68, 67, 55),
('tg003', 'sad1', 56, 74, 52, 74, 89, 41, 53, 75, 98, 45),
('tg004', 'dbms1', 72, 75, 65, 70, 79, 71, 69, 70, 75, 65),
('tg004', 'eng1', 90, 60, 55, 43, 57, 82, 40, 69, 79, 63),
('tg004', 'mis1', NULL, 60, 63, 65, 60, 69, 70, 62, NULL, 66),
('tg004', 'cp1', 60, 35, 62, 68, 55, 46, 33, 86, 34, 75),
('tg004', 'achi1', NULL, 75, 75, 70, 65, 86, 75, 65, NULL, 64),
('tg004', 'Lab1', 59, 45, 56, 57, 55, 65, 66, 88, 69, 45),
('tg004', 'sad1', 87, 80, 75, 46, 89, 86, 80, 79, 84, 62),
('tg005', 'dbms1', 78, 89, 66, 88, 74, 96, 56, 85, 42, 69),
('tg005', 'eng1', 52, 65, 45, 91, 52, 81, 79, 56, 79, 63),
('tg005', 'mis1', NULL, 66, 85, 42, 85, 45, 74, 68, NULL, 67),
('tg005', 'cp1', 54, 68, 67, 48, 79, 88, 78, 95, 76, 78),
('tg005', 'achi1', NULL, 42, 63, 85, 74, 70, 69, 64, NULL, 73),
('tg005', 'Lab1', 85, 42, 78, 42, 89, 74, 89, 75, 56, 56),
('tg005', 'sad1', 74, 23, 74, 48, 89, 45, 74, 89, 56, 46),
('tg006', 'dbms1', 45, 55, 65, 60, 90, 65, 70, 80, 15, 55),
('tg006', 'eng1', 90, 91, 88, 93, 97, 92, 90, 98, 99, 93),
('tg006', 'mis1', NULL, 60, 53, 55, 50, 69, 78, 72, NULL, 76),
('tg006', 'cp1', 45, 47, 42, 48, 49, 43, 45, 53, 54, 55),
('tg006', 'achi1', NULL, 25, 75, 90, 65, 96, 75, 85, NULL, 64),
('tg006', 'Lab1', 68, 45, 73, 65, 53, 55, 65, 88, 79, 67),
('tg006', 'sad1', 35, 80, 95, 66, 69, 86, 50, 19, 84, 92),
('tg007', 'dbms1', 15, 27, 35, 45, 57, 66, 73, 88, 98, 69),
('tg007', 'eng1', 97, 87, 76, 69, 56, 49, 30, 21, 18, 89),
('tg007', 'mis1', NULL, 70, 57, 51, 61, 51, 97, 90, NULL, 25),
('tg007', 'cp1', 86, 79, 73, 78, 87, 69, 78, 80, 95, 90),
('tg007', 'achi1', NULL, 35, 85, 70, 75, 25, 45, 85, NULL, 64),
('tg007', 'Lab1', 66, 65, 76, 85, 75, 85, 92, 59, 43, 85),
('tg007', 'sad1', 47, 55, 65, 78, 89, 96, 86, 45, 69, 72),
('tg008', 'dbms1', 85, 45, 49, 85, 96, 78, 68, 74, 69, 63),
('tg008', 'eng1', 85, 45, 65, 71, 53, 65, 85, 54, 45, 86),
('tg008', 'mis1', NULL, 76, 45, 85, 65, 96, 74, 75, NULL, 96),
('tg008', 'cp1', 56, 89, 45, 78, 56, 41, 46, 84, 70, 66),
('tg008', 'achi1', NULL, 54, 60, 49, 56, 85, 23, 45, NULL, 47),
('tg008', 'Lab1', 56, 85, 23, 42, 74, 56, 84, 74, 56, 74),
('tg008', 'sad1', 68, 53, 64, 54, 96, 74, 56, 74, 78, 68),
('tg009', 'dbms1', 35, 55, 65, 40, 80, 65, 40, 80, 75, 65),
('tg009', 'eng1', 84, 78, 88, 29, 65, 32, 70, 72, 69, 83),
('tg009', 'mis1', NULL, 80, 83, 85, 70, 59, 48, 72, NULL, 96),
('tg009', 'cp1', 55, 7, 45, 48, 89, 64, 65, 63, 58, 55),
('tg009', 'achi1', NULL, 35, 65, 90, 85, 86, 85, 95, NULL, 64),
('tg009', 'Lab1', 78, 75, 63, 70, 73, 75, 70, 75, 77, 70),
('tg009', 'sad1', 85, 80, 95, 76, 79, 76, 70, 79, 74, 92),
('tg010', 'dbms1', 54, 55, 56, 57, 86, 70, 69, 56, 80, 66),
('tg010', 'eng1', 54, 85, 65, 70, 46, 47, 89, 69, 74, 70),
('tg010', 'mis1', NULL, 56, 66, 74, 75, 47, 60, 56, NULL, 59),
('tg010', 'cp1', 56, 47, 83, 76, 66, 40, 70, 63, 66, 40),
('tg010', 'achi1', NULL, 85, 60, 70, 60, 70, 80, 90, NULL, 77),
('tg010', 'Lab1', 45, 65, 85, 23, 41, 47, 80, 70, 72, 73),
('tg010', 'sad1', 42, 45, 51, 54, 74, 74, 51, 45, 80, 81),
('tg001', 'dbms1', 89, 77, 69, 73, 80, 91, 65, 76, 68, 78);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_achi1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_achi1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_cp1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_cp1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_dbms1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_dbms1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_eng1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_eng1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_lab1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_lab1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_mis1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_mis1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_sad1`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_sad1` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg001`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg001` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg002`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg002` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg003`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg003` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg004`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg004` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg005`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg005` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg006`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg006` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg007`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg007` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg008`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg008` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg009`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg009` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `marks_all_tg010`
-- (See below for the actual view)
--
CREATE TABLE `marks_all_tg010` (
`std_id` varchar(10)
,`course_id` varchar(10)
,`mid_p` int(11)
,`mid_t` int(11)
,`Ass1` int(11)
,`Ass2` int(11)
,`quiz1` int(11)
,`quiz2` int(11)
,`quiz3` int(11)
,`quiz4` int(11)
,`end_exm_p` int(11)
,`end_exm_t` int(11)
);

-- --------------------------------------------------------

--
-- Table structure for table `medical`
--

CREATE TABLE `medical` (
  `ref_no` varchar(10) NOT NULL,
  `course_id` varchar(10) DEFAULT NULL,
  `submit_date` date DEFAULT NULL,
  `place_of_issue` varchar(15) DEFAULT NULL,
  `std_id` varchar(10) DEFAULT NULL,
  `status` varchar(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medical`
--

INSERT INTO `medical` (`ref_no`, `course_id`, `submit_date`, `place_of_issue`, `std_id`, `status`) VALUES
('rf001', 'mis1', '2019-12-17', 'Matara_Hospital', 'tg003', 'T'),
('rf002', 'mis1', '2019-12-25', 'Karapitiya', 'tg004', 'T'),
('rf003', 'mis1', '2019-12-31', 'Matara_Hospital', 'tg008', 'T'),
('rf004', 'dbms1', '2019-12-20', 'Matara_Hospital', 'tg003', 'T'),
('rf005', 'dbms1', '2019-12-24', 'Matara_Hospital', 'tg003', 'P'),
('rf006', 'dbms1', '2018-12-21', 'Matara_Hospital', 'tg005', 'P'),
('rf007', 'dbms1', '2018-12-27', 'Matara_Hospital', 'tg004', 'T'),
('rf008', 'dbms1', '2018-12-28', 'Matara_Hospital', 'tg008', 'P'),
('rf009', 'dbms1', '2020-01-02', 'Matara_Hospital', 'tg002', 'T'),
('rf010', 'dbms1', '2020-01-04', 'Matara_Hospital', 'tg002', 'P'),
('rf011', 'sad1', '2019-12-20', 'Matara_Hospital', 'tg005', 'T'),
('rf012', 'sad1', '2019-12-25', 'Matara_Hospital', 'tg005', 'P'),
('rf013', 'achi1', '2019-12-20', 'Matara_Hospital', 'tg003', 'T'),
('rf014', 'cp1', '2019-12-22', 'Matara_Hospital', 'tg003', 'T'),
('rf015', 'cp1', '2019-12-22', 'Matara_Hospital', 'tg003', 'P'),
('rf016', 'cp1', '2019-12-23', 'Matara_Hospital', 'tg005', 'P'),
('rf017', 'cp1', '2019-12-30', 'Matara_Hospital', 'tg008', 'P'),
('rf018', 'cp1', '2019-12-31', 'Matara_Hospital', 'tg008', 'T'),
('rf019', 'Lab1', '2020-01-01', 'Matara_Hospital', 'tg003', 'T'),
('rf020', 'Lab1', '2020-01-02', 'Matara_Hospital', 'tg004', 'P'),
('rf021', 'eng1', '2019-12-20', 'Matara_Hospital', 'tg003', 'T'),
('rf022', 'eng1', '2019-12-25', 'Matara_Hospital', 'tg004', 'P'),
('rf023', 'eng1', '2019-12-31', 'Matara_Hospital', 'tg002', 'T');

-- --------------------------------------------------------

--
-- Table structure for table `notise`
--

CREATE TABLE `notise` (
  `notise_id` int(11) NOT NULL,
  `notise_date` date DEFAULT NULL,
  `notise_description` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `notise`
--

INSERT INTO `notise` (`notise_id`, `notise_date`, `notise_description`) VALUES
(1, '2020-04-14', 'Tomarrow is hollyday'),
(2, '2020-06-24', 'pay your fees');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `std_id` varchar(10) NOT NULL,
  `f_name` char(10) DEFAULT NULL,
  `l_name` char(10) DEFAULT NULL,
  `gender` char(7) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`std_id`, `f_name`, `l_name`, `gender`, `Address`, `status`) VALUES
('tg001', 'pasan', 'lahiru', 'male', '710023654', 'proper'),
('tg002', 'lakshitha', 'dilshan', 'male', '712005686', 'proper'),
('tg003', 'lakshan', 'ravindu', 'male', '712008696', 'proper'),
('tg004', 'kashyapa', 'deshan', 'male', '712897976', 'proper'),
('tg005', 'mudeesha', 'tharindu', 'male', '721305689', 'proper'),
('tg006', 'lahiru', 'ravishanka', 'male', '707898456', 'proper'),
('tg007', 'rashini', 'ravi', 'female', '707778998', 'proper'),
('tg008', 'mariya', 'revon', 'female', '707771198', 'repeat'),
('tg009', 'kavindi', 'limini', 'female', '709932148', 'suspended'),
('tg010', 'nirasha', 'janz', 'female', '709996524', 'proper');

-- --------------------------------------------------------

--
-- Table structure for table `technical_officer`
--

CREATE TABLE `technical_officer` (
  `to_id` varchar(10) NOT NULL,
  `f_name` char(10) DEFAULT NULL,
  `l_name` char(10) DEFAULT NULL,
  `contact_no` int(11) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` char(7) DEFAULT NULL,
  `dep_id` varchar(10) DEFAULT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `technical_officer`
--

INSERT INTO `technical_officer` (`to_id`, `f_name`, `l_name`, `contact_no`, `dob`, `gender`, `dep_id`, `password`) VALUES
('to1', 'sinev', 'krish', 778989555, '2020-12-09', 'Male', 'd1', 'zashgdyd');

-- --------------------------------------------------------

--
-- Table structure for table `tech_officer`
--

CREATE TABLE `tech_officer` (
  `tec_id` char(10) NOT NULL,
  `tec_f_name` varchar(20) NOT NULL,
  `tec_l_name` varchar(20) NOT NULL,
  `tec_dob` date DEFAULT NULL,
  `tec_gender` char(10) DEFAULT NULL,
  `dep_id` varchar(10) DEFAULT NULL,
  `admin_id` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_all`
--
DROP TABLE IF EXISTS `ca_marks_all`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_all`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg001`
--
DROP TABLE IF EXISTS `ca_marks_tg001`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg001`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg001' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg002`
--
DROP TABLE IF EXISTS `ca_marks_tg002`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg002`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg002' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg003`
--
DROP TABLE IF EXISTS `ca_marks_tg003`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg003`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg003' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg004`
--
DROP TABLE IF EXISTS `ca_marks_tg004`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg004`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg004' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg005`
--
DROP TABLE IF EXISTS `ca_marks_tg005`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg005`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg005' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg006`
--
DROP TABLE IF EXISTS `ca_marks_tg006`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg006`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg006' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg007`
--
DROP TABLE IF EXISTS `ca_marks_tg007`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg007`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg007' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg008`
--
DROP TABLE IF EXISTS `ca_marks_tg008`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg008`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg008' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg009`
--
DROP TABLE IF EXISTS `ca_marks_tg009`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg009`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg009' ;

-- --------------------------------------------------------

--
-- Structure for view `ca_marks_tg010`
--
DROP TABLE IF EXISTS `ca_marks_tg010`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ca_marks_tg010`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2` FROM `marks` WHERE `marks`.`std_id` = 'tg010' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_achi1`
--
DROP TABLE IF EXISTS `marks_all_achi1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_achi1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'achi1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_cp1`
--
DROP TABLE IF EXISTS `marks_all_cp1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_cp1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'cp1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_dbms1`
--
DROP TABLE IF EXISTS `marks_all_dbms1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_dbms1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'dbms1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_eng1`
--
DROP TABLE IF EXISTS `marks_all_eng1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_eng1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'eng1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_lab1`
--
DROP TABLE IF EXISTS `marks_all_lab1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_lab1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'Lab1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_mis1`
--
DROP TABLE IF EXISTS `marks_all_mis1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_mis1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'mis1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_sad1`
--
DROP TABLE IF EXISTS `marks_all_sad1`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_sad1`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`course_id` = 'sad1' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg001`
--
DROP TABLE IF EXISTS `marks_all_tg001`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg001`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg001' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg002`
--
DROP TABLE IF EXISTS `marks_all_tg002`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg002`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg002' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg003`
--
DROP TABLE IF EXISTS `marks_all_tg003`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg003`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg003' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg004`
--
DROP TABLE IF EXISTS `marks_all_tg004`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg004`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg004' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg005`
--
DROP TABLE IF EXISTS `marks_all_tg005`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg005`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg005' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg006`
--
DROP TABLE IF EXISTS `marks_all_tg006`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg006`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg006' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg007`
--
DROP TABLE IF EXISTS `marks_all_tg007`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg007`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg007' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg008`
--
DROP TABLE IF EXISTS `marks_all_tg008`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg008`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg008' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg009`
--
DROP TABLE IF EXISTS `marks_all_tg009`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg009`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg009' ;

-- --------------------------------------------------------

--
-- Structure for view `marks_all_tg010`
--
DROP TABLE IF EXISTS `marks_all_tg010`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `marks_all_tg010`  AS SELECT `marks`.`std_id` AS `std_id`, `marks`.`course_id` AS `course_id`, `marks`.`mid_p` AS `mid_p`, `marks`.`mid_t` AS `mid_t`, `marks`.`Ass1` AS `Ass1`, `marks`.`Ass2` AS `Ass2`, `marks`.`quiz1` AS `quiz1`, `marks`.`quiz2` AS `quiz2`, `marks`.`quiz3` AS `quiz3`, `marks`.`quiz4` AS `quiz4`, `marks`.`end_exm_p` AS `end_exm_p`, `marks`.`end_exm_t` AS `end_exm_t` FROM `marks` WHERE `marks`.`std_id` = 'tg010' ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `admin_course`
--
ALTER TABLE `admin_course`
  ADD KEY `admin_id` (`admin_id`),
  ADD KEY `course_id` (`course_id`);

--
-- Indexes for table `admin_notice`
--
ALTER TABLE `admin_notice`
  ADD PRIMARY KEY (`notice_id`);

--
-- Indexes for table `bsttimetable`
--
ALTER TABLE `bsttimetable`
  ADD PRIMARY KEY (`Time`);

--
-- Indexes for table `course_module`
--
ALTER TABLE `course_module`
  ADD PRIMARY KEY (`course_id`),
  ADD KEY `lec_id` (`lec_id`),
  ADD KEY `dep_id` (`dep_id`);

--
-- Indexes for table `demostrator`
--
ALTER TABLE `demostrator`
  ADD PRIMARY KEY (`demo_id`),
  ADD KEY `dep_id` (`dep_id`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`dep_id`);

--
-- Indexes for table `ettimetable`
--
ALTER TABLE `ettimetable`
  ADD PRIMARY KEY (`Time`);

--
-- Indexes for table `icttimetable`
--
ALTER TABLE `icttimetable`
  ADD PRIMARY KEY (`Time`);

--
-- Indexes for table `instructor`
--
ALTER TABLE `instructor`
  ADD PRIMARY KEY (`instruct_id`),
  ADD KEY `dep_id` (`dep_id`);

--
-- Indexes for table `lecture`
--
ALTER TABLE `lecture`
  ADD PRIMARY KEY (`lec_id`);

--
-- Indexes for table `medical`
--
ALTER TABLE `medical`
  ADD PRIMARY KEY (`ref_no`),
  ADD KEY `std_id` (`std_id`);

--
-- Indexes for table `notise`
--
ALTER TABLE `notise`
  ADD PRIMARY KEY (`notise_id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`std_id`);

--
-- Indexes for table `technical_officer`
--
ALTER TABLE `technical_officer`
  ADD PRIMARY KEY (`to_id`),
  ADD KEY `dep_id` (`dep_id`);

--
-- Indexes for table `tech_officer`
--
ALTER TABLE `tech_officer`
  ADD PRIMARY KEY (`tec_id`),
  ADD KEY `dep_id` (`dep_id`),
  ADD KEY `admin_id` (`admin_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin_notice`
--
ALTER TABLE `admin_notice`
  MODIFY `notice_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `admin_course`
--
ALTER TABLE `admin_course`
  ADD CONSTRAINT `admin_course_ibfk_1` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`),
  ADD CONSTRAINT `admin_course_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_module` (`course_id`);

--
-- Constraints for table `course_module`
--
ALTER TABLE `course_module`
  ADD CONSTRAINT `course_module_ibfk_1` FOREIGN KEY (`lec_id`) REFERENCES `lecture` (`lec_id`),
  ADD CONSTRAINT `course_module_ibfk_2` FOREIGN KEY (`dep_id`) REFERENCES `department` (`dep_id`);

--
-- Constraints for table `demostrator`
--
ALTER TABLE `demostrator`
  ADD CONSTRAINT `demostrator_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`dep_id`);

--
-- Constraints for table `instructor`
--
ALTER TABLE `instructor`
  ADD CONSTRAINT `instructor_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`dep_id`);

--
-- Constraints for table `medical`
--
ALTER TABLE `medical`
  ADD CONSTRAINT `medical_ibfk_1` FOREIGN KEY (`std_id`) REFERENCES `student` (`std_id`);

--
-- Constraints for table `technical_officer`
--
ALTER TABLE `technical_officer`
  ADD CONSTRAINT `technical_officer_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`dep_id`);

--
-- Constraints for table `tech_officer`
--
ALTER TABLE `tech_officer`
  ADD CONSTRAINT `tech_officer_ibfk_1` FOREIGN KEY (`dep_id`) REFERENCES `department` (`dep_id`),
  ADD CONSTRAINT `tech_officer_ibfk_2` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`admin_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
