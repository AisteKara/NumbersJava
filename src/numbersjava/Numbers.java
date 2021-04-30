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
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // suma dviejų skaičių intervale
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstN = sc.nextInt();
        System.out.println("Input second number:");
        int secondN = sc.nextInt();
        int sum = 0;

        if (!(firstN < secondN)) {
            firstN = firstN^secondN^(secondN = firstN);
        }
        while (firstN <= secondN) {
            System.out.println(firstN);
            sum = sum + firstN;
            firstN++;}
        System.out.println("All numbers sum in the interval is:" + sum);
        // TODO code application logic here
    }

}
