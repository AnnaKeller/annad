package com.academy.lesson11;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToExcelFromTxt { public static void main(String[] args) throws IOException, InvalidFormatException {
    String pathIn = "/Users/annadrevnyak/Desktop/temp/женские имена.txt";
    String pathOut = "/Users/annadrevnyak/Desktop/temp/test file.xlsx";

    XSSFWorkbook workbook = new XSSFWorkbook(new File(pathIn));

    XSSFSheet sheet = workbook.getSheetAt(0);
    XSSFRow row = sheet.getRow(0);
    XSSFCell cell = row.getCell(0);
    String name = cell.getStringCellValue();
    System.out.println(name);

    workbook.close();

}
}
