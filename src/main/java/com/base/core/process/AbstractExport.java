package com.base.core.process;

import com.base.core.process.parser.Parser;

/**
 * @Author renzhiqiang
 * @Description 导出抽象类
 * @Date 2019-04-28
 **/
public abstract class AbstractExport<T> implements Export<T>{

    @Override
    public T exportData(Parser parser) {
        return null;
    }
}
