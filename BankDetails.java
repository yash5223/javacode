package keystone;

interface BankDetails {
    int ID = 1230;
    String PSWD = "BankofAmerica";
    void deposit(double amount);   
    void withdraw(double amount);
    void displayDetails();
}