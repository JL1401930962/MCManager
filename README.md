# MCManager

* 现在使用/api/user/getAllUser或/post/getAllPost时获取不到数据，res.data输出为undefined

* NeteaseMusicApi 是一个需要翻墙才能访问的API接口，与Song表相关。给api传入 cloudsearch?keyword=歌名 会返回一堆数据，然后通过找到歌曲的id，存入songid。以后再给此API传入这个id：
song/url?id=歌曲id。 返回的结果是歌曲ID对应的歌曲信息包括url（播放源），以及一堆信息。song表的icon对应专辑图片的url地址。
* 目前我自己部署了一个NeteaseMusicApi，但是也是需要翻墙，因为它在vercel上。后面有时间了我会转移到腾讯云serverless上就不用翻墙了。

* src里没啥好说的，依托答辩，现在只剩controller了。

### 数据特别说明
* user表里的head(头像), post表里的head(头像), picture(图片)已经全部替换成url，可放心使用。

## 如果使用本地数据库，查看创建表SQL

## 如果使用云数据库
登录注册阿里云账号
![image](https://user-images.githubusercontent.com/58733209/233963667-bae91b47-8cda-415a-919d-ad1304c6ca61.png)

![image](https://user-images.githubusercontent.com/58733209/233963528-fda060e0-243a-4704-b94e-e35f69922b9d.png)
然后就可以登录数据库实例直接查看和修改表
