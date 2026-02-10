public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        // implement
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        // implement
        this.title = other.title;
        this.author = other.title;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }
    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        // implement
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Booked borrowed successfully");
        }
        else {
            System.out.println("Book is not available");
        }
    }

    // TODO: Implement return logic
    public void returnBook() {
        // implement
        if(!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned succsessfully");
        }
        else {
            System.out.println("Book was already available");
        }
    }

    // TODO: Override toString()
    @Override
    public String toString() {
        return "Title :" + title +
               ", Author :" + author +
               ", Year : " + year +
               "isAvailable" + isAvailable;
    }

    // TODO: Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return this.year == other.year
                && this.title.equalsIgnoreCase(other.title)
                && this.author.equalsIgnoreCase(other.author);
    }
    }