class Father {
    String famName, address;

    Father() {
        famName = "Indian";
        address = "India, Earth, Universe";
    }
}

class Son extends Father {
    String name;
    Son() {
        name = "Soni";
    }

    public void print() {
        System.out.println("Hey, I am "+name+" "+famName+", and my address is "+address);
    }
}

class Daughter extends Father {
    String name;
    Daughter() {
        name = "Sonia";
    }

    public void print() {
        System.out.println("Hey, I am "+name+" "+famName+", and my address is "+address);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Son s = new Son();
        Daughter d = new Daughter();
        s.print();
        d.print();
    }
}
