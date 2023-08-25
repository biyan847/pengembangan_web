package pertemuan_3;

public class membuat_array {
     public static void main(String[] args) {
    //membuat array
    String[] arrayString;
    arrayString = new String[3];
    arrayString [0] = "eko";
    arrayString [1] = "budi";
    arrayString [2] = "joko";
    

    //array initializer
    int[] arrayint = new int[]{
        10,90,80,67,29
    };
    long[] arraylong ={
        10,90,80,67,29
    };

    //operasi di array pakai var long
    arraylong[0]=100;
    System.out.println(arraylong[0]);
    System.out.println(arraylong[1]);
    System.out.println(arraylong.length);
    

    //Array di dalam Array
    String[][] members = {
        {"eko","kurniawan","joko",
        "budi"},
        {"nugraha","kurnia"}
        
    };
    String[] member1 = members [0];
    System.out.println(member1[0]);
    System.out.println(members[1][0]);
    System.out.println(members[2][0]);

  
    
   } 
}

  
