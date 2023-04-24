import request from '@/utils/request'

export function getList(params) {
  return request({
    url: 'http://localhost:5009/comment/list',
    method: 'get',
    params
  })
}
