public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Omar", "1234");
        Person p2 = new Student("Amer", "564");
        Person p3 = new Lecturer("Izad", "12345607");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
