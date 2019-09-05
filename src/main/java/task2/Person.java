package task2;

public class Person{
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected Integer birsday;
    protected String address;
    protected Integer phoneNumber;

    public Person(String firstName, String lastName, String middleName, Integer birsday, String address, Integer phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birsday = birsday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName
                + "\n" + lastName
                + "\n" + middleName
                + "\n" + birsday
                + "\n" + address
                + "\n" + phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getBirsday() {
        return birsday;
    }
}