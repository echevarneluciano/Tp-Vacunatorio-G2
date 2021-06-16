-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2021 a las 01:00:35
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar-g2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `paisOrigen` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `nombre`, `paisOrigen`, `direccion`, `estado`) VALUES
(1, 'Inglish lab sa', 'Inglaterra', '2st san peterson', 0),
(2, 'Chinchu lab', 'China', 'Barrio chino 123', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `patologia`
--

CREATE TABLE `patologia` (
  `idPatologia` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `patologia`
--

INSERT INTO `patologia` (`idPatologia`, `Nombre`, `estado`) VALUES
(1, 'Asma', 1),
(2, 'Obesidad', 1),
(3, 'Hipertension', 0),
(4, 'Ninguna', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `dni` bigint(20) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `fechaNac` date NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `idPersona` int(11) NOT NULL,
  `idPatologia` int(11) NOT NULL,
  `trabajo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `peso` float NOT NULL,
  `altura` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`dni`, `nombre`, `apellido`, `fechaNac`, `localidad`, `direccion`, `email`, `telefono`, `idPersona`, `idPatologia`, `trabajo`, `estado`, `peso`, `altura`) VALUES
(3322, 'luciano', 'echevarene', '2021-06-01', 'san luis', 'cerro', 'lalal@lsla', 332244, 3, 4, 'loqhay', 1, 74, 1.82),
(122, 'qweq', 'qweq', '2021-06-04', 'eqw', 'qw', 'dqwdq', 31, 4, 4, 'Informal', 1, 123, 32),
(1228, 'wd', 'dw', '2021-06-18', 'dwd', 'swdw', 'ad', 2, 6, 2, 'Educacion', 1, 3, 3),
(1229, 'qwe', 'dqw', '2021-06-11', 'dwa', 'eqw', 'qsd', 3, 8, 1, 'Informal', 1, 4, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `idLaboratorio` int(11) NOT NULL,
  `nroSerie` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idVacuna` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`idLaboratorio`, `nroSerie`, `estado`, `idVacuna`) VALUES
(2, 101, 1, 1),
(1, 100, 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacunatorios`
--

CREATE TABLE `vacunatorios` (
  `idVacunatorio` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `localidad` varchar(20) NOT NULL,
  `calle` varchar(30) NOT NULL,
  `altura` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vacunatorios`
--

INSERT INTO `vacunatorios` (`idVacunatorio`, `nombre`, `localidad`, `calle`, `altura`, `estado`) VALUES
(1, 'Policlinico San Luis', 'San Luis', 'Porhai ', 123, 0),
(2, 'Poli VM', 'VM', 'Porhaidos', 321, 0);


-- --------------------------------------------------------
--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `idPersona` int(11) NOT NULL,
  `idVacunatorio` int(11) NOT NULL,
  `fechYhorTurno` datetime NOT NULL,
  `motivo` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idCita` int(11) NOT NULL,
  `idVacuna` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------
--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`idCita`),
  ADD KEY `idPersona` (`idPersona`),
  ADD KEY `idVacunatorio` (`idVacunatorio`),
  ADD KEY `idVacuna` (`idVacuna`) USING BTREE;

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `idLaboratorio` (`idLaboratorio`);

--
-- Indices de la tabla `patologia`
--
ALTER TABLE `patologia`
  ADD PRIMARY KEY (`idPatologia`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD UNIQUE KEY `dni-idpersona` (`dni`,`idPersona`),
  ADD KEY `idPatologia` (`idPatologia`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`idVacuna`),
  ADD UNIQUE KEY `nroSerie` (`nroSerie`),
  ADD KEY `idLaboratorio` (`idLaboratorio`);

--
-- Indices de la tabla `vacunatorios`
--
ALTER TABLE `vacunatorios`
  ADD PRIMARY KEY (`idVacunatorio`),
  ADD UNIQUE KEY `idVacunatorio` (`idVacunatorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `idCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `patologia`
--
ALTER TABLE `patologia`
  MODIFY `idPatologia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `idVacuna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `vacunatorios`
--
ALTER TABLE `vacunatorios`
  MODIFY `idVacunatorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `citas_ibfk_2` FOREIGN KEY (`idVacunatorio`) REFERENCES `vacunatorios` (`idVacunatorio`),
  ADD CONSTRAINT `citas_ibfk_3` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`),
  ADD CONSTRAINT `citas_ibfk_4` FOREIGN KEY (`idVacuna`) REFERENCES `vacuna` (`idVacuna`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`idPatologia`) REFERENCES `patologia` (`idPatologia`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `laboratorio` (`idLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
