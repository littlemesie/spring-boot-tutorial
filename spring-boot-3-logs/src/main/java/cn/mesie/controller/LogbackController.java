package cn.mesie.controller;

import cn.mesie.utils.LoggingUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 2018/12/9 16:32
 *
 * @author: mesie
 */
@RestController
public class LogbackController {

    private static final Logger logger = LoggerFactory.getLogger(Log4jController.class);

    @RequestMapping(value = { "/logback", "/" }, method = RequestMethod.GET)
    public Long logback() {
        logger.info("logback----------------------------------INFO");
        logger.debug("logback----------------------------------DEBUG");
        logger.error("logback----------------------------------ERROR");
        LoggingUtil.creatLogging();
        return System.currentTimeMillis();
    }
}
