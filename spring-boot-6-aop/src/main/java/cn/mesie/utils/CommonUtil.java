package cn.mesie.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by 2019-03-24 17:43
 *
 * @author: mesie
 */
public class CommonUtil {

    private final static Logger logger = LoggerFactory.getLogger(CommonUtil.class);

    public static int add(int i) {
        i = i + 1;
        logger.info("CommonUtil 的处理结果为：" + i);
        return i;
    }
}
