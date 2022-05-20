import java.util.Objects;

public class Book {
   private final String bookName;
   private final Author nameOfAuthor;
   private final int pagesAmount;
   private int publishingYear;
   private final String publisherName;

   public Book(String bookName, Author nameOfAuthor, int pagesAmount, int publishingYear, String publisherName)        //Constructor
  {this.bookName = bookName;
   this.nameOfAuthor = nameOfAuthor;
   this.pagesAmount = pagesAmount;
   this.publishingYear = publishingYear;
   this.publisherName = publisherName;}

    public String getBookName()
    {return bookName;}

    public Author getNameOfAuthor()
    {return nameOfAuthor;}

    public int getPagesAmount() {
        return pagesAmount;}

    public int getPublishingYear() {
        return publishingYear;}

    public String getPublisherName() {
        return publisherName;}

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;}

    @Override
    public String toString() {
        return bookName+" "+nameOfAuthor+" "+pagesAmount+" "+publishingYear+" "+publisherName;
    }
    @Override
    public boolean equals(Object obj) {
       if (this == obj || getClass() != obj.getClass()) return false;
       Book book = (Book)obj;
       return bookName.equals(book.bookName)&&nameOfAuthor.equals(book.nameOfAuthor)
               &&pagesAmount==book.getPagesAmount()&&publishingYear==book.publishingYear
               &&publisherName.equals(book.publisherName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName,nameOfAuthor, pagesAmount, publishingYear, publisherName);
    }
}
