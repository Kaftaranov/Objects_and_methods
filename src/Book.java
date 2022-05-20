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
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
