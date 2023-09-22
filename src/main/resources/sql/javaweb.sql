create table `t_song` (
                          `id` int not null auto_increment comment '主键',
                          `name` varchar(255) collate utf8mb4_general_ci default null comment '歌名',
                          `singer` varchar(255) collate utf8mb4_general_ci default null comment '歌手姓名',
                          `path` varchar(255) collate utf8mb4_general_ci default null comment '歌曲文件路径',
                          `cover` varchar(255) collate utf8mb4_general_ci default null comment '封面图',
                          `lyric` text collate utf8mb4_general_ci comment '歌词',
                          `create_time` datetime default null comment '创建时间',
                          primary key (`id`)
)engine=InnoDB auto_increment=1 default charset=utf8mb4 collate=utf8mb4_general_ci;