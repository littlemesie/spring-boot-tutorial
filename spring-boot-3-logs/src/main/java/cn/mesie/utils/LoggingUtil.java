package cn.mesie.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 2018/12/9 16:02
 *
 * @author: mesie
 */
public class LoggingUtil {

    private static final Logger logger = LoggerFactory.getLogger(LoggingUtil.class);

    public static void creatLogging() {
        logger.info("----------------------------------INFO");
        logger.debug("----------------------------------DEBUG");
        logger.error("----------------------------------ERROR");
    }
}
