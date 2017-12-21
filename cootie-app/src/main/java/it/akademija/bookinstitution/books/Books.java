package it.akademija.bookinstitution.books;

import javax.persistence.*;

@Entity
@Table
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private long id;
    @Column
    private String name;
    @Column
    private  String author;
    @Column
    private int pages;
    @Column
    private String img;


    public Books(){}
    public Books(String name, String author, int pages, String img){
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.img = img;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
