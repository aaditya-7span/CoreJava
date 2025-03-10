package oops_concept.abstarction.atm_sys;

public class Demo {
    public static void main(String[] args) {
        Atm user = new AtmUser();
        user.withdrawCash();
        user.checkBalance();
    }
}

