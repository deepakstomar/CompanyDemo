public class EmployeeMain {
    public static void main(String[] args) {
        Address ronnieAddress = new Address(308, "Kolar Road", 400000, "Bhopal", "Madhya Pradesh", "India");
        Employee ronnie = new Employee("Ronnie", 101, 20, "01/01/1998", 50000, ronnieAddress);
    }
}