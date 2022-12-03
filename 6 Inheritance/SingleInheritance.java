class Father1 {
    String famName, address;

    Father1() {
        famName = "Indian";
        address = "India, Earth, Universe";
    }
}

class Son1 extends Father {
    String name;
    Son1() {
        name = "Soni";
    }

    public void print() {
        System.out.println("Hey, I am "+name+" "+famName+", and my address is "+address);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Son1 s = new Son1();
        s.print();
    }
}
