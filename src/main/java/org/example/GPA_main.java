package org.example;

import java.util.Scanner;

/*Design a class for a student at a school. The class should have the following features:
        - Instance variables for the student's name, grade level, and GPA.
        - A constructor that allows the user to create a student with a given name, grade level, and GPA.
        - A method that allows the user to update the student's GPA.
        - A method that returns the student's name and GPA as a string (e.g. ""John Doe has a 3.5 GPA"")."*/
public class GPA_main {
    public static void main(String [] args)
    {
        Scanner bn=new Scanner(System.in);
        System.out.println("enter the student name:");
        String name=bn.next();
        System.out.println("enter the student grade:");
        String grade=bn.next();
        gpa o=new gpa(name);
        o.gpa_cal(grade);

        System.out.println(o.disp_gpa());
        o.gpa_update();
    }
}

class gpa{
    String name;


    int dec,gpa=0;
    public gpa(String name) {
        this.name = name;
    }


    public void gpa_cal(String grade){


        switch (grade) {
            case "A":
                dec = 4;
                gpa += dec;

                break;
            case "B":
                dec = 3;
                gpa+= dec;

                break;
            case "C":
                dec = 2;
                gpa+= dec;

                break;
            case "D":
                dec = 1;
                gpa+= dec;

                break;
            case "F":
                dec = 0;
                gpa= dec;
                break;
            default:

                throw new IllegalStateException("Unexpected value: ");
        }



    }
    public String disp_gpa()
    {
        return name+" has "+gpa+" gpa ";
    }
    public void  gpa_update()
    {
        Scanner  bn= new Scanner(System.in);
        System.out.println("do you need to update gpa(yes/no)");
        String des=bn.next();
        if(des.equals("yes"))
        {
            gpa=0;
            System.out.println("enter the student grade:");
            String grade=bn.next();
            gpa_cal(grade);
            System.out.println( disp_gpa());
        }
    }

}