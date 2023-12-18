package com.ohgiraffers.practice;

import com.ohgiraffers.practice2.RandomMaker;

public class Application {
    public static void main(String[] args) {

        RandomMaker rn = new RandomMaker();

        System.out.println(rn.randomNumber(30,100));

        System.out.println(rn.rockPaperScissors());

        System.out.println(rn.tossCoin());



    }
}
