package de.claudioaltamura.java.jaxb2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class App {
    public static void main() {
        final var order = new Order();
        order.setOrderId("1234");
        order.setCustomer("Me");

        Order.ShipToAddress home = new Order.ShipToAddress();
        home.setName("Me");
        home.setAddress("Boulevard 1");
        home.setCity("Miami");
        home.setCountry("USA");
        order.setShipToAddress(home);

        Order.Item item = new Order.Item();
        item.setTitle("new shoes");
        item.setQuantity(BigInteger.valueOf(1L));
        item.setPrice(BigDecimal.valueOf(100.0));
        item.setNote("Be careful");
        order.getItems().add(item);
    }
}
