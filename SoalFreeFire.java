/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalfreefire;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SoalFreeFire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String soal1,soal2,soal3,soal4,soal5;
        int nilai1,nilai2,nilai3,nilai4,nilai5;
        boolean ulang=true;
        while(ulang){
        System.out.println("SELAMAT DATANG DI QUIZ PRI PAYER");
        System.out.println("Buktikan kamu adalah survivor sejati!!!");
        //soal1
        System.out.println("1. Tempat apa di ff manakah yang sering terjadi war");
        System.out.println("a. Pochinock b.Factory c. Banjarmadu d. Dragonspine");
        soal1=input.nextLine();
        if(soal1.equalsIgnoreCase("a")){
            nilai1=20;
        }
        else{
            nilai1=0;
        }
        //soal2
        System.out.println("2. Karakter apa yang bisa menjadi semak-semak");
        System.out.println("a. Alok  b. Wukong  c.Alucard  d. Pani");
        soal2=input.nextLine();
        if (soal2.equalsIgnoreCase("b")){
            nilai2=20;
        }
        else{
            nilai2=0;
        }
        ///soal3
        System.out.println("3. Karakter paling OP dan bekerja sampingan sebagai DJ adalah ?");
        System.out.println("a. Alok  b. Jota  c. Paquitto  d. Ayaka Gila");
        soal3=input.nextLine();
        if(soal3.equalsIgnoreCase("a")){
            nilai3=20;
        }
        else{
            nilai3=0;
        }
        ///soal4
        System.out.println("4. Salah Tempat yang dilaksanakannya perang pada Free Fire adalah ?");
        System.out.println("a. pochinki  b. land of dawn  c. liyue  d. bermuda");
        soal4=input.nextLine();
        if(soal4.equalsIgnoreCase("d")){
            nilai4=20;
        }
        else{
            nilai4=0;
        }
        ///soal5
        System.out.println("Apa nama kotak yang dijatuhkan pesawat ?");
        System.out.println("a. ayaka lagi di gang  b. looting   c. airdrop  d. klee");
        soal5=input.nextLine();
        if(soal5.equalsIgnoreCase("c")){
            nilai5=20;
        }
        else{
            nilai5=0;
        }
        int total;
        total=nilai1+nilai2+nilai3+nilai4+nilai5;
        System.out.println("=====Kuis Selesai=====");
        System.out.println("Dear Survivor Skor Kamu Adalah : "+total);
        System.out.println("Jangan Lupa Pukul Ayaka!!");
        System.out.println("-------------------------");
        ////
        boolean salah=true;
        String pil;
        while(salah){
        System.out.println("Apakah anda ingin mengulang [y/t]?");
        pil=input.nextLine();
        if(pil.equalsIgnoreCase("y")){
            ulang=true;
            salah=false;
        }
        else if(pil.equalsIgnoreCase("t")){
            ulang=false;
            salah=false;
        }
        else{
            System.out.println("--------------------------------");
            System.out.println("Masukkan Pilhan Yang Benar Jinx");
            ulang=false;
            salah=true;
        }
        }
        }
    }
    
}
