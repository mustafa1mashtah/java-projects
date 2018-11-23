package week32.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class ScreenTest {
    Screen screen=new Screen();

    @Test
    void testBusinessCustomer() {
        Customer customer=new Customer("mustafa","business");
        String name= screen.display(customer);
        Assertions.assertEquals("MUSTAFA",name);

    }
    @Test
    void testEconomicCustomer() {
        Customer customer=new Customer("mustafa","economic");
        String name= screen.display(customer);
        Assertions.assertEquals("mustafa",name);

    }
    @Test
    void testOtherCustomer() {
        Customer customer=new Customer("mustafa","normal");
        String name= screen.display(customer);
        Assertions.assertEquals("give me valid value",name);

    }
}
//[Testing] Create the ScreenTest class and test its behavior. Write three methods: testBusinessCustomer,
// testEconomicCustomer and testOtherCustomer. What happens when a business class has to be displayed?
//
// What happens when the customer is in economic class? What if they have a different category or none at all?