package inheritance;

public class employee {
    String name;
    employee(String name){
        this.name = name;
    }
    void sayhello(String name){
        System.out.println("Hi " + name + ", My Name Is Employee " + this.name);
    }

}

 class VicePresident extends Manager{
        VicePresident(String name){
            super(name);
        }
    
        void sayhello(String name){
            System.out.println("Hi " + name + ", My Name Is VicePresident " + this.name);
        }
    }



    class Manager extends employee{
        Manager(String name){
            super(name);
        }
        void sayhello(String name){
            System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
        }
    }


