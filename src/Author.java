import java.util.Objects;

public class Author {
   private final String name;
   private final String surname;
   public Author(String name, String surname)
   {this.name = name;
   this.surname = surname;}

   public String getAuthorName()
   {return name;}

   public String getAuthorSurname()
   {return surname;}

   @Override
   public String toString() {
   return name + " " + surname;
   }
   @Override
   public boolean equals(Object obj) {
   if (this == obj) return true;
   if (obj==null||getClass()!=obj.getClass()) return false;
   Author author = (Author)obj;
   return name.equals(author.name) && surname.equals(author.surname);
   }
   @Override
   public int hashCode() {
   return Objects.hash(name, surname);
   }
}
