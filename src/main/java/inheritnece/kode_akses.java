package inheritnece;

public class kode_akses {
    public static void main(String[] args) {
        var manager = new manager();
        manager.name = "febyan";
        manager.sayhello("putra");

        var visePresident = new visePresident();
        visePresident.name = "kurniawan";
        visePresident.sayhello("");
    }
}