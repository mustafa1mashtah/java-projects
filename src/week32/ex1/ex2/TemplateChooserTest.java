package week32.ex1.ex2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week32.ex1.Customer;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @Test
    void testManTemplate() {
        Customer customer = new Customer("Mr. mustafa", "economic");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Man", template);

    }
    @Test
    void testWomanTemplate() {
        Customer customer = new Customer("Ms. johanna", "economic");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("Women", template,"its wrong");

    }
    @Test
    void testDefaultTemplate() {
        Customer customer = new Customer("johanna", "economic");
        String template = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("default Template", template);

    }
    @Test
    void testPrivilegedTemplate() {
        Customer customer = new Customer("Mr. mustafa Hokopoko", "economic");
        String templat = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("privileged", templat);

    }
    @Test
    void testSpaceAtBeginning() {
        Customer customer = new Customer("  Mr. mustafa Hokopoko", "economic");
        String templat = templateChooser.chooseTemplate(customer);
        Assertions.assertEquals("privileged", templat);

    }

}
//[Testing] Create the TemplateChooserTest class and test its behavior. Write four methods: testManTemplate,
// testWomanTemplate, testPrivilegedTemplate and testDefaultTemplate.
// What happens in each one of the cases? What happens when there is a space at the beginning of their name?