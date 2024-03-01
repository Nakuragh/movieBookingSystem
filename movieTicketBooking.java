import java.util.*;
public class movieTicketBooking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to INOX");
		int a=0;
		int b=0;
		System.out.println("FOR BROWSING MOVIES PRESS 1");
		a=sc.nextInt();
		if(a==1)
		{
			System.out.println("Press 1 for RAID");
			System.out.println("Press 2 for PATHAAN");
			System.out.println("Press 3 for JAVAAN");
			System.out.println("Press 4 for 12th FAIL");
			System.out.println("Press 5 for SALAAR");
			System.out.println("Press 6 for KGF");
			b=sc.nextInt();
			switch(b) 
			{
			case 1 :
				System.out.println("Your Movie Is RAID");
				break;
			case 2 :
				System.out.println("Your Movie Is PATHAAN");
				break;
			case 3 :
				System.out.println("Your Movie Is JAVAAN");
				break;
			case 4 :
				System.out.println("Your Movie Is 12th FAIL");
				break;
			case 5 :
				System.out.println("Your Movie Is SALAAR");
				break;
			case 6 :
				System.out.println("Your Movie Is KGF");
				break;
			}
			System.out.println("PLEASE ENTER NUMBER OF SEATS YOU WANT TO BOOK");
			int seats=sc.nextInt();
			System.out.println("NUMBER OF SEATS TO BE BOOKED ARE "+seats);
			System.out.println("FOR SELECTING SEAT PRESS 1");
			int book=0;
			book=sc.nextInt();
			int[] arr=new int[seats];
			if(book==1)
			{
				System.out.println("SELECT THE ROW FROM A TO Z");
				char row=sc.next().charAt(0);
				System.out.println("YOUR ROW IS "+row);
				System.out.println("PLEASE SELECT YOUR SEAT NUMBERS FROM 1 TO 20");
				for(int i=0;i<seats;i++)
					arr[i]=sc.nextInt();
				System.out.println("YOUR SEAT NUMBERS ARE");
				for(int i=0;i<seats;i++)
					System.out.println("Seat Number "+arr[i]+" Row Number "+row);
				System.out.println("FOR CONFIRMATION OF YOU BOOKING PRESS 1");
				int confirm=sc.nextInt();
				if(confirm==1)
				{
					System.out.println("YOUR TICKETS ARE CONFIRMED :)");
					if(b==1)
						System.out.println("Your Movie Is RAID");
					else if(b==2)
						System.out.println("Your Movie Is PATHAAN");
					else if(b==3)
						System.out.println("Your Movie Is JAVAAN");
					else if(b==4)
						System.out.println("Your Movie Is 12th FAIL");
					else if(b==5)
						System.out.println("Your Movie Is SALAAR");
					else if(b==6)
						System.out.println("Your Movie Is KGF");
					System.out.println("AND YOUR SEAT AND ROW NUMBERS ARE");
					for(int i=0;i<seats;i++)
						System.out.println("Seat Number "+arr[i]+" Row Number "+row);
					System.out.println("Thank you");
				}
			}
		}
	}
}
