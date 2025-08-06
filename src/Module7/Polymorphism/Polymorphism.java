package Module7.Polymorphism;

class Mom {
    void cook(){
        System.out.println("Indian Food");
    }
}
class Daughter extends Mom{
    void cook(){
        System.out.println("Italian Food");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Daughter daughter = new Daughter();
        mom.cook();
        daughter.cook();
    }
}
