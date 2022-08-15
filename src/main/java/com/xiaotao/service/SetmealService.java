package com.xiaotao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaotao.dto.SetmealDto;
import com.xiaotao.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
