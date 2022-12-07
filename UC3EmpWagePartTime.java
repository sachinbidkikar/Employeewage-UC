package empwage;

public class UC3EmpWagePartTime {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20, FULL_TIME = 1, PART_TIME = 2;
        int workedHours = 0, dailyWage =0;

        double IsPresent =  Math.ceil(Math.random() *10) % 3 ; // %3 is used to get 3 random values
        if (IsPresent == FULL_TIME){
            workedHours = 8;
        } else if (IsPresent==PART_TIME) {
            workedHours = 4;
        } else{
            workedHours =0;
        }
        dailyWage = workedHours * WAGE_PER_HOUR;
        System.out.println("Daily Wage of Employee is : "  +dailyWage);
    }
}
