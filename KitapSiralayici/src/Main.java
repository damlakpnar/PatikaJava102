import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set <Book> booksByTitle = new TreeSet<>();
        //5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
        booksByTitle.add(new Book("The Catcher in the Rye", 277, "J.D. Salinger", 1951));
        booksByTitle.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960));
        booksByTitle.add(new Book("1984", 328, "George Orwell", 1949));
        booksByTitle.add(new Book("Moby-Dick", 635, "Herman Melville", 1851));
        booksByTitle.add(new Book("Pride and Prejudice", 279, "Jane Austen", 1813));


        // Kitapları başlığa göre sıralanmış
        System.out.println("Books sorted by title (A to Z):");
        for(Book book : booksByTitle){
            System.out.println(book);
        }

        //Set kullanarak sayfa sayısına göre sıralama
        Set<Book> booksByPage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPage(),o2.getPage());
            }
        });
        booksByPage.addAll(booksByTitle);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPage) {
            System.out.println(book);
        }


    }
}