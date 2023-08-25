package inheritance;



public class appemployee {
    public static void main(String[] args) {
       
        employee employee = new employee("eko");
        employee.sayhello("budi");

        employee = new Manager("joko");
        employee.sayhello("parjo");
        
        employee = new VicePresident("stepen");
        employee.sayhello("ronald");

        sayhello(new employee("eko"));
        sayhello(new employee("joko"));
        sayhello(new employee("stepen"));


    }
    static void sayhello(employee employee){
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello Vp " + vicePresident.name);
        }else if
        (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }else{
            System.out.println("Hello " + employee.name);
        }
    }
}
