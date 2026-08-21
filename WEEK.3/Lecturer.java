/** Week 3-4: Lecturer inherits from Person. */
class Lecturer extends Person {

    public Lecturer(String name, String id) {
        super(name, id);
    }

    @Override
    public void introduce() {
        System.out.println("I am a lecturer.");
    }
}
