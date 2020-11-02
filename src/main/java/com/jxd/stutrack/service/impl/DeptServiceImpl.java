package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.DeptMapper;
import com.jxd.stutrack.model.Dept;
import com.jxd.stutrack.service.DeptService;
import org.springframework.stereotype.Service;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2020-10-31 14:37:18
 */
@Service("deptService")
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}