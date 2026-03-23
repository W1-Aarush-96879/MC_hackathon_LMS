package entity;

import java.io.Serializable;
import java.time.LocalDate;

public class IssueRecord implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int copyId;
    private int memberId;
    private LocalDate issueDate;
    private LocalDate returnDueDate;
    private LocalDate returnDate;
    private double fineAmount;

    public IssueRecord() {}

    public IssueRecord(int id, int copyId, int memberId,
                       LocalDate issueDate, LocalDate returnDueDate) {
        this.id = id;
        this.copyId = copyId;
        this.memberId = memberId;
        this.issueDate = issueDate;
        this.returnDueDate = returnDueDate;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCopyId() {
		return copyId;
	}

	public void setCopyId(int copyId) {
		this.copyId = copyId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getReturnDueDate() {
		return returnDueDate;
	}

	public void setReturnDueDate(LocalDate returnDueDate) {
		this.returnDueDate = returnDueDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}

	public double getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(double fineAmount) {
		this.fineAmount = fineAmount;
	}

    

   
}