const Mock = require('mockjs')

const data = Mock.mock({
  'items|30': [{
    post_id: '@id',
    userid: '@id',
    username: 'name',
    content: '@sentence(10, 20)',
    picture: '@image("200x100", "#50B347", "#FFF", "Mock.js")',
    songid: '@id',
    like_num: '@integer(0, 5000)',
    comment_num: '@integer(0, 5000)',
    post_time: '@datetime'

  }]
})

module.exports = [
  {
    url: 'http://localhost:5009/post/list',
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
