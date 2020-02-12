package homework.WS1two;


public class Film {
    private String title;
    private Date releaseDate;
    private int length;

    public Film(String title, Date releaseDate, int length) {// creat a approach to creat object,if you would like to use it,you need get three aprameters.
        this.title = title;//the object will get the title from the class;
        this.releaseDate = releaseDate;//the object will get the releaseDate from the class;
        this.length = length;//the object will get the length from the class;
    }

    public String getTitle() {
        return title;
    }//the object will get the value of title;

    public Date getReleaseDate() {
        return releaseDate;
    }//the object will get the value of release ;

    public int getLength() {
        return length;
    }//the object will get the value of length ;

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }//the object will set the value of releaseDate ;

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", length=" + length +
                '}';
    }

    public static void main(String[] args) {
        Film adAstra = new Film("Ad Astra", new Date(18, "September", 2019), 123);
        System.out.println("adAstra = " + adAstra);
    }
}



