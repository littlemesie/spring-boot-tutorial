package cn.mesie.controller;

import cn.mesie.utils.LoggingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2018/12/9 16:04
 *
 * @author: mesie
 */
@RestController
public class Log4jController {

    private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

    @RequestMapping(value = { "/log4j", "/" }, method = RequestMethod.GET)
    public Long log4j() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
        LoggingUtil.creatLogging();
        return System.currentTimeMillis();
    }
}
