import java.io.*;
public class UC2{
    public static void main(String args[])
    {
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HR=20;
        int emphrs=0;
        int empwage=0;
        double empCheck=Math.floor(Math.random () *10) %2;
        if(empCheck== IS_FULL_TIME)
            emphrs=8;
        else
            emphrs=0;
        empwage=emphrs*EMP_RATE_PER_HR;
        System.out.println("Emp Wage: " +empwage);
    }
}