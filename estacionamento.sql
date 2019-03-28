-- phpMyAdmin SQL Dump
-- version 4.8.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Mar-2019 às 22:00
-- Versão do servidor: 10.1.32-MariaDB
-- PHP Version: 7.2.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

CREATE TABLE `carro` (
  `id` int(11) NOT NULL,
  `placa` char(8) NOT NULL,
  `cor` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT '0',
  `idCliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`id`, `placa`, `cor`, `modelo`, `marca`, `ativo`, `idCliente`) VALUES
(3, 'DAS-2313', '', '', '', 0, 2),
(4, 'AAA-1111', '', '', '', 0, 1),
(5, 'AAA-2222', '', '', '', 0, 1),
(6, 'AAA-3333', '', '', '', 0, 3),
(7, 'AAS-1211', 'ads', '', '', 0, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT '1',
  `tipo` enum('Servidor','Público') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `ativo`, `tipo`) VALUES
(1, 'henrique', 1, 'Público'),
(2, 'jose', 1, 'Público'),
(3, 'aaaa', 1, 'Servidor');

-- --------------------------------------------------------

--
-- Estrutura da tabela `servico`
--

CREATE TABLE `servico` (
  `id` int(11) NOT NULL,
  `hora_entrada` datetime DEFAULT NULL,
  `hora_saida` datetime DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `ativo` tinyint(1) DEFAULT '1',
  `idCarro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `servico`
--

INSERT INTO `servico` (`id`, `hora_entrada`, `hora_saida`, `valor`, `ativo`, `idCarro`) VALUES
(1, '2019-03-28 10:49:00', '2019-03-28 15:57:00', 20, 1, 4),
(2, '2019-03-28 12:50:00', '2019-03-28 15:50:00', 12, 1, 5),
(3, '2019-03-28 15:50:00', '2019-03-28 15:59:00', 0, 1, 3);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carro`
--
ALTER TABLE `carro`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `placa` (`placa`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `servico`
--
ALTER TABLE `servico`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idCarro` (`idCarro`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carro`
--
ALTER TABLE `carro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `servico`
--
ALTER TABLE `servico`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `carro`
--
ALTER TABLE `carro`
  ADD CONSTRAINT `carro_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`id`);

--
-- Limitadores para a tabela `servico`
--
ALTER TABLE `servico`
  ADD CONSTRAINT `servico_ibfk_1` FOREIGN KEY (`idCarro`) REFERENCES `carro` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
