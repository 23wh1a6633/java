public class BookInfo 
{
        public static void main(String s[]) 
    {

        Book myBook = new Book();
        myBook.bookName = "The Great Gatsby";
        myBook.isbnNumber = "978-0743273565";
        myBook.authorName = "F. Scott Fitzgerald";
        myBook.publisher = "Scribner";
        
        System.out.println(myBook.getBookInfo());
        
        myBook.bookName = "The Great Gatsby - Updated Edition";
        System.out.println("Updated Book Name: " + myBook.bookName);
    }
}

class Book 
{

    String bookName;
    String isbnNumber;
    String authorName;
    String publisher;

    String getBookInfo() 
    {
        return "Book Name: " + bookName + "\nISBN Number: " + isbnNumber + "\nAuthor Name: " + authorName + "\nPublisher: " + publisher;
    }
}
