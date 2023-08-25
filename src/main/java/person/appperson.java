package person;

public class appperson {
    public static void main(String[] args) {
      var person = new person(null,null,null);

        person.name = "Eko Kurniawan";
        person.address = "Yogya";
        person.bajaklaut = "lutfi";

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);
        

        person.sayhello( "Febyan");
        person.saygoddbye("roger");
    }
}
