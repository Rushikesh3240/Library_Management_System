package com.borax;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library lib=new Library();
        String choice;

        do {
            System.out.println("Welcome to library management");
            System.out.println("1: add book");
            System.out.println("2: view book");
            System.out.println("3: borrow book");
            System.out.println("4: return book");
            System.out.println("5: exit");
            System.out.println("Enter your choice");
            choice = sc.nextLine();

            switch (choice){
                case "1":
                    System.out.println("Enter book title");
                    String title=sc.nextLine();
                    System.out.println("Enter book author");
                    String auther=sc.nextLine();
                    lib.addBook(title,auther);
                    break;

                case "2":
                    lib.viewBook();
                    break;

                case "3":
                    System.out.println("Enter title to borrow");
                    String borrow=sc.nextLine();
                    lib.borrowBook(borrow);
                    break;

                case "4":
                    System.out.println("Enter title to return");
                    String retur=sc.nextLine();
                    lib.returnBook(retur);
                    return;

                case "5":
                    System.out.println("Good Bye");

                default:
                    System.out.println("Invalid option");
            }

        }while(!choice.equals("5"));
            sc.close();
    }
}
