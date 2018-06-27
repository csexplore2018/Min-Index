/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package min.index;
import java.util.Scanner;

/**
 *
 * @author gc_science10
 */
public class MinIndex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        System.out.println("pls input array length");
        Scanner scanf = new Scanner(System.in);
        int arrlength = scanf.nextInt();
        int[] arr = new int[arrlength];
        
        for(int x=0 ; x<arrlength ; x++){
            System.out.println("place value for number " + x);
            int value = scanf.nextInt();
            arr[x] = value;
            
        }
        int smallnum = 0;
        for(int x=0 ; x<arrlength-1 ; x++){
            
            int y = x+1; 
            if(arr[x]<arr[y]){
            smallnum = arr[x];
            }
            
            
        }
        
        
        System.out.println("smallest number is" + smallnum);
        
    }
    
}
