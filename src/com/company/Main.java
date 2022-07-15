package com.company;

import java.util.*;
import java.lang.*;

import static com.company.BalancedBrackets.areBracketsBalanced;

public class Main {
    // დავალება 5 ის ნაწილი
    public static int CountVariants(int n)
    {
        if (n == 1 || n == 0)
            return 1;
        else if (n == 2)
            return 2;

        else
            return  CountVariants(n - 2) + CountVariants(n - 1);
    }

    public static void main(String[] args) {
        //დავალება 1
        /*
        String str;
        String reverseStr = "";

        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();


        int strLength = str.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
        */

        //დავალება 2
        /*
        int money;
        int minSplit = 0;
        int[] split = {1,5,10,20,50};

        Scanner scan = new Scanner(System.in);
        money = scan.nextInt();

        for(int i = 0; i < 5; i++){
            if(money >= 50){
                minSplit = minSplit + money / 50;
                money = money % 50;
            }
            if(money < 50 & money >= 20){
                minSplit = minSplit + money / 20 ;
                money = money % 20;
            }
            if(money < 20 & money >= 10){
                minSplit = minSplit + money / 10;
                money = money % 10;
            }
            if(money < 10 & money >= 5){
                minSplit = minSplit + money / 5;
                money = money % 5;
            }
            if(money < 5 & money >= 1){
                minSplit = minSplit + money / 1;
                money = money % 1;
            }
        }
        System.out.println(minSplit);
*/


        //დავალება 3
        /*
        int n;
        int notContains = 0;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[] array = new int[n+1];
        for(int i = 1; i <= n;i++){
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);
        array[0] = 0;
        for(int i = 1; i <= n; i++){
            if(array[i]-1 > 0 & array[i]-1 != array[i-1]){
                notContains = array[i] - 1;
                System.out.println(notContains);
                break;
            }
        }

        if(notContains == 0){
            System.out.println(array[n] +1);
        }

*/
        //დავალება 4
        /*
        String expr = "())()";

        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        */

        //დავალება 5
        /*
        int n = 4;
        System.out.println(CountVariants(n));
    */


        //დავალება 6

        /*
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al =new ArrayList<Integer>();
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();

                System.out.println("Enter the Element Which u want to remove");
                  int  a = sc.nextInt();
                    if(mp.containsKey(a)){

                        int size = al.size();
                        int index = mp.get(a);

                        int last = al.get(size-1);
                        Collections.swap(al, index,  size-1);

                        al.remove(size-1);
                        mp.put(last, index);

                        System.out.println("Data Deleted");

                    }
                    else{
                        System.out.println("Data Not found");
                    }
*/






    }


}

