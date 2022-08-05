package com.ylt.mapper;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylt.model.entity.BmsBillboard;

@Repository				//meaning it is a entity layer object
public interface BmsBillboardMapper extends BaseMapper<BmsBillboard>{

}
