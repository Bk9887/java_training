package Module3.StackInvestment;
import java.util.Scanner;
public class StackInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prevPrice = sc.nextDouble();
        double currPrice = sc.nextDouble();
        double change=((currPrice-prevPrice)/prevPrice)*100;
        if(change>10.0){
            System.out.println("Buy");
        }
        else if(change>=5.0){
            System.out.println("Hold");
        }
        else if(change<-5.0){
            System.out.println("Sell");
        }
        else{
            System.out.println("Hold");
        }
    }
}
