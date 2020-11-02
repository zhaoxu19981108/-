package com.jxd.stutrack.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jxd.stutrack.model.User;
import org.springframework.stereotype.Repository;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-31 14:39:23
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

}