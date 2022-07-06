package BasicClass.Class2;
/*
check Goldbach's conjecture
"Every even integer greater than 2  can be expressed as the sum of two primers"
Write a program to check whether this is true, starting from 4.
 */
public class GoldbachConjecture {
    public static void main(String[] args) {
        check();
    }

    public static void check() {
        for (int i = 4; i < 10000; i+= 2) { //even integer so i+=2
            if (isCounterExample(i)) {
                System.out.println("Congratulation! You have won Fields award!!!" + i );
                return;
            } else {
                System.out.println(i + " is not a counter-example.");
            }
        }
    }
    public static boolean isCounterExample (int n) {
        for (int i = 2; i <= n /2; i++) {
            if (isPrime(i) && isPrime(n-i)) {
                return false;
            }
        }
        return true;
    }
    /*
6
6/2 =3 i= 2,3
1*6 6*1
2 * 3 = 6 -> 6 % 2 == 0? T, 6 is not prime
             6 % 3 == 0? T, 6 is not prime
             ...
12
12/2 = 6, i = 2, 3, 4, 5, 6
12 % 2 = ?
12 % 6 = ? <- Not necessary
12 = 2 * 6 = 6 * 2
     3 * 4 = 4 * 3
 */


    private static boolean isPrime (int n) {
        if (n < 2) {
            return false;
        }
        // Math.sqrt(n) is slower
        // i < = Math.sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
