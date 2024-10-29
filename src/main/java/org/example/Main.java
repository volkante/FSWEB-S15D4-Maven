package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Main {

    public static boolean checkForPalindrome(String text){

        String readyForCheckText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        Locale.setDefault(Locale.ENGLISH);
        String[] splittedTextArr = readyForCheckText.split("");
        String reversedText= "";
        for (int i = splittedTextArr.length-1 ; i >= 0 ; i--) {
            reversedText = reversedText + splittedTextArr[i];
        }
        //System.out.println("reversedText: " + reversedText);

        System.out.println("readyForCheckText: " + readyForCheckText);

        System.out.println(readyForCheckText.equals(reversedText));
        return readyForCheckText.equals(reversedText);
    }

    ///
    public static String convertDecimalToBinary (int num){
        ArrayList<String> RemainderArrList = new ArrayList<>();
        for (int i = num; i >0 ; i=i/2) {
            System.out.println("Bölen: " + i);
            System.out.println("Remainder: " + i%2);
            String stringNum = String.valueOf(i%2);
            RemainderArrList.add(stringNum);
        }



        System.out.println(RemainderArrList);
        String joinedText = String.join("",RemainderArrList);
        System.out.println("ters cevrilmemis: " + joinedText);

        String result="";
        for (int i = joinedText.length()-1; i >=0 ; i--) {
            result = result + joinedText.charAt(i);
        }
        System.out.println("sonuc: " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Burada I'yı ı yaptığı için sorun oluyor. Yoksa gerisi doğru:
        //I'yı ingilizce gibi küçülünce i yapmalı:
        Main.checkForPalindrome("Was it a car or a cat I saw ?");
        Main.checkForPalindrome("1001");
        ///////////Veri Yapıları Challenge II//////////////
        System.out.println("---Veri Yapıları Challenge II başlangıç---");

        //string içeren WorkintechList deneme
        WorkintechList workintechList1 = new WorkintechList();
        workintechList1.add("b");
        workintechList1.add("a");
        workintechList1.add("z");
        workintechList1.add("d");
        workintechList1.add("c");
        workintechList1.add("c");
        workintechList1.add("b");

        System.out.println(workintechList1);
        //workintechList1.sort();

        String a = "a";
        workintechList1.remove(a);
        System.out.println(workintechList1);

        //Integer içeren workintechlist deneme
        WorkintechList workintechList2 = new WorkintechList();
        workintechList2.add(3);
        workintechList2.add(2);
        workintechList2.add(1);
        workintechList2.add(2); //atmıyor güzel.
        System.out.println(workintechList2);

        //workintechList2.remove();
        System.out.println("3 çıktı mı? " + workintechList2);

        //
        WorkintechList workintechList3 = new WorkintechList();
        Integer x = 3;
        Integer y = 2;
        Integer z = 1;
        Integer b = 2;
        workintechList3.add(x);
        workintechList3.add(y);
        workintechList3.add(z);
        workintechList3.add(b);

        System.out.println("3. liste: " + workintechList3);
        workintechList3.remove(x);
        System.out.println("çıktı mı 3: " + workintechList3);

        //
        Main.convertDecimalToBinary(13);


    }

}