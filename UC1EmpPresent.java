package empwage;

public class UC1EmpPresent {
    public static void main(String[] args) {
        int Present = 1;
        int IsPresent = (int) Math.ceil(( Math.random() * 10 ) % 2);
//        System.out.println(IsPresent); by using this we can check value of random function
        if (IsPresent==Present){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent ");
        }
    }
}
