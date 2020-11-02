package com.jxd.stutrack.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jxd.stutrack.mapper.ScoreMapper;
import com.jxd.stutrack.model.Score;
import com.jxd.stutrack.service.ScoreService;
import org.springframework.stereotype.Service;

/**
 * (Score)表服务实现类
 *
 * @author makejava
 * @since 2020-10-31 14:38:32
 */
@Service("scoreService")
public class ScoreServiceImpl extends ServiceImpl<ScoreMapper, Score> implements ScoreService {

}