# MCManager

* NeteaseMusicApi 是一个需要翻墙才能访问的API接口，与Song表相关。给api传入 cloudsearch?keyword=歌名 会返回一堆数据，然后通过找到歌曲的id，存入songid。以后再给此API传入这个id：
song/url?id=歌曲id。 返回的结果是歌曲ID对应的歌曲信息包括url（播放源），以及一堆信息。数据表icon对应专辑图片的url地址。
* 目前我自己部署了一个NeteaseMusicApi，但是也是需要翻墙，因为它在vercel上。后面有时间了我会转移到腾讯云serverless上就不用翻墙了。

* Vue-admin-template 里 npm install, cd vue-admin-template, npm run dev启动后，侧边栏最下面一行是官方文档。

* src里没啥好说的，依托答辩，现在只剩controller了。
