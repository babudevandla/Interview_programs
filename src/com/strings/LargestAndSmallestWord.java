package com.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LargestAndSmallestWord {

	static void printLargestAndSmallestWord(String str){
        String[] arr=str.split(" ");
        int i=0;
        int maxlength,minlength;
        maxlength=Integer.MIN_VALUE;
        minlength=Integer.MAX_VALUE;
        String largest,smallest;
        largest = smallest = "";
        for(i=0;i<arr.length;i++){
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            } 
            if(arr[i].length() > maxlength) {
                largest=arr[i];
                maxlength=arr[i].length();
            }
        }
        System.out.println("The largest and smallest word is \"" + largest +
                                               "\" and \"" + smallest + "\"");
    }
    // Main function to read the string
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the text string");
        String str;
        try{
            str=br.readLine();
        }
        catch(Exception e){
            System.out.println("Error reading input");
            return;
        }
        printLargestAndSmallestWord(str);
    }

}
