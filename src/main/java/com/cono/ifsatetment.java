package com.cono;

public class ifsatetment 
{
    public static void main(String[] args) {
        var nilai = 15;
        var absen = 70;
    
        if
        (
            nilai >= 65 && absen >= 30){
            System.out.println("lulus");
        }
        else{
       System.out.println("GAGAL");
        }


        if (nilai >= 80 && absen >=80){
            System.out.println("nilai anda A");
        }
        else if (nilai >= 70 && absen >= 70){
            System.out.println("nilai anda B");
        }
         else if (nilai >= 60 && absen >= 60){
            System.out.println("nilai anda C");
        }
         else if (nilai >= 50 && absen >= 50){
            System.out.println("nilai anda D");
        }
         else{
            System.out.println("nilai anda E");
        }
    }
}
