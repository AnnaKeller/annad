package com.academy.lesson03;

public class lesson0303 {
    public static void main(String[] args) {
        String [] priceRaw = {"4 418?грн", "41 418?грн", "4 418?$"};
        int [] expected = {4418, 41481, 4418};

        for (int i =0; i < priceRaw.length; i++){
            String replaced = Replace(priceRaw[i]);
            int actual = Integer.parseInt(replaced);
            System.out.println(expected[i] == actual);

        }

        String replaced = Replace(priceRaw[1]);
        System.out.println(replaced);




    }
    public static String Replace (String priceRaw) {
        return priceRaw
                .replace("?грн", "")
                .replace(" ", "") //заменяем ненужные знаки на пустоту
                .replace("?$", "");

    }
}
