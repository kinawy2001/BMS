package bank.mangment.system;

//this class is inherted form user which is the super class
public class client extends user {

    /*
    here I made all of them private 
    because encapsulation property 
    and to protect them 
     */
    private double _balance;

    private double deposit;
    private double withdraw;

    public double with;

    public double depo;

    public double getBalance() {
        return _balance;
    }

    public double getDeposit() {
        return depo;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
        deposit -= getDeposit();
        depo = getDeposit() + deposit;
    }

    public double getWithdraw() {
        return with;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
        with = getDeposit() - withdraw;
    }

    public double getWithdraw1() {
        return withdraw;
    }

    public void setWithdraw1(double withdraw) {
        this.withdraw = withdraw;

    }

}
