package com.base.core.process.parser.reader;

import com.base.core.process.base.Column;
import com.base.core.process.base.Row;

public interface Reader<T> {

    T readRow(Row row);

    T readColumn(Column column);

    /**
     * bean class type
     * @return
     */
    Class<?> clazzType();

}
