/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;


/**
 *
 * @author KESHAV
 */
public class Prime {
   
    /**
     * @param args the command line arguments
     */
    // driver program
    public static void main(String[] args) {
        // TODO code application logic here
   int num =6;
   int temp =0;
   for(int i=2;i<=num-1;i++){       
   if(num%i==0){
       temp=temp+1;
   }
   }
   if(temp==0)
   {
       System.out.println("no. is prime no." );
       
   }
   else 
          System.out.println("no. is not a prime no." );
    }
    
}
        