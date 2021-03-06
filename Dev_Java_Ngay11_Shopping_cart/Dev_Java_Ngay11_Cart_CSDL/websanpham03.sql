-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2020 at 03:08 PM
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
(5, 3, 1, 1, 5000000),
(6, 3, 2, 2, 20000),
(7, 4, 1, 1, 5000000),
(8, 4, 2, 2, 20000),
(9, 5, 2, 1, 2000000),
(10, 5, 4, 1, 12000000),
(11, 5, 6, 1, 10000000),
(14, 7, 2, 1, 2000000),
(15, 7, 6, 2, 10000000),
(18, 9, 1, 2, 5000000),
(19, 9, 2, 1, 2000000),
(27, 13, 1, 1, 5000000),
(28, 13, 2, 2, 2000000),
(29, 14, 1, 1, 5000000),
(30, 14, 2, 1, 2000000),
(31, 15, 1, 1, 5000000),
(32, 15, 2, 1, 2000000),
(33, 16, 1, 2, 5000000),
(34, 16, 2, 3, 2000000),
(35, 17, 1, 1, 5000000),
(36, 17, 2, 1, 2000000),
(37, 17, 3, 1, 5000000),
(38, 18, 1, 2, 5000000),
(39, 18, 2, 1, 2000000);

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
(3, 'abc19', '123456789', '2018-09-19 21:17:17', '2018-09-20 21:16:00', 1),
(4, 'abc20', '0912356004', '2018-09-19 21:17:47', '2018-09-20 21:17:00', 2),
(5, 'Ng???c Anh', '0123456789', '2019-09-03 10:13:06', '2019-09-05 10:12:00', 3),
(7, 'Nguy???n ?????c Anh', '0123456789', '2019-09-05 10:09:15', '2019-09-06 11:41:00', 2),
(9, '?????ng V??n L??m', '0123456789', '2019-09-05 11:22:56', '2019-09-06 11:41:00', 1),
(13, 'Nguy???n Ho??ng Chung', '0123456789', '2019-10-08 16:32:39', '2019-09-06 11:41:00', 2),
(14, 'Nguy???n Ho??ng Chung2', '0123456789', '2019-10-08 16:45:23', '2019-10-09 15:00:00', 0),
(15, 'Lan Anh', '123456778', '2019-10-16 17:28:12', '2019-10-19 17:28:00', 2),
(16, 'Ph???m Ho??ng H???i', '0123456789', '2019-10-29 20:15:39', '2019-10-30 21:00:00', 2),
(17, 'Hoang Anh Tuan', '1244555', '2019-12-07 08:23:07', '2019-12-05 10:12:00', 2),
(18, 'H???ng Nhung', '12345678', '2020-06-12 21:15:21', '2020-06-15 00:00:00', 0);

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
-- Table structure for table `tbnhanvien`
--

