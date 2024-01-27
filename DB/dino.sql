-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Dinosaurs
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `Dinosaurs` ;

-- -----------------------------------------------------
-- Schema Dinosaurs
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Dinosaurs` DEFAULT CHARACTER SET utf8 ;
USE `Dinosaurs` ;

-- -----------------------------------------------------
-- Table `Dinosaur`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Dinosaur` ;

CREATE TABLE IF NOT EXISTS `Dinosaur` (
  `id` INT(10) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  `diet` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS dinoNerd@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'dinoNerd'@'localhost' IDENTIFIED BY 'dinoNerd';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'dinoNerd'@'localhost';
GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'dinoNerd'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `Dinosaur`
-- -----------------------------------------------------
START TRANSACTION;
USE `Dinosaurs`;
INSERT INTO `Dinosaur` (`id`, `name`, `description`, `diet`) VALUES (1, 'Allosaurus', 'Large bipedal predator ', 'Carnivore');
INSERT INTO `Dinosaur` (`id`, `name`, `description`, `diet`) VALUES (2, 'Triceratops', 'Large three-horned dinosaur', 'Herbivore');
INSERT INTO `Dinosaur` (`id`, `name`, `description`, `diet`) VALUES (3, 'T-Rex', 'Large bipedal predator ', 'Carnivore');

COMMIT;

