import java.io.Serializable;
import java.util.Objects;

public class JavaBeans implements Serializable {
    public static int serialUid=100;
    private Long beanId;
    private String name;
    private String address;

    @Override
    public String toString() {
        return "JavaBeans{" +
                "beanId=" + beanId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaBeans javaBeans)) return false;
        return Objects.equals(getBeanId(), javaBeans.getBeanId()) && Objects.equals(getName(), javaBeans.getName()) && Objects.equals(getAddress(), javaBeans.getAddress());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getBeanId(), getName(), getAddress());
    }

    public static int getSerialUid() {
        return serialUid;
    }

    public static void setSerialUid(int serialUid) {
        JavaBeans.serialUid = serialUid;
    }

    public Long getBeanId() {
        return beanId;
    }

    public void setBeanId(Long beanId) {
        this.beanId = beanId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}