public class BookCD 
{
    private String title;
    private String authorOrArtist;
    private String uniqueId;
    private int pages; // Applicable for books
    private double duration; // Applicable for CDs, in minutes

    // Default constructor
    public BookCD() 
    {
        this.title = "";
        this.authorOrArtist = "";
        this.uniqueId = "";
        this.pages = 0;
        this.duration = 0.0;
    }

    // Parameterized constructor
    public BookCD(String title, String authorOrArtist, String uniqueId, int pages, double duration) 
    {
        this.title = title;
        this.authorOrArtist = authorOrArtist;
        this.uniqueId = uniqueId;
        this.pages = pages;
        this.duration = duration;
    }

    public void displayDetails()     // Method to display details of the BookCD
    {
        System.out.println("Title: " + title);
        System.out.println("Author/Artist: " + authorOrArtist);
        System.out.println("Unique ID: " + uniqueId);

        if (pages > 0) 
        {
            System.out.println("Pages: " + pages);
        } 

        else 
        {
            System.out.println("Duration: " + duration + " minutes");
        }
    }

    // Getters and setters for all fields
    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getAuthorOrArtist() 
    {
        return authorOrArtist;
    }

    public void setAuthorOrArtist(String authorOrArtist) 
    {
        this.authorOrArtist = authorOrArtist;
    }

    public String getUniqueId() 
    {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) 
    {
        this.uniqueId = uniqueId;
    }

    public int getPages() 
    {
        return pages;
    }

    public void setPages(int pages) 
    {
        this.pages = pages;
    }

    public double getDuration() 
    {
        return duration;
    }

    public void setDuration(double duration) 
    {
        this.duration = duration;
    }

    public static void main(String[] args) 
    {
        // Create a BookCD object representing a book
        BookCD book = new BookCD("Java Programming", "John Doe", "BK123", 350, 0.0);

        // Create a BookCD object representing a CD
        BookCD cd = new BookCD("Greatest Hits", "The Artist", "CD456", 0, 45.0);

        System.out.println("Book Details:");         // Display details of the book
        book.displayDetails();

        System.out.println("\nCD Details:");        // Display details of the CD
        cd.displayDetails();
    }
}

