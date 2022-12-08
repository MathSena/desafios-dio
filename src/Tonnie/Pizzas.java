package Tonnie;

import java.util.*;


public class Pizzas {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i =0;i<T;i++){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int k = n*x;

            if(k%4==0){
                System.out.println(k/4);
            }

            else{

                System.out.println((k/4)+1);
            }
        }
    }
}