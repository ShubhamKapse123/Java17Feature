package records;

// Records were introduced in Java 16 to simplify the creation of immutable data carrier classes.
// A record automatically provides implementations for:
// - Getter methods for all fields
// - equals(), hashCode(), and toString() methods
// Records are implicitly final and cannot be extended.
// All fields in a record are final, making the record immutable.
// Useful for modeling simple data aggregates without boilerplate code.
// In this example, 'Student' is a record with fields 'id' and 'name'.
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
