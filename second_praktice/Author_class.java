package second_praktice;

public class Author_class {
    public static class Author{
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String get_Name(){
            return this.name;
        }

        public void set_Email(String new_email){
            this.email = new_email;
        }

        public String get_Email(){
            return this.email;
        }

        public char get_Gender(){
            return this.gender;
        }

        @Override
        public String toString(){
            return "name = " + name + ", email = " + email + ", gender = " + gender;
        }
    }

    public static class TestAuthor{
        public static void main(String[] args){
            Author author = new Author("Nikita", "Romazanov", 'm');
            System.out.println(author.toString());
            System.out.println("--------------");
            author.set_Email("Zyablikov");
            System.out.println(author.toString());
        }
    }


}
