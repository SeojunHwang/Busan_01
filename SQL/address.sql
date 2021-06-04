-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: testdb1
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `id` varchar(50) DEFAULT NULL,
  `pw` varchar(50) NOT NULL,
  `userName` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT 'defaultEmail@gmail.com',
  `num` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`num`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES ('test1','1234','테스트1','test1@gmail.com',21),('test2','1234','테스트2','test2@gmail.com',22),('test3','1234','테스트3','test3@gmail.com',23),('test4','1234',NULL,'defaultEmail@gmail.com',24),('test5','1234',NULL,'defaultEmail@gmail.com',25),('test6','1234','테스트6','test6@naver.com',27),('test11','1234','테스트11','test11@gmail.com',28),('test12','1234','테스트12','test12@gmail.com',29),('test13','1234','테스트13','test13@gmail.com',30),('test14','1234','테스트14','test14@gmail.com',31),('test15','1234','테스트15','test15@gmail.com',32),('test16','1234','테스트16','test16@gmail.com',34),('test21','1234','테스트21','defaultEmail@gmail.com',35),('test22','1234','테스트22','defaultEmail@gmail.com',36),('test23','1234','테스트23','defaultEmail@gmail.com',37),('test24','1234','테스트24','defaultEmail@gmail.com',39),('test25','1234','테스트25','test25@gmail.com',40),('test26','1234','테스트29','test29@gmail.com',41);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'testdb1'
--

--
-- Dumping routines for database 'testdb1'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-04 14:00:12
