import java.util.*;

public class AbstractFileEditor {
    public static void main(String[] args) {
        System.out.print("Choose file format(txt, xml, doc): ");
        Scanner scanner = new Scanner(System.in);
        String format = scanner.next();
        format = format.toLowerCase();

        switch(format) {
            case "txt":
                System.out.println("Your chosen format: " + format);
                break;
            case "xml":
                System.out.println("Your chosen format: " + format);
                break;
            case "doc":
                System.out.println("Your chosen format: " + format);
                break;
            default:
                System.out.println("You chosed unidentified format: " + format);
        }
    }
}

class TXTHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void create() {
        System.out.println("CREATE");
    }

    @Override
    public void delete() {
        System.out.println("DELETE");
    }

    @Override
    public void change() {
        System.out.println("CHANGE");
    }

    @Override
    public void save() {
        System.out.println("SAVE");
    }
}

class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void create() {
        System.out.println("CREATE");
    }

    @Override
    public void delete() {
        System.out.println("DELETE");
    }

    @Override
    public void change() {
        System.out.println("CHANGE");
    }

    @Override
    public void save() {
        System.out.println("SAVE");
    }
}

class DOCHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("OPEN");
    }

    @Override
    public void create() {
        System.out.println("CREATE");
    }

    @Override
    public void delete() {
        System.out.println("DELETE");
    }

    @Override
    public void change() {
        System.out.println("CHANGE");
    }

    @Override
    public void save() {
        System.out.println("SAVE");
    }
}

abstract class AbstractHandler {
    public abstract void open();

    public abstract void create();

    public abstract void delete();

    public abstract void change();

    public abstract void save();
}
