public class Book {
   private String bookName;
   private Author authorName;
   private short pagesAmount;
   private short publishingYear;
   private String publisherName;

   public Book(String bookName, Author authorName, short pagesAmount, short publishingYear, String publisherName)        //Constructor
  {this.bookName = bookName;
   this.authorName = authorName;
   this.pagesAmount = pagesAmount;
   this.publishingYear = publishingYear;
   this.publisherName = publisherName;}

    public String getBookName()
    {return bookName;}

    public Author getAuthorName()
    {return authorName;}

    public short getPagesAmount() {
        return pagesAmount;}

    public short getPublishingYear() {
        return publishingYear;}

    public String getPublisherName() {
        return publisherName;}

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;}
}
