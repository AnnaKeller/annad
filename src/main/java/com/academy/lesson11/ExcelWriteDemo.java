package com.academy.lesson11;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriteDemo {
    public static void main(String[] args) throws IOException {
        String pathOut = "/Users/annadrevnyak/Desktop/temp/test file.xlsx";
        FileOutputStream fos = new FileOutputStream(new File(pathOut));

        XSSFWorkbook workbook = new XSSFWorkbook();
        // создаем эксель файл для заполнения

        XSSFSheet sheet = workbook.createSheet("Some Shit");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("Happiness and joy");

        workbook.write(fos);
        // Физически запись в файл

        fos.close();
        workbook.close();


    }
}
