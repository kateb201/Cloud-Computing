package demo;

import java.util.List;

public interface CustomerService {

    CustomerBoundry createCustomer(CustomerBoundry user);

    CustomerBoundry login(String userSpace, String userEmail);

    CustomerBoundry updateCustomer(String userSpace, String userEmail, CustomerBoundry update);

    List<CustomerBoundry> getAllCustomers(String adminSpace, String adminEmail);

    void deleteAllCustomers(String adminSpace, String adminEmail);

}
