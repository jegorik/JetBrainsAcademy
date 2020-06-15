// Posted from EduTools plugin
class Application {

    String name;

    void run(String[] args) {
        System.out.println(this.name);
        for (String value: args) {
            System.out.println(value);
        }
    }
}