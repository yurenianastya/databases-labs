package iot.yurenia.passive.view;

import iot.yurenia.passive.controller.Bank.BankDAOImpl;
import iot.yurenia.passive.controller.Business.BusinessDAOImpl;
import iot.yurenia.passive.controller.BusinessAccount.BusinessAccountDAOImpl;
import iot.yurenia.passive.controller.Country.CountryDAOImpl;
import iot.yurenia.passive.controller.Currency.CurrencyDAOImpl;
import iot.yurenia.passive.controller.Customer.CustomerDAOImpl;
import iot.yurenia.passive.controller.PrivateAccount.PrivateAccountDAOImpl;
import iot.yurenia.passive.controller.Product.ProductDAOImpl;
import iot.yurenia.passive.controller.Service.ServiceDAOImpl;
import iot.yurenia.passive.controller.Transaction.TransactionDAOImpl;
import iot.yurenia.passive.model.*;

import java.util.Scanner;

public class ViewMain {

    private static Bank bank;
    private static Business business;
    private static BusinessAccount ba;
    private static Country country;
    private static Currency currency;
    private static Customer customer;
    private static PrivateAccount pa;
    private static Product product;
    private static Service service;
    private static Transaction transaction;

    private static BankDAOImpl bankDAOImpl = new BankDAOImpl();
    private static BusinessDAOImpl businessDAOimpl = new BusinessDAOImpl();
    private static BusinessAccountDAOImpl businessAccountDAOimpl = new BusinessAccountDAOImpl();
    private static CountryDAOImpl countryDAOIpml = new CountryDAOImpl();
    private static CurrencyDAOImpl currencyDAOIpml = new CurrencyDAOImpl();
    private static PrivateAccountDAOImpl PADAOIpml = new PrivateAccountDAOImpl();
    private static CustomerDAOImpl customerDAOImpl = new CustomerDAOImpl();
    private static ProductDAOImpl productDAOIpml = new ProductDAOImpl();
    private static ServiceDAOImpl serviceDAOIpml = new ServiceDAOImpl();
    private static TransactionDAOImpl transactionDAOIpml = new TransactionDAOImpl();
    private static PrivateAccountDAOImpl paDAOImpl = new PrivateAccountDAOImpl();

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

