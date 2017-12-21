package it.akademija.bookinstitution;


import it.akademija.bookinstitution.books.Books;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class BookInstitution {

    @Column
    private String isntName;
    @Column
    private String town;
    @Column
    private String picture;
    @Column
    private String category;
    @Enumerated
    private bookInstitutionType bookInstitutionType;

    private List<Books> books;



    public BookInstitution(){}
    public BookInstitution(String instName, String town, String picture, String category){
        this.isntName = instName;
        this.town = town;
        this.picture = picture;
        this.category = category;
        this.books = new ArrayList<>();
    }

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

}

