package web_tech_lab_1_12.Comparators;

import web_tech_lab_1_12.Data.Book;
import java.util.Comparator;
/**
 * Created by Сергей on 16.09.2016.
 */
public class TitleComparator implements Comparator<Book>{
    public int compare(Book a, Book b){
        return a.GetTitle().compareTo(b.GetTitle());
    }
}
