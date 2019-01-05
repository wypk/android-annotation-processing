public class User {

    @NullWithDefault(value = "John")
    public String firstName;

    @NullWithBlank
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
