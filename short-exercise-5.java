class OverallModuleGrade{
    public static int[] ask_grades (String[] grade, int[] student_grades)
{
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    for (int i = 0; i < 7; i ++ )
    {
        int input;
        while (true)            //while loop which validates that the input is an integer that won't return an error
        {
            System.out.println("How many " + grade[i] + " grades did you get? ");
            if (scanner.hasNextInt())
            {
                input = scanner.nextInt();
                if (input >= 0)
                {
                    student_grades[i] = input;
                    break;
                }
                else
                {
                    System.out.println("Input an integer between 1 and 7.");
                }
            }
            else
            {
                System.out.println("Input an integer between 1 and 7.");
                scanner.next();
            }
        }
        sum = sum + student_grades[i];
    }
    if (sum > 8)
    {
        System.out.println("Input all your grades(They should add up to 8).");
        ask_grades(grade, student_grades);
    }
    return student_grades;
}

public static int [] adding_grades(int [] grades){
    // loop through the grades array from the second position to the end of the array
    for (int i= 1; i < grades.length; i ++){
      // change the value in position i to value in position i + value in position i-1
      grades[i] = grades[i-1] + grades[i];
    }
  // return the manipulated array cumulative frequency array
  return grades;   
}

public static String grade_overall (int[] student_grades, String[] final_grade, String overall)
{
    if (student_grades[0] == 8)
    {
        overall = final_grade[0];
    }
    else if (student_grades[0] >= 7 && student_grades[1] == 8)
    {
        overall = final_grade[1];
    }
    else if (student_grades[0] >= 6 && student_grades[1] == 8)
    {
        overall = final_grade[2];
    }
    else if (student_grades[1] >= 6 && student_grades[2] == 8)
    {
        overall = final_grade[3];
    }
    else if (student_grades[2] >= 6 && student_grades[3] == 8)
    {
        overall = final_grade[4];
    }
    else if (student_grades[3] >= 6 && student_grades[4] == 8)
    {
        overall = final_grade[5];
    }
    else if (student_grades[4] >= 6 && student_grades[5] == 8)
    {
        overall = final_grade[6];
    }
    else if (student_grades[5] >= 6 && student_grades[6] == 8)
    {
        overall = final_grade[7];
    }
    else if (student_grades[6] == 8)
    {
        overall = final_grade[8];
    }
    else
    {
        overall = final_grade[9];
    }
    return overall;
}
public static void display_grade_overall (String overall)
{
    System.out.println("You consistently gained a " + overall + " grade or better.");
    System.out.println("Therefore you gained a " + overall + " grade overall.");
    return;
}
public static void main (String[] args)
{
    final String[] grade = {"A+", "A", "B", "C", "D", "F", "G"};
    final String[] final_grade = {"A*" ,"A++" , "A+", "A", "B", "C", "D", "F", "G", "Q"};
    int[] student_grades = new int[7];
    int input;
    String overall = ""; 
    student_grades = ask_grades(grade, student_grades);
    int [] added_grades = adding_grades (student_grades);
    overall = grade_overall(added_grades, final_grade, overall);
    display_grade_overall(overall);
}

}

