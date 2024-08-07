public class App {
    public static void main(String[] args) throws Exception {
        CustomerRepository customerRepository=new CustomerRepositoryImpl();
        CustomerService customerService=new CustomerService(customerRepository);
        Customer customer=customerService.getCustomerById(1);
        System.out.println("Customer ID : "+customer.getId());
        System.out.println("Customer Name : "+customer.getName());
    }
}
