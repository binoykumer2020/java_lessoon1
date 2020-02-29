package OOPs2;

public class AbstractTest {

    public static void main(String[] args) {
      //  AbstractCurrentAccount ob1 = new AbstractCurrentAccount();
        // this is not allowed as Abstract class can't be instantiated/ means we can't create object

        // only we can create some reference var/ refer to sub class object polymorphism

        AbstractBankAccountProperty basic, advance;

        basic= new AbstractBasic();
        basic.cashDeposits();

        advance = new AbstractAdvance();
        advance.cashDeposits();
        advance.cashWithdrawal();









    }
}
