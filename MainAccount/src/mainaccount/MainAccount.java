package mainaccount;

public class MainAccount {

    public static void main(String[] args) {
        AccountPLN acpln = new AccountPLN(); //declaration and instatiation
        AccountUSD acusd = new AccountUSD();
        acpln.setTotalAmount(150000);
        acpln.setMonthLimit(3000);
        acpln.printTotalAmount();
        acpln.printMonthLimit();
        acusd.setTotalAmount(20000);
        acusd.setMonthLimit(1000);
        acusd.printTotalAmount();
        acusd.printMonthLimit();
    }
}


