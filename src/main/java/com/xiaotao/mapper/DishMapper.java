package com.xiaotao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaotao.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
