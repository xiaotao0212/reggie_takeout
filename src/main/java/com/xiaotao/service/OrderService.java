package com.xiaotao.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaotao.entity.Orders;

public interface OrderService extends IService<Orders> {


    public void submit(Orders orders);

}
