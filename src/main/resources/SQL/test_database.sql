/*
 Navicat Premium Data Transfer

 Source Server         : 10.0.0.101
 Source Server Type    : MySQL
 Source Server Version : 50561
 Source Host           : localhost:3306
 Source Schema         : test_database

 Target Server Type    : MySQL
 Target Server Version : 50561
 File Encoding         : 65001

 Date: 12/06/2019 18:17:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_user_table
-- ----------------------------
DROP TABLE IF EXISTS `test_user_table`;
CREATE TABLE `test_user_table`  (
  `id` int(20) NOT NULL COMMENT 'Test user id data ',
  `name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'Test user name data',
  `age` int(20) NOT NULL COMMENT 'Test user age data',
  `gender` int(10) NOT NULL COMMENT 'Test user age data 1 for men , 2 for Women',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of test_user_table
-- ----------------------------
INSERT INTO `test_user_table` VALUES (1, '迪丽热巴2', 21, 2);
INSERT INTO `test_user_table` VALUES (2, '小芳', 20, 2);
INSERT INTO `test_user_table` VALUES (3, '大黑', 45, 1);
INSERT INTO `test_user_table` VALUES (4, '迪丽热巴3', 21, 2);
INSERT INTO `test_user_table` VALUES (5, '迪丽热巴3', 21, 2);
INSERT INTO `test_user_table` VALUES (6, '大壮', 21, 2);
INSERT INTO `test_user_table` VALUES (7, '迪丽热巴', 21, 1);

SET FOREIGN_KEY_CHECKS = 1;
