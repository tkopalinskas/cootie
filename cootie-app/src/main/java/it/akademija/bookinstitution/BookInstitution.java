package it.akademija.bookinstitution;


import it.akademija.bookinstitution.books.Books;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Entity
public class BookInstitution {

    @Column(unique = true)
    private String isntName;
    private String town;
    private String picture;
    private String category;
    @Enumerated
    private bookInstitutionType bookInstitutionType;
    @ManyToMany(mappedBy = "bookInsitutions")
    private List<Books> books;



    public String getIsntName() {
        return isntName;
    }

    public void setIsntName(String isntName) {
        this.isntName = isntName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getCategory() {
        return category;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public enum bookInstitutionType{
        LIBRARY, STORE, RENT, ARCHYVE}

    public void addBook(Books book){
        books.add(book);
    }
    public void deleteBook(Books book){
        books.remove(book);
    }

}

