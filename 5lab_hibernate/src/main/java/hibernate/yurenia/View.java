package hibernate.yurenia;

import hibernate.yurenia.service.*;
import hibernate.yurenia.model.*;

import java.util.Scanner;

public class View {

    BankService bankService = new BankService();
    BusinessAccountService businessAccountService = new BusinessAccountService();
    BusinessService businessService = new BusinessService();
    CountryService countryService = new CountryService();
    CurrencyService currencyService = new CurrencyService();
    CustomerService customerService = new CustomerService();
    PrivateAccountService privateAccountService = new PrivateAccountService();
    ProductService productService = new ProductService();
    ServiceService serviceService = new ServiceService();
    TransactionService transactionService = new TransactionService();

    public void chooseTable() {

        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("Choose your destiny: ");
                System.out.println("1 - get all, 2 - get, 3 - create, 4 - update, 5 - delete: ");
                modifyBank();
                break;
//            case 2:
//                modifyBusiness();
//                break;
//            case 3:
//                modifyBA();
//                break;
//            case 4:
//                modifyCountry();
//                break;
//            case 5:
//                modifyCurrency();
//                break;
//            case 6:
//                modifyCustomer();
//                break;
//            case 7:
//                modifyPA();
//                break;
//            case 8:
//                modifyProduct();
//                break;
//            case 9:
//                modifyService();
//                break;
//            case 10:
//                modifyTransaction();
//                break;

        }
    }

    public void workChecker() {
        System.out.println("Need tables again? Y for YES");
        String input = new Scanner(System.in).nextLine();
        if(input.equals("Y")) {
            System.out.println("Choose again! from 1 to 10");
            chooseTable();
        } else {
            System.out.println("Goodbye!");
        }
    }

    public void outputMenu() {
        System.out.println("Choose the table to work with:");
        System.out.print("\t1 - Bank\n"
                + "\t2 - Business\n"
                + "\t3 - Business Account\n"
                + "\t4 - Country\n"
                + "\t5 - Currency\n"
                + "\t6 - Customer\n"
                + "\t7 - PrivateAccount\n"
                + "\t8 - Product\n"
                + "\t9 - Service\n"
                + "\t10 - Transaction\n"
                + "\tQ - Exit\n");
    }

    public void modifyBank() {
        System.out.println("Choose your destiny: ");
        System.out.println("1 - get all, 2 - get, 3 - create, 4 - update, 5 - delete: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("get all banks: ");
                System.out.println(bankService.findAllBanks());
                break;
            case 2:
                System.out.println("get bank");
                System.out.println("enter id: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println(bankService.findBank(id));
                break;
            case 3:
                System.out.println("create bank: ");
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter country id: ");
                int countryId = new Scanner(System.in).nextInt();
                Bank bank = new Bank(name, countryId);
                bankService.saveBank(bank);
                break;
            case 4:
                bank = new Bank();
                System.out.println("update bank: ");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                bank.setId(id);
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                bank.setName(name);
                System.out.println("Enter country id: ");
                countryId = new Scanner(System.in).nextInt();
                bank.setCountryId(countryId);
                bankService.updateBank(bank);
                break;
            case 5:
                System.out.println("delete bank: ");
                System.out.println("enter id: ");
                id = new Scanner(System.in).nextInt();
                bankService.deleteBank(id);
                break;
            default:
                System.out.println("Incorrect input");
        }
        workChecker();
    }
}
