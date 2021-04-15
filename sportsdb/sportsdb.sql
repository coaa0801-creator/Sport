-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema sportsdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sportsdb` ;

-- -----------------------------------------------------
-- Schema sportsdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sportsdb` DEFAULT CHARACTER SET utf8 ;
USE `sportsdb` ;

-- -----------------------------------------------------
-- Table `team`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `team` ;

CREATE TABLE IF NOT EXISTS `team` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `nickname` VARCHAR(45) NULL,
  `win` INT NULL,
  `loss` INT NULL,
  `tie` INT NULL,
  `playoff_win` INT NULL,
  `playoff_loss` INT NULL,
  `superbowl` INT NULL,
  `year` INT NULL,
  `league` VARCHAR(45) NULL,
  `team_id` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nfl_player_season`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nfl_player_season` ;

CREATE TABLE IF NOT EXISTS `nfl_player_season` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `number` INT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `age` INT NULL,
  `position` VARCHAR(45) NULL,
  `games_played` INT NULL,
  `games_started` INT NULL,
  `rushing_att` INT NULL,
  `rushing_yds` DOUBLE NULL,
  `rushing_td` INT NULL,
  `longest_rushing_att` DOUBLE NULL,
  `rushing_yards_attempt` INT NULL,
  `rushing_yards_game` DOUBLE NULL,
  `rushing_attempts_per_game` DOUBLE NULL,
  `pass_tgt` INT NULL,
  `receptions` INT NULL,
  `rec_yards` DOUBLE NULL,
  `rec_yds_per_rec` DOUBLE NULL,
  `rec_td` INT NULL,
  `longest_rec` DOUBLE NULL,
  `rec_per_game` DOUBLE NULL,
  `rec_yds_per_game` DOUBLE NULL,
  `catch_percent` DOUBLE NULL,
  `yards_per_tgt` DOUBLE NULL,
  `rush_rec_touch` DOUBLE NULL,
  `scrimmage_yds_per_touch` DOUBLE NULL,
  `yards_from_scrimmage` DOUBLE NULL,
  `rrtd` INT NULL,
  `fmb` INT NULL,
  `qb_rec` VARCHAR(45) NULL,
  `comp_pass` INT NULL,
  `att_pass` INT NULL,
  `pass_comp_percent` DOUBLE NULL,
  `pass_yds` DOUBLE NULL,
  `pass_td` INT NULL,
  `pass_td_percent` DOUBLE NULL,
  `inter` INT NULL,
  `int_percent` DOUBLE NULL,
  `long_pass` DOUBLE NULL,
  `yards_per_attempt` DOUBLE NULL,
  `adj_yards_per_attempt` DOUBLE NULL,
  `yards_per_pass_comp` DOUBLE NULL,
  `yards_per_game` DOUBLE NULL,
  `qb_rating` DOUBLE NULL,
  `espn_qbr` DOUBLE NULL,
  `sacks` DOUBLE NULL,
  `yds_lost_sacks` DOUBLE NULL,
  `net_yds_per_attempt` DOUBLE NULL,
  `adj_net_yards` DOUBLE NULL,
  `sack_percent` DOUBLE NULL,
  `comebacks` INT NULL,
  `gwd` INT NULL,
  `player_id` INT NOT NULL,
  `enabled` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stadium`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stadium` ;

CREATE TABLE IF NOT EXISTS `stadium` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `street` VARCHAR(45) NULL,
  `street2` VARCHAR(45) NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `zip_code` INT NULL,
  `capacity` INT NULL,
  `surface` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `coach_season`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `coach_season` ;

CREATE TABLE IF NOT EXISTS `coach_season` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `win` INT NULL,
  `loss` INT NULL,
  `tie` INT NULL,
  `playoff_win` INT NULL,
  `playoff_loss` INT NULL,
  `coach_id` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `staff`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `staff` ;

CREATE TABLE IF NOT EXISTS `staff` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `position` VARCHAR(45) NULL,
  `win` INT NULL,
  `loss` INT NULL,
  `tie` INT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `team_has_staff`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `team_has_staff` ;

