public class Main {

    public static void main(String[] args) throws IllegalAccessException {

        User user = new User("Wai Yan", null);

        System.out.println("First name : " + AnnotationProcess.nullWithBlank(user).firstName);
        System.out.println("Last name : " + AnnotationProcess.nullWithBlank(user).lastName);

        User user1 = new User(null, null);

        System.out.println("First name : " + AnnotationProcess.nullWithDefault(user1).firstName);
        System.out.println("Last name : " + AnnotationProcess.nullWithBlank(user1).lastName);
    }
}
