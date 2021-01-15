
/**
 * Default constructor and get/set method for book class.
 * to get book author, title and rating
 *
 * @Jin Tang
 * @05/11/2020
 */
public class Book
{
    private String title;
    private String author;
    private String rating;

    public Book()
    {
        title = "";
        author = "";
        rating = "";
    }

    /**
     * default constructor
     * 
     * @param newTitle accept passing title value
     * @param newAuthor accept passing author value
     * @param newRating accept passing rating value
     */
    public Book(String newTitle, String newAuthor, String newRating)
    {
        title = newTitle;
        author = newAuthor;
        rating = newRating;
    }

    /**
     * display the details of books
     */
    public void display()
    {   
        System.out.println("Name: "+ title + "  Author: " + author +  
                           "  Rating: " + rating + "\n");
    }

    public String getAuthor()
    {
        return author;
    }

    public String getRating()
    {
        return rating;
    }

    public String getTitle()
    {
        return title;
    }

    public void setAuthor(String newAuthor)
    {
        author = newAuthor;
    }

    public void setRating(String newRating)
    {
        rating = newRating;
    }

    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
}
