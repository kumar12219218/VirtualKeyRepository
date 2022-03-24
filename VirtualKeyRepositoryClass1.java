package VirtualKeyRepository_Package;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;
public class VirtualKeyRepositoryClass1 {
	public static void main(String[] args) {
		while(true)
		{
			Scanner sc=new Scanner(System.in);
		try
		{
		//Creating main file to store all user details
		File file=new File("ProjectFile.txt");
		if(file.createNewFile())
		{
			//System.out.println("File is successfully created");
		}
		if(file.exists())
		{
			//System.out.println("File already exists");
			//System.out.println("path: "+file.getAbsolutePath());
		}
		//Using while loop to fetch all users and delete user if required repeatedly
		while(true) {
		System.out.println("Select one:\n1.Fetch all users\n2.No need to fetch\n3.Delete user");
		int f10=sc.nextInt();
		Scanner sc8=new Scanner(file);
		if(f10==1)
		{
			while(sc8.hasNextLine())
			{
				String data5=sc8.nextLine();
				String splitA[]=data5.split("@");
				System.out.println(splitA[0]);
				//System.out.println("Data"+data5);
			}
		}
		else if(f10==3)
		{
			while(true)
			{
				System.out.println("Select Any One option:\n1.Delete ALL users\n2.Delete specified User");
				int u=sc.nextInt();
				File f6=new File("ProjectFile.txt");
				List<String> l3=new ArrayList<String>();
				Scanner sc7=new Scanner(f6);
				if(u==1) {
					while(sc7.hasNextLine())
					{
						
						String data3=sc7.nextLine();
						String splitArray[]=data3.split("@");
						String dfile=splitArray[0]+".txt";
						//System.out.println("Dfile:"+dfile);
						System.out.println("The file to be deleted:"+dfile);
						File dFile1=new File("C:\\Users\\1TIN\\eclipse-workspace\\FirstProject_VirtualKeyRepository\\"+dfile);
						
						if(dFile1.delete())
						{
							System.out.println(dfile+" File was successfully deleted");
						}
						else
						{
							List<String> l22=new ArrayList<String>();
							FileWriter file44=new FileWriter(dFile1.getAbsolutePath());
							BufferedWriter b44=new BufferedWriter(file44);
							for(String s91:l22)
							{
								
								b44.write(s91);
								b44.write("\n");
							}
							b44.close();
							System.out.println(dfile+" file not deleted but data in the file was successfully deleted");
				
						}
					}
					FileWriter file4=new FileWriter(f6.getAbsolutePath());
					BufferedWriter b5=new BufferedWriter(file4);
					b5.write("");
					b5.close();
					break;}
				else if(u==2) {
					System.out.println("Enter the UserName to delete:");
					String UName=sc.next();
					
					while(sc7.hasNextLine())
					{
						String data3=sc7.nextLine();
						String splitArray[]=data3.split("@");
						if(!(splitArray[0].equals(UName)))
						{
							l3.add(data3);
						}
						else
						{
							String dfile=splitArray[0]+".txt";
							System.out.println("The file to be deleted:"+dfile);
							File dFile1=new File("C:\\Users\\1TIN\\eclipse-workspace\\FirstProject_VirtualKeyRepository\\"+dfile);
							
							if(dFile1.delete())
							{
								System.out.println(dfile+" File was successfully deleted");
							}
							else
							{
								List<String> l23=new ArrayList<String>();
								FileWriter file43=new FileWriter(dFile1.getAbsolutePath());
								BufferedWriter b43=new BufferedWriter(file43);
								for(String s92:l23)
								{
									
									b43.write(s92);
									b43.write("\n");
								}
								b43.close();
								System.out.println(dfile+" file not deleted but data in the file was successfully deleted");
							}
						}
						
					}
					
				}
				FileWriter file4=new FileWriter(f6.getAbsolutePath());
				BufferedWriter b5=new BufferedWriter(file4);
				for(String s10:l3)
				{
					
					b5.write(s10);
					b5.write("\n");
					
				}
				b5.close();
				System.out.println("Select one from below:\n1.Delete once again\n2.exit delete");
				int di=sc.nextInt();
				if(di==2)
				{
					break;
				}
			}
		}
		System.out.println("Select One:\n1.Start from Begin\n2.Continue the program");
		int n1=sc.nextInt();
		if(n1==2)
		{
			break;
		}
		}
		
		
		
		//**********************************
		
		//Asking the user whether to login or to register
		System.out.println("CLICK\n1.To Login\n2.To Register");
		int a=sc.nextInt();
		//If the user wants to login "if" block will execute
		if(a==1)
		{
			while(true)
			{
			int count=0;
			System.out.println("Enter username: ");
			String s2=sc.next();
			System.out.println("Enter your email");
			String s=sc.next();
			System.out.println("Enter your password");
			String s1=sc.next();
			Scanner sc1=new Scanner(file);
			while(sc1.hasNextLine())
			{
				String data=sc1.nextLine();
				String detailsArray[]=data.split(" ");
				if(detailsArray[0].equals(s) && detailsArray[1].equals(s1))
				{
					count+=1;
				}
			}
			//If the user enters correct credentials then count will increase and if block will execute
			if(count>0)
			{
				System.out.println();
				System.out.println("Login successfull");
				while(true)
				{
				System.out.println();
				System.out.println("Choose one option:");
				System.out.println("1.Fetch Creds\n2.Store Creds\n3.Delete Creds");
				int option=sc.nextInt();
				//try
				//{
				switch(option)
				{
				case 1:
					//Using "while" loop to repeat the fetch details of users creds if user wants to execute again
					while(true)
					{
					String userName1=s2+".txt";
					File f3=new File(userName1);
					Scanner sc3=new Scanner(f3);
					System.out.println("Select one:\n1.Fetch all\n2.Fetch Specific Cred");
					int c1=sc.nextInt();
					if(c1==1) {
					System.out.println("Total Creds present in the file are:\n ");
					while(sc3.hasNextLine())
					{
						String data1=sc3.nextLine();
						System.out.println(data1);
					}}
					else if(c1==2)
					{
						System.out.println("Enter the Website/Company name:\n");
						String w=sc.next();
						while(sc3.hasNextLine())
						{
							String data1=sc3.nextLine();
							String detailsArray1[]=data1.split(" ");
							if(detailsArray1[0].equals(w))
							{
								System.out.println(data1);
							}
						}
						
					}
					else
					{
						System.out.println("Enter correct choice");
					}
					System.out.println("Select one:\n1.Stop Fetching Details\n2.Fetch Details");
					int c2=sc.nextInt();
					if(c2==1)
					{
						break;
					}
					}
					break;
				case 2:
					//Using "while" loop to repeatedly add creds if user wants to add.
					while(true)
					{
					String userName2=s2+".txt";
					File f4=new File(userName2);
					Scanner sc4=new Scanner(f4);
					List<String> l1=new ArrayList<String>();
					while(sc4.hasNextLine())
					{
						String data1=sc4.nextLine();
						l1.add(data1);
					}
					FileWriter file3=new FileWriter(f4.getAbsolutePath());
					BufferedWriter b1=new BufferedWriter(file3);
					System.out.println("Enter the creds to store: ");
					System.out.println("enter the Website/Company name:");
					String s3=sc.next();
					System.out.println("Enter mail id");
					String s31=sc.next();
					System.out.println("Enter the password:");
					String s4=sc.next();
					String s5=s3+" "+s31+" "+s4;
					l1.add(s5);
					Collections.sort(l1);
					for(String s6:l1)
					{
						b1.write(s6);
						b1.write("\n");
					}
					b1.close();
					System.out.println("Select one:\n1.Stop Adding Cred\n2.Add One more Cred");
					int c=sc.nextInt();
					if(c==1)
					{
						break;
					}
					}
					break;
				case 3:
					//Using "while" loop to repeatedly perform delete operations if user wants to do.
					while(true)
					{
						System.out.println("Select Any One option:\n1.Delete Everything\n2.Delete specific Cred");
						int c4=sc.nextInt();
						System.out.println("Enter the File Name(UserName) to delete data:");
						String FName=sc.next();
						String userName3=FName+".txt";
						File f5=new File(userName3);
						Scanner sc5=new Scanner(f5);
						
						if(c4==1) {
							List<String> l2=new ArrayList<String>();
							FileWriter file4=new FileWriter(f5.getAbsolutePath());
							BufferedWriter b4=new BufferedWriter(file4);
							for(String s9:l2)
							{
								
								b4.write(s9);
								b4.write("\n");
							}
							b4.close();
							break;}
						else if(c4==2) {
							List<String> l2=new ArrayList<String>();
							System.out.println("Enter the Website/Company name to delete:");
							String deleteWebsite=sc.next();
							while(sc5.hasNextLine())
							{
								String data3=sc5.nextLine();
								String splitArray[]=data3.split(" ");
								if(!(splitArray[0].equals(deleteWebsite)))
								{
									l2.add(data3);
								}
								
							}
							FileWriter file4=new FileWriter(f5.getAbsolutePath());
							BufferedWriter b4=new BufferedWriter(file4);
							for(String s9:l2)
							{
								
								b4.write(s9);
								b4.write("\n");
							}
							b4.close();
							
						}
						
						
						
						System.out.println("Select one from below:\n1.Delete once again\n2.exit delete");
						int di=sc.nextInt();
						if(di==2)
						{
							break;
						}
					}
					break;
					default:
						System.out.println("Enter the correct option");
				}
				System.out.println("Select One:\n1.Do you want to perform operations one more time\n2.Exit operations");
				int op1=sc.nextInt();
				if(op1==2)
				{
					break;
				}
				}
			}
			else
			{
				System.out.println("no user found");
				System.out.println("Select one:\n1.Do you want to try again\n2.No need");
				int t=sc.nextInt();
				if(t==2)
				{
					break;
				}
			}
			if(count==1)
			{
				break;
			}
			}
			
		}
		else if(a==2)
		{
			//Using "while" loop to repeatedly add new users to file if users wants to add.
			while(true)
			{
			System.out.println("Please fill the listed details:");
			System.out.println("Enter your name:");
			String name=sc.next();
			System.out.println("Enter your mail");
			String mail1=sc.next();
			System.out.println("Enter your password: ");
			String password=sc.next();
			System.out.println("enter the number of credentials");
			int no=sc.nextInt();
			if(no>0)
			{
				String fileName=name+".txt";
				File file1=new File(fileName);
				if(file1.createNewFile())
				{
					
				}
				if(file1.exists())
				{
					Scanner sc6=new Scanner(file1);
					List<String> l2=new ArrayList<String>();
					while(sc6.hasNextLine())
					{
						String data1=sc6.nextLine();
						l2.add(data1);
					}
					FileWriter myWriter=new FileWriter(file1.getAbsolutePath());
					BufferedWriter b2=new BufferedWriter(myWriter);
					for(int i=0;i<no;i++)
					{
						System.out.println("Enter the number "+(i+1)+" details: ");
						System.out.println("enter the Website/Company name:");
						String s3=sc.next();
						System.out.println("Enter mail id");
						String s31=sc.next();
						System.out.println("Enter the password:");
						String s4=sc.next();
						String s5=s3+" "+s31+" "+s4;
						l2.add(s5);
						
					}
					Collections.sort(l2);
					for(String s7:l2)
					{
						
						b2.write(s7);
						b2.write("\n");
					}
					b2.close();
				}
				
			}
			
			
			if(file.createNewFile())
			{
				
			}
			if(file.exists())
			{
				Scanner sc7=new Scanner(file);
				List<String> l3=new ArrayList<String>();
				while(sc7.hasNextLine())
				{
					String data1=sc7.nextLine();
					l3.add(data1);
				}
				String s81=mail1 + " "+password;
				l3.add(s81);
				FileWriter myWriter1=new FileWriter(file.getAbsolutePath());
				BufferedWriter b3=new BufferedWriter(myWriter1);
				Collections.sort(l3);
				for(String s8:l3)
				{
					
					b3.write(s8);
					b3.write("\n");
				}
				b3.close();
				
			}
			
			
			
		System.out.println("Select one:\n1.Do you want to register one more\n2.Stop Registering");
		int s=sc.nextInt();
		if(s==2)
		{
			break;
		}
			}
		}
		
		}
		catch(Exception e)
		{
			
		}
		System.out.println("Select one:\n1.Exit the program\n2.Execute the program from Begining");
		int c4=sc.nextInt();
		if(c4==1)
		{
			System.out.println("Program Executed Successfully");
			break;
		}
		
		}
	}

}

