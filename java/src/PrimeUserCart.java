public class PrimeUserCart extends Cart {

    public PrimeUserCart(float total) {
        super(total);
    }

    public float calculateTotalWithShippingAndDiscount(){
        return ((this.total * (1 - this.paymentMethod.discountPercentage())) + this.shipping) * 0.9f;
    }
}
