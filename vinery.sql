# Host: 127.0.0.1  (Version: 5.6.19)
# Date: 2014-06-08 20:54:02
# Generator: MySQL-Front 5.3  (Build 4.13)

/*!40101 SET NAMES utf8 */;

#
# Source for table "mst_role"
#

DROP TABLE IF EXISTS `mst_role`;
CREATE TABLE `mst_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL DEFAULT '' COMMENT '角色名称',
  `UPDATE_DATE` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新日期',
  `CREATE_DATE` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建日期',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "mst_role"
#


#
# Source for table "mst_user"
#

DROP TABLE IF EXISTS `mst_user`;
CREATE TABLE `mst_user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `EMAIL` varchar(100) NOT NULL DEFAULT '' COMMENT '邮件',
  `NICKNAME` varchar(20) NOT NULL DEFAULT '' COMMENT '昵称',
  `PASSWORD` varchar(64) NOT NULL DEFAULT '' COMMENT '密码',
  `PHONE` varchar(11) DEFAULT NULL COMMENT '手机号码',
  `SEXUAL` tinyint(1) NOT NULL DEFAULT '0' COMMENT '性别',
  `STATUS` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态',
  `UPDATE_DATE` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '更新日期',
  `CREATE_DATE` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '创建日期',
  PRIMARY KEY (`ID`),
  KEY `邮件地址` (`EMAIL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "mst_user"
#

