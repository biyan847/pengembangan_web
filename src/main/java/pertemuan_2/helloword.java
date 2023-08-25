package pertemuan_2;

import javax.print.DocFlavor.STRING;

public class helloword {
    public static void main(String[] args) {

       //type dta number
       byte iniByte = 100;
       short iniShort= 1000;
       int iniint=10000;
       long inilong = 100000;
       long inilong2 = 10000000L;

       //floating point number
       float inifloat = 10.12F;
       double inidouble = 12.2424;

       //literals
       int decimalint = 25;
       int hexint = 0xA132B;
       int binint = 0b01010101;

       //underscore
        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;


        //konversi tipe data number
        byte inibyte = 10;
        short inishort =inibyte;
        int iniInt = inishort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short inishort2 =(short)iniInt2;

        //character
        char e = 'E';
        char k = 'K';
        char o = 'Q';

        System.out.println(e);
        System.out.println(k);
        System.out.println(o);
        
        //boolean
        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);
        
        //string
        String fristname = "eko ";
        String lastname = " kurniawan";

        System.out.println(fristname);
        System.out.println(lastname);
        
        //menggabungkan string
        String fristName = "eko ";
        String lastName = " kurniawan";
        String fullname = fristName+""+lastName;

        System.out.println(fullname);

        
        //hello word
        System.out.println("hello word");
    }
}
