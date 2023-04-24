<template>
  <div class="app-container">
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
      <el-table-column label="歌曲ID">
        <template slot-scope="scope">
          {{ scope.row.songid }}
        </template>
      </el-table-column>
      <el-table-column label="歌曲url" width="110">
        <template slot-scope="scope">
          {{ scope.row.songurl }}
        </template>
      </el-table-column>
      <el-table-column label="歌曲名">
        <template slot-scope="scope">
          {{ scope.row.songname }}
        </template>
      </el-table-column>
      <el-table-column label="专辑ID">
        <template slot-scope="scope">
          {{ scope.row.albumid }}
        </template>
      </el-table-column>
      <el-table-column label="专辑名">
        <template slot-scope="scope">
          {{ scope.row.albumname }}
        </template>
      </el-table-column>
      <el-table-column label="歌手ID">
        <template slot-scope="scope">
          {{ scope.row.artistid }}
        </template>
      </el-table-column>
      <el-table-column label="歌手名">
        <template slot-scope="scope">
          {{ scope.row.artistname }}
        </template>
      </el-table-column>
      <el-table-column label="专辑图标">
        <template slot-scope="scope">
          {{ scope.row.icon }}
        </template>
      </el-table-column>
      <el-table-column label="歌曲大小">
        <template slot-scope="scope">
          {{ scope.row.size }}
        </template>
      </el-table-column>

    </el-table>
  </div>
</template>

<script>
import { getList } from '@/api/song'

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
      listLoading: true
    }
  },
  created() {
    this.fetchData()
  },
  methods: {
    fetchData() {
      this.listLoading = true
      getList().then(response => {
        this.list = response.data.items
        this.listLoading = false
      })
    }
  }
}
</script>
