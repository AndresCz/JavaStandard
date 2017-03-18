package model;


/**
 * @author daro on 18/03/17.
 */
public class Transaction {

    public enum TransactionType {
        GROCERY, MEAT, DRINKS;
    }

    private Integer id;
    private TransactionType transactionType;
    private Double value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
