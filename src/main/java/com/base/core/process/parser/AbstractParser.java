package com.base.core.process.parser;

import com.base.core.metadata.Row;
import com.base.core.metadata.Sheet;
import com.base.core.metadata.Title;
import com.base.core.process.parser.mapper.Mapper;
import com.base.core.process.parser.reader.Reader;
import com.base.core.process.parser.writer.Writer;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

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

    @Override
    public List<T> parse(InputStream stream, Sheet sheet) {
        try {
            //1.解析标题信息
            Title title = parseTitle();
            //2.解析所有数据行
            List<Row> allRows = parseAllRow();
        } catch (Exception e) {

        }

        return null;
    }



    protected abstract Title parseTitle();

    protected abstract List<Row> parseAllRow();

    @Override
    public OutputStream parse(List<T> data) {
        return null;
    }
}
