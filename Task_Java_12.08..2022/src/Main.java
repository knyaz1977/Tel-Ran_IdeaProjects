public class Main {

    public static void main(String[] args) {
        LongTermDeposit ltd1 = new LongTermDeposit("John", 5000.0);
        LongTermDeposit ltd2 = new LongTermDeposit("Ann", 1000.0);
        LongTermDeposit ltd3 = new LongTermDeposit("Victor", 15000.0);
        DemandDeposit dd1 = new DemandDeposit("John", 3500.0);
        DemandDeposit dd2 = new DemandDeposit("Ann", 7500.0);

        Deposit[] deposits = {ltd1, ltd2, ltd3, dd1, dd2};

        for (Deposit deposit : deposits) {
            System.out.println(deposit.getHolderName() + " " + deposit.getDepositAmount() + " " + deposit.calculateDepositAmount(3));
        }

//        Apple ap; // переменная ссылочного типа
//        ap = Apple.GoldenDel;
//        ap = Apple.Jonathan;
//        ap = Apple.Winesap;

        Apple ap = Apple.Winesap;
        if (ap == Apple.GoldenDel) {
            System.out.println();
        }

        switch (ap) {
            case Reddel:
                break;
            case Jonathan:
        }

        for (Apple apple : Apple.values()) {
            System.out.println();
        }

        ErrorCode errorCode = ErrorCode.Error1;
//        errorCode.

    }

}

