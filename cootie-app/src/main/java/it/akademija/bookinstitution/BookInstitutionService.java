package it.akademija.bookinstitution;

import it.akademija.bookinstitution.books.BookRepository;
import it.akademija.bookinstitution.books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.transaction.Transactional;


@Service
public class BookInstitutionService {

    @Autowired
    private BookInstitutionRepository bookInstitutionRepository;
    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public void addBookInstitution (BookInstitution bookInstitution){
        bookInstitutionRepository.save(bookInstitution);
    }



    @Transactional
    public void addBookToInstitution(String institutionname, Books book){
        BookInstitution bi1 =bookInstitutionRepository.findBookInsitutionByName(institutionname);
        bi1.addBook(book);

    }
    @Transactional
    public void removeBookFromInstitution(String institutionname, Books book){
        BookInstitution bi1 =bookInstitutionRepository.findBookInsitutionByName(institutionname);
        bi1.deleteBook(book);
    }

//    public List<BookInstitution> getAllBookInstitutions(){
//        List<BookInstitution> institutionDB = getBookInstitutionRepository().findAll();
//        List
//    }


     public BookInstitutionRepository getBookInstitutionRepository() {
        return bookInstitutionRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookInstitutionRepository(BookInstitutionRepository bookInstitutionRepository) {
        this.bookInstitutionRepository = bookInstitutionRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
