package pa_303_10_3;

import java.util.Objects;

public class KidUser implements Libraryable {
    int age;
    String bookType;
    KidUser(int age) {
        this.age = age;
    }

    @Override
    public String registerAccount() {
        if(age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
            bookType = "Kids";
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");

        }
        return bookType;
    }

    @Override
    public boolean requestBook(String book) {
        boolean canRequest = Objects.equals(bookType, book);

        if(canRequest) System.out.println("Book issued successfully, please return the book within 10 days");
        else System.out.println("Oops, you are allowed to take only kids books.");

        return canRequest;
    }
}
