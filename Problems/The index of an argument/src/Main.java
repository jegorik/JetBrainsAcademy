// Posted from EduTools plugin

class Problem {

    public static void main(String[] args) {
//        Checking array for "test" value without using class import from java lib.
//        Can be done with Arrays class import: System.out.println(Arrays.asList(args).indexOf("test"));
        int value = -1;
        for (int i = 0; i < args.length; i++) {
            value = args[i].equals("test") ? i : value;
        }
        System.out.println(value);
    }
}