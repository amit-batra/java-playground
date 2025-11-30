package streams;

import java.util.List;

record User(
    String name,
    List<String> emails
) {}


public class ListAllEmailsForUsers {
    
    private static final List<User> users = List.of(
        new User("Amit", List.of("a@gmail.com", "a@work.com")),
        new User("John", List.of("john@yahoo.com")),
        new User("Sara", List.of("sara@abc.com", "sara@xyz.com"))
    );

    public static void main(String[] args) {
    
        final List<String> emails = users
            .stream()
            .flatMap(user -> user.emails().stream())
            .toList();

        System.out.println(emails);
    }
}