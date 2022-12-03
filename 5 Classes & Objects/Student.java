public class Student {
    int id, age;
    String name;

    public void printInfo() {
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Stud 1";
        s.age = 21;
        s.printInfo();
    }
}
