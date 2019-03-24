package cn.mesie.service.order.impl;

import cn.mesie.service.order.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 2019-03-24 17:29
 *
 * @author: mesie
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Override
    public String addOrderInfo(String name) {
        logger.info("新增的订单名称是：" + name);
        return name + "O";
    }
}
