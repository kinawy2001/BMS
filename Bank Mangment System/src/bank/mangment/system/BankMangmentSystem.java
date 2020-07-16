package bank.mangment.system;

public class BankMangmentSystem {

    public static void main(String[] args) {
        client lol = new client();
        lol.setDeposit(23.0);
        System.out.println("You Deposit            : " + lol.getDeposit() + " $");
        lol.setWithdraw(11.5);
        System.out.println("You Withdraw           : " + lol.getWithdraw() + " $");
        lol.setDeposit(20.0);
        System.out.println("You Deposit            : " + lol.getDeposit() + " $");
        lol.setWithdraw(100.0);
        try {
            if (lol.getWithdraw() < 0) {
                System.out.println("You Wanna Withdraw     : " + lol.getWithdraw1() + " $ And Your Balance Small Than That !");
            } else {
                System.out.println(lol.getWithdraw());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
