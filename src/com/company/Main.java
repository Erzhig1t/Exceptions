package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            number(-4);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public static void number(int a) throws Exception{
         int result = 1;
                if(a<0) throw new  ArithmeticException("Tuura emes");

                    for (int i = 0; i < a; i++) {
                        result = result * i;

                    }
                    System.out.println(result);

                }

    }

