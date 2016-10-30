package com.taotao.ucenter.mapper;


import java.util.List;

import com.github.abel533.mapper.Mapper;
import com.taotao.ucenter.pojo.Order;
import com.taotao.ucenter.vo.OrderSelectVo;

public interface OrderMapper extends Mapper<Order> {
    public List<Order> queryOrderByUserIdAndCreateDateAndStatus(OrderSelectVo vo);
}
