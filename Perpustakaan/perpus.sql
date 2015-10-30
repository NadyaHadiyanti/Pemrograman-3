-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 30 Okt 2015 pada 09.24
-- Versi Server: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `perpus`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `anggota`
--

CREATE TABLE IF NOT EXISTS `anggota` (
  `id_anggota` varchar(5) NOT NULL,
  `npm` varchar(12) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jurusan` varchar(20) NOT NULL,
  `tgl_daftar` date NOT NULL,
  PRIMARY KEY (`id_anggota`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `anggota`
--

INSERT INTO `anggota` (`id_anggota`, `npm`, `nama`, `jurusan`, `tgl_daftar`) VALUES
('44021', '4513210027', 'Kusakawa Takuya', 'Teknik Informatika', '2015-03-12'),
('44022', '4412210009', 'Yoshino Kouichi', 'Arsitektur', '2014-11-07'),
('44023', '4513210021', 'Fukuda Yuusuke', 'Teknik Informatika', '2015-01-09'),
('44024', '4214210018', 'Matsuo Takashi', 'Teknik Elektro', '2014-12-17');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku`
--

CREATE TABLE IF NOT EXISTS `buku` (
  `kode_buku` varchar(6) NOT NULL,
  `judul` varchar(30) NOT NULL,
  `pengarang` varchar(30) NOT NULL,
  `penerbit` varchar(20) NOT NULL,
  `tahun` year(4) NOT NULL,
  PRIMARY KEY (`kode_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `buku`
--

INSERT INTO `buku` (`kode_buku`, `judul`, `pengarang`, `penerbit`, `tahun`) VALUES
('B013IT', 'PHP dan MySQL untuk Web', 'Bimo Sunarfrihartono, ST', 'ANDI', 2002),
('B078IT', 'Manajemen Database Identitas', 'Ir. Yuniarto Nurwono', 'ANDI', 2005),
('B214AR', 'Pengantar Teknik Pondasi', 'Dian Ariestadi', 'Kanisius', 1990),
('B392EL', 'Dasar-Dasar Teknik Listrik', 'L. Widarto dan Suryanta', 'Kanisius', 1995);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login_admin`
--

CREATE TABLE IF NOT EXISTS `login_admin` (
  `id_admin` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY (`id_admin`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data untuk tabel `login_admin`
--

INSERT INTO `login_admin` (`id_admin`, `username`, `password`) VALUES
(1, 'NadyaHadiyanti', 'trafa12'),
(2, 'nadya', 'nadya12');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengembalian`
--

CREATE TABLE IF NOT EXISTS `pengembalian` (
  `no_transaksi` varchar(10) NOT NULL,
  `no_pinjam` varchar(6) NOT NULL,
  `tgl_kembali` varchar(15) NOT NULL,
  `status` varchar(10) NOT NULL,
  PRIMARY KEY (`no_transaksi`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pengembalian`
--

INSERT INTO `pengembalian` (`no_transaksi`, `no_pinjam`, `tgl_kembali`, `status`) VALUES
('T0124', 'P01085', '2015-10-20', 'Telat'),
('T0125', 'P01086', '2015-05-25', 'Tepat'),
('T0126', 'P01087', '2015-10-07', 'Tepat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam`
--

CREATE TABLE IF NOT EXISTS `pinjam` (
  `no_pinjam` varchar(6) NOT NULL,
  `id_anggota` varchar(5) NOT NULL,
  `kode_buku` varchar(6) NOT NULL,
  `tgl_pinjam` varchar(20) NOT NULL,
  `tgl_hrskembali` varchar(20) NOT NULL,
  PRIMARY KEY (`no_pinjam`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pinjam`
--

INSERT INTO `pinjam` (`no_pinjam`, `id_anggota`, `kode_buku`, `tgl_pinjam`, `tgl_hrskembali`) VALUES
('43245', '44088', 'B010EL', '2015-10-14', '2015-10-16'),
('P01083', '44025', 'B010EL', '2015-10-14', '2015-10-16'),
('P01084', 'bcjk', 'B078IT', '2015-06-09', '2015-06-16'),
('P01085', '44024', 'B392EL', '2015-09-14', '2015-10-19'),
('P01086', '44022', 'B214AR', '2015-05-20', '2015-05-27'),
('P01087', '44023', 'B013IT', '2015-10-01', '2015-10-08');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
