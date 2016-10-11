package web_tech_lab_1_12.Data;

import org.junit.Test;
import web_tech_lab_1_12.Comparators.AuthorComparator;
import web_tech_lab_1_12.Comparators.PriceComparator;
import web_tech_lab_1_12.Comparators.TitleComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * Created by Сергей on 11.10.2016.
 */
public class BookTest {
    @Test
    public void compareTo() throws Exception {
        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(new Book("Red hat","Fedya",15,4));
        tree.add(new Book("Red hat","Fedya",16,42));
        tree.add(new Book("Goodfather","Petya",115,1));
        tree.add(new Book("Goodfather2","Petya",15,14));
        tree.add(new Book("Goodfather3","Fedya",15,0));
        ArrayList<Book> list = new ArrayList<Book>();
        for(Book book:tree){
            list.add(book);
        }
        for (int i=1;i<list.size();i++){
            assertTrue(list.get(i-1).compareTo(list.get(i))<0);
        }

    }
    @Test
    public void CheckComparators() throws Exception {
        Comparator<Book> comparator =
                new AuthorComparator().thenComparing(new TitleComparator()).thenComparing(new PriceComparator());
        TreeSet<Book> tree = new TreeSet<Book>(comparator);
        tree.add(new Book("Red hat","Petya",16,42));
        tree.add(new Book("Goodfather2","Fedya",15,14));
        tree.add(new Book("Goodfather3","Fedya",15,0));
        tree.add(new Book("Goodfather","Fedya",115,1));
        tree.add(new Book("Red hat","Petya",15,4));
        ArrayList<Book> list = new ArrayList<Book>();
        ArrayList<Book> testList = new ArrayList<Book>();
        testList.add(new Book("Goodfather","Fedya",115,1));
        testList.add(new Book("Goodfather2","Fedya",15,14));
        testList.add(new Book("Goodfather3","Fedya",15,0));
        testList.add(new Book("Red hat","Petya",15,4));
        testList.add(new Book("Red hat","Petya",16,42));
        for(Book book:tree){
            list.add(book);
        }
        for (int i=1;i<list.size();i++){
           assertTrue(list.get(i).equals(testList.get(i)));
        }

    }

}