public class EBook extends Book {

    private double fileSize;

    // TODO: Implement constructor using super()
    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }
    public double getFileSize() {
        return fileSize;
    }
    // TODO: Override toString()
    @Override
    public String toString() {
        return "[E-Book]" + super.toString() + ". File size : " + fileSize + "mb";
    }
}
