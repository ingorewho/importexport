package com.base.core.process.parser.reader;


import com.base.core.metadata.Row;
import com.base.core.metadata.Title;

import java.util.List;

public interface Reader {
    Title readTitle();

    List<Row> readMutiRow(int rowNum);

    List<Row> readAllRow();
}
