abstract public class Employee implements Payable {
  private String employeeId;
  private String name;

  public Employee(String employeeId, String name) {
    this.employeeId = employeeId;
    this.name = name;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAverageMonthlySalary() {
    return this.calculatePay();
  }

  abstract public double calculatePay();

  @Override
  public String toString() {
    return String.format("Name: %s, id: %s, salary: %.2f", this.name, this.employeeId, this.getAverageMonthlySalary());
  }
}
