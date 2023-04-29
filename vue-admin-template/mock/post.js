const Mock = require('mockjs')

const data = Mock.mock({
  'items|30': [{
    post_id: '@id',
    userid: '@integer(0, 1000)',
    username: 'name',
    content: '@sentence(10, 20)',
    picture: 'data:image/.;base64',
    songid: '@integer(0, 1000)',
    like_num: '@integer(0, 5000)',
    comment_num: '@integer(0, 5000)',
    post_time: '@datetime'

  }]
})

module.exports = [
  {
    url: 'http://localhost:5009/post/getAllPost',
    type: 'get',
    response: config => {
      const items = data.items
      return {
        code: 20000,
        data: {
          total: items.length,
          items: items
        }
      }
    }
  }
]
