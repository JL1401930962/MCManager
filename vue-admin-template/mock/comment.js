const Mock = require('mockjs')

const data = Mock.mock({
  'items|30': [{
    comment_id: '@id',
    post_id: '@id',
    userid: '@id',
    username: 'name',
    date: '@date',
    content: '@sentence(10, 20)',
    picture: '@image("200x100", "#50B347", "#FFF", "Mock.js")',

  }]
})

module.exports = [
  {
    url: '@api/comment/list',
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
