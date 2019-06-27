/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : learning

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 27/06/2019 23:20:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_graphql_blog
-- ----------------------------
DROP TABLE IF EXISTS `tb_graphql_blog`;
CREATE TABLE `tb_graphql_blog` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(64) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `comment` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_graphql_blog
-- ----------------------------
BEGIN;
INSERT INTO `tb_graphql_blog` VALUES (1, 'graphql实践', 'graphql实践', 2, 2);
INSERT INTO `tb_graphql_blog` VALUES (2, 'springboot + graphiql搭建你的graphql应用', 'springboot + graphiql搭建你的graphql应用', 2, 6);
COMMIT;

-- ----------------------------
-- Table structure for tb_graphql_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_graphql_user`;
CREATE TABLE `tb_graphql_user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` char(32) DEFAULT NULL,
  `age` tinyint(3) unsigned DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_graphql_user
-- ----------------------------
BEGIN;
INSERT INTO `tb_graphql_user` VALUES (1, 'sun', 26, 0);
INSERT INTO `tb_graphql_user` VALUES (2, 'xixi', 27, 1);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
