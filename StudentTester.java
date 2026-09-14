public class StudentTester {
    public static void main(String[] args) {
        Student john = new Student("John");
        Student james = new Student("James", 11);
        Student bobby = new Student("bobby");
        Student bob = new Student("Bob", 9);

        System.out.println(john.toString());
        System.out.println(james.toString());
        System.out.println(bobby.toString());
        System.out.println(bob.toString());

        System.out.println("Changing Bob's Stats: ");

        bob.setGrade(10);
        bob.setName("Bobby");
        System.out.println(bob.toString());

        System.out.print("Bob equals Bobby?: ");
        System.out.println(bob.equals(bobby));
    }

}
