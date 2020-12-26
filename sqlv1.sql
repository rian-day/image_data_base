/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 80022
Source Host           : localhost:3306
Source Database       : image_data_base

Target Server Type    : MYSQL
Target Server Version : 80022
File Encoding         : 65001

Date: 2020-12-26 12:13:02
*/

SET
FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for image
-- ----------------------------
DROP TABLE IF EXISTS `image`;
CREATE TABLE `image`
(
    `id`          int                                                     NOT NULL AUTO_INCREMENT,
    `image_path`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `image_name`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `remark`      varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
    `creat_time`  datetime                                                NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    `update_time` datetime                                                NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
AUTO_INCREMENT=1
;

-- ----------------------------
-- Records of image
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for image_operation
-- ----------------------------
DROP TABLE IF EXISTS `image_operation`;
CREATE TABLE `image_operation`
(
    `id`           int      NOT NULL,
    `image_id`     int      NOT NULL,
    `operation_id` int      NOT NULL,
    `create_time`  datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    `update_time`  datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
;

-- ----------------------------
-- Records of image_operation
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Table structure for operation
-- ----------------------------
DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation`
(
    `id`             int                                                     NOT NULL,
    `operation_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
    `create_time`    datetime                                                NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    `update_time`    datetime                                                NOT NULL ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
;

-- ----------------------------
-- Records of operation
-- ----------------------------
BEGIN;
COMMIT;

-- ----------------------------
-- Auto increment value for image
-- ----------------------------
ALTER TABLE `image` AUTO_INCREMENT=1;
