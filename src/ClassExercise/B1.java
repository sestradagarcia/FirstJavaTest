package ClassExercise;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class B1 {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("Fourth Wing");
        b1.setAuthor("Rebecca Yarros");
        b1.setGenre("Fantasy");
        b1.setPrice(11);
        b1.setNonFiction(false);


        System.out.println(b1.getTitle());
        System.out.println(b1.getDetails());

        Book b2 = new Book("Iron Flame", "Fantasy", "Rebecca Yarros", 11, false);

        System.out.println(b2.getTitle());
        System.out.println(b2.getDetails());
        System.out.println(b2);

        Book[] books = new Book[2];
        books[0] = new Book("Iron Flame", "Fantasy", "Rebecca Yarros", 11, false);
        books[1] = new Book("Iron Flame", "Fantasy", "Rebecca Yarros", 12, false);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getPrice());
        }

        for (Book b : books) {
            System.out.println(b.getAuthor());
        }

        List<Book> books2 = new ArrayList<>();
        books2.add(new Book("Iron", "Fantasy", "Rebecca Yarros", 11, false));
        books2.add(new Book("Flame", "Fantasy", "Rebecca Yarros", 12, false));

        for (Book b : books2) System.out.println(b.getTitle());

    }



}
