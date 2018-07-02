-- ----------------------------------
-- ----------------------------------
-- ---user
-- ----------------------------------
-- ----------------------------------
CREATE SCHEMA `user`;

CREATE TABLE `user`.`trainer` (
  `ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL COMMENT 'USER.ID',
  `TRAINER_EID` varchar(50) NOT NULL,
  `TRAINER_STATE_IND` int(1) NOT NULL,
  `TRAINER_DESCRIPTION` varchar(500) NOT NULL DEFAULT '',
  `TRAINER_IG` varchar(100) NOT NULL DEFAULT '',
  `TRAINER_PIC` varchar(2000) NOT NULL DEFAULT '',
  `CREATOR_ID` int(11) NOT NULL DEFAULT '0',
  `CREATOR` varchar(45) NOT NULL DEFAULT '',
  `CREATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATED_BY_ID` int(11) NOT NULL DEFAULT '0',
  `UPDATED_BY` varchar(45) NOT NULL DEFAULT '',
  `LAST_UPDATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DELETED_IND` int(11) NOT NULL DEFAULT '0',
  `DELETED_BY` varchar(45) NOT NULL DEFAULT '',
  `DELETED_BY_ID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE `user`.`user` (
  `ID` int(11) NOT NULL,
  `EID` varchar(50) NOT NULL,
  `USER_STATE_IND` int(1) NOT NULL,
  `USER_DESCRIPTION` varchar(500) NOT NULL DEFAULT '',
  `USER_IG` varchar(100) NOT NULL DEFAULT '',
  `USER_PIC` varchar(2000) NOT NULL DEFAULT '',
  `CREATOR_ID` int(11) NOT NULL DEFAULT '0',
  `CREATOR` varchar(45) NOT NULL DEFAULT '',
  `CREATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPDATED_BY_ID` int(11) NOT NULL DEFAULT '0',
  `UPDATED_BY` varchar(45) NOT NULL DEFAULT '',
  `LAST_UPDATE_DATE` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DELETED_IND` int(11) NOT NULL DEFAULT '0',
  `DELETED_BY` varchar(45) NOT NULL DEFAULT '',
  `DELETED_BY_ID` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


INSERT INTO `user`.`trainer`
(`ID`,
`USER_ID`,
`TRAINER_EID`,
`TRAINER_STATE_IND`,
`TRAINER_DESCRIPTION`,
`TRAINER_IG`,  
`TRAINER_PIC`,
`CREATOR_ID`,
`CREATOR`)
VALUES
(1,
1,
'xiaohui.c.liu',
1,
'毕业于上海交通大学，2年项目经验，12年教学经验，在WOLF任教12年期间帮助1000余名学员顺利PASS RS方向CCIE。课堂风格风趣幽默，善于控制学员思维节奏，善于引导学员主动思考。积极响应学员的各种提问。课后对学员的实验落实情况追踪严格。用“业精于勤”的思想. ',
'DIGITAL',
'http://bpic.588ku.com/element_origin_min_pic/17/05/02/4efe5cbf9731fe1b2bba1543fc0a4c59.jpg!r650',
2,
'fangzhou.li');


INSERT INTO `user`.`user`
(	  `ID`,
	  `EID`,
	  `USER_STATE_IND`,
	  `USER_DESCRIPTION`,
	  `USER_IG`,  
`CREATOR_ID`,
`CREATOR`)
VALUES
(1,
'xiaohui.c.liu',
1,
'毕业于上海交通大学，2年项目经验，12年教学经验，在WOLF任教12年期间帮助1000余名学员顺利PASS RS方向CCIE。课堂风格风趣幽默，善于控制学员思维节奏，善于引导学员主动思考。积极响应学员的各种提问。课后对学员的实验落实情况追踪严格。用“业精于勤”的思想. ',
'DIGITAL',
2,
'fangzhou.li'
);

INSERT INTO `user`.`user`
(	  `ID`,
	  `EID`,
	  `USER_STATE_IND`,
	  `USER_DESCRIPTION`,
	  `USER_IG`,  
`CREATOR_ID`,
`CREATOR`)
VALUES
(2,
'fangzhou.li',
1,
'略',
'PRODUCT',
2,
'fangzhou.li'
);

INSERT INTO `user`.`user`
(	  `ID`,
	  `EID`,
	  `USER_STATE_IND`,
	  `USER_DESCRIPTION`,
	  `USER_IG`,  
`CREATOR_ID`,
`CREATOR`)
VALUES
(5000001,
'sample.trainee',
1,
'略',
'PRODUCT',
2,
'fangzhou.li'
);