package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String companyName = "BMW.com";
    private String Password;
    private int Passwordlength = 10;
    private String department;
    private int mailboxCapacity=500;
    private String alternateEmail;

    // Constructor to receive the first and last-name
    public Email (String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email created " + this.firstName + ", " + this.lastName);
        // Call method asking for department
        this.department = setDepartment();
        System.out.println("Department: "+this.department);
        // Call method that returns random password.
        this.Password = randompassword(Passwordlength);
        System.out.println("Your password is: "+ this.Password);
        // combine elements to generate email.
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "-" + companyName;
        //System.out.println("Your Emailadress is: "+ email);
    }
    // Ask the department
    private String setDepartment(){
        System.out.println("New worker: " + firstName + " " + lastName);
        System.out.println("Enter th code of your department!");
        System.out.print("The departments\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n");
        System.out.println("Enter the department:");
        Scanner in = new Scanner(System.in);
        int departtchoice = in.nextInt();
       switch (departtchoice){
           case 1:
           return "Sales";
           case 2:
           return "Development";
           case 3:
           return "Accounting";
           default:
               System.out.println("None");
       }

        return "";
    }
    // Generate a random password
    private String randompassword(int length){
        String Passwordset ="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!$%&?L'*+";
        char [] password = new char [length];
        for(int i=0; i<length;i++){
            int randompass= (int) (Math.random() * Passwordset.length());
            password [i] = Passwordset.charAt(randompass);

        }
        return new String(password);
    }
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;

    }
    // set alternate email
    public void setAlternateEmail(String  alternateEmail1){
        this.alternateEmail = alternateEmail1;
    }
    // change the password
    public void changePassword(String changepass){
        this.Password = changepass;
    }

    public int getMailboxCapacity (){
        return mailboxCapacity;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    public String getPassword(){
        return Password;
    }
    public String showInfo(){
        return "Name: " + firstName + " " + lastName + "\nCompanynemail: " + email + "\nMailboxcapacity: " + mailboxCapacity +"mb";
    }
}
