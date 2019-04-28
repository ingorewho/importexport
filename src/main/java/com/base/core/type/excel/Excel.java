package com.base.core.type.excel;

import com.base.core.process.helper.ImportHelper;


/**
 * @Author renzhiqiang
 * @Description excel文件
 * @Date 2019-04-28
 **/
public final class Excel<T> {

    final ImportHelper<T> importHelper;

    public Excel(ImportHelper importHelper) {
        this.importHelper = importHelper;
    }


    public ImportHelper getImportHelper() {
        return importHelper;
    }

    public static Builder newBuilder(){
        return new Builder();
    }

    private Excel(Builder builder) {
        this.importHelper = builder.importHelper;
    }

    static class Builder<T> {
        private ImportHelper<T> importHelper;


        public Builder importHelper(ImportHelper importHelper) {
            this.importHelper = importHelper;
            return this;
        }

        public Excel build(){
            return new Excel(this);
        }

    }

}
