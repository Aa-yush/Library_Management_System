/* PROJECT:- Menu Based Project on "Library Management System" 
*
*
*
*
*
*
*   Author- Ayush Gupta
*   Contact No- 8745056594
*
*/



import java.util.*;    // import util package to use scanner class

/*

Make an Library Manager class which manages operation of LIBRARY_MANAGEMENT project

*/


public class LibraryManager {
	
	public static void main ( String[] args ) {
	LibraryIm li = new LibraryIm();            // object of LibraryIm class
	Scanner sc = new Scanner ( System.in );   // object of scanner class
    String ans = null;

	while( true ) {
		
		/*                Infinite Loop "For this menu"                 */

		
	System.out.println ( "MENU:- " );	
	System.out.println ( "1.Admin Login" );
    System.out.println ( "2.Librarian Login" );
	System.out.println ( "3.Exit" );
	System.out.print ( "Enter Your Choice: " );
	int ch = sc.nextInt();
	switch ( ch ){

		case 1:
			String str1 = "admin";     // assign admin as String in str1
			String str2 = "admin";     // assign admin as String in str2
			sc.nextLine();
			System.out.print ( "Enter Username: " );  // User Input Username
			String un=sc.nextLine();	
			System.out.print ( "Enter Password: " );  // User Input Password
			String ps=sc.nextLine();
			
		/*Checking condition username and password  */	
			
			if( (str1.equals(un))&&(str2.equals(ps)) ) {
				
		/*if condition true Than it pass into admin menu:-  */		
				
			do{
				System.out.println ( "Admin Menu:- " );
				System.out.println ( "1.Add Librarian" );
				System.out.println ( "2.View Librarian" );
				System.out.println ( "3.Delete Liabrarian " );
				System.out.print ( "Enter Your Choice:: " );
				int choice = sc.nextInt();
				switch( choice ) {

		        	case 1:sc.nextLine();
			        System.out.print ( "Enter LIbrarian Id: " );
				    String lid = sc.nextLine();
				    System.out.print ( "Enter LIbrarian Name: " );
				    String lname = sc.nextLine();
				    System.out.print ( "Enter LIbrarian Password: " );
				    String lpass = sc.nextLine();
				    System.out.print ( "Enter LIbrarian Address: " );
				    String ladd = sc.nextLine();
				    System.out.print ( "Enter LIbrarian City: " );
				    String lcity = sc.nextLine();
				    System.out.print ( "Enter LIbrarian Contact Number: " );
				    String lcont = sc.nextLine();
				    Librarian l = new Librarian(lid, lname, lpass, ladd, lcity, lcont );
				    li.addLibrarian(l);  // call addLibrarian with object 
					li.FilewriteL();     // write into file 
				    System.out.println ( "*****Addition Successfull*****" );   
				    break;

					case 2:System.out.println ( "Following Librarian Working: " );
			        li.viewLibrarian();  // call viewLibrarian function 
				    break;

					case 3:sc.nextLine();
			        System.out.print ( "Enter the Librarian Id: " );
				    String id = sc.nextLine();
				    li.deleteLibrarian(id);   // call deleteLibrarian function
				    System.out.println ( "*****Deletion Successfull*****" );
				    break;

					default:System.out.println ( "**Wrong Choice**" );	
					} 
        			sc.nextLine();
                    System.out.print ( "Do you want to Continue(y/n)" );
		         	ans = sc.nextLine();
			
					} while ( ans.equals("y") || ans.equals("Y") ); 
			 
					} 
					else{
						System.out.println("You Entered a Wrong Username and Password");
						}
                    break;
					
			case 2: boolean a = li.checkUser();
			   	if( a == true ){
				do {
				System.out.println ( "Liabrarian Menu: " );
				System.out.println ( "1.Add Books in Library" );
				System.out.println ( "2.View Books of Library" );
				System.out.println ( "3.Delete Book From Library" );
				System.out.println ( "4.Issue Book" );
				System.out.println ( "5.View Issued Books" );
				System.out.println ( "6.Return Book" );
				System.out.println ( "7.Exit" );
				System.out.print ( "Enter Your Choice:: " );
				int choice = sc.nextInt();
				switch ( choice ) {
					
						case 1: sc.nextLine();
					    System.out.print ( "Enter Book Id: " );
						String bid = sc.nextLine();
						System.out.print ( "Enter Book Name: " );
						String bname = sc.nextLine();
						System.out.print ( "Enter Book AuthorName: " );
						String aname = sc.nextLine();
						Books b = new Books(bid, bname, aname);
						li.addBooks( b );  // call addBooks function
						System.out.println ( "**Add Book Successfully**" );
					    break;
						  
					    case 2: System.out.println ( "\nFollowing Library Books Are:-\n" );
					    li.viewBooks();  // call viewBooks function
                        break;
						
					    case 3: sc.nextLine();
					    System.out.print ( "Enter BookId: " );
					    String dbi = sc.nextLine();
						li.deleteBooks( dbi );  // call deleteBooks function
						System.out.println ( "**Delete Book Successfully**" );
						break;
						
					    case 4: System.out.println ( "Enter Following Information:- " ) ;
					    sc.nextLine();
					    System.out.print ( "Enter BookId to Issue: " );
						String bd = sc.nextLine();
						li.issueBooks ( bd );  // call issueBooks function
						System.out.println ( " **Book Issued Successfully** " );
						break;
						   
					    case 5:System.out.println ( "Following Issued Books are: " );
					    li.viewIssuedBooks(); //call viewIssuedBooks function
						break;
						   
					    case 6:sc.nextLine();
					    System.out.print ( "Enter Student Id: " );
						String sid = sc.nextLine();
					    System.out.print ( "Enter Book Id: " );
						String rbid = sc.nextLine();						   
						System.out.print ( "Enter Book Name: " );
						String rbname = sc.nextLine();
						System.out.print ( "Enter Book AuthorName: " );
						String raname = sc.nextLine();
						Books b1 = new Books(rbid, rbname, raname); 
						li.addBooks( b1 );  // Add Book into Library again 
						li.returnBook( rbid ); // delete Book from Issued book
						
						System.out.println ( "**Return Successfully**" );
						break;
						
						case 7:System.exit(0);					
						default: System.out.println("**Wrong Choice**");
				    }   
                sc.nextLine();
			    System.out.print ( "Do you want to Continue(y/n)" ) ;
			    ans = sc.nextLine();
		     	} while( ans.equals("y") || ans.equals("Y") ); 			 
				}else{
			    System.out.println("Wrong Id and Password");
			    }
			    break;
			
			case 3:System.exit(0);
			
			default:System.out.println("**Wrong Choice**");
			}    
		}
	} 
} 