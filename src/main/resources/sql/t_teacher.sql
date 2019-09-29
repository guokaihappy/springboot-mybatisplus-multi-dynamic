/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : vhr

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-09-29 14:03:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_teacher`
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年级',
  `subject` varchar(50) DEFAULT NULL COMMENT '科目',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------
INSERT INTO `t_teacher` VALUES ('1', '陈志伟', '43', '语文');
INSERT INTO `t_teacher` VALUES ('2', '王雨涵', '34', '英语');
INSERT INTO `t_teacher` VALUES ('3', '陈志', '40', '英语');
INSERT INTO `t_teacher` VALUES ('4', '陈志', '40', '英语');
