package ClassExercise;

public class Book {
    private String title;
    private String author;
    private String genre;
    private boolean nonFiction;
    private int price;

    public static String owner = "Stephanie";

    public Book(){

    }
    public Book(String title, String genre, String author,int price, boolean nonFiction) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.price = price;
        this.nonFiction = nonFiction;
    }

    public String getDetails(){
        return "Book summary "+ "Title: "+ title + ", Genre: " + genre +", Author: "+ author +", Price: "+ price +", Non-fiction: "+ nonFiction + ", Owner: " + owner;
    }

    public String toString(){
        return "Book summary "+ "Title: "+ title + ", Genre: " + genre +", Author: "+ author +", Price: "+ price +", Non-fiction: "+ nonFiction + ", Owner: " + owner;
    }
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getGenre(){
        return genre;
    }

    public int getPrice(){
        return price;
    }

    public boolean getNonFiction(){
        return nonFiction;
    }


    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setNonFiction(boolean nonFiction){
        this.nonFiction = nonFiction;
    }


}
