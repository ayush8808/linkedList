package com.Ayushman;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        CLL cll = new CLL();
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while(true)
        {
            n = sc.nextInt();
            if(n < 0)
                break;
            cll.insertFirst(n);
        }
        cll.display();
        cll.sortingAcending();
        System.out.print("This is ascending order : ");
        cll.display();

        // cll.deleteFirst();
        cll.sortingDecsending();
        System.out.print("This is descending order : ");
        cll.display();
        cll.deleteLast();
        cll.emptyLL();
        cll.display();
        // cll.clear();
        // cll.display();
        // cll.evenLL();
        // cll.OddLL();

    }
};