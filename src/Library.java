public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if(count >= books.length) {
            System.out.println("Library is full");
            return;
        }
        books[count++] = book;
        System.out.println("Book added succsessfully ");
    }

    // TODO: Display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No Books in Library");
            return;
        }
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for(int i = 0; i < count ; i++) {
            if(books[i].getTitle().equalsIgnoreCase(title.trim())) {
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if(book == null) {
            System.out.println("Book not found");
        }
        else {
            book.borrowBook();
        }
     }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if(book == null) {
            System.out.println("Book not found");
        }
        else {
            book.returnBook();
        }
    }
    public void addBook(String title , String author , int year) {
        addBook(new Book(title, author,year));
    }
    public void addBook(String title , String author , int year , double fileSize) {
        addBook(new EBook(title , author , year , fileSize));

    }
}
