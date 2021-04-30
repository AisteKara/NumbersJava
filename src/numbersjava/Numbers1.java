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
public class Numbers1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // nelyginiai skaičiai dviejų skaičių intervale
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstN = sc.nextInt();
        System.out.println("Input second number:");
        int secondN = sc.nextInt();

        if (!(firstN < secondN)) {
            firstN = firstN ^ secondN ^ (secondN = firstN);
        }

        System.out.println("All odd numbers in the interval are:");
        while (firstN <= secondN) {
            firstN++;
            if (firstN % 2 == 1) {
                System.out.println(firstN);
            }
        }

        // TODO code application logic here
    }

}
