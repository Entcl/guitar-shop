# guitar-shop-back(音乐商城商品及人员管理页面)

~~ 项目地址: ~~

~~ 后端地址： ~~

## 技术栈

1. mabatis
2. mabatis-generator
3. maven
4. springboot2
5. mysql



## 后端

### 接口：











## 数据库



### 表结构（符合范式要求）

user_infomation

![image-20220617155509291](.\md-img\image-20220617155407873.png)

user_infomation

![image-20220617155554091](.\md-img\image-20220617155554091.png)

剩余表（功能完成会将数据库文件导出）：

![image-20220617160004484](.\md-img\image-20220617160004484.png)



<hr>



### 触发器：

#### 注册触发器：

代码

```mysql
DELIMITER $$

USE `guitarshop`$$

DROP TRIGGER /*!50032 IF EXISTS */ `userInfomation_inserts`$$

CREATE
    /*!50017 DEFINER = 'root'@'localhost' */
    TRIGGER `userInfomation_inserts` AFTER INSERT ON `user_login` 
    FOR EACH ROW BEGIN
	INSERT INTO user_infomation VALUES (NULL,new.ul_name,NULL,NULL,NULL,'default.jpg',NULL,new.ul_id);
END;
$$

DELIMITER ;
```

功能

用户注册登录账号时往user_iunfomation表添加一条数据

