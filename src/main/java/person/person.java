package person;

public class person {
    String name;
    String address;
    String bajaklaut;
    final String country = "NKRI";

    person(String name, String address, String bajaklaut){
        this.name = name;
        this.address = address;
        this.bajaklaut = bajaklaut;

    }

   // person(string paramName){
    //    this(paramName, address:null);
   // }

  // person(){
   // this(paramName:null);
   //}

    void sayhello(String name){
        System.out.println( "Hello " +  name  + " , my name is " + this.name);
    }
     void saygoddbye(String name){
        System.out.println( "lutfi " +  bajaklaut + " , roger " + this.bajaklaut);
    }
}
