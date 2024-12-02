public class Books {
    private String title; // Bokens titel
    private int length;   // Antal sidor i boken
    private Genre genre;  // Genren boken tillhör

    public Books(String title, int length, Genre genre) {
        this.title = title;
        this.length = length;
        this.genre = genre;
        genre.addBook(this);
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }


    public Genre getGenre() {
        return genre;
    }


    @Override
    public String toString() {
        return title + " (" + length + " sidor, Genre: " + genre.getName() + ")";
    }
}