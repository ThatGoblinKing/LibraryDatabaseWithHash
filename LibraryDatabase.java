import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryDatabase {
    public static void main(String[] args) {
        BookHashManager.fillMap();
        Scanner stdIn = new Scanner(System.in);
        boolean validInput = false;
        int input = 1;
        System.out.println("Welcome to the library database.");
        while (input != 3) {
            System.out.println("What would you like to do?\n" +
                    "1). Search for a specific book by title.\n" +
                    "2). Search library for any of the following properties: Title, Author, Genre, Year Published, Page Count, Price\n" +
                    "3). Quit the program.");
            do {
                try {
                    input = stdIn.nextInt();
                    validInput = (input > 0 && input < 4);
                } catch (InputMismatchException e) {
                    validInput = false;
                }
                if (!validInput) {
                    System.out.println("Invalid Input. Please try again with a number 1-3");
                }
                stdIn.nextLine();
            } while (validInput == false);
            switch(input){
                case 1:
                    System.out.println("Enter a book's name.");
                    BookHashManager.searchByName(stdIn.nextLine());
                    break;
                case 2:
                    System.out.println("Enter a number or word(s) you'd like to search for in all the above properities.");
                    BookHashManager.searchByProperty(stdIn.nextLine());
            }
        }
        stdIn.close();
    }
}
