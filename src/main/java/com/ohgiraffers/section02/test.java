package com.ohgiraffers.section02;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력해 주세요");
        int num = sc.nextInt();

        if(num >=1 && num<11){
            if(num%2==0){
                System.out.println("짝수입니다.");
            }else {
                System.out.println("홀수입니다.");
            }
        }else {
            System.out.println("반드시 1~10사이의 정수를 입력.");
        }

       }


    }
