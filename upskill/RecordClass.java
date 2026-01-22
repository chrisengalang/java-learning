public class RecordClass {

    public static void main(String[] args) {
        PersonRecord person = new PersonRecord("Alice", 30);
        PersonRecord changeName = new PersonRecord("Bob", person.age());

        System.out.println("Name: " + person.name());
        System.out.println("Change name: " + changeName.name());
    }

}

record PersonRecord (String name, int age)  {
    PersonRecord {
        if (age < 0) {
            throw new IllegalArgumentException("Age should not be a negative number.");
        }
    }
}