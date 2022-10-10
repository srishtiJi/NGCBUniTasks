import java.util.Objects;

public class Product {
    private String brandName;
    private Integer pid;

    @Override
    public String toString() {
        return "Product{" +
                "brandName='" + brandName + '\'' +
                ", pid=" + pid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getBrandName(), product.getBrandName()) && Objects.equals(getPid(), product.getPid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrandName(), getPid());
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}