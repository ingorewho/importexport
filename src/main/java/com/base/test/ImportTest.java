package com.base.test;

import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author renzhiqiang
 * @Description 导入测试
 * @Date 2019-05-14
 **/
public class ImportTest {

    public static void main(String[] args){
        File file = new File("/Users/renfeng/Downloads/test.xls");

        try {
            System.out.println(importExcel(file));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static List importExcel(File file)throws Exception {
        // 1.获取用户上传的文件
        Workbook workbook = Workbook.getWorkbook(file);
        // 2.获取工作簿sheet
        Sheet sheet = workbook.getSheet(0);
        // 3.获取总行数
        int rows = sheet.getRows();
        List<TestBean> list = new ArrayList<TestBean>();
        for (int i = 1; i < rows; i++) {
            TestBean testBean = new TestBean();
            testBean.setName(sheet.getCell(0, i).getContents());
            testBean.setDesc(sheet.getCell(1, i).getContents());
            list.add(testBean);
        }
        // 5.关闭资源
        workbook.close();
        return list;
    }
}
