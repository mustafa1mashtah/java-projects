package week32.ex1;

public class Screen {
    public String display(Customer customer) {
        Boolean isBusiness = customer.getCategory().equals("business");
        Boolean isEconomic = customer.getCategory().equals("economic");
        if (isBusiness) {
            String name = customer.getName().toUpperCase();
            System.out.println(name);
            return name;

        } if (isEconomic){
            String name = customer.getName().toLowerCase();
            System.out.println(name);
            return name;
        }
        else {
            System.out.println("give me valid value");

            return "give me valid value";
        }



    }


}


//A Screen can display a customer name according to the railway rules,
// and it also returns the name it displayed so that it can be tested afterwards.
//They want those names of the business class to be displayed in capital letters and those in
// economic class to be displayed in small letters.