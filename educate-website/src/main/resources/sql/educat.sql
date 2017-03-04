create  database if not exists educate;
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
CREATE TABLE `user` (
  `uid` varchar(40) NOT NULL,
  `phoneNum` varchar(20) NOT NULL DEFAULT '""',
  `email` varchar(40) NOT NULL DEFAULT '""',
  `lastLoginType` int(11) NOT NULL DEFAULT '0',
  `password` varchar(40) NOT NULL,
  `gender` int(4) NOT NULL DEFAULT '1',
  `name` varchar(20) NOT NULL DEFAULT '""',
  `age` int(11) NOT NULL DEFAULT '0',
  `identity` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`uid`),
  INDEX `phone_index` (`phoneNum`,`identity`) USING BTREE,
  INDEX `email_index` (`email`,`identity`) USING BTREE,
  INDEX `name_index` (`name`,`identity`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- ----------------------------
-- Records of user
-- ----------------------------
