package com.base.core.process.parser.writer;

import com.base.core.process.base.Column;
import com.base.core.process.base.Row;

public interface Writer<T> {
    T writeRow(Row row);

    T writeColumn(Column column);
}
