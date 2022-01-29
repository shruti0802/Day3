public class UC6 {
    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    public static final int EMP_RATE_PER_HR=20;
    public static final int Num_of_workingdays=2;
    public static final int Max_hrs_in_month=10;

    public static void main(String args[]){
        int emphrs=0, totalEmphrs=0, totalworkingdays=0;
        while(totalEmphrs<=Max_hrs_in_month && totalworkingdays<=Num_of_workingdays) {
            totalworkingdays++;
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
            totalEmphrs += emphrs;
            System.out.println("Day# " + totalworkingdays + " Emp Hr:" + emphrs);
        }
        int totalEmpwage = totalEmphrs* EMP_RATE_PER_HR;
        System.out.println("Employee Wages: " + totalEmpwage);
        }
    }
