/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50724
 Source Host           : localhost:3306
 Source Schema         : sharding-1

 Target Server Type    : MySQL
 Target Server Version : 50724
 File Encoding         : 65001

 Date: 28/04/2020 01:08:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for test_qq
-- ----------------------------
DROP TABLE IF EXISTS `test_qq`;
CREATE TABLE `test_qq`  (
  `test_qq_id` int(11) NOT NULL COMMENT '测试QQ号主键',
  `qq` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '测试QQ号',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '测试用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '测试用户密码',
  `create_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间，MySQL 自动生成',
  `update_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间，MySQL 自动生成',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除，0 未删除，1 删除，MySQL 默认值 0，不为 NULL，注解@TableLogic。',
  PRIMARY KEY (`test_qq_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '测试QQ号表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user`  (
  `test_user_id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '测试用户表主键',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '测试用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '测试用户密码',
  `create_date` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间，MySQL 自动生成',
  `update_date` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间，MySQL 自动生成',
  `deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '逻辑删除，0 未删除，1 删除，MySQL 默认值 0，不为 NULL，注解@TableLogic。',
  PRIMARY KEY (`test_user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '测试用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES (1, NULL, NULL, '2020-04-27 22:53:47', NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
