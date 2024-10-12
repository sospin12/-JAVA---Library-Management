public class Book { //class book; definition of the class
    // defitnition
    private String title;
    private String author;
    private boolean state;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.state = true; //The book is in stock by sefault.
    }

    //Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    
    //show book ifo:
    public void displayInfoBook(){
        System.out.println("Book title: " + title + ", Author: " + author + ", Available: " + (state? "Yes" : "No"));
    }
}
