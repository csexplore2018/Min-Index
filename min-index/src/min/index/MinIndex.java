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
        int smallnum = arr[0];
        int index = 0;
        
        
        for(int x=0;x<arr.length;x++){
                if(arr[x] < smallnum){
                smallnum = arr[x];
                index= x;
            }
        }
        
        
        System.out.println("smallest number is" + smallnum);
        System.out.println("index of smallest number is" + index);
        
    }
    
}
