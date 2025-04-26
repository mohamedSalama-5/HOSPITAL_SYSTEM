//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
public class Main {
    static File patients = new File("Patients.txt");//object to control the patient file
    static File doctors = new File("doctor.txt");//object to control the doctors file
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        boolean exit = false; // control program
        filePatient();
        fileDoctors();
        while (!exit)
        {
            String choice = choice();
            switch(choice)
            {
                case "add patient":
                    addPatient();
                    break;
                case "remove patient" :
                    removePatient();
                    break;
                case "view patients" :
                    viewAllPatients();
                    break;
                case "add doctor" :
                    addDoctor();
                    break;
                case "remove doctor" :
                    removeDoctor();
                    break;
                case "view doctors" :
                    viewAllDoctors();
                    break;
                default:
                    exit=true;
            }
        }
    }
    public static String choice()
    {
        String[] options = {"add patient", "remove patient", "view patients","add doctor","remove doctor","view doctors", "exit"};
        String choice = (String) JOptionPane.showInputDialog(null, "what do you want to do?", "hospital Management System  ", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        return choice;
    }

    public static void addPatient()
    {
        do{
            System.out.print("Enter patient name: ");
            String name=input.nextLine();
            System.out.print("enter the patient address: ");
            String address = input.nextLine();
            System.out.print("enter the patient gender:");
            String gender = input.nextLine();
            System.out.print("enter the patient phone number: ");
            String phone = input.nextLine();
            System.out.print("enter the patient age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("enter the patient bloodType: ");
            String bloodType = input.nextLine();
            System.out.print("enter the patient room: ");
            int room = input.nextInt();
            input.nextLine();
            System.out.print("enter the patient email: ");
            String email = input.nextLine();
            System.out.print("enter the patient medical history: ");
            String medicalHistory = input.nextLine();
            System.out.print("enter the doctor that in charge of the patient: ");
            String doctorInChargeOf = input.nextLine();
            Patient patient =new Patient( name, address, gender, phone, age, bloodType, room, email, medicalHistory, doctorInChargeOf);
            try
            {
                FileWriter patientWriter = new FileWriter( patients , true);
                patientWriter.write("\n"+
                        patient.getName()+" ,"
                        +patient.getAddress()+" ,"
                        +patient.getGender()+" ,"
                        +patient.getPhone()+" ,"
                        +patient.getAge()+" ,"
                        +patient.getBloodType()+" ,"
                        +patient.getRoom()+" ,"
                        +patient.getEmail()+" ,"
                        +patient.getMedicalHistory()+" ,"
                        +patient.getDoctorInChargeOf()
                );
                patientWriter.close();
            }catch (IOException error) {
                System.out.println(" error .");
                error.printStackTrace();
            }
            int theContinue = JOptionPane.showConfirmDialog(
                    null
                    ,"do you want to add another patient?"
                    , "choice"
                    , JOptionPane.YES_NO_OPTION);
            if (theContinue == JOptionPane.NO_OPTION)
            {
                break;
            }
        }while(true);
    }

    public static void removePatient()
    {
        do
        {
            System.out.print("Enter patient name: ");
            String name=input.nextLine();
            try
            {
                ArrayList<String> allPatients = new ArrayList<>();
                Scanner patientReader = new Scanner(patients);
                while(patientReader.hasNext())
                {
                    String line = patientReader.nextLine();
                    if(!line.startsWith(name+" ,"))
                    {
                        allPatients.add(line);
                    }
                }
                patientReader.close();
                FileWriter patientWriter = new FileWriter( patients , false);
                for(int i=0; i<allPatients.size();i++)
                {
                    patientWriter.write(allPatients.get(i)+"\n");
                }
                patientWriter.close();
            }catch (IOException error) {
                System.out.println(" error .");
                error.printStackTrace();
            }
            int theContinue = JOptionPane.showConfirmDialog(
                    null
                    ,"do you want to remove another patient?"
                    , "choice"
                    , JOptionPane.YES_NO_OPTION);
            if (theContinue == JOptionPane.NO_OPTION)
            {
                break;
            }
        }while(true);
    }

    public static void viewAllPatients()
    {
        do{

            try
            {
                Scanner patientReader = new Scanner(patients);
                while(patientReader.hasNextLine())
                {
                    String data = patientReader.nextLine();
                    System.out.println(data);
                }
                patientReader.close();
            }catch (FileNotFoundException error) {
                System.out.println(" error ");
                error.printStackTrace();
            }
            int theContinue= JOptionPane.showOptionDialog
                    (
                            null,
                            "tap to continue?",
                            "Choice",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            new Object[]{"Yes"},
                            "Yes"
                    );
            if(theContinue == 0) {
                break;
            }
        }while (true);
    }
    public static void addDoctor()
    {
        do{
            System.out.print("Enter doctor name: ");
            String name = input.nextLine();
            System.out.print("enter the doctor gender: ");
            String gender = input.nextLine();
            System.out.print("enter the doctor age: ");
            int age = input.nextInt();
            input.nextLine();
            System.out.print("enter the doctor speciality: ");
            String speciality = input.nextLine();
            System.out.print("enter the doctor section: ");
            String section = input.nextLine();
            System.out.print("enter the doctor address: ");
            String address = input.nextLine();
            System.out.print("enter the doctor ID: ");
            int id = input.nextInt();
            input.nextLine();
            System.out.print("enter the doctor salary: ");
            int salary = input.nextInt();
            input.nextLine();
            System.out.print("enter the doctor shift: ");
            String shift = input.nextLine();
            System.out.print("enter the doctor phone number: ");
            String phone = input.nextLine();
            System.out.print("enter the doctor email: ");
            String email = input.nextLine();
            Doctor doctor = new Doctor( name , gender , age , speciality , section , address , id , salary , shift , phone , email);
            try{
                FileWriter doctorWriter = new FileWriter(doctors,true);
                doctorWriter.write("\n"+
                        doctor.getName()+" ,"
                        +doctor.getGender()+" ,"
                        +doctor.getAge()+" ,"
                        +doctor.getSpecialty()+" ,"
                        +doctor.getSection()+" ,"
                        +doctor.getAddress()+" ,"
                        +doctor.getId()+" ,"
                        +doctor.getSalary()+" ,"
                        +doctor.getShift()+" ,"
                        +doctor.getPhone()+" ,"
                        +doctor.getEmail()
                );
                doctorWriter.close();
            }catch (IOException error) {
                System.out.println(" error .");
                error.printStackTrace();
            }
            int theContinue = JOptionPane.showConfirmDialog(
                    null
                    ,"do you want to add another doctor?"
                    , "choice"
                    , JOptionPane.YES_NO_OPTION);
            if (theContinue == JOptionPane.NO_OPTION)
            {
                break;
            }
        }while(true);
    }
    public static void removeDoctor()
    {
        do{
            System.out.print("Enter doctor name: ");
            String name = input.nextLine();

            try{
                ArrayList<String> allDoctors = new ArrayList<>();
                Scanner doctorReader = new Scanner(doctors);
                while(doctorReader.hasNextLine())
                {
                    String line = doctorReader.nextLine();
                    if(!line.startsWith(name+" ,"))
                    {
                        allDoctors.add(line);
                    }
                }
                doctorReader.close();
                FileWriter doctorWriter = new FileWriter( doctors , false);
                for(int i=0; i<allDoctors.size();i++)
                {
                    doctorWriter.write(allDoctors.get(i)+"\n");
                }
                doctorWriter.close();
            }catch(IOException error) {
                System.out.println(" error ");
                error.printStackTrace();
            }
            int theContinue = JOptionPane.showConfirmDialog(
                    null
                    ,"do you want to remove another doctor?"
                    , "choice"
                    , JOptionPane.YES_NO_OPTION);
            if (theContinue == JOptionPane.NO_OPTION)
            {
                break;
            }
        }while(true);
    }
    public static void viewAllDoctors()
    {
        do{
            try
            {
                Scanner doctorReader = new Scanner(doctors);
                while(doctorReader.hasNextLine())
                {
                    String data = doctorReader.nextLine();
                    System.out.println(data);
                }
                doctorReader.close();
            }catch (FileNotFoundException error) {
                System.out.println(" error ");
                error.printStackTrace();
            }
            int theContinue= JOptionPane.showOptionDialog
                    (null,
                            "tap continue?",
                            "Choice",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE,
                            null,
                            new Object[]{"Yes"},
                            "Yes"
                    );
            if(theContinue == 0) {
                break;
            }
        }while(true);
    }
    public static void filePatient()
    {

        //creat the patient file
        try {
            if(patients.createNewFile())
            {
                System.out.println("File created: " + patients.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException error)
        {
            System.out.println(" error ");
            error.printStackTrace();
        }
        //end of creation the patient file

    }
    public static void fileDoctors()
    {

        //creat the doctors file
        try {
            if(doctors.createNewFile())
            {
                System.out.println("File created: " + doctors.getName());
            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException error)
        {
            System.out.println(" error ");
            error.printStackTrace();
        }
        //end of creation the doctors file
    }
}

