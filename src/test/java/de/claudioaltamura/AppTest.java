package de.claudioaltamura;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.claudioaltamura.java.jaxb2.Order;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void shouldBePossible() {
        final var order = new Order();
        order.setOrderId("1234");
        assertEquals("1234", order.getOrderId());
    }
}
