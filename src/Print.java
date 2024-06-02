public class Print {
    public static void printAccount(){
        System.out.println("-----------------------------------");
        System.out.println("Do you want create a current account or a savings account?");
		System.out.println("1 - Current Account");
		System.out.println("2 - Savings Account");
        System.out.println("-----------------------------------");
    }

    public static void printCurrentAccount(){
        System.out.println("Current Account created successfully!");
    }

    public static void printSavingAccount(){
        System.out.println("Saving Account created successfully!");
    }

    public static void printOperations(){
        System.out.println("-----------------------------------");
        System.out.println("What operation do you want to do?");
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Print Extract");
        System.out.println("4 - Exit");
        System.out.println("-----------------------------------");
    }
}
