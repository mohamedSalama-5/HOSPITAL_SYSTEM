public class Doctor {

    String name;
    String gender;
    int age;
    String specialty;
    String section;
    String address;
    int id;
    int salary;
    String shift;
    String phone;
    String email;

    Doctor(String name ,String gender ,int age ,String specialty ,String section ,String address ,int id ,int salary ,String shift ,String phone ,String email)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.specialty = specialty;
        this.section = section;
        this.address = address;
        this.id = id;
        this.salary = salary;
        this.shift = shift;
        this.phone = phone;
        this.email = email;

    }

    //get functions
    public String getName()
    {
        return name;
    }
    public String getGender()
    {
        return gender;
    }
    public int getAge()
    {
        return age;
    }
    public String getSpecialty()
    {
        return specialty;
    }
    public String getSection()
    {
        return section;
    }
    public String getAddress()
    {
        return address;
    }
    public int getId()
    {
        return id;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getShift()
    {
        return shift;
    }
    public String getPhone()
    {
        return phone;
    }
    public String getEmail()
    {
        return email;
    }
    // end of get functions

    //start set functions
    public void setName(String name)
    {
        this.name = name;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }
    public void setSection(String section)
    {
        this.section=section;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    public void setShift(String shift)
    {
        this.shift = shift;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    //end of set functions


}
