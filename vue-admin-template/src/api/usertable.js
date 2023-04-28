import request from '@/utils/request'

export function getList(params) {
  return request({
    url: 'http://localhost:5009/user/getAllUser',
    method: 'get',
    params
  })
}
