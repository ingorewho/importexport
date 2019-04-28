package com.base.core.process.parser;

import com.base.core.process.parser.mapper.Mapper;
import com.base.core.process.parser.reader.Reader;
import com.base.core.process.parser.writer.Writer;

/**
 * @Author renzhiqiang
 * @Description 解析器抽象类
 * @Date 2019-04-28
 **/
public abstract class AbstractParser<T> implements Parser<T> {
    private Reader reader;
    private Writer writer;
    private Mapper mapper;

    AbstractParser(Reader reader, Writer writer, Mapper mapper){
        this.reader = reader;
        this.writer = writer;
        this.mapper = mapper;
    }


    public T parse(Reader reader) {
        return null;
    }
}
