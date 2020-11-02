package com.jxd.stutrack.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jxd.stutrack.model.Schedule;
import com.jxd.stutrack.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Schedule)表控制层
 *
 * @author Chen Yu
 * @since 2020-11-01 14:59:15
 */
@RestController
@RequestMapping("schedule")
public class ScheduleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private ScheduleService scheduleService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param schedule 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Schedule> page, Schedule schedule) {
        return success(this.scheduleService.page(page, new QueryWrapper<>(schedule)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.scheduleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param schedule 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Schedule schedule) {
        return success(this.scheduleService.save(schedule));
    }

    /**
     * 修改数据
     *
     * @param schedule 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Schedule schedule) {
        return success(this.scheduleService.updateById(schedule));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.scheduleService.removeByIds(idList));
    }
}