const Mock = require('mockjs')

//这是数据库的user表字段
const data = Mock.mock({
  'items|30': [{
    userid: '@id',
    username: '@sentence(10, 20)',
    password: '@sentence(10, 20)',
    signature: '@sentence(10, 20)',
    head: 'data:image/.;base64',
    sex: '@integer(0, 2)',
    age: '@integer(0, 2)'

  }]
})

module.exports = [
  {
    url: 'http://localhost:5009/user/getAllUser',
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
