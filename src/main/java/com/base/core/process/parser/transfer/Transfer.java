package com.base.core.process.parser.transfer;

import com.base.core.metadata.*;

/**
 * @Author renzhiqiang
 * @Description 数据转换接口
 * @Date 2019-05-14
 **/
public interface Transfer<T> {

    /**
     * 转换成bean
     * @param baseRow
     * @param title
     * @return
     */
    T transfer(Row baseRow, Title title);


    /**
     * 转换成一行数据
     * @param data
     * @return
     */
    Row transfer(T data);
}
