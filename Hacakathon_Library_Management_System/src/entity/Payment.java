package entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private int memberId;
    private double amount;
    private String type; // MEMBERSHIP / FINE
    private LocalDateTime transactionTime;

    public Payment() {}

    public Payment(int id, int memberId, double amount,
                   String type, LocalDateTime transactionTime) {
        this.id = id;
        this.memberId = memberId;
        this.amount = amount;
        this.type = type;
        this.transactionTime = transactionTime;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(LocalDateTime transactionTime) {
		this.transactionTime = transactionTime;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", memberId=" + memberId + ", amount=" + amount + ", type=" + type
				+ ", transactionTime=" + transactionTime + "]";
	}

    
}