package task2;

public abstract class AbstractHandler {
    public void open(String format) {
        System.out.println("Opening a " + format + " file");
    }

    public void change(String format) {
        System.out.println("Changing a " + format + " file");
    }

    public void save(String format) {
        System.out.println("Saving a " + format + " file");
    }
}