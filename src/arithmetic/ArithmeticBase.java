/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the operation
 *
 * @author sivagamasrinivasan
 * date 06/20
 */
public class ArithmeticBase 
{
    //applying the encapsulation by making data members private
    private double x,y;
    double calculate(double x, double y) 
        {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number from 1 to 4");
        int s= sc.nextInt();
        if(s == 1) 
        {
                return x + y;}
        else if(s == 2) {
            return x - y;
        }else if(s==3) {
           return x * y;
        }else if(s == 4) {
                return x / y;
        }else {
            System.out.println("enter a number from 1 to 4");
            s = sc.nextInt();
            
    }
        return 0;
   
        }
}
