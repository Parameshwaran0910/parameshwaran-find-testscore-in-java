import java.io.*;

class GradeCalculator
{
    public static void main(String[] args) throws IOException 
    {
        DataInputStream in = new DataInputStream(System.in);
        
        System.out.print("Enter your test score: ");
        int score = Integer.parseInt(in.readLine());
        
        if (score >= 0 && score <= 100)
        {
            String grade;
            
            if (score >= 90 && score <= 100)
            {
                grade = "A";
            }
            else if (score >= 80 && score <= 89)
            {
                grade = "B";
            }
            else if (score >= 70 && score <= 79)
            {
                grade = "C";
            }
            else if (score >= 60 && score <= 69)
            {
                grade = "D";
            }
            else if (score >= 50 && score <= 59)
            {
                grade = "E";
            }
            else
            {
                grade = "F";
            }
            
            System.out.println("Grade: " + grade);
        }
        else
        {
            System.out.println("Invalid test score!!! Please enter a score between 0 and 100.");
        }
    }
}