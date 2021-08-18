/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.curd;

/**
 *
 * @author ZainalAbidin
 */
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String [] args)throws IOException{
        Scanner input= new Scanner(System.in);
        String user;
        boolean lanjutkan=true;
        
        while(lanjutkan){
            System.out.println("Database data");
            System.out.println("1.\tLihat seluruh buku yang ada");
            System.out.println("2.\tMencari buku pada data");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");
            
            System.out.print("Pilihan Anda    :");
            user=input.next();
            
            switch(user){
                case "1":
                System.out.println("\n################");
                System.out.println("LIST SELURUH BUKU");
                System.out.println("\n################");
                break;
                case "2":
                System.out.println("\n################");
                System.out.println("MENCARI BUKU");
                System.out.println("################");
                break;
                case "3":
                System.out.println("\n################");
                System.out.println("TAMBAH DATA BUKU");
                System.out.println("################");
                break;
                case "4":
                System.out.println("\n################");
                System.out.println("UBAH DATA BUKU");
                System.out.println("################");
                break;
                
                case "5":
                System.out.println("\n################");
                System.out.println("HAPUS DATA BUKU");
                System.out.println("################");
                break;
                default :
                    System.err.println("PILIHAN ANDA TIDAK ADA , SILAHKAN INPUT KEMABALI ANTARA 1-5");
            }
            lanjutkan=getYoT("Apakah anda ingin melanjutkan");
            
            
        }
        
    }
    private static void tampilkanData() throws IOException{
      
    }
    public static boolean getYoT(String message){
        Scanner input= new Scanner(System.in);
        System.out.println("\n"+message+"(y/n) ?");
        String user=input.next();
        
        while(!user.equalsIgnoreCase("y")&& !user.equalsIgnoreCase("n")){
        System.err.println("Pilihan anda bukan y ataupun n");
        System.out.println("\n"+message+"(y/n) ?");
        user=input.next();
    }
        return user.equalsIgnoreCase("y");
    }
    private static void clearScreen(){
        
    }
}
