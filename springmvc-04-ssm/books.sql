use test;

create table `books`(
    `bookID` int(11) not null auto_increment comment '书id',
    `bookName` varchar(100) not null comment '书名',
    `bookCounts` int(11) not null comment '数量',
    `detail` varchar(200) not null comment '描述',
    key `bookID` (`bookID`)
    )ENGINE = INNODB DEFAULT CHARSET = UTF8;

INSERT INTO `books`(
    `bookID`,`bookName`,`bookCounts`,`detail`
) values
(1,'朝花夕拾',3,'经典代表作'),
(2,'狂人日记',11,'赵家的狗又叫了'),
(3,'孔乙己',6,'上大人孔乙己'),
(4,'呐喊',23,'风全住了，路上还是很安静');
