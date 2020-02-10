package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int namea = 2;
        System.out.println(namea);
        String [] names = {"Mansur","Akbar","Aziz","Jurabek"};
        String [] names1 = new String[10];
        int [] numMy = {10,20,30,40};

        for (String name : names){
            System.out.println(name);
        }
        for (String name : names1){
            System.out.println(name);
        }
        for (int name : numMy){
            System.out.println(name);
        }
    }
}
