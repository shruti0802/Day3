public class UC5 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HR=20;
    public static final int Num_of_workingdays=20;
    public static void main(String args[]){
        int emphrs=0, empwage=0, totalEmpwage=0;
       for(int day=0; day<Num_of_workingdays;day++) {
           int empCehck = (int) Math.floor(Math.random() * 10) % 3;
           switch (empCehck) {
               case IS_PART_TIME:
                   emphrs = 4;
                   break;
               case IS_FULL_TIME:
                   emphrs = 8;
                   break;
               default:
                   emphrs = 0;
           }
           empwage = emphrs * EMP_RATE_PER_HR;
           totalEmpwage += empwage;
           System.out.println("Employee Wages: " + empwage);
       }
       System.out.println("Total Emp Wage:" +totalEmpwage);
    }
}