    public void chooseTable() {
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                modifyBank();
                break;
            case 2:
                modifyBusiness();
                break;
            case 3:
                modifyBA();
                break;
            case 4:
                modifyCountry();
                break;
            case 5:
                modifyCurrency();
                break;
            case 6:
                modifyCustomer();
                break;
            case 7:
                modifyPA();
                break;
            case 8:
                modifyProduct();
                break;
            case 9:
                modifyService();
                break;
            case 10:
                modifyTransaction();
                break;

        }
    }

    public void modifyBank() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter country id: ");
                Integer countryId = new Scanner(System.in).nextInt();
                bank = new Bank(name, countryId);
                bankDAOImpl.insertBank(bank);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(bankDAOImpl.getBank(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                bankDAOImpl.getAllBanks();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter country id: ");
                countryId = new Scanner(System.in).nextInt();
                bank = new Bank(id, name, countryId);
                bankDAOImpl.updateBank(bank);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                bankDAOImpl.deleteBank(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public void modifyBusiness() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter service name: ");
                String service_name = new Scanner(System.in).nextLine();
                System.out.println("Enter email: ");
                String email = new Scanner(System.in).nextLine();
                business = new Business(name, service_name, email);
                businessDAOimpl.insertBusiness(business);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(businessDAOimpl.getBusiness(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                businessDAOimpl.getAllBusinesses();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter service name: ");
                String service_value = new Scanner(System.in).nextLine();
                System.out.println("Enter email: ");
                String email_value = new Scanner(System.in).nextLine();
                business = new Business(id, name, service_value, email_value);
                businessDAOimpl.updateBusiness(business);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                businessDAOimpl.deleteBusiness(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }
    public void modifyBA() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter owners's name: ");
                String ownerCompany = new Scanner(System.in).nextLine();
                System.out.println("Enter service name: ");
                Double balance = new Scanner(System.in).nextDouble();
                System.out.println("Enter business_id: ");
                Integer businessID = new Scanner(System.in).nextInt();
                System.out.println("Enter currency_id: ");
                Integer currencyID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction_id: ");
                Integer transactionID = new Scanner(System.in).nextInt();
                ba = new BusinessAccount(ownerCompany, balance, businessID, currencyID, transactionID);
                businessAccountDAOimpl.insertBA(ba);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(businessAccountDAOimpl.getBA(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                businessAccountDAOimpl.getAllBA();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter owner's name: ");
                ownerCompany = new Scanner(System.in).nextLine();
                System.out.println("Enter service name: ");
                balance = new Scanner(System.in).nextDouble();
                System.out.println("Enter business_id: ");
                businessID = new Scanner(System.in).nextInt();
                System.out.println("Enter currency_id: ");
                currencyID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction_id: ");
                transactionID = new Scanner(System.in).nextInt();
                ba = new BusinessAccount(id, ownerCompany, balance, businessID, currencyID, transactionID);
                businessAccountDAOimpl.updateBA(ba);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                businessAccountDAOimpl.deleteBA(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public void modifyCountry() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter tax: ");
                Integer tax = new Scanner(System.in).nextInt();
                country = new Country(name, tax);
                countryDAOIpml.insertCountry(country);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(countryDAOIpml.getCountry(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                countryDAOIpml.getAllCountries();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter tax: ");
                tax = new Scanner(System.in).nextInt();
                country = new Country(id, name, tax);
                countryDAOIpml.updateCountry(country);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                countryDAOIpml.deleteCountry(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public void modifyCurrency() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter tax: ");
                Integer transaction_id = new Scanner(System.in).nextInt();
                currency = new Currency(name, transaction_id);
                currencyDAOIpml.insertCurrency(currency);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(currencyDAOIpml.getCurrency(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                currencyDAOIpml.getAllCurrencies();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter transaction id: ");
                transaction_id = new Scanner(System.in).nextInt();
                currency = new Currency(id, name, transaction_id);
                currencyDAOIpml.updateCurrency(currency);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                currencyDAOIpml.deleteCurrency(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public void modifyCustomer() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter surname: ");
                String surname = new Scanner(System.in).nextLine();
                System.out.println("Enter phone number: ");
                Integer phoneNumber = new Scanner(System.in).nextInt();
                System.out.println("Enter email: ");
                String email = new Scanner(System.in).nextLine();
                System.out.println("Enter income: ");
                Double income = new Scanner(System.in).nextDouble();
                System.out.println("Enter country id: ");
                Integer country_id = new Scanner(System.in).nextInt();
                customer = new Customer(id, name, surname, phoneNumber, email, income, country_id);
                customerDAOImpl.insertCustomer(customer);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(currencyDAOIpml.getCurrency(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                customerDAOImpl.getAllCustomers();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter surname: ");
                surname = new Scanner(System.in).nextLine();
                System.out.println("Enter phone number: ");
                phoneNumber = new Scanner(System.in).nextInt();
                System.out.println("Enter email: ");
                email = new Scanner(System.in).nextLine();
                System.out.println("Enter income: ");
                income = new Scanner(System.in).nextDouble();
                System.out.println("Enter country id: ");
                country_id = new Scanner(System.in).nextInt();
                customer = new Customer(id, name, surname, phoneNumber, email, income, country_id);
                customerDAOImpl.updateCustomer(customer);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                customerDAOImpl.deleteCustomer(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }
    public void modifyPA() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter account number: ");
                Integer accountNumber = new Scanner(System.in).nextInt();
                System.out.println("Enter balance: ");
                Double balance = new Scanner(System.in).nextDouble();
                System.out.println("Enter name: ");
                String ownersName = new Scanner(System.in).nextLine();
                System.out.println("Enter currency: ");
                Integer currencyID = new Scanner(System.in).nextInt();
                System.out.println("Enter customer: ");
                Integer customerID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction: ");
                Integer transactionID = new Scanner(System.in).nextInt();
                pa = new PrivateAccount(id, accountNumber, balance, ownersName,
                        currencyID, customerID, transactionID);
                customerDAOImpl.insertCustomer(customer);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(currencyDAOIpml.getCurrency(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                customerDAOImpl.getAllCustomers();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.println("Enter account number: ");
                accountNumber = new Scanner(System.in).nextInt();
                System.out.println("Enter balance: ");
                balance = new Scanner(System.in).nextDouble();
                System.out.println("Enter name: ");
                ownersName = new Scanner(System.in).nextLine();
                System.out.println("Enter currency: ");
                currencyID = new Scanner(System.in).nextInt();
                System.out.println("Enter customer: ");
                customerID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction: ");
                transactionID = new Scanner(System.in).nextInt();
                pa = new PrivateAccount(id, accountNumber, balance, ownersName,
                        currencyID, customerID, transactionID);
                paDAOImpl.updatePA(pa);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                paDAOImpl.deletePA(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }
    public void modifyProduct() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter price: ");
                Double price = new Scanner(System.in).nextDouble();
                System.out.println("Enter quantity: ");
                Integer quantity = new Scanner(System.in).nextInt();
                System.out.println("Enter business id: ");
                Integer businessID = new Scanner(System.in).nextInt();
                product = new Product(id, name, price, quantity, businessID);
                productDAOIpml.insertProduct(product);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(productDAOIpml.getProduct(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                productDAOIpml.getAllProducts();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter price: ");
                price = new Scanner(System.in).nextDouble();
                System.out.println("Enter quantity: ");
                quantity = new Scanner(System.in).nextInt();
                System.out.println("Enter business id: ");
                businessID = new Scanner(System.in).nextInt();
                product = new Product(id, name, price, quantity, businessID);
                productDAOIpml.updateProduct(product);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                productDAOIpml.deleteProduct(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();

    }
    public void modifyService() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Enter price: ");
                Double price = new Scanner(System.in).nextDouble();
                System.out.println("Enter quantity: ");
                Integer quantity = new Scanner(System.in).nextInt();
                System.out.println("Enter business id: ");
                Integer businessID = new Scanner(System.in).nextInt();
                service = new Service(id, name, price, quantity, businessID);
                serviceDAOIpml.updateService(service);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(serviceDAOIpml.getService(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                serviceDAOIpml.getAllServices();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.println("Enter name: ");
                name = new Scanner(System.in).nextLine();
                System.out.println("Enter price: ");
                price = new Scanner(System.in).nextDouble();
                System.out.println("Enter quantity: ");
                quantity = new Scanner(System.in).nextInt();
                System.out.println("Enter business id: ");
                businessID = new Scanner(System.in).nextInt();
                service = new Service(id, name, price, quantity, businessID);
                serviceDAOIpml.updateService(service);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                serviceDAOIpml.deleteService(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public void modifyTransaction() {
        System.out.println("Choose your destiny: ");
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                System.out.println("OK, creating...");
                System.out.println("Enter ID: ");
                int id = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction info: ");
                String info = new Scanner(System.in).nextLine();
                System.out.println("Enter amount: ");
                Double amount = new Scanner(System.in).nextDouble();
                System.out.println("Enter business id: ");
                Integer businessID = new Scanner(System.in).nextInt();
                System.out.println("Enter private account id: ");
                Integer paID = new Scanner(System.in).nextInt();
                System.out.println("Enter bank id: ");
                Integer bankID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction code: ");
                String code = new Scanner(System.in).nextLine();
                transaction = new Transaction(id, info, amount, businessID, paID, bankID, code);
                transactionDAOIpml.insertTransaction(transaction);
                break;
            case 2:
                System.out.println("OK, getting...");
                System.out.println("Enter ID: ");
                int newId = new Scanner(System.in).nextInt();
                System.out.println(transactionDAOIpml.getTransaction(newId));
                break;
            case 3:
                System.out.println("OK, getting ALL");
                transactionDAOIpml.getAllTransactions();
                break;
            case 4:
                System.out.println("OK, updating...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction info: ");
                info = new Scanner(System.in).nextLine();
                System.out.println("Enter amount: ");
                amount = new Scanner(System.in).nextDouble();
                System.out.println("Enter business id: ");
                businessID = new Scanner(System.in).nextInt();
                System.out.println("Enter private account id: ");
                paID = new Scanner(System.in).nextInt();
                System.out.println("Enter bank id: ");
                bankID = new Scanner(System.in).nextInt();
                System.out.println("Enter transaction code: ");
                code = new Scanner(System.in).nextLine();
                transaction = new Transaction(id, info, amount, businessID, paID, bankID, code);
                transactionDAOIpml.updateTransaction(transaction);
                break;
            case 5:
                System.out.println("OK, deleting...");
                System.out.println("Enter ID: ");
                id = new Scanner(System.in).nextInt();
                transactionDAOIpml.deleteTransaction(id);
                break;
            default:
                System.out.println("Incorrect.");
        }
        workChecker();
    }

    public static void main(String[] args) {

    }
}
