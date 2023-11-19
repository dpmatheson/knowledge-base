package uk.co.dpmatheson.loops;

public class Loops {

    private static final String[] values = {"Zero", "First", "Second", "Third", "Forth", "Fifth"};

    public static void main(String[] args) {
        System.out.println("====================== For Loop ======================");
        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

        System.out.println("====================== For Each Loop ======================");
        for (String s : values){
            System.out.println(s);
        }

        System.out.println("====================== Do While Loop ======================");
        int j = 0;
        do{ //guaranteed to run at least once
            System.out.println(values[j]);
            j++;
        }while (j < values.length);

        System.out.println("====================== While Loop ======================");
        int k = 0;
        while (k < values.length){
            System.out.println(values[k]);
            k++;
        }

        System.out.println("====================== Infinite For Loop with break ======================");
        int l = 1;
        for (;;){
            System.out.println(l);
            if (l == 10){
                break;
            }
            l++;
        }

        System.out.println("====================== For Loop with continue ======================");
        for (int m = 0; m < values.length; m++){
            if (m%2 == 0){
                continue; //if m is even, continue to next loop, skipping the rest of the statements
            }
            System.out.println(values[m]);
        }

    }

}
