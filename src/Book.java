public class Book {
   private String bookName;
   private Author nameOfAuthor;
   private int pagesAmount;
   private int publishingYear;
   private String publisherName;

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
}
