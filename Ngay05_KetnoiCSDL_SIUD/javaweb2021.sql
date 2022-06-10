-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th12 16, 2021 lúc 04:22 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 7.3.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `javaweb2021`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbsanpham`
--

CREATE TABLE `tbsanpham` (
  `id` int(11) NOT NULL,
  `tensp` varchar(30) NOT NULL,
  `giasp` float DEFAULT NULL,
  `trangthai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbsanpham`
--

INSERT INTO `tbsanpham` (`id`, `tensp`, `giasp`, `trangthai`) VALUES
(1, 'Iphone 13', 30000000, 1),
(2, 'Galaxy S20', 25000000, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tbtaikhoan`
--

CREATE TABLE `tbtaikhoan` (
  `id` int(11) NOT NULL,
  `SoTK` varchar(20) DEFAULT NULL,
  `Sodu` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tbtaikhoan`
--

INSERT INTO `tbtaikhoan` (`id`, `SoTK`, `Sodu`) VALUES
(1, '001', 1000000),
(2, '002', 2000000),
(3, '003', 3000000),
(4, '004', 4000000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `tbtaikhoan`
--
ALTER TABLE `tbtaikhoan`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT cho bảng `tbtaikhoan`
--
ALTER TABLE `tbtaikhoan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
