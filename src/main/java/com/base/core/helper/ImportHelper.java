package com.base.core.helper;

import com.base.core.process.parser.Parser;

import java.io.FileInputStream;
import java.util.List;

public interface ImportHelper<T> {
    FileInputStream getStream();

    List<T> getData();

    Parser<T> getParser();
}
