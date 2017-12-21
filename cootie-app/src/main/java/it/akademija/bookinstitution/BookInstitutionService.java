package it.akademija.bookinstitution;

import it.akademija.bookinstitution.books.BookRepository;
import it.akademija.bookinstitution.books.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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
    public void addBookToInstitution(BookInstitution bookInstitution, Books book){

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
