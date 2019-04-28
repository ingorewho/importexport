package com.base.core.type.excel;

import com.base.core.process.helper.ImportHelper;

public interface ImportExcel<T>{

    /**
     * 导入excel
     * @param helper
     * @return
     */
    boolean importExcel(ImportHelper<T> helper);


}
