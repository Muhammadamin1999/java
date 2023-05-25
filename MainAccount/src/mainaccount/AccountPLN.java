package mainaccount;

import java.text.DecimalFormat;

public class AccountPLN {
    
    DecimalFormat df = new DecimalFormat("0.00"); //object for formatting float numbers
     
    float total_amount, month_limit; //fields

    public AccountPLN() {  //default constuctor
    }

    void setTotalAmount(float total_amount) {
        this.total_amount = total_amount;
    }

    void printTotalAmount() {
   
        System.out.println("Your total amount is " + df.format(total_amount) + " PLN");
    }

    void setMonthLimit(float month_limit) {
        this.month_limit = month_limit;
    }

    void printMonthLimit() {
        System.out.println("Your monthly limit is " + df.format(month_limit) + " PLN");
    }

}


