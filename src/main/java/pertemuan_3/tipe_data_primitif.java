package pertemuan_3;

public class tipe_data_primitif {
    public static void main(String[] args) 
    {
        //bukan primitif
        Integer iniInteger = 10;
        long inilong = 10L;
        Boolean iniBoolean = true;

        short iniShort;//null
        iniShort = 100;


        //tipe primitif
        int age = 30;
        Integer ageObject = age;
        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteage = ageObject.byteValue();
    }

}
