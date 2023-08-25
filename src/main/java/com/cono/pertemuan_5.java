package com.cono;

public class pertemuan_5 {
  
static String sayhello(String firstname){
    return firstname;
}

static String sayhello(String firstname, String lastname){
    return firstname + lastname;
}


  static int tambah(int var1, int var2){
    return var1 + var2;
  }
   static String tambah(String var1, String var2){
    return var1 +"tambah"+ var2;
  }




 public static void main(String[] args) {
    
System.out.println(sayhello("eko", "joko"));
System.out.println(sayhello("hello"));

System.out.println(tambah(1, 2));
System.out.println(tambah("satu", "sua"));


   }
}


