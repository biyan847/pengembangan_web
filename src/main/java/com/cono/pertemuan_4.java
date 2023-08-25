package com.cono;

public class pertemuan_4 {
    
//method return value
public static void main(String[]args){
     
    var a = 100;
    var b = 200;
    var c = sum(a, b);
    System.out.println(c);
    }
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    } 

    // tanpa variable argument
    static void sayCongrats(String name, int[] values){
        int total = 0;
        for (var value : values){
         total += value;
}
        int finalValue = total / values.length;
        if (finalValue >= 75){
        System.out.println("selamat" + name + ", anda lulus");
} else {
        System.out.println("maaf" + name + ", anda gagal");
}
    }

    // dengan variable argument
static void saycongrats(String name, int... values)
{
int total = 0;
for (var value : values){
    total += value;
}
int finalValue = total / values.length;
if (finalValue >= 75){
    System.out.println("selamat" + name + ", anda lulus");
} else {
    System.out.println("maaf" + name + ", anda gagal");
}
}



}
