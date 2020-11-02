package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.EmpMapper;
import com.jxd.stutrack.model.Emp;
import com.jxd.stutrack.service.EmpService;
import org.springframework.stereotype.Service;

/**
 * (Emp)表服务实现类
 *
 * @author makejava
 * @since 2020-10-31 14:38:15
 */
@Service("empService")
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {

}