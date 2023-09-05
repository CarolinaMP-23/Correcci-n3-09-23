package tasks;

//import org.jetbrains.annotations.Contract;

/**
 *
 */
public class AddProduct implements Tasks { //presenta los productos disponibles para la compra
    private final String name;
    private final double price;
    private String productDetail;
    private boolean isInCart;
    private AddProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.productDetail = "";
        this.isInCart = false;
    }
   public final String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getProductDetail(){
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public boolean isInCart() {
        return isInCart;
    }
    public void removeFromCart(){
        isInCart = false;
    }
}