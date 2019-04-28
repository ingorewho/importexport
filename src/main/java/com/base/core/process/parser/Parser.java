package com.base.core.process.parser;

import com.base.core.process.parser.reader.Reader;

public interface Parser<T> {
    T parse(Reader reader);



}
