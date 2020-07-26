import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        return f1.getParentFile().getName().equals(f2.getParentFile().getName());
    }
}