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
