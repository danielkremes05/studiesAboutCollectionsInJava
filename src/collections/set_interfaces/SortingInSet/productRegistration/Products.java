package collections.set_interfaces.SortingInSet.productRegistration;

import java.util.Objects;

public class Products {
    private String name;
    private double price;
    private int code;
    private int quantity;

    public Products (String name, double price, int code, int quantity) {
        this.name = name;
        this.price = price;
        this.code = code;
        this.quantity = quantity;
    }

    public String getName () {
        return name;
    }

    public double getPrice () {
        return price;
    }

    public int getCode () {
        return code;
    }

    public int getQuantity () {
        return quantity;
    }

    @Override
    public String toString () {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", code=" + code +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (Double.compare(products.price, price) != 0) return false;
        if (code != products.code) return false;
        if (quantity != products.quantity) return false;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode () {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + code;
        result = 31 * result + quantity;
        return result;
    }
}
