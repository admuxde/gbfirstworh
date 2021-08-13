package ru.dolgov.javawork1;


public class JavaIntroduction {
    public static void main(String[] args) {
        byte b = 10;
        short sh = 123;
        int i = 34234;
        long l = 32432L;
        float f = 435.4F;
        double d = 22.21;
        char c = '*';
        boolean bo = true;
        String s = "String";
        int ans = iFormul(5, 6, 7, 2);
        System.out.println(ans);
        System.out.println(limitSum(0, 5));
        System.out.println(nigativePositive(0));
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static int iFormul(int a, int b, int c, int d) {

        return a * (b + (c / d));
    }

    public static boolean limitSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String nigativePositive (int a){
        String messag;
        if (a<0){
            messag = "Nigativ";
            return messag;
        }else {
            messag="Positiv";
            return messag;
        }

    }
    public static void printThreeWords() {

        System.out.println("Orange\nBanana\nApple");

    }

    public static void checkSumSign() {
        int a, b, sum;
        a = -7;
        b = 3;
        sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value = 118;

        if (value < 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a, b;
        a = 4;
        b = 6;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}
