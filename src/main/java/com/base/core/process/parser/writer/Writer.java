package com.base.core.process.parser.writer;

import com.base.core.metadata.Column;
import com.base.core.metadata.Row;

public interface Writer<T> {
    T writeRow(Row row);

    T writeColumn(Column column);
}
