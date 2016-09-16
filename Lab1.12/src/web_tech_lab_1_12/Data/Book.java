package web_tech_lab_1_12.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;
    public boolean equals(Object obj){
        if (!(obj instanceof Book)) return false;

        Book b = (Book)obj;
        return (this.title == b.title && this.author==b.author && this.price==b.price && this.edition==b.edition);

    }
}
