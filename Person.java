public class Person
{
    private String name;
    private String phone;

    public Person(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public String printName()
    {
        return name;
    }

    public String printPhone()
    {
        return phone;
    }

    public static void main(String[] args)
    {
        Person person = new Person("Anusuya","9361288032");
        System.out.println("Person Name is : " + person.printName());
        System.out.println("Phone Number is : " + person.printPhone());
    }
}
