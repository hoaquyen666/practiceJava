package Bai1.Models;

public class Student {

    private static Student instance;
    public static Student getInstance()
    {
        if (instance == null)
        {
            instance = new Student();
        }
        return instance;
    }

    public Student(){ }
    public Student(int mssv, String name, double gpa)
    {
        this.MSSV = mssv;
        this.Name = name;
        this.GPA = gpa;
    }


    private Integer MSSV;
    public Integer getMSSV()
    {
        return MSSV;
    }
    public void setMSSV(Integer MSSV)
    {
        this.MSSV = MSSV;
    }

    private String Name;
    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }

    private double GPA;
    public double getGPA()
    {
        return GPA;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "MSSV: " + MSSV + " | Tên: " + Name + " | GPA: " + GPA;
    }
}
