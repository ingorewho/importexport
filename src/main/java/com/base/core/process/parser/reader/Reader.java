package com.base.core.process.parser.reader;


import com.base.core.metadata.Row;

public interface Reader<T> {

    T readRow(Row row);




}
