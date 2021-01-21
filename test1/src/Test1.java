import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell7450
 */
public class Test1 {
   public static float Delta(float a, float b, float c) {
	float delta = b * b - 4 * a*c;
	return  (float) Math.sqrt(delta);
}
   public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int a,b,c;
         int testcase=s.nextInt();
         for(int i=0;i< testcase;i++){
             a = s.nextInt();
             b = s.nextInt();
             c = s.nextInt();
           System.out.println(Delta(a,b,c));
         }    
    }   
}