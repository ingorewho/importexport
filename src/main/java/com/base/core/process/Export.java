package com.base.core.process;

import com.base.core.process.parser.Parser;

public interface Export<F> {

    /**
     * 导出
     * @param parser
     * @return
     */
    F exportData(Parser parser);
}
