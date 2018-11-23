package week32.ex1.ex2;

import week32.ex1.Customer;

public class TemplateChooser {
    public String chooseTemplate(Customer customer) {
        String name = customer.getName().trim();
        Boolean starts = name.startsWith("Mr.");
        Boolean starts2 = name.startsWith("Ms.") || name.startsWith("Mrs.");
        Boolean contains = name.contains("Hokopoko");
        if (starts && !contains) {
            return "Man";
        }
        if (starts2 && !contains) {
            return "Women";

        }
        if (contains) {
            return "privileged";

        } else {
            return "default Template";
        }


    }

}
//The TemplateChooser has no attributes. It has the chooseTemplate method that receives a customer and returns the word man,
// woman or privileged depending on the insurance company’s requirements.

//An insurance company wants to send customized emails to their customers.
// If the name starts with Mr. they want to send the man template. If it starts with Ms. or Mrs.
// they want to send the woman template.
// Also, the Hokopoko family is the owner of the company,
// and if the email would be sent to anyone of that family, they want to send the privileged template.
// If neither of the previous cases are recognized through the name, then they want to use the default template.