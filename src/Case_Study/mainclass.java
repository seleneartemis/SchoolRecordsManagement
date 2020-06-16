package Case_Study;

import java.util.ArrayList;
import java.util.Scanner;


public class mainclass {
	
	//TEACHER
	private ArrayList<Teacher> teacher_list;
	
	private ArrayList<Student> student_list;
	
	private static mainclass controller = new mainclass();
	
	static Scanner sc3 = new Scanner(System.in);
	
	public mainclass() {
		//goes to teacherdata method
		teacherdata();
		
		//goes to studentdata method
		studentdata();
	}
	
	private void teacherdata() {
		teacher_list = new ArrayList<Teacher>();
		   
		   Teacher teacher_01 = new Teacher();
		   //adds new information into teacher_01
		   teacher_01.setID("T01");
		   teacher_01.setFirstname("Jennie");
		   teacher_01.setLastname("Kim");
		   teacher_01.setGender("F");
		   teacher_01.setPhonenumber("09333333333");
		   teacher_01.setAddress("Seoul");
		   teacher_01.setDepartment("Business");
		   teacher_01.setDesignation("L");
		   teacher_01.setHours(16);
		   //adds teacher_01 to teacher_list
		   teacher_list.add(teacher_01);
		   
		   Teacher teacher_02 = new Teacher();
		   //adds new information into teacher_02
		   teacher_02.setID("T02");
		   teacher_02.setFirstname("Lisa");
		   teacher_02.setLastname("Manoban");
		   teacher_02.setGender("F");
		   teacher_02.setPhonenumber("09222222222");
		   teacher_02.setAddress("Bangkok");
		   teacher_02.setDepartment("Computing");
		   teacher_02.setDesignation("CO");
		   teacher_02.setHours(13);
		   //adds teacher_02 to teacher_list
		   teacher_list.add(teacher_02);
		   
		   Teacher teacher_03 = new Teacher();
		   //adds new information into teacher_03
		   teacher_03.setID("T03");
		   teacher_03.setFirstname("Rose");
		   teacher_03.setLastname("Park");
		   teacher_03.setGender("F");
		   teacher_03.setPhonenumber("09111111111");
		   teacher_03.setAddress("Auckland");
		   teacher_03.setDepartment("Business");
		   teacher_03.setDesignation("HOF");
		   teacher_03.setHours(18);
		   //adds teacher_01 to teacher_list
		   teacher_list.add(teacher_03);
		   
		   Teacher teacher_04 = new Teacher();
		   //adds new information into teacher_04
		   teacher_04.setID("T04");
		   teacher_04.setFirstname("Jisoo");
		   teacher_04.setLastname("Kim");
		   teacher_04.setGender("F");
		   teacher_04.setPhonenumber("09777777777");
		   teacher_04.setAddress("Auckland");
		   teacher_04.setDepartment("Computing");
		   teacher_04.setDesignation("CO");
		   teacher_04.setHours(15);
		   //adds teacher_04 to teacher_list
		   teacher_list.add(teacher_04);
		}
	
	// 1 ADD NEW TEACHER
	
	private void addTeacher() {
		System.out.println("****** ADD A NEW TEACHER *****");
		System.out.print("Employee ID: ");
		String ID = sc2.nextLine();
		System.out.print("First Name: ");
		String fname = sc2.nextLine();
		System.out.print("Last Name: ");
		String lname = sc2.nextLine();
		System.out.print("Gender [F/M]: ");
		String gender = sc2.nextLine();
		System.out.print("Phone Number: ");
		String phonenum = sc2.nextLine();
		System.out.print("Address: ");
		String address = sc2.nextLine();
		System.out.print("Department [Computing or Business]: ");
		String department = sc2.nextLine();
		System.out.print("Designation [HOF/CO/L]: ");
		String designation = sc2.nextLine();
		System.out.print("Teaching Hours: ");
		int hours = sc.nextInt();
		System.out.println(" ");
		
		Teacher teach = new Teacher();
		teach.setID(ID);
		teach.setFirstname(fname);
		teach.setLastname(lname);
		teach.setGender(gender);
		teach.setPhonenumber(phonenum);
		teach.setAddress(address);
		teach.setDepartment(department);
		teach.setDesignation(designation);
		teach.setHours(hours);
		//adds to student_list
		teacher_list.add(teach);	
	}
	
