-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 19, 2022 at 02:26 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `webbanhang`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbsanpham`
--

CREATE TABLE `tbsanpham` (
  `id` int(11) NOT NULL,
  `masp` varchar(30) NOT NULL,
  `tensp` varchar(100) CHARACTER SET utf8 NOT NULL,
  `giasp` int(11) NOT NULL,
  `manhom` int(11) DEFAULT NULL,
  `hinhanh` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `tomtat` text CHARACTER SET utf8 DEFAULT NULL,
  `noidung` text CHARACTER SET utf8 DEFAULT NULL,
  `trangthai` tinyint(1) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsanpham`
--

INSERT INTO `tbsanpham` (`id`, `masp`, `tensp`, `giasp`, `manhom`, `hinhanh`, `tomtat`, `noidung`, `trangthai`) VALUES
(1, 'sp01', 'iphone-5s', 2000000, 1, 'iphone-5s.png', 'apple - USA', 'Màu trắng - Bạch Kim', 1),
(2, 'sp02', 'Apple - Watch', 1500000, 2, 'slide2.png', 'Đồng hồ đeo tay', 'Kết Nối các loại Iphone', 1),
(3, 'sp03', 'Iphone -7', 7500000, 2, 'trend1.jpg', 'đổi mới', 'Sản phẩm có nhiều thay đổi', 1),
(4, 'sp04', 'Laptop - ASUS', 12000000, 1, 'trend2.jpg', 'Thế hệ mới', 'Có tích hợp Adroid', 1),
(5, 'sp05', 'Máy tính bảng Apple', 9000000, 1, 'trend3.jfif', 'sản phẩm thế hệ mới', 'Tích hợp nhiều chức năng', 1),
(6, 'sp06', 'Tai nghe Apple', 2500000, 2, 'trend4.jfif', 'thế hệ mới', 'chống ồn', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbuser`
--

CREATE TABLE `tbuser` (
  `username` varchar(30) NOT NULL,
  `password` varchar(32) NOT NULL,
  `fullname` varchar(30) DEFAULT NULL,
  `role` tinyint(4) DEFAULT 2 COMMENT '0:khóa - 1:admin - 2:user'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbuser`
--

INSERT INTO `tbuser` (`username`, `password`, `fullname`, `role`) VALUES
('admin', '123456', 'Quản trị hệ thống', 1),
('user1', '123456', 'Người dùng 1', 2),
('user2', '123456', 'Người dùng 2', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
