package web_tech_lab_1_13.Data;

/**
 * Created by Сергей on 16.09.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;
    ProgrammerBook(String title, String author, int price, String language, int level){
        super(title,author,price);
        this.language = language;
        if (level < 0) level = 0;
        this.level = level;
    }
    public boolean equals(Object obj){
        boolean result = super.equals(obj);
        if (!(obj instanceof ProgrammerBook)) return false;

        ProgrammerBook b = (ProgrammerBook)obj;
        return (result && this.level==b.level && this.language.equals(b.language));

    }
    public int hashCode(){

        return super.hashCode()*level*language.hashCode();
    }
}
