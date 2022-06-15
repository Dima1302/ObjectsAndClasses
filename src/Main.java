public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Джордж", "Оруэл");
        Author author2 = new Author("Олдос", "Хаксли");
        Book book1 = new Book("1986", author1, 1949);
        Book book2 = new Book("О дивный мир!", author2, 1932);
        System.out.println(book1.getPublishingYear());
        System.out.println(book1.getAuthor().getName());
        System.out.println(book1.getAuthor().getLastName());
        System.out.println(book1.getName());
        System.out.println(book2.getAuthor().getLastName());
        book1.setPublishingYear(2022);
        System.out.println(book1.getPublishingYear());
        System.out.println(book1.getName().equals(book2.getName())); // метод equals класса Book здесь
        System.out.println(book1.getAuthor().getLastName().equals(book2.getAuthor().getLastName())); // метод equals класса Author здесь
        System.out.println(book1.getName().hashCode());
        System.out.println(book2.getName().hashCode());


        String c = book1.getAuthor().getLastName();
        System.out.println(c);
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1);
        System.out.println(book2);


    }


}
