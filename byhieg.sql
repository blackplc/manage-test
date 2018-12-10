/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : byhieg

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-12-10 10:50:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for api
-- ----------------------------
DROP TABLE IF EXISTS `api`;
CREATE TABLE `api` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `api_info` varchar(255) DEFAULT NULL,
  `api_method` varchar(255) DEFAULT NULL,
  `api_name` varchar(255) DEFAULT NULL,
  `api_url` varchar(255) DEFAULT NULL,
  `mark` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of api
-- ----------------------------

-- ----------------------------
-- Table structure for api_md
-- ----------------------------
DROP TABLE IF EXISTS `api_md`;
CREATE TABLE `api_md` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mark` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of api_md
-- ----------------------------

-- ----------------------------
-- Table structure for program
-- ----------------------------
DROP TABLE IF EXISTS `program`;
CREATE TABLE `program` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `api_des` varchar(255) DEFAULT NULL,
  `api_domain` varchar(255) DEFAULT NULL,
  `detail_name` varchar(255) DEFAULT NULL,
  `mark` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of program
-- ----------------------------
INSERT INTO `program` VALUES ('1', 'des1', 'dd1', 'd_nam1', '1', 'firstOne');
INSERT INTO `program` VALUES ('2', 'des2', 'dd2', 'd_nam2', '1', 'secondOne');
INSERT INTO `program` VALUES ('3', 'des3', 'dd3', 'd_nam3', '1', 'thirdOne');
INSERT INTO `program` VALUES ('4', 'des4', 'dd4', 'd_nam4', '1', 'fourthOne');
INSERT INTO `program` VALUES ('5', 'des5', 'dd5', 'd_nam5', '1', 'fifthOne');
INSERT INTO `program` VALUES ('6', 'des6', 'dd6', 'd_nam6', '1', 'sixthOne');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123');
