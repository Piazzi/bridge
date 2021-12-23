
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static junit.framework.TestCase.assertEquals;


class PrimeUserCartTest {

    @Test
    void shouldReturnTotalWithShippingUsingBitcoin(){
        PaymentMethod paymentMethod = new Bitcoin();
        PrimeUserCart primeUserCart = new PrimeUserCart(100);
        primeUserCart.setShipping(0);
        primeUserCart.setPaymentMethod(paymentMethod);
        assertEquals(81.0f, primeUserCart.calculateTotalWithShippingAndDiscount());
    }

    @Test
    void shouldReturnTotalWithShippingUsingCreditCard(){
        PaymentMethod paymentMethod = new CreditCard();
        PrimeUserCart primeUserCart = new PrimeUserCart(100);
        primeUserCart.setShipping(0);
        primeUserCart.setPaymentMethod(paymentMethod);
        assertEquals(90.0f, primeUserCart.calculateTotalWithShippingAndDiscount());
    }
}