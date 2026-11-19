package com.example.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.model.Book;

@Service
public class BookService {

    private final List<Book> books = new ArrayList<>();

    // Constructor: 5 sample books
    public BookService() {

        books.add(new Book(201, "Effective Java",
                "Joshua Bloch", "Programming", 2018, true));

        books.add(new Book(202, "Clean Code",
                "Robert C. Martin", "Programming", 2008, true));

        books.add(new Book(203, "The Alchemist",
                "Paulo Coelho", "Fiction", 2015, false));

        books.add(new Book(204, "Introduction to Algorithms",
                "Thomas H. Cormen", "Computer Science", 2022, true));

        books.add(new Book(205, "Java Complete Reference",
                "Herbert Schildt", "Programming", 2021, true));
    }

    // 1. Get all books
    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    // 2. Get book by ID
    public Book getBookById(int bookId) {

        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }

        return null;
    }

    // 3. Add a new book
    public Book addBook(Book book) {
        books.add(book);
        return book;
    }

    // 4. Update an existing book
    public Book updateBook(int bookId, Book updatedBook) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == bookId) {

                updatedBook.setBookId(bookId);
                books.set(i, updatedBook);

                return updatedBook;
            }
        }

        return null;
    }

    // 5. Delete a book
    public boolean deleteBook(int bookId) {

        for (int i = 0; i < books.size(); i++) {

            if (books.get(i).getBookId() == bookId) {
                books.remove(i);
                return true;
            }
        }

        return false;
    }

    // 6. Search books by category
    public List<Book> searchByCategory(String category) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getCategory() != null
                    && book.getCategory().equalsIgnoreCase(category)) {
                result.add(book);
            }
        }

        return result;
    }

    // 7. Find books published from a given year
    public List<Book> findPublishedFromYear(int fromYear) {

        List<Book> result = new ArrayList<>();

        for (Book book : books) {

            if (book.getPublicationYear() >= fromYear) {
                result.add(book);
            }
        }

        return result;
    }
}