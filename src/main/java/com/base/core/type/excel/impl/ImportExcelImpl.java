package com.base.core.type.excel.impl;

import com.base.core.process.AbstractImport;
import com.base.core.type.excel.Excel;
import com.base.core.type.excel.ImportExcel;

/**
 * @Author renzhiqiang
 * @Description 导入excel实现类
 * @Date 2019-04-28
 **/
public class ImportExcelImpl extends AbstractImport  implements ImportExcel {

    @Override
    public boolean importExcel(Excel excel) {
        importData(excel.getImportHelper());
        return true;
    }

}
