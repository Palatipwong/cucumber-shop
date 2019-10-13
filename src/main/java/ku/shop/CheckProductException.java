package ku.shop;

public class CheckProductException extends RuntimeException {

    public CheckProductException() {
        super("product not exist");
    }
}
