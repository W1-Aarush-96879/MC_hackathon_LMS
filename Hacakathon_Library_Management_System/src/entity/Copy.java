package entity;

import java.io.Serializable;

public class Copy implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int bookId;   // FIXED
    private String rack;
    private String status; // AVAILABLE / ISSUED

    public Copy() {}

    public Copy(int id, int bookId, String rack, String status) {
        this.id = id;
        this.bookId = bookId;
        this.rack = rack;
        this.status = status;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Copy [id=" + id + ", bookId=" + bookId + ", rack=" + rack + ", status=" + status + "]";
	}

  
    
}