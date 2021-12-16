package domain.RiverwoodInn_adapter;

public class InnDetails{
    private String innName;
    private String customerName;
    private long accNumber;

    public String getInnName() {
        return innName;
    }
    public void setInnName(String innName) {
        this.innName = innName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public long getCustomerAmount() {
        return accNumber;
    }
    public void settCustomerAmount(long accNumber) {
        this.accNumber = accNumber;
    }
}