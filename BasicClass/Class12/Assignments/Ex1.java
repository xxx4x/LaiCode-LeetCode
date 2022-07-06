package BasicClass.Class12.Assignments;

import java.util.Random;

/*
Bounded Random Number(548)
Write a function that returns a random number within the range of [a, b] with equal probabilities.
Note: you can use Java’s Random class.

 */
public class Ex1 {
    public static void main(String[] args){
        System.out.println(random(3,5));

    }

    public static int random(int a, int b){// 参考答案
        Random rand = new Random();
        return a+rand.nextInt(b-a+1);
        /*
        Random rand =  new Random();
        int num = rand.nextInt(b+1);
        if (num < a){
            num = random(a, b);
        }
        return num;

         */
    }

}
