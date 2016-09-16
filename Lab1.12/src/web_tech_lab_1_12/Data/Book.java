package web_tech_lab_1_12.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class Book implements Cloneable{
    private String title;
    private String author;
    private int price;
    private static int edition;
    static {
        edition = 1;
    }
    Book (String title, String author, int price) {
        this.title = title;
        this.author = author;
        if (price<0) price = 0;
        this.price = price;
    }
    public boolean equals(Object obj){
        if (!(obj instanceof Book)) return false;

        Book b = (Book)obj;
        return (this.title.equals(b.title)&& this.author.equals(b.author) && this.price==b.price);

    }
    public int hashCode(){

        return 10 * title.hashCode() +
                5 * author.hashCode() +
                10*price ;
    }
    public String toString(){

        return "Книга '" + title + " - " + author + " (цена " +  price + ")";
    }
    public Book clone() throws CloneNotSupportedException{

        return (Book) super.clone();
    }
}

