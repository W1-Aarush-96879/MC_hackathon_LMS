package entity;

import java.io.Serializable;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private String author;
    private String subject;
    private String isbn;
    private float price;

    public Book() {}

    public Book(int id, String title, String author, String subject, String isbn, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.isbn = isbn;
        this.price = price;
    }

   
    
    // Getters & Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
    public String toString() {
        return "Book [id=" + id + ", title=" + title + ", author=" + author +
               ", subject=" + subject + ", isbn=" + isbn + ", price=" + price + "]";
    }
}