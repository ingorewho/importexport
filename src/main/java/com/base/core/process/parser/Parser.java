package com.base.core.process.parser;

import com.base.core.metadata.Sheet;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public interface Parser<T> {
    List<T> parse(InputStream stream, Sheet sheet);

    OutputStream parse(List<T> data);
}
