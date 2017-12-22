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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agence`
--

LOCK TABLES `agence` WRITE;
/*!40000 ALTER TABLE `agence` DISABLE KEYS */;
INSERT INTO `agence` VALUES (1,'namur','boulevard leopold');
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
  `note` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`factID`),
  KEY `tech_FK_idx` (`techID`),
  KEY `location_FK_idx` (`locationID`),
  CONSTRAINT `location_FK` FOREIGN KEY (`locationID`) REFERENCES `location` (`locationID`) ON UPDATE CASCADE,
  CONSTRAINT `tech_FK` FOREIGN KEY (`techID`) REFERENCES `personne` (`personneID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `facture`
--

LOCK TABLES `facture` WRITE;
/*!40000 ALTER TABLE `facture` DISABLE KEYS */;
INSERT INTO `facture` VALUES (14,900,11,1,0,' Le client a tout paye immediatement');
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
  `estEnCours` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`locationID`),
  KEY `personne_KF_idx` (`personneID`),
  KEY `assur_FK_idx` (`assurID`),
  KEY `voiture_FK_idx` (`voitureID`),
  CONSTRAINT `assur_FK` FOREIGN KEY (`assurID`) REFERENCES `assurance` (`assurID`) ON UPDATE CASCADE,
  CONSTRAINT `personne_FK` FOREIGN KEY (`personneID`) REFERENCES `personne` (`personneID`) ON UPDATE CASCADE,
  CONSTRAINT `voiture_FK` FOREIGN KEY (`voitureID`) REFERENCES `voiture` (`voitID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (11,17,2,17,200,1,25000,0),(12,15,8,18,200,1,23000,1);
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
  `dateInscription` varchar(10) DEFAULT NULL,
  `dateNaissance` varchar(10) DEFAULT NULL,
  `adresse` varchar(80) NOT NULL DEFAULT 'n''importe quoi',
  `adresseMail` varchar(60) NOT NULL DEFAULT 'ephec@ephec.be',
  PRIMARY KEY (`personneID`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personne`
--

LOCK TABLES `personne` WRITE;
/*!40000 ALTER TABLE `personne` DISABLE KEYS */;
INSERT INTO `personne` VALUES (1,'admin','admin','Robin','Gielen',0,'15-11-2017','29-06-1994','rue de la citronelle','robin@ephec.be'),(2,'tech','tech','Tanguy','Alexandre',1,'16-11-2017','30-06-1994','rue de l\'étoile','tanguy@ephec.be'),(15,'client','client','Fabian','Descampe',2,'2017-12-22','25-01-2000','rue','du'),(16,'bouterfa','bouterfa','bouterfa','yousef',2,'2017-12-22','10-01-1930','ruelle-fay','bouterfa@ephec.be'),(17,'dewulf','dewulf','dewulf','arnaud',2,'2017-12-22','14-10-1985','rue-du-champ-des-oiseaux','dewulf@ephec.be');
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
  `prix` double NOT NULL,
  `marque` varchar(45) NOT NULL,
  `modele` varchar(45) NOT NULL,
  `annee` int(5) NOT NULL COMMENT '0-5\n0-99999',
  `carburant` varchar(45) NOT NULL,
  `couleur` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `estManuelle` tinyint(1) NOT NULL DEFAULT '1',
  `roueMotrice` int(2) NOT NULL DEFAULT '2',
  `kilometrage` bigint(20) NOT NULL,
  `volumeCoffre` double NOT NULL,
  `hauteur` double NOT NULL,
  `poids` double NOT NULL,
  `estLouee` tinyint(1) DEFAULT '0',
  `note` varchar(150) DEFAULT NULL,
  `agenceID` int(11) DEFAULT NULL,
  PRIMARY KEY (`voitID`),
  UNIQUE KEY `voitID_UNIQUE` (`voitID`),
  KEY `agence_FK_idx` (`agenceID`),
  CONSTRAINT `agence_FK` FOREIGN KEY (`agenceID`) REFERENCES `agence` (`agenceID`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voiture`
--

LOCK TABLES `voiture` WRITE;
/*!40000 ALTER TABLE `voiture` DISABLE KEYS */;
INSERT INTO `voiture` VALUES (17,500,'marque 4','modele 4',2015,'diesel','noir','citadine',1,2,25000,100,140,900,0,'Ceci st une note',1),(18,500,'marque 5','modele 5',2015,'diesel','noir','citadine',1,2,23000,100,140,900,1,'Ceci st une note',1),(22,600,'opel','corsa',2015,'diesel','rouge','citadine',0,4,69000,150.4,194.5,987.6,0,'Bonne voiture',1),(23,600,'opel','corsa',2015,'diesel','rouge','citadine',0,4,51213,150.4,194.5,987.6,0,'Bonne voiture',1),(24,600,'Marqueur','modeleisation',2004,'diesel','rouge','citadine',1,2,30400,250,170,875,0,'Bonjour',1),(25,600,'Marqueur','modeleisation',2004,'diesel','rouge','citadine',1,2,700001,250,170,875,0,'Bonjour',1),(26,600,'Marqueur','modeleisation',2004,'diesel','rouge','citadine',1,2,700001,250,170,875,0,'Bonjour',1),(27,500,'marque 4','modele 4',2015,'diesel','noir','citadine',1,2,25000,100,140,900,0,'Ceci st une note',1);
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

-- Dump completed on 2017-12-22  1:46:16
