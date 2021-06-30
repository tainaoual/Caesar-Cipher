package com.company;

import java.util.Scanner;

public class Main
{
    // main method
        public static void main(String[] args) {

            // create an object of Scanner class for user input
            Scanner sc = new Scanner(System.in);

            Cipher obj = new Cipher();

            // display menu (Encrypt/Decrypt)
            System.out.println("Secret Decoder Ring:");
            System.out.println("1. Encrypt\n2. Decrypt");
            int choice1 = Integer.parseInt(sc.nextLine());

            // if choice1 is 1 then go for Encryption process
            if(choice1 == 1){

                // display menu (Atbash/Caesar)
                System.out.println("Enter Encryption Type:");
            System.out.println("1. Atbash\n2. Caesar");
            int choice2 = Integer.parseInt(sc.nextLine());

            // if 1 then go for Atbash Encryption
            // otherwise go for Caesar Encryption
            if(choice2 == 1){
                obj.atbashEncryption();
            }else{
                obj.caesarEncryption();
            }
            }
            // otherwise, go for Decryption process
            else
            {
                // display menu (Atbash/Caesar)
                System.out.println("Enter Decryption Type:");
            System.out.println("1. Atbash\n2. Caesar");
            int choice2 = Integer.parseInt(sc.nextLine());

            // if 1 then go for Atbash Decryption
            // otherwise go for Caesar Decryption
            if(choice2 == 1){
                obj.atbashDecryption();
            }else{
                obj.caesarDecryption();
            }
            }
        }
}
