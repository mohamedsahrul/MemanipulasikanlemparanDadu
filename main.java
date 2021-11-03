/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dadu;
import java.util.Scanner;
/**
 *
 * @author Sahrul
 */
public class main {

    public static void main(String[] args) {
           System.out.println("Program Start");
        System.out.println("Inputan : ");
        Scanner in = new Scanner(System.in);
        dadu dadu = new dadu();
        String kode;

        while (true) {
            kode = in.nextLine().toLowerCase();
            if (kode.equals("q"))
                break;
            System.out.println(dadu.parse(kode));
        }
    }
    
}
