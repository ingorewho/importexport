package com.base.core.process.parser;

import com.base.core.metadata.Row;
import com.base.core.metadata.Title;
import com.base.core.process.parser.mapper.Mapper;
import com.base.core.process.parser.reader.Reader;
import com.base.core.process.parser.writer.Writer;

import java.util.List;

/**
 * @Author renzhiqiang
 * @Description 内部实现的解析器
 * @Date 2019-04-28
 **/
public class InternalParser extends AbstractParser{
    public InternalParser(Reader reader, Writer writer, Mapper mapper){
        super(reader, writer, mapper);
    }

    @Override
    protected Title parseTitle() {
        return null;
    }

    @Override
    protected List<Row> parseAllRow() {
        return null;
    }
}
