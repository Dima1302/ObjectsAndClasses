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
    }
}
