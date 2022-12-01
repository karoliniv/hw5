package ru.netology.sqr;

public class SQRService {
    public int calculate(int firstBorder, int lastBorder) {
        int counter = 0;
        for (int i = firstBorder; i <= lastBorder; i++) {
            for (int j = 1; j <= i; j++) {
                if (j * j == i) {
                    counter++;
//                    System.out.println(j + " - корень числа " + i);
                }
            }
        }
        return counter;
    }
}
