-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 03, 2019 at 05:39 AM
-- Server version: 10.1.31-MariaDB
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `websanpham03`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbchitiethoadon`
--

CREATE TABLE `tbchitiethoadon` (
  `id` int(11) NOT NULL,
  `mahd` int(11) NOT NULL,
  `idsp` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `giamua` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbchitiethoadon`
--

INSERT INTO `tbchitiethoadon` (`id`, `mahd`, `idsp`, `soluong`, `giamua`) VALUES
(3, 2, 1, 1, 5000000),
(4, 2, 2, 2, 20000),
(5, 3, 1, 1, 5000000),
(6, 3, 2, 2, 20000),
(7, 4, 1, 1, 5000000),
(8, 4, 2, 2, 20000),
(9, 5, 2, 1, 2000000),
(10, 5, 4, 1, 12000000),
(11, 5, 6, 1, 10000000);

-- --------------------------------------------------------

--
-- Table structure for table `tbhoadon`
--

CREATE TABLE `tbhoadon` (
  `mahd` int(11) NOT NULL,
  `tennguoimua` varchar(30) CHARACTER SET utf8 NOT NULL,
  `dienthoai` varchar(15) NOT NULL,
  `ngaydat` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ngaynhan` datetime NOT NULL,
  `trangthai` tinyint(4) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbhoadon`
--

INSERT INTO `tbhoadon` (`mahd`, `tennguoimua`, `dienthoai`, `ngaydat`, `ngaynhan`, `trangthai`) VALUES
(2, 'abc19', '123456789', '2018-09-19 21:16:22', '2018-09-20 21:16:00', 0),
(3, 'abc19', '123456789', '2018-09-19 21:17:17', '2018-09-20 21:16:00', 1),
(4, 'abc20', '0912356004', '2018-09-19 21:17:47', '2018-09-20 21:17:00', 2),
(5, 'Ng???c Anh', '0123456789', '2019-09-03 10:13:06', '2019-09-05 10:12:00', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbloaitin`
--

CREATE TABLE `tbloaitin` (
  `LoaiTin` int(11) NOT NULL,
  `TenLoaiTin` varchar(2000) CHARACTER SET utf8 NOT NULL,
  `Sothutu` int(11) DEFAULT NULL,
  `TrangThai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbloaitin`
--

INSERT INTO `tbloaitin` (`LoaiTin`, `TenLoaiTin`, `Sothutu`, `TrangThai`) VALUES
(1, 'Th??? Thao', NULL, NULL),
(2, 'Kinh t???', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tbnhomsp`
--

CREATE TABLE `tbnhomsp` (
  `manhom` int(11) NOT NULL,
  `tennhom` varchar(200) CHARACTER SET utf8 NOT NULL,
  `sothutu` int(11) DEFAULT NULL,
  `trangthai` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbnhomsp`
--

INSERT INTO `tbnhomsp` (`manhom`, `tennhom`, `sothutu`, `trangthai`) VALUES
(1, 'M??y t??nh', 3, 1),
(2, '??i???n tho???i', 2, 1),
(5, '?????ng h???', 1, 1),
(6, 'T??? l???nh', 4, 1),
(7, 'test', 1, 1),
(8, 'test 2', 1, 1),
(9, 'test 2', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbquantri`
--

CREATE TABLE `tbquantri` (
  `id` int(11) NOT NULL,
  `taikhoan` varchar(50) NOT NULL,
  `matkhau` varchar(32) NOT NULL,
  `loai` tinyint(4) DEFAULT NULL,
  `trangthai` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbquantri`
--

INSERT INTO `tbquantri` (`id`, `taikhoan`, `matkhau`, `loai`, `trangthai`) VALUES
(1, 'admin', 'e10adc3949ba59abbe56e057f20f883e', 1, 1),
(2, 'nhanvien', '202cb962ac59075b964b07152d234b70', 2, 1);

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
  `tomtat` text CHARACTER SET utf8,
  `noidung` text CHARACTER SET utf8,
  `trangthai` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbsanpham`
--

INSERT INTO `tbsanpham` (`id`, `masp`, `tensp`, `giasp`, `manhom`, `hinhanh`, `tomtat`, `noidung`, `trangthai`) VALUES
(1, 'sp01', '??i???n tho???i iphone', 5000000, 2, 'iphone-8-plus-hh-600x600.jpg', '<p> t??m t???t s???n ph???m 1 </p>\r\n<p> t??m t???t s???n ph???m 1 </p>\r\n<p> t??m t???t s???n ph???m 1 </p>', '<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>\r\n<p> chi ti???t s???n ph???m 1 </p>', 0),
(2, 'sp02', 'M??y t??nh 2', 2000000, 1, 'apple-macbook-pro-touch-mr9q2sa-a-2018-thumb-1-600x600.jpg', '', '', 1),
(3, 'SP04', 'M??y t??nh 1', 5000000, 1, 'apple-macbook-air-mqd32sa-a-i5-5350u-400-1-450x300-600x600.jpg', '', '', 1),
(4, 'SP05', '??i???n tho???i 5', 12000000, 2, 'oppo-a3s-red-600x600.jpg', '', '', 1),
(6, 'SP053', '??i???n tho???i 6', 10000000, 2, 'samsung-galaxy-s9-plus-64gb-xanh-san-ho-2-1-600x600.jpg', '', '', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tbtintuc`
--

CREATE TABLE `tbtintuc` (
  `id` int(11) NOT NULL,
  `Tieude` varchar(200) CHARACTER SET utf8 NOT NULL,
  `TomTat` varchar(500) CHARACTER SET utf8 DEFAULT NULL,
  `Noidung` text CHARACTER SET utf8,
  `Hinhanh` varchar(100) CHARACTER SET utf16 DEFAULT NULL,
  `TinNoiBat` tinyint(1) DEFAULT NULL,
  `LoaiTin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbtintuc`
--

INSERT INTO `tbtintuc` (`id`, `Tieude`, `TomTat`, `Noidung`, `Hinhanh`, `TinNoiBat`, `LoaiTin`) VALUES
(2, 'ti??u ????? tin 1', 'T??m t???t tin 1', 'N???i dung tin 1', 'ha_giang.PNG', 1, 1),
(3, 'ti??u ????? tin 2', 'T??m t???t tin 2', 'N???i dung tin 2', 'moc_chau.PNG', 1, 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uni_hd_sp` (`mahd`,`idsp`),
  ADD KEY `idsp` (`idsp`);

--
-- Indexes for table `tbhoadon`
--
ALTER TABLE `tbhoadon`
  ADD PRIMARY KEY (`mahd`);

--
-- Indexes for table `tbloaitin`
--
ALTER TABLE `tbloaitin`
  ADD PRIMARY KEY (`LoaiTin`);

--
-- Indexes for table `tbnhomsp`
--
ALTER TABLE `tbnhomsp`
  ADD PRIMARY KEY (`manhom`);

--
-- Indexes for table `tbquantri`
--
ALTER TABLE `tbquantri`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `taikhoan` (`taikhoan`);

--
-- Indexes for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `masp_unique` (`masp`),
  ADD KEY `manhom` (`manhom`);

--
-- Indexes for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  ADD PRIMARY KEY (`id`),
  ADD KEY `LoaiTin` (`LoaiTin`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tbhoadon`
--
ALTER TABLE `tbhoadon`
  MODIFY `mahd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbloaitin`
--
ALTER TABLE `tbloaitin`
  MODIFY `LoaiTin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbnhomsp`
--
ALTER TABLE `tbnhomsp`
  MODIFY `manhom` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tbquantri`
--
ALTER TABLE `tbquantri`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbchitiethoadon`
--
ALTER TABLE `tbchitiethoadon`
  ADD CONSTRAINT `tbchitiethoadon_ibfk_1` FOREIGN KEY (`mahd`) REFERENCES `tbhoadon` (`mahd`),
  ADD CONSTRAINT `tbchitiethoadon_ibfk_2` FOREIGN KEY (`idsp`) REFERENCES `tbsanpham` (`id`);

--
-- Constraints for table `tbsanpham`
--
ALTER TABLE `tbsanpham`
  ADD CONSTRAINT `tbsanpham_ibfk_1` FOREIGN KEY (`manhom`) REFERENCES `tbnhomsp` (`manhom`);

--
-- Constraints for table `tbtintuc`
--
ALTER TABLE `tbtintuc`
  ADD CONSTRAINT `tbtintuc_ibfk_1` FOREIGN KEY (`LoaiTin`) REFERENCES `tbloaitin` (`LoaiTin`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
