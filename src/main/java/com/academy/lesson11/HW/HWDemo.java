package com.academy.lesson11.HW;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HWDemo extends Abonent{
    public static void main(String[] args) throws IOException, InvalidFormatException {
        String pathFemNames = null;
        String pathFemLasts = null;
        String pathMaleNames = null;
        String pathMaleLasts = null;
        String pathOut = null;

        FileOutputStream fos = null;
        XSSFWorkbook workbook = null;
        try {
            pathFemNames = "/Users/annadrevnyak/Desktop/temp/женские имена.txt";
            pathFemLasts = "/Users/annadrevnyak/Desktop/temp/женские фамилии.txt";
            pathMaleNames = "/Users/annadrevnyak/Desktop/temp/мужские имена.txt";
            pathMaleLasts = "/Users/annadrevnyak/Desktop/temp/мужские фамилии.txt";
            pathOut = "/Users/annadrevnyak/Desktop/temp/test file.xlsx";


            BufferedReader br = new BufferedReader(new FileReader(pathFemNames));
            BufferedReader br1 = new BufferedReader(new FileReader(pathFemLasts));
            BufferedReader br2 = new BufferedReader(new FileReader(pathMaleNames));
            BufferedReader br3 = new BufferedReader(new FileReader(pathMaleLasts));

            List<String> femNames = readFile(br);
            List<String> femLasts = readFile(br1);
            List<String> maleNames = readFile(br2);
            List<String> maleLasts = readFile(br3);

            List<Abonent> abonents = new ArrayList<Abonent>();
            List<String> operators = new ArrayList<String>();
            operators.add("Life");
            operators.add("Kievstar");
            operators.add("Vodafone");

            for (int i = 0; i < 199; i++) {
                abonents.add(createAbonent(femNames, maleNames, femLasts, maleLasts, operators));
            }

            fos = new FileOutputStream(new File(pathOut));
            workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Abonents");

            String[] header = new String[]{"First name", "Last name", "Age", "Gender", "Operator", "Number"};
            XSSFRow row = sheet.createRow(0);

            createHeader(header, row);
            int rowIterator = 1;

            pasteIntoXls(abonents, sheet, rowIterator);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert workbook != null;
        workbook.write(fos);

        workbook.close();

    }

    private static void pasteIntoXls(List<Abonent> abonents, XSSFSheet sheet, int rowIterator) {
        XSSFRow row;
        for (int i = 0; i < abonents.size(); i++) {
            row = sheet.createRow(rowIterator); //задать строку
            XSSFCell cell = row.createCell(0); //задать колонку
            cell.setCellValue(abonents.get(i).getFirstName());
            cell = row.createCell(1); //перейти на следующую колонку
            cell.setCellValue(abonents.get(i).getLastName());
            cell = row.createCell(2);
            cell.setCellValue(abonents.get(i).getAge());
            cell = row.createCell(3);
            cell.setCellValue(abonents.get(i).getGender());
            cell = row.createCell(4);
            cell.setCellValue(abonents.get(i).getOperator());
            cell = row.createCell(5);
            cell.setCellValue(abonents.get(i).getNumber());
            rowIterator += 1; //перейти на следующую строку
        }
    }


    private static void createHeader(String[] header, XSSFRow row) {
        for (int i = 0; i < header.length; i++) {
            XSSFCell cell = row.createCell(i);
            cell.setCellValue(header[i]);
        }
    }

    static public List<String> readFile(BufferedReader br) throws IOException {
        List<String> tempArray = new ArrayList<>();
        String temp;
        while ((temp = br.readLine()) != null) {
            tempArray.add(temp);
        }
        return tempArray;
    }

    static public Abonent createAbonent(List<String> fName, List<String> mName, List<String> fLast,
                                        List<String> mLast, List<String> operators) {
        Abonent test = new Abonent();
        Random random = new Random();

        test.setGender(createGender());
        List<String> names = null;
        List<String> lastNames = null;
        if (test.getGender().equals("м")) {
            names = mName;
            lastNames = mLast;
        } else {
            names = fName;
            lastNames = fLast;
        }
        test.setFirstName(names.get(random.nextInt(names.size())));
        test.setLastName(lastNames.get(random.nextInt(lastNames.size())));
        test.setAge(18 + random.nextInt(70));
        test.setOperator(operators.get(random.nextInt(operators.size())));
        if (test.getOperator().equals("Life")) {
            test.setNumber("+38063" + (1000000 + random.nextInt(999999)));
        }
        if (test.getOperator().equals("Kievstar")) {
            test.setNumber("+38097" + (1000000 + random.nextInt(999999)));
        }
        if (test.getOperator().equals("Vodafone")) {
            test.setNumber("+38050" + (1000000 + random.nextInt(999999)));
        }
        return test;
    }

    static public String createGender() {
        Random random = new Random();
        if (random.nextBoolean())
            return "м";
        else
            return "ж";
    }
}
