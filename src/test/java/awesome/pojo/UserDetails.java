package awesome.pojo;

public class UserDetails {
    private String password;
    private String firstName;
    private String lastName;
    private String company;
    private String address;
    private String state;
    private String city;
    private String zipCode;
    private String mobileNumber;

    public UserDetails(String password, String firstName, String lastName,
                       String company, String address, String state,
                       String city, String zipCode, String mobileNumber) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
        this.mobileNumber = mobileNumber;
    }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password;}

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName;}

    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getCompany() { return company; }

    public void setCompany(String company) { this.company = company;}

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getState() { return state;}

    public void setState(String state) { this.state = state; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getZipCode() { return zipCode; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }

    public String getMobileNumber() { return mobileNumber; }

    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

}
