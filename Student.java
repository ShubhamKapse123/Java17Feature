package records;

public record Student(int id,String name) {
    //getter
    //hashcode
    //equals
    //tostring

    public Student(String name) {
       this(0,name);
    }

    public void displayName() {
        System.out.println(name);
    }

    public static void displayId() {
        System.out.println("static id 123");
    }
}
