package com.xiaotao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaotao.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
