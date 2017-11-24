-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: db_test
-- ------------------------------------------------------
-- Server version	5.7.20-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agence`
--

DROP TABLE IF EXISTS `agence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `agence` (
  `agenceID` int(11) NOT NULL AUTO_INCREMENT,
  `ville` varchar(60) DEFAULT NULL,
  `adresse` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`agenceID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agence`
--

LOCK TABLES `agence` WRITE;
/*!40000 ALTER TABLE `agence` DISABLE KEYS */;
/*!40000 ALTER TABLE `agence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `assurance`
--

DROP TABLE IF EXISTS `assurance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `assurance` (
  `assurID` int(11) NOT NULL AUTO_INCREMENT,
  `prix` double NOT NULL,
  `type` varchar(20) NOT NULL,
  `prixKmSupp` double NOT NULL,
  PRIMARY KEY (`assurID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assurance`
--

LOCK TABLES `assurance` WRITE;
/*!40000 ALTER TABLE `assurance` DISABLE KEYS */;
INSERT INTO `assurance` VALUES (1,100,'100',1),(2,200,'200',2),(3,300,'300',3),(4,400,'400',4),(5,500,'500',5),(6,600,'600',6),(7,1000,'1000',10),(8,700,'700',7),(9,800,'800',8),(10,900,'900',9);
/*!40000 ALTER TABLE `assurance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `facture`
--

DROP TABLE IF EXISTS `facture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `facture` (
  `factID` int(11) NOT NULL AUTO_INCREMENT,
  `montant` double DEFAULT NULL,
  `locationID` int(11) DEFAULT NULL,
  `techID` int(11) DEFAULT NULL,
  `estPaye` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`factID`),
  KEY `tech_FK_idx` (`techID`),
  KEY `location_FK_idx` (`locationID`),
  CONSTRAINT `location_FK` FOREIGN KEY (`locationID`) REFERENCES `location` (`locationID`) ON UPDATE CASCADE,
  CONSTRAINT `tech_FK` FOREIGN KEY (`techID`) REFERENCES `personne` (`personneID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facture`
--

LOCK TABLES `facture` WRITE;
/*!40000 ALTER TABLE `facture` DISABLE KEYS */;
/*!40000 ALTER TABLE `facture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location` (
  `locationID` int(11) NOT NULL AUTO_INCREMENT,
  `personneID` int(11) NOT NULL,
  `assurID` int(11) NOT NULL,
  `voitureID` int(11) NOT NULL,
  `accompte` int(11) NOT NULL,
  `accomptePaye` tinyint(1) NOT NULL,
  `kmInitial` int(11) NOT NULL,
  PRIMARY KEY (`locationID`),
  KEY `personne_KF_idx` (`personneID`),
  KEY `assur_FK_idx` (`assurID`),
  KEY `voiture_FK_idx` (`voitureID`),
  CONSTRAINT `assur_FK` FOREIGN KEY (`assurID`) REFERENCES `assurance` (`assurID`) ON UPDATE CASCADE,
  CONSTRAINT `personne_FK` FOREIGN KEY (`personneID`) REFERENCES `personne` (`personneID`) ON UPDATE CASCADE,
  CONSTRAINT `voiture_FK` FOREIGN KEY (`voitureID`) REFERENCES `voiture` (`voitID`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personne`
--

DROP TABLE IF EXISTS `personne`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `personne` (
  `personneID` int(11) NOT NULL AUTO_INCREMENT,
  `pseudo` varchar(45) NOT NULL,
  `motDePasse` varchar(45) NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `privilege` int(11) NOT NULL,
  `dateInscription` date NOT NULL,
  `dateNaissance` date NOT NULL,
  `adresse` varchar(80) NOT NULL,
  `adresseMail` varchar(60) NOT NULL,
  PRIMARY KEY (`personneID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personne`
--

LOCK TABLES `personne` WRITE;
/*!40000 ALTER TABLE `personne` DISABLE KEYS */;
/*!40000 ALTER TABLE `personne` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voiture`
--

DROP TABLE IF EXISTS `voiture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voiture` (
  `voitID` int(11) NOT NULL AUTO_INCREMENT,
  `modele` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `estLouee` tinyint(1) DEFAULT '0',
  `client` varchar(45) DEFAULT NULL,
  `agenceID` int(11) DEFAULT NULL,
  PRIMARY KEY (`voitID`),
  UNIQUE KEY `voitID_UNIQUE` (`voitID`),
  KEY `agence_FK_idx` (`agenceID`),
  CONSTRAINT `agence_FK` FOREIGN KEY (`agenceID`) REFERENCES `agence` (`agenceID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voiture`
--

LOCK TABLES `voiture` WRITE;
/*!40000 ALTER TABLE `voiture` DISABLE KEYS */;
INSERT INTO `voiture` VALUES (5,'mod1','type1',0,NULL,NULL),(6,'mod2','type2',0,NULL,NULL),(7,'mod3','type3',1,'dewulf',NULL),(8,'mod4','type4',0,NULL,NULL),(9,'mod5','type5',0,NULL,NULL),(10,'mod6','type6',1,'dewulf',NULL);
/*!40000 ALTER TABLE `voiture` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-24  8:07:54
