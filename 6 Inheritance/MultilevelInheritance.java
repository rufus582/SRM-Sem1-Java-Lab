class GrandFather {
    GrandFather() {
        System.out.println("GrandFather's Constructor!!!");
    }
}

class Father extends GrandFather {
    Father() {
        System.out.println("Father's Constructor!!!");
    }
}

class Son extends Father {
    Son() {
        System.out.println("I am the Son!");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        new Son();
    }
}
