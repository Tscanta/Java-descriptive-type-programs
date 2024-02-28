package Descriptives;

//A program that implements a class namely Student with fields to store student's name and marks of 3 subjects.
class Student
{
    String name;//Student's name.
    double marks1,marks2,marks3;//marks in three subjects.
    Student(String theName,double m1,double m2,double m3)
    {
        //Constructor for student objects
        name=theName;
        marks1=m1;
        marks2=m2;
        marks3=m3;
    }
    String getName()
    {
        //method for reading the value of field name
        return name;
    }
    double getAverage()
    {
        return(marks1+marks2+marks3)/3;
    }
}//end of class Student