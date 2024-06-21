-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2024 at 03:52 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stock_managment_system_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `id` int(11) NOT NULL,
  `product` varchar(60) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unityPrice` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `date` varchar(60) NOT NULL,
  `action` varchar(10) NOT NULL DEFAULT 'in'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`id`, `product`, `quantity`, `unityPrice`, `total`, `date`, `action`) VALUES
(1, 'LV shart', 60, 7000, 7000, '03/04/2024', 'Deleted'),
(2, 'LV shart', 30, 17000, 510000, '03/04/2024', 'in'),
(3, 'Gucci Pants', 20, 21000, 21000, '03/04/2024', 'Deleted'),
(4, 'Gucci Pants', 15, 12000, 180000, '03/04/2024', 'in'),
(5, 'J5', 30, 19000, 19000, '03/04/2024', 'Deleted'),
(6, 'LV shart', 10, 17000, 170000, '03/04/2024', 'in'),
(7, 'LV shart', 30, 7000, 210000, '03/04/2024', 'Out'),
(8, 'Jordan 1', 150, 1700, 255000, '03/04/2024', 'Updated'),
(9, 'phendi bag', 50, 15000, 750000, '08/04/2024', 'in'),
(10, 'phendi bag', 20, 15000, 300000, '08/04/2024', 'Out');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(60) NOT NULL,
  `category` varchar(60) NOT NULL,
  `brand` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `category`, `brand`) VALUES
(4, 'J5', 'Shoes', 'Dior'),
(6, 'Jordan 1', 'Shoes', 'Dior'),
(7, 'Gucci Pants', 'Pants', 'Gucci'),
(8, 'Red Dress', 'Dresses', 'Prada'),
(9, 'LV shart', 'T-shirt', 'Caguwa'),
(10, 'phendi bag', 'Harts', 'Caguwa');

-- --------------------------------------------------------

--
-- Table structure for table `stockin`
--

CREATE TABLE `stockin` (
  `id` int(11) NOT NULL,
  `product` varchar(60) NOT NULL,
  `quantity` int(11) NOT NULL,
  `unityPrice` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `date` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockin`
--

INSERT INTO `stockin` (`id`, `product`, `quantity`, `unityPrice`, `total`, `date`) VALUES
(2, 'testing nameX2', 15, 1200, 18000, '2024/04/93'),
(3, 'Jordan 1', 150, 1700, 255000, '03/04/2024'),
(5, 'Red Dress', 0, 30000, 300000, '03/04/2024'),
(6, 'Red Dress', 20, 25000, 500000, '03/04/2024'),
(8, 'LV shart', 20, 17000, 170000, '03/04/2024'),
(9, 'Gucci Pants', 15, 12000, 180000, '03/04/2024'),
(10, 'phendi bag', 30, 15000, 300000, '08/04/2024');

-- --------------------------------------------------------

--
-- Table structure for table `stockout`
--

CREATE TABLE `stockout` (
  `id` int(11) NOT NULL,
  `product` varchar(60) NOT NULL,
  `quantity` varchar(60) NOT NULL,
  `unityPrice` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `date` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stockout`
--

INSERT INTO `stockout` (`id`, `product`, `quantity`, `unityPrice`, `total`, `date`) VALUES
(1, 'J5', '50', 19000, 950000, '2024/04/94'),
(2, 'testing nameX2', '40', 1200, 48000, '2024/04/94'),
(3, 'J5', '20', 19000, 380000, '2024/04/94'),
(4, 'J5', '30', 19000, 570000, '2024/04/94'),
(5, 'J5', '20', 19000, 380000, '2024/04/94'),
(6, 'Red Dress', '5', 30000, 150000, '2024/04/94'),
(7, 'Red Dress', '10', 30000, 300000, '03/04/2024'),
(8, 'LV shart', '10', 17000, 170000, '03/04/2024'),
(9, 'LV shart', '30', 7000, 210000, '03/04/2024'),
(10, 'phendi bag', '20', 15000, 300000, '08/04/2024');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `history`
--
ALTER TABLE `history`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indexes for table `stockin`
--
ALTER TABLE `stockin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stockout`
--
ALTER TABLE `stockout`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `history`
--
ALTER TABLE `history`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `stockin`
--
ALTER TABLE `stockin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `stockout`
--
ALTER TABLE `stockout`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
