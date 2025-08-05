package Module4.KaprekarNumber;

import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        boolean found=false;
        String sqstr=Integer.toString(sq);
        for(int i=1;i<sqstr.length();i++){
            String leftstr=sqstr.substring(0,i);
            String rightstr=sqstr.substring(i);
            int left=Integer.parseInt(leftstr);
            int right=Integer.parseInt(rightstr);
            if(right!=0 && left+right==n){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
