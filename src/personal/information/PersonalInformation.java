package personal.information;

import java.util.Scanner;

public class PersonalInformation {

    String FirstName;
    String LastName;
    String sex;
    int age;
    String MaritialStatus;
    String AcadamicStatus;
    String email;

    public void SetpersonalInfo() {
        System.out.println("insert info \n");
        Scanner sn = new Scanner(System.in);
        FirstName = sn.next();
        LastName = sn.next();
        sex = sn.next();
        age = sn.nextInt();
        email=sn.next();

    }

    public void DisplaypersonalInfo() {
        System.out.println("here is the info");
        System.out.println("Fname" + " " + FirstName);
        System.out.println("Lname" + " " + LastName);
        System.out.println("sex" + " " + sex);
        System.out.println("age" + " " + age);
             System.out.println("email"+" "+email);

    }

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        PersonalInformation pi = new PersonalInformation();
        pi.SetpersonalInfo();
        pi.DisplaypersonalInfo();

    }

}
