package cn.mesie.service;

import cn.mesie.annotation.timebuskerBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by 2019-03-24 17:26
 *
 * @author: mesie
 */
@Service
@timebuskerBean
public class CommonService {
    private final static Logger logger = LoggerFactory.getLogger(CommonService.class);

    public int add(int i) {
        i = i + 1;
        logger.info("CommonService 的处理结果为：" + i);
        return i;
    }
}
