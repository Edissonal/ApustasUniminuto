-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-04-2019 a las 21:38:13
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `unimonito`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `apuesta`
--

CREATE TABLE `apuesta` (
  `idApuesta` int(200) NOT NULL,
  `idPartido` int(200) NOT NULL,
  `idUsuarios` int(200) NOT NULL,
  `idBoleteria` int(200) NOT NULL,
  `Marcador1` int(200) NOT NULL,
  `Marcador2` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `apuesta`
--

INSERT INTO `apuesta` (`idApuesta`, `idPartido`, `idUsuarios`, `idBoleteria`, `Marcador1`, `Marcador2`) VALUES
(11, 1, 15, 13, 1, 1),
(12, 1, 15, 12, 2, 2),
(13, 1, 18, 8, 2, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleteria`
--

CREATE TABLE `boleteria` (
  `idBoleteria` int(200) NOT NULL,
  `Precio` int(200) NOT NULL,
  `Cantidad` int(200) NOT NULL,
  `idUsuarios` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `boleteria`
--

INSERT INTO `boleteria` (`idBoleteria`, `Precio`, `Cantidad`, `idUsuarios`) VALUES
(8, 33, 122, 11),
(9, 36000, 3, 15),
(10, 50000, 3, 15),
(11, 1, 1, 15),
(12, 40000, 1, 15),
(13, 50000, 1, 16),
(14, 60000, 5, 18);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `idEquipo` int(200) NOT NULL,
  `NombEquipo` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `idTipo_Deporte` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`idEquipo`, `NombEquipo`, `idTipo_Deporte`) VALUES
(1, 'Deportivo Pasto', 3),
(2, 'Deportivo Cali', 3),
(3, 'Atletico Nacional', 3),
(4, 'Lakers', 1),
(5, 'movistar', 5),
(6, 'Bulls', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo2`
--

CREATE TABLE `equipo2` (
  `idEquipo2` int(200) NOT NULL,
  `NombEquipo2` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `idTipo_Deporte` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `equipo2`
--

INSERT INTO `equipo2` (`idEquipo2`, `NombEquipo2`, `idTipo_Deporte`) VALUES
(1, 'Deportes Tolima', 3),
(2, 'sky', 5),
(3, 'Deportivo Medellin', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ganadores`
--

CREATE TABLE `ganadores` (
  `idGanadores` int(200) NOT NULL,
  `idRifa` int(200) NOT NULL,
  `idApuesta` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE `partido` (
  `idPartido` int(200) NOT NULL,
  `idEquipo` int(200) NOT NULL,
  `idEquipo2` int(200) NOT NULL,
  `marcadorEquip1` int(200) NOT NULL,
  `marcadorEquip2` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`idPartido`, `idEquipo`, `idEquipo2`, `marcadorEquip1`, `marcadorEquip2`) VALUES
(1, 1, 1, 2, 4),
(2, 3, 3, 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `perfiles`
--

CREATE TABLE `perfiles` (
  `idPerfiles` int(200) NOT NULL,
  `NombPerf` varchar(200) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `perfiles`
--

INSERT INTO `perfiles` (`idPerfiles`, `NombPerf`) VALUES
(1, 'Administrador'),
(2, 'Estandar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rifa`
--

CREATE TABLE `rifa` (
  `idRifa` int(200) NOT NULL,
  `idUsuarios` int(200) NOT NULL,
  `Premio` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `idBoleteria` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `rifa`
--

INSERT INTO `rifa` (`idRifa`, `idUsuarios`, `Premio`, `idBoleteria`) VALUES
(2, 16, 'cocacola', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_deporte`
--

CREATE TABLE `tipo_deporte` (
  `idTipo_Deporte` int(200) NOT NULL,
  `NombDepor` varchar(200) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `tipo_deporte`
--

INSERT INTO `tipo_deporte` (`idTipo_Deporte`, `NombDepor`) VALUES
(1, 'Baloncesto'),
(3, 'futbol'),
(4, 'Beisbol'),
(5, 'ciclismo'),
(6, 'natacion'),
(7, 'tejo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuarios` int(200) NOT NULL,
  `NombUsu` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `CedulUsu` int(200) NOT NULL,
  `idPerfiles` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuarios`, `NombUsu`, `CedulUsu`, `idPerfiles`) VALUES
(11, 'wwww', 74324, 1),
(12, 'wwww', 74324, 2),
(13, 'wwww', 74324, 2),
(15, 'Ivan Prueba', 1073680979, 1),
(16, 'carlos valderrama', 19087548, 2),
(17, 'Juan Martir', 1894568354, 2),
(18, 'Elizabeth Flores', 1076346, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `apuesta`
--
ALTER TABLE `apuesta`
  ADD PRIMARY KEY (`idApuesta`),
  ADD KEY `idPartido` (`idPartido`) USING BTREE,
  ADD KEY `idUsuarios` (`idUsuarios`) USING BTREE,
  ADD KEY `idBoleteria` (`idBoleteria`) USING BTREE;

--
-- Indices de la tabla `boleteria`
--
ALTER TABLE `boleteria`
  ADD PRIMARY KEY (`idBoleteria`),
  ADD KEY `idUsuarios` (`idUsuarios`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`idEquipo`),
  ADD KEY `idTipo_Deporte` (`idTipo_Deporte`);

--
-- Indices de la tabla `equipo2`
--
ALTER TABLE `equipo2`
  ADD PRIMARY KEY (`idEquipo2`),
  ADD KEY `idTipo_Deporte` (`idTipo_Deporte`);

--
-- Indices de la tabla `ganadores`
--
ALTER TABLE `ganadores`
  ADD PRIMARY KEY (`idGanadores`),
  ADD KEY `idRifa` (`idRifa`),
  ADD KEY `idApuesta` (`idApuesta`);

--
-- Indices de la tabla `partido`
--
ALTER TABLE `partido`
  ADD PRIMARY KEY (`idPartido`),
  ADD KEY `idEquipo` (`idEquipo`),
  ADD KEY `idEquipo2` (`idEquipo2`);

--
-- Indices de la tabla `perfiles`
--
ALTER TABLE `perfiles`
  ADD PRIMARY KEY (`idPerfiles`);

--
-- Indices de la tabla `rifa`
--
ALTER TABLE `rifa`
  ADD PRIMARY KEY (`idRifa`),
  ADD KEY `idUsuarios` (`idUsuarios`),
  ADD KEY `idBoleteria` (`idBoleteria`);

--
-- Indices de la tabla `tipo_deporte`
--
ALTER TABLE `tipo_deporte`
  ADD PRIMARY KEY (`idTipo_Deporte`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuarios`),
  ADD KEY `idPerfiles` (`idPerfiles`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `apuesta`
--
ALTER TABLE `apuesta`
  MODIFY `idApuesta` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `boleteria`
--
ALTER TABLE `boleteria`
  MODIFY `idBoleteria` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `equipo`
--
ALTER TABLE `equipo`
  MODIFY `idEquipo` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `equipo2`
--
ALTER TABLE `equipo2`
  MODIFY `idEquipo2` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `ganadores`
--
ALTER TABLE `ganadores`
  MODIFY `idGanadores` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `partido`
--
ALTER TABLE `partido`
  MODIFY `idPartido` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `perfiles`
--
ALTER TABLE `perfiles`
  MODIFY `idPerfiles` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `rifa`
--
ALTER TABLE `rifa`
  MODIFY `idRifa` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipo_deporte`
--
ALTER TABLE `tipo_deporte`
  MODIFY `idTipo_Deporte` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuarios` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `apuesta`
--
ALTER TABLE `apuesta`
  ADD CONSTRAINT `apuesta_ibfk_1` FOREIGN KEY (`idPartido`) REFERENCES `partido` (`idPartido`),
  ADD CONSTRAINT `apuesta_ibfk_2` FOREIGN KEY (`idUsuarios`) REFERENCES `usuarios` (`idUsuarios`),
  ADD CONSTRAINT `apuesta_ibfk_3` FOREIGN KEY (`idBoleteria`) REFERENCES `boleteria` (`idBoleteria`);

--
-- Filtros para la tabla `boleteria`
--
ALTER TABLE `boleteria`
  ADD CONSTRAINT `boleteria_ibfk_1` FOREIGN KEY (`idUsuarios`) REFERENCES `usuarios` (`idUsuarios`);

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`idTipo_Deporte`) REFERENCES `tipo_deporte` (`idTipo_Deporte`);

--
-- Filtros para la tabla `equipo2`
--
ALTER TABLE `equipo2`
  ADD CONSTRAINT `equipo2_ibfk_1` FOREIGN KEY (`idTipo_Deporte`) REFERENCES `tipo_deporte` (`idTipo_Deporte`);

--
-- Filtros para la tabla `ganadores`
--
ALTER TABLE `ganadores`
  ADD CONSTRAINT `ganadores_ibfk_1` FOREIGN KEY (`idRifa`) REFERENCES `rifa` (`idRifa`),
  ADD CONSTRAINT `ganadores_ibfk_2` FOREIGN KEY (`idApuesta`) REFERENCES `apuesta` (`idApuesta`);

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `partido_ibfk_1` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`idEquipo`),
  ADD CONSTRAINT `partido_ibfk_2` FOREIGN KEY (`idEquipo2`) REFERENCES `equipo2` (`idEquipo2`);

--
-- Filtros para la tabla `rifa`
--
ALTER TABLE `rifa`
  ADD CONSTRAINT `rifa_ibfk_1` FOREIGN KEY (`idBoleteria`) REFERENCES `boleteria` (`idBoleteria`),
  ADD CONSTRAINT `rifa_ibfk_2` FOREIGN KEY (`idUsuarios`) REFERENCES `usuarios` (`idUsuarios`);

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`idPerfiles`) REFERENCES `perfiles` (`idPerfiles`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
