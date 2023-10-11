/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

import java.util.Scanner;

/**
 *
 * @author Ваня
 */
public class App {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Vuvedete broi godini: ");
        int n=scan.nextInt();
        int years[]=new int[n];
        System.out.println("Vuvedete godinite: ");
        for(int i=0;i<n;i++){
            int year;
            do{
                System.out.print("Godina "+(i+1)+": ");
                while(!scan.hasNextInt()){
                    System.out.print("Nevaliden vhod. Vuvedete otnovo godinata: ");
                    scan.next();
                }
                year=scan.nextInt();
                if(year<0){
                    System.out.println("Nevalidna godina. Goddinata ne mozhe da bude otritsatelna.");
                }
            }while(year<0);
            years[i]=year;
        }
        System.out.println("Rezultati: ");
        for(int i=0;i<n;i++){
            System.out.println(years[i]+" e visokosna: "+isLeap(years[i]));
        }
    }
    private static boolean isLeap(int year){
        boolean result=false;
        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            result = true;
        }
        return result;
    }
}
