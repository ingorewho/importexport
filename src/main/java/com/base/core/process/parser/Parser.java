package com.base.core.process.parser;

import java.io.InputStream;
import java.util.List;

public interface Parser<T> {
    List<T> parse(InputStream stream);

    InputStream parse(List<T> data);

    /**
     * bean class type
     * @return
     */
    Class<?> clazzType();
}
