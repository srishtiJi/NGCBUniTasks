import java.util.Objects;
import java.util.PrimitiveIterator;

public class Order {
    private Integer oid;
    private Integer quantity;
    private Integer bill;

    private Product product;
    private Customer customer;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", quantity=" + quantity +
                ", bill=" + bill +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(getOid(), order.getOid()) && Objects.equals(getQuantity(), order.getQuantity()) && Objects.equals(getBill(), order.getBill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOid(), getQuantity(), getBill());
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}
