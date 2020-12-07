public class SalariedEmployee extends Employee {
  // TODO fix class declaration and declare variables here
  private String socialSecurityNumber;
  private double fixedMonthlyPayment;

  public SalariedEmployee(String employeeId, String name, String socialSecurityNumber) {
    // TODO fill in code here
    super(employeeId, name);
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getSocialSecurityNumber() {
    return this.socialSecurityNumber;
  }

  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public double getFixedMonthlyPayment() {
    return this.fixedMonthlyPayment;
  }

  public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
    this.fixedMonthlyPayment = fixedMonthlyPayment;
  }

  @Override
  public double calculatePay() {
    return this.fixedMonthlyPayment;
  }

}
