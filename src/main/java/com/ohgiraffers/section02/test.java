package com.ohgiraffers.section02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("정수를 입력해 주세요");
//        int num = sc.nextInt();
//
//        if(num >=1 && num<11){
//            if(num%2==0){
//                System.out.println("짝수입니다.");
//            }else {
//                System.out.println("홀수입니다.");
//            }
//        }else {
//            System.out.println("반드시 1~10사이의 정수를 입력.");
//        }

//        int age = 9;
//        double height = 110;
//
//        if ( age >= 9 && height >= 110){
//            System.out.println("나이는 " + age +  " 살 이상이여야 하고 " + " 키는 " + height +" cm 이상이어야 한다.");
//        }
        
        int englishScore = 30;
        int mathScore = 90;
        int sum;
        double average;
        
        sum = englishScore + mathScore;
        average = sum /2.0;

        System.out.println("점수를 입력하세요 : ");

        Scanner sc = new Scanner(System.in);
        average = sc.nextDouble();
        
      if (average < 60){
          System.out.println("불합격입니다.");
      } else if (englishScore < 40 || mathScore <40){
          System.out.println("불합격");
      } else {
          System.out.println("합격입니다.");
      }



    }


    }