CREATE TABLE IF NOT EXISTS `team_has_staff` (
  `team_id` INT NOT NULL,
  `staff_id` INT NOT NULL,
  PRIMARY KEY (`team_id`, `staff_id`),
  INDEX `fk_team_has_staff_staff1_idx` (`staff_id` ASC),
  INDEX `fk_team_has_staff_team1_idx` (`team_id` ASC),
  CONSTRAINT `fk_team_has_staff_team1`
    FOREIGN KEY (`team_id`)
    REFERENCES `team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_team_has_staff_staff1`
    FOREIGN KEY (`staff_id`)
    REFERENCES `staff` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `team_has_coach`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `team_has_coach` ;

CREATE TABLE IF NOT EXISTS `team_has_coach` (
  `team_id` INT NOT NULL,
  `coach_id` INT NOT NULL,
  PRIMARY KEY (`team_id`, `coach_id`),
  INDEX `fk_team_has_coach_coach1_idx` (`coach_id` ASC),
  INDEX `fk_team_has_coach_team1_idx` (`team_id` ASC),
  CONSTRAINT `fk_team_has_coach_team1`
    FOREIGN KEY (`team_id`)
    REFERENCES `team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_team_has_coach_coach1`
    FOREIGN KEY (`coach_id`)
    REFERENCES `coach_season` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `team_has_stadium`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `team_has_stadium` ;

CREATE TABLE IF NOT EXISTS `team_has_stadium` (
  `team_id` INT NOT NULL,
  `stadium_id` INT NOT NULL,
  PRIMARY KEY (`team_id`, `stadium_id`),
  INDEX `fk_team_has_stadium_stadium1_idx` (`stadium_id` ASC),
  INDEX `fk_team_has_stadium_team1_idx` (`team_id` ASC),
  CONSTRAINT `fk_team_has_stadium_team1`
    FOREIGN KEY (`team_id`)
    REFERENCES `team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_team_has_stadium_stadium1`
    FOREIGN KEY (`stadium_id`)
    REFERENCES `stadium` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nfl_player_season_has_team`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nfl_player_season_has_team` ;

CREATE TABLE IF NOT EXISTS `nfl_player_season_has_team` (
  `nfl_player_season_id` INT NOT NULL,
  `team_id` INT NOT NULL,
  PRIMARY KEY (`nfl_player_season_id`, `team_id`),
  INDEX `fk_nfl_player_season_has_team_team1_idx` (`team_id` ASC),
  INDEX `fk_nfl_player_season_has_team_nfl_player_season1_idx` (`nfl_player_season_id` ASC),
  CONSTRAINT `fk_nfl_player_season_has_team_nfl_player_season1`
    FOREIGN KEY (`nfl_player_season_id`)
    REFERENCES `nfl_player_season` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_nfl_player_season_has_team_team1`
    FOREIGN KEY (`team_id`)
    REFERENCES `team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `nfl_defense`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `nfl_defense` ;

CREATE TABLE IF NOT EXISTS `nfl_defense` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `points_scored_by_opp` INT NULL,
  `yds_by_opp` INT NULL,
  `opp_number_of_plays` INT NULL,
  `yds_per_opp_play` INT NULL,
  `turnovers` INT NULL,
  `fumbles_lost` INT NULL,
  `1st_downs` INT NULL,
  `pass_comp` INT NULL,
  `pass_att` INT NULL,
  `passing_yds` INT NULL,
  `passing_tds` INT NULL,
  `ints` INT NULL,
  `net_yards_gained_per_pass_att` INT NULL,
  `passing_1st_downs` INT NULL,
  `rushing_att` INT NULL,
  `rushing_yds` INT NULL,
  `rushing_tds` INT NULL,
  `rushing_yds_per_att` INT NULL,
  `rushing_1st_downs` INT NULL,
  `pen` INT NULL,
  `pen_yds` INT NULL,
  `pen_1st_downs` INT NULL,
  `drives` INT NULL,
  `percent_of_drives_scoring` INT NULL,
  `percent_of_drives_ending_with_turnover` INT NULL,
  `avg_starting_position` VARCHAR(45) NULL,
  `avg_time_per_drive` VARCHAR(45) NULL,
  `avg_num_plays_per_drive` INT NULL,
  `net_yds_per_drive` INT NULL,
  `avg_points_per_drive` INT NULL,
  `team_name` VARCHAR(100) NULL,
  `team_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_nfl_defense_team1_idx` (`team_id` ASC),
  CONSTRAINT `fk_nfl_defense_team1`
    FOREIGN KEY (`team_id`)
    REFERENCES `team` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS sportsdb;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'sportsdb' IDENTIFIED BY 'sportsdb';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'sportsdb';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `team`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `team` (`id`, `name`, `nickname`, `win`, `loss`, `tie`, `playoff_win`, `playoff_loss`, `superbowl`, `year`, `league`, `team_id`) VALUES (1, 'Minnesota Vikings', 'Vikings', 7, 9, 0, NULL, NULL, NULL, 2020, 'NFL', 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `nfl_player_season`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (1, 33, 'Dalvin', 'Cook', 25, 'RB', 14, 14, 312, 1557, 16, 70, 5, 111.2, 22.3, 54, 44, 361, 8.2, 1, 50, 3.1, 25.8, 81.50, 6.7, 356, 5.4, 1918, 17, 5, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (2, 25, 'Alexander', 'Mattison', 22, 'RB', 13, 2, 96, 434, 2, 25, 4.5, 33.4, 7.4, 15, 13, 125, 9.6, 1, 28, 1, 9.6, 86.70, 8.3, 109, 5.1, 559, 3, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (3, 8, 'Kirk', 'Cousins', 32, 'QB', 16, 16, 32, 156, 1, 16, 4.9, 9.8, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32, 4.9, 156, 1, 9, '7/9/00', 349, 516, 67.6, 4265, 35, 6.8, 13, 2.5, 71, 8.3, 8.5, 12.2, 266.6, 105, 63.2, 39, 256, 7.22, 7.43, 7, 1, 3, 3, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (4, 23, 'Mike', 'Boone', 25, 'RB', 16, 0, 11, 59, 1, 19, 5.4, 3.7, 0.7, 2, 2, 10, 5, 0, 6, 0.1, 0.6, 100.00, 5, 13, 5.3, 69, 1, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (5, 31, 'Ameer', 'Abdullah', 27, 'RB', 16, 0, 8, 42, 0, 13, 5.3, 2.6, 0.5, 9, 8, 58, 7.3, 2, 22, 0.5, 3.6, 88.90, 6.4, 16, 6.3, 100, 2, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (6, 30, 'C.J.', 'Ham', 27, 'FB', 15, 11, 5, 18, 0, 10, 3.6, 1.2, 0.3, 13, 8, 97, 12.1, 1, 30, 0.5, 6.5, 61.50, 7.5, 13, 8.8, 115, 1, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (7, 19, 'Adam', 'Thielen', 30, 'WR', 15, 15, 3, 15, 0, 8, 5, 1, 0.2, 108, 74, 925, 12.5, 14, 51, 4.9, 61.7, 68.50, 8.6, 77, 12.2, 940, 14, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (8, 18, 'Justin', 'Jefferson', 21, 'WR', 16, 14, 1, 2, 0, 2, 2, 0.1, 0.1, 125, 88, 1400, 15.9, 7, 71, 5.5, 87.5, 70.40, 11.2, 89, 15.8, 1402, 7, 1, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (9, 84, 'Irv', 'Smith Jr.', 22, 'TE', 13, 7, 0, 0, 0, 0, 0, 0, 0, 43, 30, 365, 12.2, 5, 36, 2.3, 28.1, 69.80, 8.5, 30, 12.2, 365, 5, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (10, 82, 'Kyle', 'Rudolph', 31, 'TE', 12, 12, 0, 0, 0, 0, 0, 0, 0, 37, 28, 334, 11.9, 1, 25, 2.3, 27.8, 75.70, 9, 28, 11.9, 334, 1, 1, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (11, 12, 'Chad', 'Beebe', 26, 'WR', 14, 0, 0, 0, 0, 0, 0, 0, 0, 30, 20, 201, 10.1, 2, 40, 1.4, 14.4, 66.70, 6.7, 20, 10.1, 201, 2, 2, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (12, 83, 'Tyler', 'Conklin', 25, 'TE', 16, 2, 0, 0, 0, 0, 0, 0, 0, 26, 19, 194, 10.2, 1, 30, 1.2, 12.1, 73.10, 7.5, 19, 10.2, 194, 1, 1, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (13, 81, 'Olabisi', 'Johnson', 23, 'WR', 16, 3, 0, 0, 0, 0, 0, 0, 0, 19, 14, 189, 13.5, 0, 29, 0.9, 11.8, 73.70, 9.9, 14, 13.5, 189, 0, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (14, 86, 'Brandon', 'Dillon', 23, 'TE', 3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 6, 6, 0, 6, 0.3, 2, 100.00, 6, 1, 6, 6, 0, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 1);
INSERT INTO `nfl_player_season` (`id`, `number`, `first_name`, `last_name`, `age`, `position`, `games_played`, `games_started`, `rushing_att`, `rushing_yds`, `rushing_td`, `longest_rushing_att`, `rushing_yards_attempt`, `rushing_yards_game`, `rushing_attempts_per_game`, `pass_tgt`, `receptions`, `rec_yards`, `rec_yds_per_rec`, `rec_td`, `longest_rec`, `rec_per_game`, `rec_yds_per_game`, `catch_percent`, `yards_per_tgt`, `rush_rec_touch`, `scrimmage_yds_per_touch`, `yards_from_scrimmage`, `rrtd`, `fmb`, `qb_rec`, `comp_pass`, `att_pass`, `pass_comp_percent`, `pass_yds`, `pass_td`, `pass_td_percent`, `inter`, `int_percent`, `long_pass`, `yards_per_attempt`, `adj_yards_per_attempt`, `yards_per_pass_comp`, `yards_per_game`, `qb_rating`, `espn_qbr`, `sacks`, `yds_lost_sacks`, `net_yds_per_attempt`, `adj_net_yards`, `sack_percent`, `comebacks`, `gwd`, `player_id`, `enabled`) VALUES (15, 11, 'Tajae', 'Sharpe', 26, 'WR', 4, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0.00, 0, 0, 0, 0, 0, 0, '0', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `stadium`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `stadium` (`id`, `name`, `street`, `street2`, `city`, `state`, `zip_code`, `capacity`, `surface`) VALUES (1, 'U.S. Bank Stadium', '900 South 5th Street', NULL, 'Minneapolis', 'MN', 55415, 73000, 'Turf');

COMMIT;


-- -----------------------------------------------------
-- Data for table `coach_season`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `coach_season` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`, `playoff_win`, `playoff_loss`, `coach_id`) VALUES (1, 'Mike', 'Zimmer', 'Head Coach', 64, 41, 1, 2, 3, 1);
INSERT INTO `coach_season` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`, `playoff_win`, `playoff_loss`, `coach_id`) VALUES (2, 'Gary', 'Kubiak', 'Offensive Coordinator', 82, 75, 0, 5, 2, 2);
INSERT INTO `coach_season` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`, `playoff_win`, `playoff_loss`, `coach_id`) VALUES (3, 'Adam', 'Zimmer', 'Defensive Coordinator', NULL, NULL, NULL, NULL, NULL, 3);
INSERT INTO `coach_season` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`, `playoff_win`, `playoff_loss`, `coach_id`) VALUES (4, 'Andre', 'Patterson', 'Defensive Coordinator', NULL, NULL, NULL, NULL, NULL, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `staff`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `staff` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`) VALUES (1, 'Zygi', 'Wilf', 'Owner', 133, 121, 2);
INSERT INTO `staff` (`id`, `first_name`, `last_name`, `position`, `win`, `loss`, `tie`) VALUES (2, 'Rick', 'Spielman', 'GM', 128, 126, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `team_has_staff`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `team_has_staff` (`team_id`, `staff_id`) VALUES (1, 1);
INSERT INTO `team_has_staff` (`team_id`, `staff_id`) VALUES (1, 2);

COMMIT;


-- -----------------------------------------------------
-- Data for table `team_has_coach`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `team_has_coach` (`team_id`, `coach_id`) VALUES (1, 1);
INSERT INTO `team_has_coach` (`team_id`, `coach_id`) VALUES (1, 2);
INSERT INTO `team_has_coach` (`team_id`, `coach_id`) VALUES (1, 3);
INSERT INTO `team_has_coach` (`team_id`, `coach_id`) VALUES (1, 4);

COMMIT;


-- -----------------------------------------------------
-- Data for table `team_has_stadium`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `team_has_stadium` (`team_id`, `stadium_id`) VALUES (1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `nfl_player_season_has_team`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (1, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (2, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (3, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (4, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (5, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (6, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (7, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (8, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (9, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (10, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (11, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (12, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (13, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (14, 1);
INSERT INTO `nfl_player_season_has_team` (`nfl_player_season_id`, `team_id`) VALUES (15, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `nfl_defense`
-- -----------------------------------------------------
START TRANSACTION;
USE `sportsdb`;
INSERT INTO `nfl_defense` (`id`, `points_scored_by_opp`, `yds_by_opp`, `opp_number_of_plays`, `yds_per_opp_play`, `turnovers`, `fumbles_lost`, `1st_downs`, `pass_comp`, `pass_att`, `passing_yds`, `passing_tds`, `ints`, `net_yards_gained_per_pass_att`, `passing_1st_downs`, `rushing_att`, `rushing_yds`, `rushing_tds`, `rushing_yds_per_att`, `rushing_1st_downs`, `pen`, `pen_yds`, `pen_1st_downs`, `drives`, `percent_of_drives_scoring`, `percent_of_drives_ending_with_turnover`, `avg_starting_position`, `avg_time_per_drive`, `avg_num_plays_per_drive`, `net_yds_per_drive`, `avg_points_per_drive`, `team_name`, `team_id`) VALUES (1, 475, 6292, 1036, 6.1, 22, 7, 366, 358, 541, 4141, 30, 15, 7.3, 208, 472, 2151, 19, 4.6, 136, 83, 723, 22, 168, 50, 10.7, 'Own 32.9', '2:53', 6.4, 37.2, 2.67, 'Vikings', 1);

COMMIT;

