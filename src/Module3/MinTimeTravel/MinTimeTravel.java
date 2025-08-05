package Module3.MinTimeTravel;

import java.util.Scanner;

public class MinTimeTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double V1 = sc.nextDouble();
        double V2 = sc.nextDouble();
        double StairTime = (Math.sqrt(2)*N)/V1;
        double ElevatorTime = N/V2;
        if(ElevatorTime<StairTime){
            System.out.println("Elevator");
        }
        else{
            System.out.println("Stair");
        }
    }
}
