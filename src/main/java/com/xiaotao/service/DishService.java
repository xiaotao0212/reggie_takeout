package com.xiaotao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaotao.dto.DishDto;
import com.xiaotao.entity.Dish;

public interface DishService extends IService<Dish> {

    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);

}
