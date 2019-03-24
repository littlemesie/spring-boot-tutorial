package cn.mesie.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 2019-03-24 17:43
 *
 * @author: mesie
 */
public class DateUtil {
    /**
     * 时间格式化
     * @return
     */
    public static String now() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String dateString = formatter.format(date);
        return dateString;
    }
}
