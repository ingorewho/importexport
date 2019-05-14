package com.base.core.process;

import com.base.core.helper.ImportHelper;

public interface Import<T> {

    /**
     * 导入
     * @param importHelper
     * @return
     */
    void importData(ImportHelper<T> importHelper);


}
