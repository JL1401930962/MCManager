CREATE TABLE `comment` (
  `post_id` int NOT NULL COMMENT '帖子ID',
  `userid` int DEFAULT NULL COMMENT '用户ID',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `comment_date` date DEFAULT NULL COMMENT '评论日期',
  `content` varchar(255) DEFAULT NULL COMMENT '评论内容',
  `picture` mediumtext COMMENT '评论图片',
  `comment_id` int NOT NULL COMMENT '评论ID',
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='评论表';

CREATE TABLE `likes` (
  `userid` int DEFAULT NULL COMMENT '用户ID',
  `post_id` int DEFAULT NULL COMMENT '帖子ID',
  `like_state` tinyint(1) DEFAULT NULL COMMENT '点赞状态',
  `id` int NOT NULL AUTO_INCREMENT COMMENT '点赞序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3 COMMENT='点赞表';

CREATE TABLE `post` (
  `userid` int DEFAULT NULL COMMENT '发帖人ID',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `head` mediumtext COMMENT '头像',
  `post_time` datetime NOT NULL COMMENT '发布时间',
  `content` varchar(1023) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '内容',
  `picture` mediumtext COMMENT '图片',
  `songid` int DEFAULT NULL COMMENT '歌曲id',
  `comment_num` int DEFAULT NULL COMMENT '评论数',
  `like_num` int DEFAULT NULL COMMENT '点赞数',
  `post_id` int unsigned NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  PRIMARY KEY (`post_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3 COMMENT='发帖表';

CREATE TABLE `song` (
  `songid` int NOT NULL COMMENT '歌曲ID',
  `songurl` varchar(1024) NOT NULL COMMENT '歌曲url',
  `songname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '歌名',
  `albumid` int DEFAULT NULL COMMENT '专辑ID',
  `albumname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '专辑名',
  `artistid` int DEFAULT NULL COMMENT '歌手ID',
  `artistname` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL COMMENT '歌手名',
  `icon` varchar(1024) DEFAULT NULL COMMENT '专辑图标',
  `size` int DEFAULT NULL COMMENT '歌曲大小',
  PRIMARY KEY (`songid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='歌曲表';

CREATE TABLE `user` (
  `userid` int NOT NULL COMMENT '用户ID',
  `username` varchar(20) NOT NULL COMMENT '用户名',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `signature` varchar(255) DEFAULT NULL COMMENT '个性签名',
  `head` mediumtext COMMENT '头像',
  `sex` int DEFAULT NULL COMMENT '性别',
  `age` int DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
