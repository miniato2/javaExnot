package com.ohgiraffers.practice2;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        int rand = (int) (Math.random() * (max - min)) + min;
        return rand;
    }
    public String rockPaperScissors(){
        int rand = (int) (Math.random() * 3);

        String result = "";

        switch(rand){
            case 0 : result = "rock"; break;
            case 1 : result = "paper"; break;
            case 2 : result = "scissors"; break;
            default:
                System.out.println("error");
        }
        return result;
    }

    public String tossCoin(){
        int rand = (int) (Math.random()*2);
        String result = "";

        if(rand == 0){
            result = "앞";
        }else result ="뒤";

        return result;

    }

}
