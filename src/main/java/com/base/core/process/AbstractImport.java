package com.base.core.process;

import com.base.core.process.helper.ImportHelper;

/**
 * @Author renzhiqiang
 * @Description 导入抽象类
 * @Date 2019-04-28
 **/
public abstract class AbstractImport<T> implements Import<T>{

    @Override
    public void importData(ImportHelper<T> importHelper) {

    }
}
