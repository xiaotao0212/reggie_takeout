package com.xiaotao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaotao.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
