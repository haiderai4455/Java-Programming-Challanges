public class Payrol {

    
    int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    int[] hours = new int[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];

   
    public void setEmployeeData(int index, int hoursWorked, double rate) {
        hours[index] = hoursWorked;
        payRate[index] = rate;
    }

    public void calculateWages() {
        for (int i = 0; i < 7; i++) {
            wages[i] = hours[i] * payRate[i];
        }
    }

    public double getWagesById(int empId) {
        for (int i = 0; i < 7; i++) {
            if (employeeId[i] == empId) {
                return wages[i];
            }
        }
        return -1; // Return -1 if the employee ID is not found
    }

   
    public void displayEmployeeData() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Employee ID: " + employeeId[i] +
                               " | Hours Worked: " + hours[i] +
                               " | Pay Rate: " + payRate[i] +
                               " | Wages: " + wages[i]);
        }
    }

    public static void main(String[] args) {
        Payrol payroll = new Payrol();

        // Set data for employees
        payroll.setEmployeeData(0, 40, 15.50);
        payroll.setEmployeeData(1, 35, 18.00);
        payroll.setEmployeeData(2, 45, 20.00);
        payroll.setEmployeeData(3, 38, 22.00);
        payroll.setEmployeeData(4, 30, 16.50);
        payroll.setEmployeeData(5, 40, 19.00);
        payroll.setEmployeeData(6, 50, 17.75);

        // Calculate the wages for all employees
        payroll.calculateWages();

        // Display employee data and wages
        payroll.displayEmployeeData();

        
        int empId = 7895122;
        double grossPay = payroll.getWagesById(empId);
        if (grossPay != -1) {
            System.out.println("The gross pay for Employee ID " + empId + " is: " + grossPay);
        } else {
            System.out.println("Employee ID " + empId + " not found.");
        }
    }
}
