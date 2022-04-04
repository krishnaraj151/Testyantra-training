package com.test.Mock;

import java.util.*;



public class Execution {
	
	public static  void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		int choice;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter the choice");
			System.out.println("1.addstudent\n2.editstudent\n3.deletestudent\n4.list of students\n5.getstudent\n6.sort\n7.exit");
			System.out.println("enter ur choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
		   System.out.println("enter the number of students");
		   int x=sc.nextInt();
		   for(int i=0;i<x;i++) {
			   System.out.println("enter the "+(i+1)+ "name?");
			   String name=sc.next();
    		   System.out.println("enter the "+(i+1)+ "id?");
    		   int id=sc.nextInt();
			   System.out.println("enter the "+(i+1)+ "marks?");
			   int marks=sc.nextInt();
			   System.out.println("enter the "+(i+1)+ "course?");
			   String course=sc.next();
			   Student s=new Student();
			   s.setName(name);
			   s.setId(id);
			   s.setMarks(marks);
			   s.setCourse(course);
			   arrayList.add(s);
			  }break;
			  
			case 2:
				System.out.println("enter the object index that u want to edit");
				while (true) {
					choice = sc.nextInt();
					if (choice >= arrayList.size()) {
						System.out.println("enter the valid index");
						continue;
					}
					System.out.println("enter the name,id,Mark, Course of the student");
				int	id = sc.nextInt();
				String	name = sc.next();
				int	marks = sc.nextInt();
				String	course = sc.next();
					arrayList.get(choice).setId(id);
					arrayList.get(choice).setName(name);
					arrayList.get(choice).setMarks(marks);
					arrayList.get(choice).setCourse(course);
					break;
				}
				break;
			case 3:System.out.println("Tell which id u want to delete:");
			while(true)
			{
				int i;
				choice=sc.nextInt();
				for( i=0;i<arrayList.size();i++)
				{
					if(arrayList.get(i).getId()==choice)
					{
						arrayList.remove(i);
						System.out.println("the id " + (i+1) + " is deleted");
						break;
					}
				
				
				if(i==arrayList.size()) {
					System.out.println("enter the valid id:");
				
				}
				}
			
				break;
			}
			break;
			
			
			
			case 4:  System.out.println(arrayList);
				break;
				
				
				
			case 5:System.out.println("enter the id");
				while(true)
				{
					int i;
					choice=sc.nextInt();
					for( i=0;i<arrayList.size();i++)
					{
						if(arrayList.get(i).getId()==choice)
						{
							System.out.println(arrayList.get(i));
							System.out.println("the id " + (i+1) + "is printed");
							break;
						}
					
					
					if(i==arrayList.size()) {
						System.out.println("enter the valid id:");
						
					}
					}
				
					break;
				}
				break;
				
			case 6:
			  System.out.println("enter the choice");
				System.out.println("1.sortbyid\n2.sortbyname\n3.sortbymarks\n4.sortbycourse");
				choice=sc.nextInt();
				switch(choice) {
				case 1:SortbyId sortbyid   =new SortbyId();
				Collections.sort(arrayList,sortbyid);
				case 2: SortbyName sortbyname   =new SortbyName();
				Collections.sort(arrayList,sortbyname);
				case 3: SortbyMarks sortbymarks   =new SortbyMarks();
				Collections.sort(arrayList,sortbymarks);
				case 4:SortbyCourse sortbycourse   =new SortbyCourse();
					Collections.sort(arrayList,sortbycourse);
				break;
				default : System.out.println("enter the proper option");
				}break;
				
				
			case 7:System.exit(1);
				break;
		    default :System.out.println("enter the proper option");
				continue;
			}
			}
			
		}
		
		
	}


