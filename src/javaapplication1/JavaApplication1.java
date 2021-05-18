/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import java.util.Arrays;

/**
 *
 * @author osama
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a[];  
         Scanner sc= new Scanner(System.in);
//initialize an array  
        System.out.println("Enter the size = ");
        int aa= sc.nextInt();
        a= new int[aa];  
        
        System.out.println("Enter numbers :");
        int n = a.length;
       for(int i=0;i<n;i++)
       {
        System.out.println("Enter "+(i+1)+" number :");
           int chk= sc.nextInt();
           a[i]=chk;
       }
        // Function call
        System.out.println("Median = " + findMedian(a, n));
        System.out.println("Mod = " + mode(a, n));
        // TODO code application logic here
    }
    public static double findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
 
        // check for even case
        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
     static int mode(int a[],int n) {
      int maxValue = 0, maxCount = 0, i, j;
      int chk=0;
      for (i = 0; i < n; ++i) {
         int count = 0;
         for (j = 0; j < n; ++j) {
            if (a[j] == a[i])
            ++count;
         }

         if (count > maxCount) {
            maxCount = count;
            maxValue = a[i];
            chk++;
         }
      }
      if(chk>1)
      {
          
        System.out.println("Med exist.. ");
      }
      else
      {
          
        System.out.println("Med does not exist.. ");
      }
      return maxValue;
   }
    
}
