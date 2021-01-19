package doa;

import java.util.List;

import domain.Customer;

public interface CustomerDao {
    long saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();
}
