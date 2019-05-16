package com.base.core.metadata;

import java.util.List;

/**
 * @Author renzhiqiang
 * @Description 自定义sheet
 * @Date 2019-05-14
 **/
public class Sheet {
    /**sheet名称.**/
    private String name;
    /**bean类型.**/
    private Class<?> clazz;
    /**标题.**/
    private Title title;
    /**行.**/
    private List<Row> rows;


}