	// 2 UPDATE TEACHER
	private void updateTeacher() {
		
		System.out.println("***** UPDATING TEACHER INFORMATION *****");
		System.out.print("Input Student First Name: ");
		String fNameTeacher = sc2.nextLine();
		System.out.print("Input Student Last Name: ");
		String lNameTeacher = sc2.nextLine();
		System.out.println(" ");
			
		for ( int i = 0; i < teacher_list.size(); i++) {	
		if(teacher_list.get(i).getFirstname().equalsIgnoreCase(fNameTeacher) && teacher_list.get(i).getLastname().equalsIgnoreCase(lNameTeacher)) {
			
			//ASKS WHICH TO UPDATE	
				System.out.println("Which do you want to Update? ");
				 System.out.println("[1] ID");
	             System.out.println("[2] First Name");
	             System.out.println("[3] Last Name");
	             System.out.println("[4] Gender");
	             System.out.println("[5] Phone Number");
	             System.out.println("[6] Address");
	             System.out.println("[7] Department");
	             System.out.println("[8] Designation");
	             System.out.println("[9] Teaching Hours");
	             System.out.print("Input Number: ");
				int choice = sc.nextInt();
				System.out.println("");
				sc.nextLine();
				
				switch(choice) {
				case 1:
					System.out.print("Input new ID: ");
					String newID = sc.nextLine();
					teacher_list.get(i).setID(newID);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 2:
					System.out.print("Input new First Name: ");
					String newfName = sc.nextLine();
					teacher_list.get(i).setFirstname(newfName);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 3: 
					System.out.print("Input new Last Name: ");
					String newlName = sc.nextLine();
					teacher_list.get(i).setLastname(newlName);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 4: 
					System.out.print("Input new Gender: ");
					String gender = sc.nextLine();
					teacher_list.get(i).setGender(gender);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 5:
					System.out.print("Input new Phone Number: ");
					String phonenumber = sc.nextLine();
					teacher_list.get(i).setPhonenumber(phonenumber);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 6: 
					System.out.print("Input new Address: ");
					String address = sc.nextLine();
					teacher_list.get(i).setAddress(address);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				break;
				
				case 7:
					System.out.println("Input new Department[Business/Computing]: ");
					String department = sc.nextLine();
					teacher_list.get(i).setDepartment(department);

					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
					
					
					break;
				
				case 8:
					
					System.out.println("Input new Designation [HOF/CO/L]: ");
					String designation = sc.nextLine();
					teacher_list.get(i).setDepartment(designation);
					
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
				case 9:
					System.out.println("Input new Teaching Hours: ");
					String hours = sc.nextLine();
					teacher_list.get(i).setDepartment(hours);
					
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
							"\nGender: " + teacher_list.get(i).getGender() + "\nPhone Number: " + teacher_list.get(i).getPhonenumber() + 
							"\nAddress: " + teacher_list.get(i).getAddress() + "\nDepartment: " + teacher_list.get(i).getDepartment() +  "\nDesignation: " + teacher_list.get(i).getDesignation()
							+ "\nTeaching Hours: " + teacher_list.get(i).getHours());
					
				default:
					System.out.println("Invalid number. Try again.");
					updateStudent();
				}
				
			}	
		}
	}
		
		
	// 3 DELETE TEACHER
	private void deleteTeacher() {
		System.out.println("***** DELETE A TEACHER RECORD *****");
		System.out.print("Input Student First Name: ");
		String fNameTeacher= sc2.nextLine();
		System.out.print("Input Student Last Name: ");
		String lNameTeacher = sc2.nextLine();
		for ( int i = 0; i < teacher_list.size(); i++) {
					
			//LOOKS FOR THE STUDENT INSIDE THE LIST
			if(teacher_list.get(i).getFirstname().equalsIgnoreCase(fNameTeacher) && teacher_list.get(i).getLastname().equalsIgnoreCase(lNameTeacher)){
				teacher_list.remove(i);
			}
		}
		
	}
		
	// 4 CALCULATE SALARY OF TEACHER
	private void calculateSalary() {
		//DESIGNATIONS
				int hof = 8;
				int co = 13;
				int l = 18;
				
				double basesalary = 1200.00;
				int OT = 0; int OThours;		//OVERTIME
				double total = basesalary + OT;	//TOTAL SALARY
				double ha = 0.1; 		//HOUSING ALLOWANCE
				double ma = 0.03; 		//MEDICAL ALLOWANCE
				double ta = 0.05; 		//TRAVELLING ALLOWANCE
				
				double netsalary;
				
			System.out.println("***** CALCULATE TEACHER SALARY *****");
			System.out.print("Input Student First Name: ");
			String fNameTeacher = sc2.nextLine();
			System.out.print("Input Student Last Name: ");
			String lNameTeacher = sc2.nextLine();
			System.out.println(" ");
				
			for ( int i = 0; i < teacher_list.size(); i++) {	
			
			if(teacher_list.get(i).getFirstname().equalsIgnoreCase(fNameTeacher) && teacher_list.get(i).getLastname().equalsIgnoreCase(lNameTeacher)) {
				
				if (teacher_list.get(i).getDesignation().equalsIgnoreCase("HOF")) {
					System.out.println("Employee ID: " + teacher_list.get(i).getID());
					System.out.println("Name: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname());
					System.out.println("Designation:" + teacher_list.get(i).getDesignation());
					System.out.println("No. of Teaching Hours: " + teacher_list.get(i).getHours());
					
					OThours = teacher_list.get(i).getHours() - hof;
					OT = OThours * 325;
					System.out.println("Overtime: P" + OT);
					
					total = basesalary + OT;
					System.out.println("Total Salary: P" + (total) );
					
					ha = ha * total;
					ma = ma *total;
					ta = ta * total;
					netsalary = total + ha + ma + ta;
					System.out.println("Net Salary: " + netsalary);
					
					
				}else if (teacher_list.get(i).getDesignation().equalsIgnoreCase("CO")) {
					System.out.println("Employee ID: " + teacher_list.get(i).getID());
					System.out.println("Name: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname());
					System.out.println("Designation:" + teacher_list.get(i).getDesignation());
					System.out.println("No. of Teaching Hours: " + teacher_list.get(i).getHours());
					
					OThours = teacher_list.get(i).getHours() - co;
					OT = OThours * 325;
					System.out.println("Overtime: P" + OT);
					
					total = basesalary + OT;
					System.out.println("Total Salary: P" + (total) );
					
					ha = ha * total;
					ma = ma *total;
					ta = ta * total;
					netsalary = total + ha + ma + ta;
					System.out.println("Net Salary: " + netsalary);
					
				}else if (teacher_list.get(i).getDesignation().equalsIgnoreCase("L")) {
					System.out.println("Employee ID: " + teacher_list.get(i).getID());
					System.out.println("Name: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname());
					System.out.println("Designation:" + teacher_list.get(i).getDesignation());
					System.out.println("No. of Teaching Hours: " + teacher_list.get(i).getHours());
					
					OThours = teacher_list.get(i).getHours() - l;
					OT = OThours * 325;
					System.out.println("Overtime: P" + OT);
					
					total = basesalary + OT;
					System.out.println("Total Salary: P" + (total) );
					
					ha = ha * total;
					ma = ma *total;
					ta = ta * total;
					netsalary = total + ha + ma + ta;
					System.out.println("Net Salary: " + netsalary);
				}
			}
		}
	}
	
	// 5 DISPLAY ALL TEACHERS
		private void displayTeachers() {
			for ( int i = 0; i < teacher_list.size(); i++)
				System.out.println("ID:" + teacher_list.get(i).getID() + "\nName: " + teacher_list.get(i).getFirstname() + " " + teacher_list.get(i).getLastname() + 
									"\nDepartment: " + teacher_list.get(i).getDepartment() + "\nDesignation: " + teacher_list.get(i).getDesignation() + 
									"\nTeaching Hours: " + teacher_list.get(i).getHours() + "\n");
		}
	
	
	
	
	
	
	// S T U D E N T
	// S T U D E N T
	// S T U D E N T
	// S T U D E N T
	// S T U D E N T
	
	private void studentdata() {
		student_list = new ArrayList<Student>();
		   
		   Student student_01 = new Student();
		 //adds new information into teacher_03
		   student_01.setID("S01");
		   student_01.setFirstname("Gabriel");
		   student_01.setLastname("Cortez");
		   student_01.setGender("M");
		   student_01.setPhonenumber("09123456789");
		   student_01.setAddress("Taguig City");
		   student_01.setNumofMod(5);
		   student_01.setNumofRepMod(2);
		   student_01.setAmountpaid(50000.00);
		   student_01.setBalance(2735.00);
		 //adds student_01 to student_list
		   student_list.add(student_01);
		   
		   Student student_02 = new Student();
		 //adds new information into student_02
		   student_02.setID("S02");
		   student_02.setFirstname("Clark");
		   student_02.setLastname("Tolosa");
		   student_02.setGender("M");
		   student_02.setPhonenumber("09987654321");
		   student_02.setAddress("Makati City");
		   student_02.setNumofMod(4);
		   student_02.setNumofRepMod(0);
		   student_02.setAmountpaid(30000.00);
		   student_02.setBalance(2100.00);
		   
		 //adds student_02 to student_list
		   student_list.add(student_02);
		   
		   Student student_03 = new Student();
		 //adds new information into student_03
		   student_03.setID("S03");
		   student_03.setFirstname("John");
		   student_03.setLastname("Labay");
		   student_03.setGender("M");
		   student_03.setPhonenumber("09444444444");
		   student_03.setAddress("Quezon City");
		   student_03.setNumofMod(6);
		   student_03.setNumofRepMod(0);
		   student_03.setAmountpaid(0.00);
		   student_03.setBalance(53150.00);
		 //adds student_03 to student_list
		   student_list.add(student_03);
		   
		   
		   Student student_04 = new Student();
		 //adds new information into student_04
		   student_04.setID("S04");
		   student_04.setFirstname("Eiseen");
		   student_04.setLastname("Mantes");
		   student_04.setGender("M");
		   student_04.setPhonenumber("09555555555");
		   student_04.setAddress("Manila City");
		   student_04.setNumofMod(2);
		   student_04.setNumofRepMod(1);
		   student_04.setAmountpaid(21050.00);
		 //adds student_04 to student_list
		   student_list.add(student_04);
		}
	
	// 1 ADD TO LIST OF STUDENTS
	public void addStudent() {
		System.out.println("***** ADD A NEW STUDENT *****");
		System.out.print("ID: ");
		String ID = sc2.nextLine();
		System.out.print("First Name: ");
		String fname = sc2.nextLine();
		System.out.print("Last Name: ");
		String lname = sc2.nextLine();
		System.out.print("Gender(F/M): ");
		String gender = sc2.nextLine();
		System.out.print("Phone Number: ");
		String phonenum = sc2.nextLine();
		System.out.print("Address: ");
		String address = sc2.nextLine();
		System.out.print("Number of Modules: ");
		int numMod = sc.nextInt();
		System.out.print("Number of Repeated Modules: ");
		int numRepMod = sc2.nextInt();
		System.out.print("Amount Paid: ");
		int aPaid = sc.nextInt();
		System.out.println(" ");
		
		double feeRepMod = numRepMod * 110;
		double balance = feeRepMod + (numMod * 525);
		
			Student stud = new Student();
				stud.setID(ID);
				stud.setFirstname(fname);
				stud.setLastname(lname);
				stud.setGender(gender);
				stud.setPhonenumber(phonenum);
				stud.setAddress(address);
				stud.setNumofMod(numMod);
				stud.setNumofRepMod(numRepMod);
				stud.setAmountpaid(aPaid);
				stud.setBalance(balance);
			 //adds to student_list
			   student_list.add(stud);	
	}
	
	
	// 2 UPDATING STUDENT
	private void updateStudent() {
		System.out.println("***** UPDATING STUDENT INFORMATION *****");
		System.out.print("Input Student First Name: ");
		String fNameStudent = sc2.nextLine();
		System.out.print("Input Student Last Name: ");
		String lNameStudent = sc2.nextLine();
		System.out.println(" ");

		//LOOPS STUDENTS
		for ( int i = 0; i < student_list.size(); i++) {
			
			//LOOKS FOR THE STUDENT INSIDE THE LIST
			if(student_list.get(i).getFirstname().equalsIgnoreCase(fNameStudent) && student_list.get(i).getLastname().equalsIgnoreCase(lNameStudent)){
			
			//ASKS WHICH TO UPDATE	
				System.out.println("Which do you want to Update? ");
				 System.out.println("[1] ID");
	             System.out.println("[2] First Name");
	             System.out.println("[3] Last Name");
	             System.out.println("[4] Gender");
	             System.out.println("[5] Phone Number");
	             System.out.println("[6] Address");
	             System.out.print("Input Number: ");
				int choice = sc.nextInt();
				System.out.println("");
				sc.nextLine();
				
				switch(choice) {
				case 1:
					System.out.print("Input new ID: ");
					String newID = sc.nextLine();
					student_list.get(i).setID(newID);
				
					//PRINTS UPDATED ID
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
				break;
				
				case 2:
					System.out.print("Input new First Name: ");
					String newfName = sc.nextLine();
					student_list.get(i).setFirstname(newfName);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
				break;
				
				case 3: 
					System.out.print("Input new Last Name: ");
					String newlName = sc.nextLine();
					student_list.get(i).setLastname(newlName);
				
					//PRINTS UPDATED LAST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
				break;
				
				case 4: 
					System.out.print("Input new Gender: ");
					String gender = sc.nextLine();
					student_list.get(i).setGender(gender);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
				break;
				
				case 5:
					System.out.print("Input new Phone Number: ");
					String phonenumber = sc.nextLine();
					student_list.get(i).setPhonenumber(phonenumber);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
					
				break;
				
				case 6: 
					System.out.print("Input new Address: ");
					String address = sc.nextLine();
					student_list.get(i).setAddress(address);
				
					//PRINTS UPDATED FIRST NAME
					System.out.println("\nUpdated Record:");
					System.out.println("ID: " + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
							"\nGender: " + student_list.get(i).getGender() + "\nPhone Number: " + student_list.get(i).getPhonenumber() + 
							"\nAddress: " + student_list.get(i).getAddress() + "\n");
				break;
				
				default:
					System.out.println("Invalid number. Try again.");
					updateStudent();
				}
				
			}	
		}
	}
	
	
	// 3 DELETE STUDENT
	private void deleteStudent() {
		System.out.println("***** DELETE A STUDENT RECORD *****");
		System.out.print("Input Student First Name: ");
		String fNameStudent = sc2.nextLine();
		System.out.print("Input Student Last Name: ");
			String lNameStudent = sc2.nextLine();
		for ( int i = 0; i < student_list.size(); i++) {
					
			//LOOKS FOR THE STUDENT INSIDE THE LIST
			if(student_list.get(i).getFirstname().equalsIgnoreCase(fNameStudent) && student_list.get(i).getLastname().equalsIgnoreCase(lNameStudent)){
					student_list.remove(i);
			}
		}
	}
		
	
	// 4 SHOW REMAINING BALANCE
	private void remainBal() {
		System.out.println("***** SHOW ALL STUDENTS WITH REMAINING BALANCE *****");
		for ( int i = 0; i < student_list.size(); i++) {
			if(student_list.get(i).getAmountpaid() == 0.00){
			System.out.println("ID:" + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + 
								student_list.get(i).getLastname() + "\nNumber of Modules: " + student_list.get(i).
								getNumofMod() + "\nNumber of Repeated Modules: " + student_list.get(i).getNumofRepMod() + 
								"\nBalance: " + student_list.get(i).getBalance());
			}
		}
	}
	
	
	// 5 FEE DEPOSIT
		private void feeDeposit() {
			System.out.println("***** FEE DEPOSIT *****");
			System.out.print("Input Student First Name: ");
			String fNameStudent = sc2.nextLine();
			System.out.print("Input Student Last Name: ");
			String lNameStudent = sc2.nextLine();
			int newpaid;
			//LOOPS STUDENTS
			for ( int i = 0; i < student_list.size(); i++) {
				
				//LOOKS FOR THE STUDENT INSIDE THE LIST
				if(student_list.get(i).getFirstname().equalsIgnoreCase(fNameStudent) && student_list.get(i).getLastname().equalsIgnoreCase(lNameStudent)){
				
				//ASKS HOW MUCH TO DEPOSIT	
				System.out.print("How much amount do you want to deposit?: ");
				double deposit = sc.nextInt();
				
				//ADDS THE AMOUNT OF DEPOSIT INTO THE STUDENT'S AMOUNT PAID
				student_list.get(i).setAmountpaid(student_list.get(i).getAmountpaid() + deposit);
				student_list.get(i).setBalance(student_list.get(i).getBalance() - deposit);
				
				//PRINTS UPDATED RECORD OF AMOUNT PAID
				System.out.println("\nUpdated Record:");
				System.out.println("ID:" + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + student_list.get(i).getLastname() + 
						"\nNumber of Modules: " + student_list.get(i).getNumofMod() + "\nNumber of Repeated Modules: " + student_list.get(i).getNumofRepMod() + 
						"\nAmount Paid: " + student_list.get(i).getAmountpaid() + "\nBalance: " + student_list.get(i).getBalance()+"\n" );
				System.out.println(" ");
				} else 
					System.out.println("Invalid name of student. Try again.");
				
			}
		}
	
	
	// 6 DISPLAYING STUDENT WITH ZERO BALANCE
	private void displayStudentsZeroBal() {
		System.out.println("***** SHOW ALL STUDENTS WITH ZERO BALANCE *****");
		for ( int i = 0; i < student_list.size(); i++) {
			if(student_list.get(i).getBalance() == 0.00){
			System.out.println("ID:" + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + 
						student_list.get(i).getLastname() + "\nNumber of Modules: " + student_list.get(i).
						getNumofMod() + "\nNumber of Repeated Modules: " + student_list.get(i).getNumofRepMod() + 
						"\nAmount Paid: " + student_list.get(i).getAmountpaid() + "\nBalance: " + student_list.get(i).getBalance() +"\n");
			}
		}
	}
	
	
	// 7 DISPLAYING STUDENT WITH BALANCE
	private void displayStudentsBal() {
		//LOOPS STUDENTS
		System.out.println("***** SHOW ALL STUDENTS WITH NON-ZERO BALANCE *****");
		for ( int i = 0; i < student_list.size(); i++)
			//LOOKS FOR STUDENT INSIDE THE LIST
			if(student_list.get(i).getBalance() > 0.00){
			System.out.println("ID:" + student_list.get(i).getID() + "\nName: " + student_list.get(i).getFirstname() + " " + 
								student_list.get(i).getLastname() + "\nNumber of Modules: " + student_list.get(i).
								getNumofMod() + "\nNumber of Repeated Modules: " + student_list.get(i).getNumofRepMod() + 
								"\nAmount Paid: " + student_list.get(i).getAmountpaid() + "\nBalance: " + student_list.get(i).getBalance()+"\n");
			}
	}
	
	

	
	
	//MAIN METHOD
	
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		mainmenu();
		
	}
		
	public static void mainmenu() {
		System.out.println("------ WELCOME TO TEJUCO COLLEGE ------");
		System.out.println("Choose which to manage: [1] Teacher ; [2] Student");
		
		System.out.print("Input number: ");
		int answer = sc.nextInt();
		System.out.println(" ");
		
		switch(answer) {
			
		case 1:
			teachermenu();
			break;
			
		case 2:
			studentmenu();
			break;
		
		default:
			System.out.println("Invalid Input. Try again.");
			mainmenu();
		}
		
	}
	
	
	
	public static void teachermenu() {
		
		System.out.println("---- TEACHER MENU ----");
		System.out.println("[1] Add new Teacher");
		System.out.println("[2] Update Teacher");
		System.out.println("[3] Delete Teacher");
		System.out.println("[4] Calculate Salary of a Teacher");
		System.out.println("[5] Show all Teachers");
		System.out.println("[6] Back to Main Menu");
		System.out.print("Input which number: ");
		int tAns = sc.nextInt();
		System.out.println(" ");
		
		switch (tAns) {
		case 1:
			try {
				controller.addTeacher();
				System.out.println("--- Teacher Successfully Registered! ---");
				
				}catch(Exception e) {
				System.out.println("Try again.");
				}
			
				System.out.println(" ");
				
				System.out.println("Do you want to return to Teacher Menu? [Y/Yes/N/No]");
			
				String ans = sc3.nextLine().toLowerCase();
				
					if(ans.equals("yes") || ans.equals("y")) {
						System.out.println(" ");
						teachermenu();
					} else 
						System.out.println("Thank you for using our program!");	
			break;
		
		case 2:
			try {
				controller.updateTeacher();
				
				}catch(Exception e) {
					System.out.println("Try again.");
				}
				
				System.out.println(" ");
				
				System.out.println("Do you want to return to Teacher Menu? [Y/Yes/N/No]");
			
				 ans = sc3.nextLine().toLowerCase();
				
					if(ans.equals("yes") || ans.equals("y")) {
						System.out.println(" ");
						teachermenu();
					} else 
						System.out.println("Thank you for using our program!");	
				
			break;
			
		case 3:
			try {
				controller.deleteTeacher();
				System.out.println(" ");
				System.out.println("--- Teacher Successfully Deleted! ---");
				
				}catch(Exception e) {
					System.out.println("Try again.");
				}
				
				System.out.println(" ");
				
				System.out.println("Do you want to return to Teacher Menu? [Y/Yes/N/No]");
			
				 ans = sc3.nextLine().toLowerCase();
				
					if(ans.equals("yes") || ans.equals("y")) {
						System.out.println(" ");
						teachermenu();
					} else 
						System.out.println("Thank you for using our program!");	
			break;
		
		case 4: 
			try {
				controller.calculateSalary();
				}catch(Exception e) {
					System.out.println("Try again. You must've input a non-existant data.");
				}
				
				System.out.println(" ");
				
				System.out.println("Do you want to return to Teacher Menu? [Y/Yes/N/No]");
			
				 ans = sc3.nextLine().toLowerCase();
				
					if(ans.equals("yes") || ans.equals("y")) {
						System.out.println(" ");
						teachermenu();
					} else 
						System.out.println("Thank you for using our program!");
			break;
			
		case 5:
			
				controller.displayTeachers();
				
				System.out.println(" ");
				
				System.out.println("Do you want to return to Teacher Menu? [Y/Yes/N/No]");
			
				 ans = sc3.nextLine().toLowerCase();
				
					if(ans.equals("yes") || ans.equals("y")) {
						System.out.println(" ");
						teachermenu();
					} else 
						System.out.println("Thank you for using our program!");
			break;
			
		case 6:
			mainmenu();
			System.out.println(" ");
			break;
			
		default:
			System.out.println("Invalid input");
			teachermenu();
			
		}
	}
	
	
	public static void studentmenu() {
		
		
		
		System.out.println("---- STUDENT MENU ----");
		System.out.println("[1] Add new Student");
		System.out.println("[2] Update Student");
		System.out.println("[3] Delete Student");
		System.out.println("[4] Show remaining balance");
		System.out.println("[5] Fee Deposit");
		System.out.println("[6] Display all students with zero balance");
		System.out.println("[7] Display all students with balance");
		System.out.println("[8] Back to Main Menu");
		System.out.print("Input which number: ");
		int sAns = sc.nextInt();
		System.out.println(" ");
		
		switch (sAns) {
		case 1:
			try {
			controller.addStudent();
			System.out.println("--- Student Successfully Registered! ---");
			
			}catch(Exception e) {
			System.out.println("Try again.");
			}

			
			System.out.println(" ");
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
		
			String ans = sc3.nextLine().toLowerCase();
			
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else 
					System.out.println("Thank you for using our program!");	
				
			
			break;
			
		case 2:
			controller.updateStudent();
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
			
			ans = sc2.nextLine().toLowerCase();
			
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else {
					System.out.println("Thank you for using our program!");
			}
			break;
			
		case 3:
			controller.deleteStudent();
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
			
			 ans = sc2.nextLine().toLowerCase();
			
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else {
					System.out.println("Thank you for using our program!");
			}
				
			break;
			
		case 4:
			controller.remainBal();
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
						
				ans = sc2.nextLine().toLowerCase();
						
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else {
					System.out.println("Thank you for using our program!");
			}	
			
			break;
		
		case 5:
			//FEE DEPOSIT
			controller.feeDeposit();
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
			
			ans = sc2.nextLine().toLowerCase();
			
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else {
					System.out.println("Thank you for using our program!");
			}
			break;
		
		case 6:
			//DISPLAYING STUDENTS WITH ZERO BALANCE
			controller.displayStudentsZeroBal();
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
			ans = sc2.nextLine().toLowerCase();
		
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else {
					System.out.println("Thank you for using our program!");
					
				}
			
			break;
			
		case 7:
			//DISPLAYING STUDENTS WITH BALANCE
			controller.displayStudentsBal();
			
			
			System.out.println("Do you want to return to Student Menu? [Y/Yes/N/No]");
			
			ans = sc3.nextLine().toLowerCase();
			
				if(ans.equals("yes") || ans.equals("y")) {
					System.out.println(" ");
					studentmenu();
				} else 
					System.out.println("Thank you for using our program!");	
			break;
		
		case 8:
			System.out.println(" ");
			mainmenu();
			break;
			
		default:
			System.out.println("Invalid Input. Try Again.");
			studentmenu();
			
		}
		
	}
	

}
