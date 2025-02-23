// q51: Immutable class
package OldSyllabus;

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
