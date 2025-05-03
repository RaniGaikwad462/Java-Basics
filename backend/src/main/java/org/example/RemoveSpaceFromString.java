package org.example;
import java.util.Scanner;


public class RemoveSpaceFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to remove spaces for....");
        String inputStr = sc.nextLine();
        char[] strArray = inputStr.toCharArray();
        //Code without any builtin fun
        /* StringBuilder inputStrWithoutSpace = new StringBuilder();
        for (int i = 0; i < strArray.length; i++) {
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {
                inputStrWithoutSpace.append(strArray[i]);
            }
        }
        System.out.println(inputStrWithoutSpace); */
        //Code with builtin fun
        String withoutSpace = inputStr.replaceAll("\\s", "");
        System.out.println(withoutSpace);


    }
}