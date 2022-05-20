public class Main {
   static String name;
   static String surname;
   static String bookCaption;
   static int pages;
   static int publishingYear;
   static String publisherName;
   static int correctedPublishingYear = 1980;
    public static void main(String[] args) {
    Author stevenKing = new Author("Steven", "King");
    Author viktorSuvorov = new Author("Viktor", "Suvorov");
    Book theMist = new Book("Mist", stevenKing, 150, 1995, "Warner Bros Ltd.");
    Book theLastRepublic = new Book("The Last republic", viktorSuvorov, 280, 2015, "BHV");
    Book theLiberator = new Book("The Liberator", viktorSuvorov, 293, 2010, "Red Star");
    Book theLangoliers = new Book("The Langoliers", stevenKing, 95, 1990, "Printer&Co");

    System.out.println("Author of book " + theLiberator.getBookName() + " is " + viktorSuvorov.getAuthorName() +
    " " + viktorSuvorov.getAuthorSurname()+". "+"Pages: "+theLiberator.getPagesAmount()+". "+"Published in "
            +theLiberator.getPublishingYear()+" "+"by "+theLiberator.getPublisherName());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The Liberator with corrected publishing year from 1990 to " + correctedPublishingYear);
        theLiberator.setPublishingYear(correctedPublishingYear);
        System.out.println("Author of book " + theLiberator.getBookName() + " is " + viktorSuvorov.getAuthorName() +
                " " + viktorSuvorov.getAuthorSurname()+". "+"Pages: "+theLiberator.getPagesAmount()+". "+"Published in "
                +theLiberator.getPublishingYear()+" "+"by "+theLiberator.getPublisherName());

    }
}