const Mock = require('mockjs')

const data = Mock.mock({
  'items|30': [{
    id: '@id',
    post_id: '@id',
    userid: '@id',
    like_state: '@boolean'
  }]
})

module.exports = [
  {
    url: '/vue-admin-template/likes/list',
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
