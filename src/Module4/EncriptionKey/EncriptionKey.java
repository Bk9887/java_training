package Module4.EncriptionKey;

import java.util.Scanner;

public class EncriptionKey {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int temp=n%10;
            if(!isPrime(temp)){
                sum=sum+temp;
            }
        }
        System.out.println(sum);
    }
}
