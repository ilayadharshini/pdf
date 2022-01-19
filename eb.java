import java.util.Scanner;
class elec_bill{
	public String con_no,con_name;
	public float pmr,cmr,s;
	void unit()
	{
		s=cmr-pmr;
	}
	void domestic()
	{
		if(s<=100)
			System.out.println("your bill is"+s*1);
		else if(s>=101 && s<=200)
			System.out.println("your bill is"+s*2.50);
		else if(s>=201 && s<=500)
			System.out.println("your bill is"+s*4);	
		else
			System.out.println("your bill is"+s*6);
	}
	void commerical()
	{
		if(s<=100)
			System.out.println("your bill is"+s*2);
		else if(s>=101 && s<=200)
			System.out.println("your bill is"+s*4.50);
		else if(s>=201 && s<=500)
			System.out.println("your bill is"+s*6);	
		else
			System.out.println("your bill is"+s*7);
	}
	void con_details()
	{

		System.out.println("Consumer number-"+con_no);
		System.out.println("Consumer name-"+con_name);
}
}


class eb{
public static void main(String args[]) {
	elec_bill bill=new elec_bill();
	int i;
	Scanner ch= new Scanner(System.in);
	System.out.println("enter the number:");
	bill.con_no=ch.nextLine();
	System.out.println("enter the name:");
	bill.con_name=ch.nextLine();
	System.out.println("enter the pre month reading:");
	bill.pmr=ch.nextFloat();
	System.out.println("enter the current month reading:");
	bill.cmr=ch.nextFloat();
	bill.con_details();
	bill.unit();
	  i=bill.con_no.length();
	if(i<=5)
		bill.domestic();
	else
		bill.commerical();
	
	
}
}

