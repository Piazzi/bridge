public class NormalUserCart extends Cart {

    public NormalUserCart(float total) {
        super(total);
    }

    public float calculateTotalWithShippingAndDiscount(){
        return (this.total * (1.0f - this.paymentMethod.discountPercentage())) + this.shipping;
    }
}