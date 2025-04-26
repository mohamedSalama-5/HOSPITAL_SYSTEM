public class Patient {

    static int patientNumberToday =0;
    String name;
    String address;
    String gender;
    String phone;
    int age;
    String bloodType;
    int room;
    String email;
    String medicalHistory;
    String doctorInChargeOf;
    int patientID;

    Patient(String name,String address,String gender,String phone,int age,String bloodType,int room,String email,String medicalHistory,String doctorInChargeOf)
    {
        this.name=name;
        this.address=address;
        this.gender=gender;
        this.phone=phone;
        this.age=age;
        this.bloodType=bloodType;
        this.room=room;
        this.email=email;
        this.medicalHistory=medicalHistory;
        this.doctorInChargeOf=doctorInChargeOf;
        patientNumberToday++;
        patientID=patientNumberToday;

    }
    //get functions
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getGender()
    {
        return gender;
    }
    public String getPhone()
    {
        return phone;
    }
    public int getAge()
    {
        return age;
    }
    public String getBloodType()
    {
        return bloodType;
    }
    public int getRoom()
    {
        return room;
    }
    public String getEmail()
    {
        return email;
    }
    public String getMedicalHistory()
    {
        return medicalHistory;
    }
    public String getDoctorInChargeOf()
    {
        return doctorInChargeOf;
    }
    public int getPatientID()
    {
        return patientID;
    }
    //end of get functions

    //set functions
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setGender(String gender)
    {
        this.gender=gender;
    }
    public void setPhone(String phone)
    {
        this.phone=phone;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setBloodType(String bloodType)
    {
        this.bloodType=bloodType;
    }
    public void setRoom(int room)
    {
        this.room=room;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public void setMedicalHistory(String medicalHistory)
    {
        this.medicalHistory=medicalHistory;
    }
    public void setDoctorInChargeOf(String doctorInChargeOf)
    {
        this.doctorInChargeOf=doctorInChargeOf;
    }
    //end of set functions


}
