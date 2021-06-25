CREATE DATABASE  IF NOT EXISTS `testdb1` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `testdb1`;
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
-- Table structure for table `t_board`
--

DROP TABLE IF EXISTS `t_board`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_board` (
  `board_idx` int NOT NULL AUTO_INCREMENT COMMENT '글번호',
  `title` varchar(300) NOT NULL COMMENT '제목',
  `contents` text NOT NULL,
  `hit_cnt` smallint NOT NULL DEFAULT '0' COMMENT '조회수',
  `created_date` datetime NOT NULL COMMENT '작성시간',
  `creator_id` varchar(45) NOT NULL COMMENT '작성자ID',
  `updated_date` datetime DEFAULT NULL COMMENT '수정시간',
  `updater_id` varchar(45) DEFAULT NULL COMMENT '수정 ID',
  `deleted_yn` char(1) NOT NULL DEFAULT 'N' COMMENT '삭제여부',
  PRIMARY KEY (`board_idx`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_board`
--

LOCK TABLES `t_board` WRITE;
/*!40000 ALTER TABLE `t_board` DISABLE KEYS */;
INSERT INTO `t_board` VALUES (1,'제목1','컨텐츠 1',0,'2021-06-08 15:08:12','tester1',NULL,NULL,'N'),(4,'제목4','컨텐츠 4',0,'2021-06-10 11:24:50','tester1',NULL,NULL,'Y'),(5,'수정된 제목5','수정된 컨텐츠5',0,'2021-06-10 11:29:00','tester1','2021-06-10 15:03:39','tester1','N'),(6,'제목6','컨텐츠 6',0,'2021-06-10 15:03:56','tester1',NULL,NULL,'N'),(7,'업로드','',0,'2021-06-15 16:31:05','tester1',NULL,NULL,'N'),(8,'업로드 테스트 수정','업로드 테스트 수정된 글..',9,'2021-06-15 16:31:26','tester1','2021-06-25 09:17:17',NULL,'N'),(9,'업로드 테스트','글 업로드',3,'2021-06-21 09:16:22','tester1',NULL,NULL,'Y'),(10,'테스트 제목 7','테스트 내용 7',2,'2021-06-24 12:42:02','tester7',NULL,NULL,'Y'),(11,'REST API를 사용한 글 등록 테스트','REST API를 사용한 글 등록 테스트 내용',0,'2021-06-25 10:51:49','tester1',NULL,NULL,'N'),(12,'REST API를 사용한 글 등록 테스트 제목2','REST API를 사용한 글 등록 테스트 내용2',0,'2021-06-25 11:10:30','tester1',NULL,NULL,'N');
/*!40000 ALTER TABLE `t_board` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_file`
--

DROP TABLE IF EXISTS `t_file`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_file` (
  `idx` int NOT NULL AUTO_INCREMENT,
  `board_idx` int NOT NULL,
  `original_file_name` varchar(255) NOT NULL,
  `stored_file_path` varchar(500) NOT NULL,
  `file_size` int unsigned DEFAULT NULL,
  `creator_id` varchar(45) NOT NULL,
  `created_date` datetime NOT NULL,
  `updater_id` varchar(45) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `deleted_yn` char(1) DEFAULT 'N',
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_file`
--

LOCK TABLES `t_file` WRITE;
/*!40000 ALTER TABLE `t_file` DISABLE KEYS */;
INSERT INTO `t_file` VALUES (1,8,'pengsu002.jpg','images/20210615/27574045466400.jpg',6637,'tester1','2021-06-15 16:31:26',NULL,NULL,'N'),(2,8,'pengsu001.jpg','images/20210615/27574046811000.jpg',7740,'tester1','2021-06-15 16:31:26',NULL,NULL,'N'),(3,9,'pengsu001.jpg','images/20210621/404755815250100.jpg',7740,'tester1','2021-06-21 09:16:22',NULL,NULL,'N');
/*!40000 ALTER TABLE `t_file` ENABLE KEYS */;
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

-- Dump completed on 2021-06-25 11:12:52
