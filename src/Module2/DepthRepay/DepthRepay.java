package Module2.DepthRepay;

import java.util.Scanner;

public class DepthRepay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double P=sc.nextDouble();
        double T=sc.nextDouble();
        double R=sc.nextDouble();
        double SI=(P*T*R)/100;
        double Amount = P+SI;
        double discount=SI*0.02;
        double Final = Amount-discount;
        System.out.println(SI);
        System.out.println(discount);
        System.out.println(Amount);
        System.out.println(Final);

    }
}
