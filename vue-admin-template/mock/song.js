const Mock = require('mockjs')

const data = Mock.mock({
  'items|30': [{
    songid: '@id',
    songurl: '@url(http)',
    songname: '@sentence(10, 20)',
    albumid: '@id',
    albumname: '@sentence(10, 20)',
    artistid: '@id',
    artistname: '@sentence(10, 20)',
    icon: '@dataImage(150x150)',
    size: '@natural(100, 1000) KB',

  }]
})

module.exports = [
  {
    url: '/vue-admin-template/song/list',
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
