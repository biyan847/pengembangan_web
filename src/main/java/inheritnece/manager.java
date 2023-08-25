package inheritnece;

public class manager {
    String name;

    void sayhello(String name){
        System.out.println("Hello " + name + ", My Name is manager " + this.name);
    }
}

class visePresident extends manager{
    void sayhello(String name){
        System.out.println("Hello " + name + ", My Name is vise manager " + this.name);
    }

}