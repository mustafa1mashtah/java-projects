package week32.ex1.ex2;

import week32.ex1.Customer;

public class InsuranceApplication {
    public static void main(String[] args) {
        Customer customer1=new Customer(" Mr. mustafa mashtah","business");
        Customer customer2=new Customer("Ms. randa","business");
        Customer customer3=new Customer("Mr. mustafa Hokopoko","business");
        Customer customer4=new Customer(" mustafa mashtah","business");
        TemplateChooser templateChooser=new TemplateChooser();
        System.out.println(templateChooser.chooseTemplate(customer1));
        System.out.println(templateChooser.chooseTemplate(customer2));
        System.out.println(templateChooser.chooseTemplate(customer3));
        System.out.println(templateChooser.chooseTemplate(customer4));

    }
}
//In the InsuranceApplication class main method, create several Customers and a TemplateChooser and see the results.