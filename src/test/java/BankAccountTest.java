import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

////Test Class Declaration:
////public class BankAccountTest {: This declares a new class named BankAccountTest. This class will contain the test methods for the BankAccount class.

public class BankAccountTest {


    //Instance Variable:
//BankAccount bankAccount;: This declares an instance variable named bankAccount of type BankAccount. This variable will hold a BankAccount object that will be used in the test methods.
    BankAccount bankAccount;

//    @BeforeEach: This annotation is part of JUnit Jupiter and is used to signal that the annotated method should be executed before each test method in the class.

//public void setUp() { ... }: This method is annotated with @BeforeEach, indicating that it should be executed before each test method. It is commonly used to set up common test fixtures or initialize objects needed for testing.


    @BeforeEach
    public void setUp() {
        bankAccount = new BankAccount("David", "Mallory", "29 - 11 - 1996", "00245");

    }

    //    Testing for getters and setters
    @Test
    public void hasFirstName() {
        assertThat(bankAccount.getFirstName()).isEqualTo("David");
    }

    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Ezekiel");
        assertThat(bankAccount.getFirstName()).isEqualTo("Ezekiel");
    }

    @Test
    public void hasLastName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Mallory");
    }

    @Test
    public void canSetLastName() {
        bankAccount.setLastName("Riviera");
        assertThat(bankAccount.getLastName()).isEqualTo("Riviera");
    }

    @Test
    public void hasDateOfBirth() {
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("29 - 11 - 1996");
    }

    @Test
    public void canSetDateOfBirth() {
        bankAccount.setDateOfBirth("12-10-1999");
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("12-10-1999");
    }

    @Test
    public void hasAccountNumber() {
        assertThat(bankAccount.getAccountNumber()).isEqualTo("00245");
    }

    @Test
    public void canSetAccountNumber() {
        bankAccount.setAccountNumber("00127");
        assertThat(bankAccount.getAccountNumber()).isEqualTo("00127");
    }

    @Test
    public void canGetBalance() {
        bankAccount.deposit(80);
        assertThat(bankAccount.getBalance()).isEqualTo(80);
    }

    @Test
    public void canSetBalance() {
        bankAccount.setBalance(200);
        assertThat(bankAccount.getBalance()).isEqualTo(200);
    }


    @Test
    public void canDeposit() {
        bankAccount.deposit(20);
        assertThat(bankAccount.getBalance()).isEqualTo(20);
    }

    @Test
    public void canWithdrawFunds() {
        bankAccount.deposit(20);
        bankAccount.withdraw(5);
        assertThat(bankAccount.getBalance()).isEqualTo(15);
    }
//EXTENSION TESTS
    
}



