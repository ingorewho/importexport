package com.base.core.type.excel;

public interface ImportExcel<T>{

    /**
     * 导入excel
     * @param excel
     * @return
     */
    boolean importExcel(Excel<T> excel);

}
