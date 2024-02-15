package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 필기.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *   리턴값으로 동링한 배열을 리턴 해주고 싶은 경우 사용한다. */

        String[] names = { "이도아 ", "이순신", "홍길동"};


         /* 필기. 얕은 복사 확인을 위한 hashCode 출력*/
        System.out.println("names의 hashCode : " + names.hashCode());

        /* 목차. 1. 인자와 매개변수로 활용 */
        print(names);        // 아래메소드를 불러와서 위에서 출력 / 위 아래 기능 분리
        // 매소드를 만나서 매소드로 갈건데 names 라는 것을 가지고 메소드로 갈거다

        /* 목차. 2. 리컨값으로 활용 */
        String[] animals = getAnimals();

        System.out.println("리턴 받은 animals 의 hashCode : " + animals.hashCode());

        print(animals);



    }

    public static void  print(String[] sarr){


        /* 필기. 전달 받은 배열의 hashCode 출력 */
        System.out.println("sarr의 hashCode : " + sarr.hashCode());   // names 랑 sarr 이랑 같은 값인지 한번 더 확인

        /* 필기. 전달 받은 배열의 값 출력 */
        for (int i = 0; i < sarr.length; i++){

            System.out.println(sarr[i]);     // names 라는 해쉬코드를 대신 출력해준다. (헤쉬코드가 같은데 잘 전달된것)
        }

        System.out.println();


    }

    public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};

        System.out.println("새로 만든 animals의 hashCode : " + animals.hashCode());

        return animals;
    }

}
