package empwage;

public class UC2DailyEmpWage {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20, PRESENT = 1;
        int workedHours = 0, dailyWage =0;

        double IsPresent =  Math.ceil(Math.random() *10) % 2 ;
        if (IsPresent == PRESENT){
            workedHours = 8;
        }
        else{
            workedHours =0;
        }
        dailyWage = workedHours * WAGE_PER_HOUR;
        System.out.println("Daily Wage of Employee is : "  +dailyWage);
    }
}
