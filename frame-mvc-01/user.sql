/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.32 : Database - study
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`study` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `study`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `user_id` varchar(9) DEFAULT NULL COMMENT '用户ID',
  `user_nickname` varchar(32) DEFAULT NULL COMMENT '用户昵称',
  `user_head` varchar(16) DEFAULT NULL COMMENT '用户头像',
  `user_password` varchar(64) DEFAULT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb3;

/*Data for the table `user` */

insert  into `user`(`id`,`user_id`,`user_nickname`,`user_head`,`user_password`,`create_time`,`update_time`) values (1,'184172133','小傅哥','01_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(2,'980765512','铁锤','02_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(3,'796542178','团团','03_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(4,'523088136','哈尼克兔','04_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(5,'123456001','比丘卡','05_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(6,'123456002','兰兰','06_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(7,'123456003','Alexa','07_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(8,'123456004','小白','08_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(9,'123456005','铃铛','09_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(10,'123456006','马小帅','10_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(11,'123456007','S.A.K','11_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00'),(12,'123456008','池鱼有点贤','12_50','123456','2023-06-23 00:00:00','2023-06-23 00:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
