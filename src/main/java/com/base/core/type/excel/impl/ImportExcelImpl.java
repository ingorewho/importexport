package com.base.core.type.excel.impl;

import com.base.core.process.AbstractImport;
import com.base.core.process.helper.ImportHelper;
import com.base.core.process.parser.Parser;
import com.base.core.type.excel.ImportExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author renzhiqiang
 * @Description 导入excel实现类
 * @Date 2019-04-28
 **/
public class ImportExcelImpl extends AbstractImport  implements ImportExcel {

    public boolean importExcel(File excel) {
        try {
            ImportHelper helper = new ImportExcelHelper(new FileInputStream(excel));
            importData(helper);
        } catch (IOException e) {

        }


        return false;
    }

    public boolean importExcel(InputStream stream) {
        return false;
    }

    class ImportExcelHelper implements ImportHelper {
        private FileInputStream stream;

        public ImportExcelHelper(FileInputStream stream){
            this.stream = stream;
        }
        public FileInputStream getStream() {
            return null;
        }

        public List getData() {
            return null;
        }

        public Parser getParser() {
            return null;
        }
    }
}
