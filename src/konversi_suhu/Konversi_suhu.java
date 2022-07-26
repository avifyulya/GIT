/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi_suhu;

/**
 *
 * @author ASUS
 */
public class Konversi_suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pembukaan
        System.out.println("Konversi suhu 78 derajat Celcius ke dalam satuan :");
        System.out.println("1. Reamur");
        System.out.println("2. Farenheit");
        System.out.println("3. Kelvin");
        //deklarasi
        int C,R,F,K;
        //cara
        C = 78;
        R = 4*C/5;
        F = 9*C/5+32;
        K = C+273;
        //output atau jawaban
        System.out.println("==================================================");
        System.out.println("Jawaban : ");
        System.out.println("==================================================");
        System.out.println("1. Reamur : "+R);
        System.out.println("2. Farenheit : "+F);
        System.out.println("3. Kelvin : "+K);
    }
    
}
