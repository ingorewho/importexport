package com.base.core.process.parser.reader;

import com.base.core.metadata.Row;
import com.base.core.metadata.Title;

import java.util.List;

/**
 * @Author renzhiqiang
 * @Description 读取抽象类
 * @Date 2019-05-14
 **/
public abstract class AbstractReader<T> implements Reader{
    @Override
    public Title readTitle() {
        return null;
    }

    @Override
    public List<Row> readMutiRow(int rowNum) {
        return null;
    }

    @Override
    public List<Row> readAllRow() {
        return null;
    }
}
