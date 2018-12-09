package cn.mesie.controller;

import cn.mesie.utils.LoggingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2018/12/9 16:33
 *
 * @author: mesie
 */
@RestController
public class Log4j2Controller {

    private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

    @RequestMapping(value = { "/log4j2", "/" }, method = RequestMethod.GET)
    public Long log4j2() {
        logger.info("log4j2----------------------------------INFO");
        logger.debug("log4j2----------------------------------DEBUG");
        logger.error("log4j2----------------------------------ERROR");
        LoggingUtil.creatLogging();
        return System.currentTimeMillis();
    }
}
