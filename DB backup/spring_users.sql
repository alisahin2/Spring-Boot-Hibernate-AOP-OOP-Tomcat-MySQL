-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: spring
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `surname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `startedDate` date DEFAULT NULL,
  `adress` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `about` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `salary` int DEFAULT '0',
  `visibility` tinyint DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'ali','sahin','05553213232','2011-11-20',' turkey','',3500,1),(2,'sem','ak','03332221144','2000-01-01','turkey',NULL,3500,1),(3,'emre','kartal','05553214332','2012-11-20',' turkey','about',4230,1),(4,'john','smith','05323257932','2013-10-21',' england','man',0,1),(5,'john','smith','05323257932','2013-10-21',' england','man',0,1),(7,'john','smith','05323257932','2013-10-21',' england','man',0,0),(8,'john','smith','05323257932','2013-10-21',' england','man',0,0),(9,'john','smith','05323257932','2013-10-21',' england','man',0,0),(10,'john','smith','05323257932','2013-10-21',' england','man',0,0),(11,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(12,'john','smith','05323257932','2013-10-21',' england','man',2345,1),(13,'john','smith','05323257932','2013-10-21',' england','man',2345,1),(14,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(15,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(16,'john','smith','05323257932','2013-10-21',' england','man',2345,1),(17,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(18,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(19,'john','smith','05323257932','2013-10-21',' england','man',2345,0),(20,'walter','white','06665554433','2012-01-01','NY','His job is teacher',5670,1);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-11  0:31:00
