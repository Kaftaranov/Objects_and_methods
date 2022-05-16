public class Author {
   private String name;
   private String surname;

   public Author(String name, String surname)              //Constructor
   {this.name = name;
   this.surname = surname;}

   public String getAuthorName()                           //Getter
   {return name;}

   public String getSurname()
   {return surname;}                                       //Getter
}
