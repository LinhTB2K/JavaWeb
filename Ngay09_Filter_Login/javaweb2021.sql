-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2022 at 10:28 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaweb2021`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbsanpham`
--

CREATE TABLE `tbsanpham` (
  `id` int(11) NOT NULL,
  `tensp` varchar(30) NOT NULL,
  `giasp` float DEFAULT NULL,
  `trangthai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbsanpham`
--

INSERT INTO `tbsanpham` (`id`, `tensp`, `giasp`, `trangthai`) VALUES
(1, 'Iphone 13', 30000000, 1),
(2, 'Galaxy S20', 25000000, 0),
(3, 'sản phẩm 1', 200000, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbtaikhoan`
--

CREATE TABLE `tbtaikhoan` (
  `id` int(11) NOT NULL,
  `SoTK` varchar(20) DEFAULT NULL,
  `Sodu` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbtaikhoan`
--

INSERT INTO `tbtaikhoan` (`id`, `SoTK`, `Sodu`) VALUES
(1, '001', 1000000),
(2, '002', 2000000),
(3, '003', 3000000),
(4, '004', 4000000);

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE `tbuser` (
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`username`, `password`) VALUES
('admin', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbtaikhoan`
--
ALTER TABLE `tbtaikhoan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbuser`
--
ALTER TABLE `tbuser`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbtaikhoan`
--
ALTER TABLE `tbtaikhoan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
