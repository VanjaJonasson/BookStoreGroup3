public class Customer {
    /*An entity class with one or more constructors together with necessary getters and setters.
    Maybe some convenience methods, like a nice looking output from toString().
    Attributes: CustomerId, FirstName, LastName, E-mail, Phone */

    int customerId;
    String firstName;
    String lastName;
    String email;
    String phone;

    public Customer(int customerId, String firstName, String lastName, String email, String phone) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Print out details about Customer
    public void customerInfo() {
        System.out.println("First name: " +this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("");
    }
}
