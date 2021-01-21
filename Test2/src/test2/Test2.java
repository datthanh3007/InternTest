package test2;
import java.util.Scanner;

public class Test2 {
   public static int calCosume(int cosume){
	int sum = 0;
	if (cosume >= 0 && cosume <= 25){
             sum = cosume * 1000;
        }   
        else if (cosume >= 25 && cosume <= 75){
            sum = cosume * 1250;
        }
        else if (cosume >= 75 && cosume <= 100){
            sum = cosume * 1800;
        }
        else if (cosume > 150){
            sum = cosume * 2500;
        }
        
        return sum;
}
 public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int total = 0;
         int testcase=s.nextInt();
         for(int i=0;i< testcase;i++){
             total = s.nextInt();
           System.out.println(calCosume(total));
         }   
    }   
}