package com.company;

import java.util.Arrays;


public class HomeWorkLesson3 {

    public static void main(String[] args) {
         zadanie1();
          zadanie2();
        zadanie3();
        zadanie4();
       zadanie5();
          }
          public static void zadanie1(){
             int[]arr=new int[]{1,0,0,1,1,1,0,1,0,0};
            for (int x=0;x< arr.length;x++)
if(arr[x] ==1)
          System.out.print(arr[x]-1+ " ");
else
         System.out.print(arr[x]+1+ " ");

              System.out.println(" ");
          }



        public static void zadanie2() {
         int[] array = new int[100];
           for(int x = 0; x < array.length; x++) {
              array[x] = x+1;
              System.out.println("array[" + x + "] = " + array[x]);

          }
}
    public static void zadanie3(){
       int [] ar= {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
       for (int a=0; a<ar.length;a++){
                      if(ar[a]<6)
               System.out.print(ar[a]*2 +" ");

            }
        System.out.println(" ");


       }
        public static void zadanie4(){
        int[][] arra=new int[10][10];
        int a= arra.length-1;
        for (int x=0;x< arra.length; x++) {
        arra[x][x]=arra[x][a-x]=1;
            System.out.println(Arrays.toString(arra[x])+"  ");
        }
        }
public static void zadanie5(){
        int len=6;
        int initialValue=6;
        int [] array=arr(len,initialValue);
    System.out.println(Arrays.toString(array));
    }
private  static int[] arr(int len, int initialValue) {
    int[] array = new int[len];
    for (int a  = 0; a < len; a++)
    array [a]=initialValue;
   return  array;
}




}










