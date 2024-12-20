public class Book implements Comparable<Book> {
    private String title;
    private int page;
    private String author;
    private int publicationYear;

    public Book(String title, int page, String author, int publicationYear) {
        this.title = title;
        this.page = page;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + page + ", Year: " + publicationYear;
    }

}
