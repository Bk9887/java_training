package Module7.Interfaces;

interface mom {
    void cook();
}
interface dad {
    void drive();
}
class Daughter implements mom,dad {
    public void cook() {
        System.out.println("cook");
    }
    public void drive() {
        System.out.println("drive");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.cook();
        daughter.drive();
    }
}