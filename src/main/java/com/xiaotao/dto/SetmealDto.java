package com.xiaotao.dto;


import com.xiaotao.entity.Setmeal;
import com.xiaotao.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
