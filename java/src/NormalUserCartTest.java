
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static junit.framework.TestCase.assertEquals;


class NormalUserCartTest {

    @Test
    void shouldReturnTotalWithShippingUsingBitcoin(){
        PaymentMethod paymentMethod = new Bitcoin();
        NormalUserCart normalUserCart = new NormalUserCart(100);
        normalUserCart.setShipping(0);
        normalUserCart.setPaymentMethod(paymentMethod);
        assertEquals(90.0f, normalUserCart.calculateTotalWithShippingAndDiscount());
    }

    @Test
    void shouldReturnTotalWithShippingUsingCreditCard(){
        PaymentMethod paymentMethod = new CreditCard();
        NormalUserCart normalUserCart = new NormalUserCart(100);
        normalUserCart.setShipping(0);
        normalUserCart.setPaymentMethod(paymentMethod);
        assertEquals(100.0f, normalUserCart.calculateTotalWithShippingAndDiscount());
    }
}