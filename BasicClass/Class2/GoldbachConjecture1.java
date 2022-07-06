package BasicClass.Class2;

public class GoldbachConjecture1 {
    public static void main(String[] args){
        checkGold(10000);
    }

    public static void checkGold(int limit) {
        for (int i = 4; i <= limit; i += 2){
            if (canDivide(i)){
                System.out.println(i + " can be divide into two primes!");
            } else {
                System.out.println("Congratulation! You have won Fields award! ");
                break;
            }
        }
    }

    public static boolean canDivide(int n){
        for (int i = 2; i <= n/2; i++){
            if (isPrime(i) && isPrime(n-i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <=n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
