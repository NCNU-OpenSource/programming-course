public class Pudding {
    private String flavor;
    private int price;
    private int quantity;

    public Pudding(String f, int p, int q) {
    	flavor = f;
    	price = p;
    	quantity = q;
    }

    public int getPrice() {
    	return price;
    }

    public int getQuantity() {
    	return quantity;
    }

    public void setQuantity(int q) {
    	quantity = q;
    }
}
