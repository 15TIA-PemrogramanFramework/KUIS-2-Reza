-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 14 Des 2017 pada 17.06
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1070`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas`
--

CREATE TABLE `identitas` (
  `id` bigint(20) NOT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nama` varchar(255) NOT NULL,
  `prodi` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas`
--

INSERT INTO `identitas` (`id`, `kelas`, `nama`, `prodi`) VALUES
(1, '3 TI A', 'Reza', 'TI');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk`
--

CREATE TABLE `ipk` (
  `id` bigint(20) NOT NULL,
  `jurusan` varchar(255) DEFAULT NULL,
  `nilai` varchar(255) NOT NULL,
  `tahun` varchar(255) DEFAULT NULL,
  `identitas_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk`
--

INSERT INTO `ipk` (`id`, `jurusan`, `nilai`, `tahun`, `identitas_id`) VALUES
(1, 'Komnputer', '90', '2015', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas`
--
ALTER TABLE `identitas`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_t096t1drjhgmlqf9cx4eskfeb` (`nama`);

--
-- Indexes for table `ipk`
--
ALTER TABLE `ipk`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_ibr8disvxsvt6u5qjqye28s51` (`nilai`),
  ADD KEY `FK3bxhv7ondr09967okctdhwdfo` (`identitas_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas`
--
ALTER TABLE `identitas`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `ipk`
--
ALTER TABLE `ipk`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk`
--
ALTER TABLE `ipk`
  ADD CONSTRAINT `FK3bxhv7ondr09967okctdhwdfo` FOREIGN KEY (`identitas_id`) REFERENCES `identitas` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
