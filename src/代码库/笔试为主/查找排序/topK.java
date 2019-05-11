package ´úÂë¿â.±ÊÊÔÎªÖ÷.²éÕÒÅÅĞò;

import java.util.ArrayList;
import java.util.Collections;

public class topK {
    public static void main(String[] args) {
        int[] a ={4,5,1,6,2,7,3,8};
        ArrayList<Integer> res =new ArrayList<>();
        res=GetLeastNumbers_Solution(a,10);
        for (Integer i:res){
            System.out.print(i+",");
        }
    }

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        if (input==null||k>input.length){
            return al;
        }
        int start=0;
        int end=input.length-1;
        int re=pation(input,start,end);
        while (re!=k-1){
            if (re<k-1){
                start=re;
                re=pation(input,start+1,end);
            }else if (re>k-1){
                end=re;
                re=pation(input,start,end-1);
            }
        }

        for (int i=0;i<k;i++){
            al.add(input[i]);
        }
        Collections.sort(al);
        return al;
    }

    public static int pation(int[] input, int start, int end) {
        //printArray(input);
        int temp = input[start];
        while (start <end) {
            while (start <end&&input[end] > temp) {
                end--;
            }
            input[start] = input[end];
            //printArray(input);
            while (start <end&&input[start] < temp) {
                start++;
            }
            input[end] = input[start];
            //printArray(input);
        }
        input[start]=temp;
        //printArray(input);
        return start;

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i != arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
