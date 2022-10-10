import java.util.Objects;

public class Customer {
    private Integer cusId;
    private String cusName;

    public Customer() {
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return Objects.equals(getCusId(), customer.getCusId()) && Objects.equals(getCusName(), customer.getCusName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCusId(), getCusName());
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                '}';
    }
}
