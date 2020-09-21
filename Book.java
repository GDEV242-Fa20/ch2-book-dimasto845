/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Bill Crosbie
 * @version Feb 4, 2019
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages; // 2.85
    private String refNumber; //2.88
    private int borrowed; //2.91
    private boolean courseText; //2.92

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int numPages, 
    boolean immutable)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = numPages; //2.85
        refNumber=""; //2.88
        courseText = immutable;
    }

    // Add the methods here ...
    
    /**
     * accessor method to return the author 2.83
     */
    public String getAuthor()
    {
     
        return author;
    }
    
    /**
     * accessor method to return the title 2.83
     */
    public String getTitle()
    {
        return title;
        
    }
    
    /**
     * returns number of pages 2.85
     */
    public int getPages()
    {   
        return pages; 
    }
    
    /**
     * prints author name 2.84
     */
    public void printAuthor()
    {   
        System.out.println("Author: " + author);
    }
    
    /**
     * prints title 2.84
     */
    public void printTitle()
    {   
        System.out.println("Title: " + title);
    }
    
    /**
     * sets reference number 
     */
    public void setRefNumber(String ref) //2.88
    {
        if(ref.length()>=3) //2.90
        refNumber=ref;
        
        /* display error input
         * 
         */
        else //2.90
            System.out.println(" Error input value! ");
    }
    
    /**
     * gets reference number 2.88
     */
    public String getRefNumber(String ref)
    {
        return refNumber;
    }
    
    
    /*
     * implemetation of accessor 2.91
     * 
     */
    public void setBorrowed()
    {
        borrowed+=1;
    }
    
    public int getBorrowed() //2.91
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
     return courseText;   
    }
    
    
    /**
     * prints details of the book 
     */
    public void printDetails()
    {   
        // displays all fields in one line
        System.out.println("Author:" + author); //2.87
        System.out.println(", Title:" + title); //2.87
        System.out.println(", Pages:" + pages); //2.87
        if(refNumber.length()==0) //2.89
            System.out.print(", Ref Number: ZZZ");//2.89
        else//2.89
            System.out.print(" , Ref Number: " + refNumber);//2.89
        System.out.print("Borrowed book :" + borrowed);
            
    }
    
    
}