CREATE TABLE `tbnhanvien` (
  `id` int(11) NOT NULL,
  `hoten` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `dienthoai` varchar(20) DEFAULT NULL,
  `hinhanh` varchar(255) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbnhanvien`
--

INSERT INTO `tbnhanvien` (`id`, `hoten`, `dienthoai`, `hinhanh`) VALUES
(3, '?????ng V??n L??m', '12345678', '1810_32_1.jpg'),
(4, 'Nguy???n Ng???c Anh', '012242343434', 'hoa-hop-bx-093.jpg'),
(5, '?????ng V??n L??m 3', '4737474', 'aoseminam01.jpg'),
(6, 'Nguy???n V??n D??ng', '1234', 'cdyduoc.jpg'),
(7, 'Messi234', '123456789', ''),
(8, 'Ronaldo', '123456789', 'logo.png');

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
(9, 'B??n gh???', 5, 1);

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
(1, 'sp01', '??i???n tho???i iphone', 5000000, 2, 'iphone-8-plus-hh-600x600.jpg', '<p>t&oacute;m t???t s???n ph???m 1</p>\r\n\r\n<p>t&oacute;m t???t s???n ph???m 1</p>\r\n\r\n<p>t&oacute;m t???t s???n ph???m 1</p>\r\n', '<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n\r\n<p>chi ti???t s???n ph???m 1</p>\r\n', 1),
(2, 'sp02', 'M??y t??nh 2', 2000000, 1, 'apple-macbook-pro-touch-mr9q2sa-a-2018-thumb-1-600x600.jpg', '', '', 1),
(3, 'SP04', 'M??y t??nh 1', 5000000, 1, 'apple-macbook-air-mqd32sa-a-i5-5350u-400-1-450x300-600x600.jpg', '', '', 1),
(4, 'SP05', '??i???n tho???i 5', 12000000, 2, 'oppo-a3s-red-600x600.jpg', '', '', 1),
(6, 'SP053', '??i???n tho???i 6', 10000000, 2, 'samsung-galaxy-s9-plus-64gb-xanh-san-ho-2-1-600x600.jpg', '', '', 1),
(7, 'banghe01', 'B??? b??n ??n 01', 10000000, 9, 'Ban-ghe-an-ma-32.1.jpg', '<p><strong>B??? B&agrave;n ??n Xoan Ta 6 gh??? BT06 ???????c s??? d???ng nguy&ecirc;n li???u l&agrave; g??? xoan ta ??&atilde; qua t???m s???y ch???ng m???i m???t. ?????m b???o ????? b???n, m???u m&atilde; th??? hi???n s??? ???m c&uacute;ng, th&acirc;n thu???c. Thi???t k??? ??a d???ng v???i m&agrave;u s???c ch&iacute;nh v&agrave;ng g??? s???i. </strong><br />\r\nB??? B&agrave;n ??n Xoan Ta 6 gh??? BT06 c&oacute; b&agrave;n k&iacute;nh d&agrave;y 8mm bo tr&ograve;n c???nh v&agrave; 6 gh??? ??i c&ugrave;ng. T???i ch??? n???i th???t Ph&aacute;t Ph&aacute;t lu&ocirc;n l&agrave; ????n v??? ??i ?????u tr???ng vi???c s???n xu???t n???i th???t gi&aacute; r???, ch???t l?????ng. C&aacute;c s???n ph???m n???i th???t gia ??&igrave;nh ???????c kh&aacute;ch h&agrave;ng tin d&ugrave;ng v???i nhi???u ki???u d&aacute;ng th&iacute;ch h???p b???i ki???u d&aacute;ng hi???n ?????i, ch???t l?????ng t????ng ??????ng v???i gi&aacute; th&agrave;nh qu&yacute; kh&aacute;ch b??? ra.</p>\r\n', '<p>???i n???i th???t PH&Aacute;T PH&Aacute;T, qu&yacute; kh&aacute;ch s??? ???????c: Mua C&agrave;ng Nhi???u Gi&aacute; C&agrave;ng T???t &ndash; ??? ??&acirc;u R??? Ph&aacute;t Ph&aacute;t R??? H??n! &ldquo;Ph&aacute;t Ph&aacute;t c&oacute; Kho h&agrave;ng l???n v&igrave; v???y s??? l?????ng v&agrave; ch???ng lo???i c&aacute;c s???n ph???m n???i th???t Ph&aacute;t Ph&aacute;t qu&aacute; nhi???u, h&igrave;nh ???nh tr&ecirc;n website kh&ocirc;ng th??? c???p nh???t h???t.</p>\r\n\r\n<p>Qu&yacute; kh&aacute;ch c&oacute; th??? tr???c ti???p qua kho ????? xem h&agrave;ng, ho???c li&ecirc;n h??? 0969 882 500 ho???c page Ph&aacute;t Ph&aacute;t. ( ?????c bi???t &Ocirc; t&ocirc; con, Xe t???i, Container 1,25 t???n &ndash; 3,5 t???n v&agrave;o 24/24h, ???????ng L&ecirc; Quang ?????o xe Container 40 feet ra v&agrave;o tho???i m&aacute;i kh&ocirc;ng b??? c???m).</p>\r\n\r\n<p>C&aacute;c s???n ph???m b&agrave;n gh??? l&agrave;m vi???c c???a N???i th???t Ph&aacute;t Ph&aacute;t ?????u ???????c l???a ch???n theo xu h?????ng theo thi???t k??? hi???n h&agrave;nh. V&igrave; th??? kh&ocirc;ng ch??? c&oacute; c&aacute;c lo???i N???i th???t v??n ph&ograve;ng ch???t l?????ng m&agrave; gi&aacute; r??? h??n so v???i th??? tr?????ng.</p>\r\n', 1),
(8, 'sp01abc123', 's???n ph???m 123', 100000, 2, 'aoseminam01.jpg', '<p>Th&ocirc;ng b&aacute;o khai gi???ng l???p l???p tr&igrave;nh PHP m???i, d???y theo nhu c???u v&agrave; ch????ng tr&igrave;nh ph&ugrave; h???p v???i kh??? n??ng v&agrave; tr&igrave;nh ????? c???a sinh vi&ecirc;n.</p>\r\n\r\n<p>L???p h???c b???t ?????u t???i nay, h???c t??? 6h-9h t???i Th??? 2, 3, 5. (C&Oacute; TH??? S???P X???P GI??? H???C KH&Aacute;C THEO NHU C???U C???A L???P)</p>\r\n\r\n<p>C&aacute;c em c&oacute; th??? tham gia h???c th??? v&agrave; gi???i thi???u c&aacute;c b???n c&oacute; nhu c???u h???c l???p tr&igrave;nh ???ng d???ng web.</p>\r\n\r\n<p>????&nbsp;?????a ??i???m:<br />\r\nPh&ograve;ng h???c tr&ecirc;n t???ng 3.<br />\r\nTrung t&acirc;m k??? n??ng th???c h&agrave;nh c?? gi???i ???????ng b??? - Cao ?????ng giao th&ocirc;ng v???n t???i TW<br />\r\nS??? 6 ng&otilde; 29 ???????ng Gi&aacute;p B&aacute;t<br />\r\n?????i di???n si&ecirc;u th??? ??i???n m&aacute;y HC ???????ng Gi???i Ph&oacute;ng.<br />\r\n??i t??? ?????u ph??? Gi&aacute;p B&aacute;t (649 Gi???i Ph&oacute;ng) ??i v&agrave;o t???m 50m v&agrave;o ng&otilde; 29 l&agrave; th???y Trung t&acirc;m.</p>\r\n\r\n<p>Li&ecirc;n h??? th???y Tr?????ng s??? 0912356004</p>\r\n', '<p>Th&ocirc;ng b&aacute;o khai gi???ng l???p l???p tr&igrave;nh PHP m???i, d???y theo nhu c???u v&agrave; ch????ng tr&igrave;nh ph&ugrave; h???p v???i kh??? n??ng v&agrave; tr&igrave;nh ????? c???a sinh vi&ecirc;n.</p>\r\n\r\n<p>L???p h???c b???t ?????u t???i nay, h???c t??? 6h-9h t???i Th??? 2, 3, 5. (C&Oacute; TH??? S???P X???P GI??? H???C KH&Aacute;C THEO NHU C???U C???A L???P)</p>\r\n\r\n<p>C&aacute;c em c&oacute; th??? tham gia h???c th??? v&agrave; gi???i thi???u c&aacute;c b???n c&oacute; nhu c???u h???c l???p tr&igrave;nh ???ng d???ng web.</p>\r\n\r\n<p>????&nbsp;?????a ??i???m:<br />\r\nPh&ograve;ng h???c tr&ecirc;n t???ng 3.<br />\r\nTrung t&acirc;m k??? n??ng th???c h&agrave;nh c?? gi???i ???????ng b??? - Cao ?????ng giao th&ocirc;ng v???n t???i TW<br />\r\nS??? 6 ng&otilde; 29 ???????ng Gi&aacute;p B&aacute;t<br />\r\n?????i di???n si&ecirc;u th??? ??i???n m&aacute;y HC ???????ng Gi???i Ph&oacute;ng.<br />\r\n??i t??? ?????u ph??? Gi&aacute;p B&aacute;t (649 Gi???i Ph&oacute;ng) ??i v&agrave;o t???m 50m v&agrave;o ng&otilde; 29 l&agrave; th???y Trung t&acirc;m.</p>\r\n\r\n<p>Li&ecirc;n h??? th???y Tr?????ng s??? 0912356004</p>\r\n', 1);

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
-- Indexes for table `tbnhanvien`
--
ALTER TABLE `tbnhanvien`
  ADD PRIMARY KEY (`id`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `tbhoadon`
--
ALTER TABLE `tbhoadon`
  MODIFY `mahd` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT for table `tbloaitin`
--
ALTER TABLE `tbloaitin`
  MODIFY `LoaiTin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tbnhanvien`
--
ALTER TABLE `tbnhanvien`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

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
