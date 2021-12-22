package com.student.management;
import java.io.*;
public class studentm {

	public static void main(String[]args)throws Exception {
		System.out.println("Welcome To Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 to ADD student ");
			System.out.println("Press 2 to DELETE student ");
			System.out.println("Press 3 to display ");
			System.out.println("Press 4 to exit ");
			
			int c =Integer.parseInt(br.readLine());   // choice
			
			if(c==1) 
			{
				System.out.println("Enter Student Name");
				String name = br.readLine();
				
				System.out.println("Enter Student City");
				String city = br.readLine();
				
				System.out.println("Enter Student Phone");
				String phone = br.readLine();

				
				student stu = new student(name,city,phone);
				boolean ans = studentDao.insertStudentToDB(stu);
				
				// if data is added succesfully it returns yes
				if(ans) {
					System.out.println("Student is added Successfully");
					System.out.println(stu);
				}
				else {
					System.out.println("Something Went Wrong");
				}
			}
			
			else if(c==2) {
				System.out.println("Enter Student id to Delete ");
				int id =Integer.parseInt(br.readLine()) ;
				boolean ans = studentDao.delete(id);
				if(ans) {
					System.out.println("Student is deleted Successfully");
				}
				else {
					System.out.println("Something Went Wrong");
				}
			}
			
			else if(c==3) {
				studentDao.show();
			}
			
			else if(c==4) {
				break;
			}
	
			else {
				continue;
			}	
		}
		
		System.out.println("Thank You for using my application");
		
	}

}
