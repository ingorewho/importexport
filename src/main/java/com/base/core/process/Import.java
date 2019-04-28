package com.base.core.process;

import com.base.core.process.helper.ImportHelper;

public interface Import<E> {

    /**
     * 导入
     * @param importHelper
     * @return
     */
    void importData(ImportHelper importHelper);


}
