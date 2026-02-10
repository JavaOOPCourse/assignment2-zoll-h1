import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter the title : ");
                    String title = scanner.nextLine();

                    System.out.print("Enter the author : ");
                    String author = scanner.nextLine();

                    System.out.print("Enter the year : ");
                    while(!scanner.hasNext()) {
                        System.out.println("Invalid year brooo");
                        scanner.next();
                    }
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    library.addBook(title , author , year);
                    break;
                }
                case 2 -> {
                    System.out.println("Enter the E-Book title : ");
                    String title = scanner.nextLine();

                    System.out.println("Enter the E-Book author : ");
                    String author = scanner.nextLine();

                    System.out.println("Enter the E-Book year : ");
                    int year = scanner.nextInt();

                    System.out.println("Enter the E-Book fileSize : ");
                    Double fileSize = scanner.nextDouble();

                    library.addBook(title , author , year , fileSize);
                    break;
                }
                case 3 -> {
                    library.displayBooks();
                    break;
                }

                case 4 -> {
                    System.out.print("Enter the title of book ; ");
                    String title = scanner.nextLine();
                    Book found = library.searchByTitle(title);
                    if(!found.isAvailable()) {
                        System.out.println("Book not found");
                    }
                    else {
                        System.out.println("The book : " + found);
                    }

                    break;
                }
                case 5 -> {
                    System.out.println("Enter the borrow book");
                    String title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                }
                case 6 -> {
                    System.out.println("Enter the book for return : ");
                    String title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                }
                case 7 -> {
                    System.out.println("Goodbye! Thanks for using our library");
                    break;
                }
                default -> {
                    System.out.println("Invalid option!");
                }
            }

        } while (choice != 7);

        scanner.close();
    }
}
