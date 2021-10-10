package com.company;
import java.util.Scanner;

class Res {

    public void type_long(double a) {
        long score;
        if(a >= 0 & a < Math.pow(2, 63)) {
            score = (long)a;
            StringBuilder out = new StringBuilder();
            for (byte i = 63; i >= 0; i--) {
                if ((long)(Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (long) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(byte i = 7; i<63; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("long:  0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 63)) {
            score=(long)(-1*Math.pow(2, 63))^(long)a;
            StringBuilder out = new StringBuilder();
            for (byte i = 63; i >= 0; i--) {
                if ((long)(Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (long) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(byte i = 7; i<63; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("long:  1" + out);
        }
        if(a >= Math.pow(2, 63) | a < (-1*Math.pow(2, 63))){
            System.out.println("Введенное число не помещается в тип long");
        }
    }

    public void type_int(double a) {
        long score;
        if(a >= 0 & a < Math.pow(2, 31)) {
            score = (long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 31; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<30; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("int:   0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 31)) {
            score=(int)(-1*Math.pow(2, 31))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 31; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<30; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("int:   1" + out);
        }
        if(a >= Math.pow(2, 31) | a < (-1*Math.pow(2, 31))){
            System.out.println("Введенное число не помещается в тип int");
        }
    }

    public void type_short(double a) {
        long score;
        if(a >= 0 & a < Math.pow(2, 15)) {
            score = (long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 15; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<15; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("short: 0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 15)) {
            score=(int)(-1*Math.pow(2, 15))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 15; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<15; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("short: 1" + out);
        }
        if(a>=Math.pow(2, 15)|a<(-1*Math.pow(2,15))){
            System.out.println("Введенное число не помещается в тип short");
        }
    }

    public void type_byte(double a) {
        long score;
        if(a >= 0 & a < Math.pow(2, 7)) {
            score = (long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 7; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            System.out.println("byte:  0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 7)) {
            score=(int)(-1*Math.pow(2, 7))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 7; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int) Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            System.out.println("byte:  1" + out);
        }
        if(a>=Math.pow(2, 7)|a<(-1*Math.pow(2, 7))){
            System.out.println("Введенное число не помещается в тип byte");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        double input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        input = sc.nextDouble();

        Res byte1 = new Res();
        Res short1 = new Res();
        Res int1 = new Res();
        Res long1 = new Res();
        byte1.type_byte(input);
        short1.type_short(input);
        int1.type_int(input);
        long1.type_long(input);
    }

}