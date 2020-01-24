package com.academy.lesson03;

import java.util.Arrays;

public class lesson0302 {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};
        System.out.println(Arrays.toString(tracks));
        filterByRange(tracks,10,15);

        //System.out.println(extractNumber(tracks[0])); // выводим отформатированный нулевой элемент
    }

    private static void filterByRange(String[] tracks, int from, int to) {
        for (int i = 0; i < tracks.length; i++){
            int number = extractNumber(tracks[i]);
            if (number >= from && number <= to) {
                System.out.println(tracks[i]);
            }
        }

    }

    public static int extractNumber(String tracks) {
        String digits = tracks.substring(6); // берем из строки только цифры "track_01" - "01"
        return Integer.parseInt(digits); // превращаем в число "01" - 1
    }


}
