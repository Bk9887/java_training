package Module2.NewspaperAgency;

import java.util.Scanner;

public class NewspaperAgency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int Profit = w*(x-y)-100;
        System.out.println("Profit="+Profit);
    }
}
