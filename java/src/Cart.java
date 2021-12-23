public abstract class Cart {

    protected PaymentMethod paymentMethod;

    protected float shipping = 0;
    protected float total = 0;

    public Cart(float total) {this.total = total;}

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setShipping(float shipping) {
        this.shipping = shipping;
    }

    public abstract float calculateTotalWithShippingAndDiscount();

}
