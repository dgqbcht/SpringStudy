package org.dgqbcht.springstudy.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类型转换器，将String转为java.util.Date
 */
public class DateConverter implements Converter<String, Date> {
    private String pattern;

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     * 实现接口的convert方法
     * @param source 日期字符串
     * @return Date类型的日期
     */
    @Override
    public Date convert(String source) {
        Date date = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            date = format.parse(source);
        }catch (ParseException e){
            e.printStackTrace();
        }
        return date;
    }
}
