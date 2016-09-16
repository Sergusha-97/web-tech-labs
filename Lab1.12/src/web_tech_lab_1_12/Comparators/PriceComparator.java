package web_tech_lab_1_12.Comparators;

import web_tech_lab_1_12.Data.Book;
import java.util.Comparator;
/**
 * Created by Сергей on 16.09.2016.
 */
public class PriceComparator implements Comparator<Book> {
public int compare(Book a, Book b){
    if (a.GetPrice()<b.GetPrice())
        return -1;
    else if (a.GetPrice()>b.GetPrice())
        return 1;
    else return 0;
        }
}
