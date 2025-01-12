// q51: Immutable class
<<<<<<< HEAD:OldSyllabus/q51.java
package OldSyllabus;
=======
package riyab;
// take user input if required
>>>>>>> 21db775 (Package Change In Rest...):q51.java

final class Immutable {
    private final String value;

    Immutable(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class q51 {
    public static void main(String[] args) {
        Immutable obj = new Immutable("Hello");
        System.out.println(obj.getValue());
    }
}
