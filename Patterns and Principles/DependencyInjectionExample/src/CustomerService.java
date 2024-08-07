public class CustomerService {
    CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    public Customer getCustomerById(int id){
        return customerRepository.findCustomerById(id);
    }
}
