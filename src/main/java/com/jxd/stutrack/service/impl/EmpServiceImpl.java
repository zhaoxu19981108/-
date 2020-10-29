package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.IEmpMapper;
import com.jxd.stutrack.model.Emp;
import com.jxd.stutrack.service.IEmpService;
import org.springframework.stereotype.Service;

/**
 * @author Daniel
 * @version 3.0
 * @description
 * @date 2020/10/29 15:02
 */
@Service
public class EmpServiceImpl extends ServiceImpl<IEmpMapper, Emp> implements IEmpService {
}
