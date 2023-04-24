const Mock = require('mockjs')

//这是数据库的user表字段
const data = Mock.mock({
  'items|30': [{
    userid: '@id',
    username: 'name',
    password: '@sentence(10, 20)',
    signature: '@sentence(10, 20)',
    head: '@image("200x100", "#50B347", "#FFF", "Mock.js")',
    sex: '@integer(0, 1)',
    age: '@integer(0, 1)'

  }]
})

module.exports = [
  {
    url: '/vue-admin-template/user/list',
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
