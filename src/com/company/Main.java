package com.company;
import java.util.Scanner;

class Res {

    public void type_double(long a, double b) {
        long score;
        double score1;
        int exp;
        StringBuilder exp1 = new StringBuilder();
        StringBuilder b1 = new StringBuilder();
        StringBuilder out = new StringBuilder();
        if(a!=0) {
            StringBuilder a1 = new StringBuilder();
            score = Math.abs(a);
            while (score > 0) {
                if (score % 2 == 1) {
                    a1.append("1");
                } else {
                    a1.append("0");
                }
                score >>= 1;
            }
            a1.reverse();
            exp = a1.length() - 1 + 1023;
            a1.deleteCharAt(0);
            for (byte i = 10; i >= 0; i--) {
                if ((int) (Math.pow(2, i)) <= exp) {
                    exp1.append("1");
                    exp = exp - (int) Math.pow(2, i);
                } else {
                    exp1.append("0");
                }
            }
            score1 = Math.abs(b);
            while(score1 > 0 & a1.length() + b1.length()<52) {
                score1 *= 2;
                if ((long)score1 == 1) {
                    b1.append("1");
                    score1 -= (long)score1;
                } else {
                    b1.append("0");
                }
            }
            out = a1.append(b1);
        }
        else {
            score1 = Math.abs(b);
            while (score1 > 0 & b1.length() < 52) {
                score1 *= 2;
                if ((long) score1 == 1) {
                    b1.append("1");
                    score1 -= (long) score1;
                } else {
                    b1.append("0");
                }
            }
            exp = 1023 - b1.length();
            for (byte i = 10; i >= 0; i--) {
                if ((int) (Math.pow(2, i)) <= exp) {
                    exp1.append("1");
                    exp = exp - (int) Math.pow(2, i);
                } else {
                    exp1.append("0");
                }
            }
            out.append(b1);
        }
        while(out.length()<52){
            out.append("0");
        }
        if (a > 0 | b > 0) {
            System.out.println("double: 0 " + exp1 + " " + out);
        }
        if (a < 0 | b < 0) {
            System.out.println("double: 1 " + exp1 + " " + out);
        }
    }

    public void type_float(long a, double b) {
        long score;
        double score1;
        int exp;
        StringBuilder exp1 = new StringBuilder();
        StringBuilder b1 = new StringBuilder();
        StringBuilder out = new StringBuilder();
        if(a!=0) {
            StringBuilder a1 = new StringBuilder();
            score = Math.abs(a);
            while (score > 0) {
                if (score % 2 == 1) {
                    a1.append("1");
                } else {
                    a1.append("0");
                }
                score >>= 1;
            }
            a1.reverse();
            exp = a1.length() - 1 + 127;
            a1.deleteCharAt(0);
            for (byte i = 7; i >= 0; i--) {
                if ((int) (Math.pow(2, i)) <= exp) {
                    exp1.append("1");
                    exp = exp - (int) Math.pow(2, i);
                } else {
                    exp1.append("0");
                }
            }
            score1 = Math.abs(b);
            while(score1 > 0 & a1.length() + b1.length()<23) {
                score1 *= 2;
                if ((long)score1 == 1) {
                    b1.append("1");
                    score1 -= (long)score1;
                } else {
                    b1.append("0");
                }
            }
            out = a1.append(b1);
        }
        else {
            score1 = Math.abs(b);
            while (score1 > 0 & b1.length() < 23) {
                score1 *= 2;
                if ((long) score1 == 1) {
                    b1.append("1");
                    score1 -= (long) score1;
                } else {
                    b1.append("0");
                }
            }
            exp = 127 - b1.length();
            for (byte i = 7; i >= 0; i--) {
                if ((int) (Math.pow(2, i)) <= exp) {
                    exp1.append("1");
                    exp = exp - (int) Math.pow(2, i);
                } else {
                    exp1.append("0");
                }
            }
            out.append(b1);
        }
        while(out.length()<23){
            out.append("0");
        }
        if (a > 0 | b > 0) {
            System.out.println("double: 0 " + exp1 + " " + out);
        }
        if (a < 0 | b < 0) {
            System.out.println("double: 1 " + exp1 + " " + out);
        }
    }

    public void type_long(double a) {
        long score;
        if(a >= 0 & a < Math.pow(2, 63)) {
            score = (long)a;
            StringBuilder out = new StringBuilder();
            for (byte i = 63; i >= 0; i--) {
                if ((long)(Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (long)Math.pow(2, i);
                }
                else {
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(byte i = 7; i<63; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("long:   0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 63)) {
            score=(long)(-1 * Math.pow(2, 63)) ^ (long)a;
            StringBuilder out = new StringBuilder();
            for (byte i = 63; i >= 0; i--) {
                if ((long)(Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (long)Math.pow(2, i);
                }
                else {
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(byte i = 7; i<63; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("long:   1" + out);
        }
        if(a >= Math.pow(2, 63) | a < (-1 * Math.pow(2, 63))){
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
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<30; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("int:    0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 31)) {
            score=(int)(-1*Math.pow(2, 31))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 31; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<30; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("int:    1" + out);
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
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<15; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("short:  0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 15)) {
            score=(int)(-1*Math.pow(2, 15))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 15; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            for(int i = 7; i<15; i+=9) {
                out.insert(i, ' ');
            }
            System.out.println("short:  1" + out);
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
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            System.out.println("byte:   0" + out);


        } if(a < 0 & a >= -1*Math.pow(2, 7)) {
            score=(int)(-1*Math.pow(2, 7))^(long)a;
            StringBuilder out = new StringBuilder();
            for (int i = 7; i >= 0; i--) {
                if ((Math.pow(2, i)) <= score) {
                    out.append("1");
                    score = score - (int)Math.pow(2, i);
                }
                else{
                    out.append("0");
                }
            }
            out.deleteCharAt(0);
            System.out.println("byte:   1" + out);
        }
        if(a>=Math.pow(2, 7)|a<(-1*Math.pow(2, 7))){
            System.out.println("Введенное число не помещается в тип byte");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        double frac = 0;
        long input;
        byte flag = 0;
        String input1;
        String[] parts;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        input1 = sc.nextLine();
        if(input1.contains(".")){
            parts = input1.split("\\.");
            input = Long.parseLong(parts[0]);
            frac = Double.parseDouble(parts[1]);
            String frac1 = String.valueOf(frac);
            frac/=(Math.pow(10, frac1.length()-2));
            if(input==0 & input1.contains("-")){
                frac*=-1;
            }
            System.out.println("\""+input1+"\" ->\n");
        } else if(input1.contains(",")){
            parts = input1.split(",");
            input = Long.parseLong(parts[0]);
            frac = Double.parseDouble(parts[1]);
            String frac1 = String.valueOf(frac);
            frac/=(Math.pow(10, frac1.length()-2));
            if(input==0 & input1.contains("-")){
                frac*=-1;
            }
            System.out.println("\""+input1+"\" ->\n");
        } else{
            input = Long.parseLong(input1);
            System.out.println("\""+input1+"\" ->\n");
        }

        Res byte1 = new Res();
        Res short1 = new Res();
        Res int1 = new Res();
        Res long1 = new Res();
        Res float1 = new Res();
        Res double1 = new Res();
        if(frac==0) {
            byte1.type_byte(input);
            short1.type_short(input);
            int1.type_int(input);
            long1.type_long(input);
            float1.type_float(input, frac);
            double1.type_double(input, frac);
        } else if(frac!=0){
            float1.type_float(input, frac);
            double1.type_double(input, frac);
        }
    }

}