/*
Navicat MySQL Data Transfer

Source Server         : lxg
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : test_db

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2015-11-23 21:49:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'aa', 'aa');
INSERT INTO `user` VALUES ('2', 'bb', 'bb');
INSERT INTO `user` VALUES ('3', 'cc', 'cc');
INSERT INTO `user` VALUES ('4', 'kk', 'kk');
INSERT INTO `user` VALUES ('5', 'mm', 'mm');
INSERT INTO `user` VALUES ('6', 'mm', 'll');
INSERT INTO `user` VALUES ('7', 'l', 'l');
INSERT INTO `user` VALUES ('8', 'o', 'o');
INSERT INTO `user` VALUES ('9', 'o', 'o');
INSERT INTO `user` VALUES ('10', 'k', 'k');
INSERT INTO `user` VALUES ('11', 'k', 'k');
INSERT INTO `user` VALUES ('12', 'o', 'o');
INSERT INTO `user` VALUES ('13', 'l', 'l');
INSERT INTO `user` VALUES ('14', 'o', 'o');
