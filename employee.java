//Write a program, creating a class which contains a method that would print the
//        information (name, year of joining, salary, address) of three employees by creating a class
//named 'Employee'. The output should be as follows:

//        Name    Year of joining     Address
//        Robert   1994               64C- WallStreet
//        Sam      2000               68D- WallStreet
//        John     1999               26B- WallStreet

class employee{
    private final String name;
    private final String address;
    private final int year;
    public employee(String n, int y,String add)
    {
        name = n;
        year = y;
        address = add;
    }
    public String getName()
    {
        return name;
    }
    public int getYear()
    {
        return year;
    }
    public String getAddress()
    {
        return address;
    }
}

class Emp
{
    public static void main(String[] args)
    {
        employee e1 = new employee("Robert", 1994, "64C- WallsStreet");
        employee e2 = new employee("Sam", 2000, "68d- WallsStreet");
        employee e3 = new employee("John", 1999, "26B- WallsStreet");
        System.out.println("Name\tYear of joining\t\tAddress");
        System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+"\t"+e1.getAddress());
        System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+"\t"+e2.getAddress());
        System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+"\t"+e3.getAddress());
    }
}