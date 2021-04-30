/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersjava;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Numbers11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // daugybos lentelė
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstN = sc.nextInt();
        System.out.println("Input second number:");
        int secondN = sc.nextInt();

        if (!(firstN < secondN)) {
            firstN = firstN ^ secondN ^ (secondN = firstN);
        }

        System.out.println("Multiplication table of inputed numbers:");

//        for (int i = firstN; i <= secondN; i++) {
//            for (int k = firstN; k <= secondN; k++) {
//                System.out.print((i * k) + " ");
//            }
//            System.out.println("");
//        }4
        int a = firstN;
        int i = firstN;
        while (firstN <= secondN) {
            while (a <= secondN) {
                System.out.print((firstN * a));
                System.out.print("\t");
                a++;
            }
            firstN++;
            System.out.println("");
            a = i;
        }
        System.out.println("pabaiga");

        // TODO code application logic here
    }

}
