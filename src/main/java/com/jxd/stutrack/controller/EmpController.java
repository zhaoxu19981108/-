package com.jxd.stutrack.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.stutrack.model.Emp;
import com.jxd.stutrack.service.EmpService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Emp)表控制层
 *
 * @author makejava
 * @since 2020-10-31 14:38:15
 */
@RestController
@RequestMapping("emp")
public class EmpController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private EmpService empService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param emp  查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Emp> page, Emp emp) {
        return success(this.empService.page(page, new QueryWrapper<>(emp)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.empService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param emp 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Emp emp) {
        return success(this.empService.save(emp));
    }

    /**
     * 修改数据
     *
     * @param emp 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Emp emp) {
        return success(this.empService.updateById(emp));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.empService.removeByIds(idList));
    }
}