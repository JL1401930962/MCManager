<template>
  <div class="app-container">
    <el-pagination
      :total="total"
      :page-size="pageSize"
      :current-page.sync="currentPage"
      @size-change="handleSizeChange"
      layout="total, sizes, prev, pager, next, jumper"
      @current-change="handleCurrentChange"
    ></el-pagination>
    <el-table
      v-loading="listLoading"
      :data="list"
      element-loading-text="Loading"
      border
      fit
      highlight-current-row
    >
      <el-table-column align="center" label="No." width="95">
        <template slot-scope="scope">
          {{ scope.$index }}
        </template>
      </el-table-column>
      <el-table-column label="用户ID">
        <template slot-scope="scope">
          {{ scope.row.userid }}
        </template>
      </el-table-column>
      <el-table-column label="用户名" width="110" align="center">
        <template slot-scope="scope">
          {{ scope.row.username }}
        </template>
      </el-table-column>
      <el-table-column label="内容">
        <template slot-scope="scope">
          {{ scope.row.content }}
        </template>
      </el-table-column>
      <el-table-column label="图片">
        <template slot-scope="scope">
          <img :src="getImageUrl(scope.row.picture)">
        </template>
      </el-table-column>
      <el-table-column label="歌曲ID">
        <template slot-scope="scope">
          {{ scope.row.songid }}
        </template>
      </el-table-column>
      <el-table-column label="点赞数">
        <template slot-scope="scope">
          {{ scope.row.like_num }}
        </template>
      </el-table-column>
      <el-table-column label="评论数">
        <template slot-scope="scope">
          {{ scope.row.comment_num }}
        </template>
      </el-table-column>
      <el-table-column align="center" prop="created_at" label="发帖时间" width="200">
        <template slot-scope="scope">
          <i class="el-icon-time" />
          <span>{{ scope.row.post_time }}</span>
        </template>
      </el-table-column>
    </el-table>
  </div>
</template>

<script>
import { getList } from '@/api/post'

export default {
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'gray',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      list: null,
      listLoading: true,
      total: 0,
      pageSize: 4,
      currentPage: 1
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    handleSizeChange(val) {
      this.pageSize = val
      this.fetchData()
    },
    handleCurrentChange(val) {
      this.currentPage = val
      this.fetchData()
    },
    fetchData() {
      this.listLoading = true
      getList().then(response => {
        this.list = response.data.items
        this.listLoading = false
      })
    },
    getImageUrl(picture) {
      const bytes = atob(picture)
      const array = new Uint8Array(bytes.length)
      for (let i = 0; i < bytes.length; i++) {
        array[i] = bytes.charCodeAt(i)
      }
      const blob = new Blob([array], { type: 'image/*' })
      return URL.createObjectURL(blob)
    }

  }
}
</script>
