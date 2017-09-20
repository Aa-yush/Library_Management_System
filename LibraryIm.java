import java.util.*;     // import util package to use scanner class
import java.io.*;      // import input-output package to use serializable class

public class LibraryIm implements LibraryCrud,Serializable {

	Librarian larr[] = new Librarian [5];
	Books barr[] = new Books [100];
	Student Sarr[] = new Student [10];
    Scanner sc = new Scanner ( System.in );
	int i = -1; 	// Initially assign larr index -1					
    int j = -1; 	// Initially assign barr index -1					
	int t = -1; 	// Initially assign Sarr index -1						
		
	public void addLibrarian ( Librarian l ) {
		
	try {
		if ( i > 4 )       // if index is greater than 4 it means Array Overflow
			System.out.println ( "Staff is Full" ) ;
		else {
			i++;          // increment by 1 
			larr[i] = l;  // assign Librarian object in array
		}
    }catch ( Exception e ) {        
		System.out.println ( e );   // Exceptional Handling
	}		
}
	
	public void viewLibrarian() {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
	
		try {
			
		/* Make an Librarian type of Array data which is null initialized */
			
		Librarian data[]=null;
		
		/* Make an object of ObjectInputStream to read data from File*/
		
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\LibrarianDB.txt"));
				
				data=(Librarian[])oi.readObject();
		
		
		if ( i==-1 ) 
            System.out.println ( "No Librarian Working" );
		for ( int x=0; x < data.length; x++ ) {
			System.out.println ( "Librarian Id is: " +larr[x].getLid() );
			System.out.println ( "Librarian Name is: " +larr[x].getLname() );
			System.out.println ( "Librarian Password is: " +larr[x].getLpass() );
			System.out.println ( "Librarian Address is: " +larr[x].getLadd() );
			System.out.println ( "Librarian City is: " +larr[x].getLcity() );
			System.out.println ( "Librarian Contact Number is: " +larr[x].getLcont() );
			System.out.println();	
		}
		} catch ( Exception e ) {
		System.out.println ( e );
	}		
	
}

	public void deleteLibrarian ( String lid ) {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
	try {
			
		/* Make an Librarian type of Array data which is null initialized */	
			
		Librarian data[]=null;
		
		/* Make an object of ObjectInputStream to read data from File*/
		
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\LibrarianDB.txt"));
				
				data=(Librarian[])oi.readObject();
				
	    if ( i == -1 )
		System.out.println ( "No Librarian Available to Delete" );
     	else{	
	        int x;		
		    for ( x=0; x <= data.length; x++) {
			if ( x == 0 && i == 0 ) {
			larr[x] = null;
				break;
			}
			else if ( larr[x].getLid().equals(lid) )
			do {
				larr[x] = larr[x+1];
				x++;
			   }while ( x <= i );
            }
    	--i;
	    }
	        } catch ( Exception e ) {
		    System.out.println ( e );
    }		
}

    public  boolean checkUser() {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
			try {
				
			/* Make an Librarian type of Array data which is null initialized */	
			
		Librarian data[]=null;
		
		/* Make an object of ObjectInputStream to read data from File*/
		
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\LibrarianDB.txt"));
				
				data=(Librarian[])oi.readObject();
				
		       sc.nextLine();
		       System.out.print ( "Enter the Librarian Id: " );
		       String u = sc.nextLine();			   
		       System.out.print ( "Enter password: ");
		       String p = sc.nextLine();
			   
			/*Checking condtion Librarian enter valid username and Password*/   
			   
               for ( int x=0; x<=data.length; x++)
		   	   if ( larr[x].getLid().equals(u) && larr[x].getLpass().equals(p)){
					return (true);
			   }
			
			} catch(Exception e){
				System.out.println(e);
				}		 
	
	return(false);	
}

	public void addBooks ( Books b ) {
	try {
	if( j > 99 )
		System.out.println ( "Books shelves is Full" );
	else {
         j++;
         barr[j] = b;	
	     }
	} catch ( Exception e ) {
		System.out.println ( e );
	    }
	FilewriteB();
}

    public void deleteBooks ( String bid ) {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
		try {
			
			/* Make an Books type of Array data which is null initialized */
			
			Books data[]=null;
			
			/* Make an object of ObjectInputStream to read data from File*/
			
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\BooksDB.txt"));
				
				data=(Books[])oi.readObject();
				
			
	    if( j == -1 )
		System.out.println ( "No Books Available to Delete" );
	else {
		int x;
		for ( x=0; x<data.length; x++ ) {
		if( x == 0 && j == 0 ) {
			barr[x] = null;
				break;
			}
		else if ( barr[x].getBid().equals(bid))
			do {
				barr[x] = barr[x+1];
				x++;
			   }while ( x <= j );
        }
		
    }
		    }catch ( Exception e ) {
		    System.out.println ( e );
        }	
			--j;
}

	public void viewBooks () {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
			try {
			
			/* Make an Books type of Array data which is null initialized */
			
			Books data[]=null;
			
			/* Make an object of ObjectInputStream to read data from File*/
			
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\BooksDB.txt"));
				
				data=(Books[])oi.readObject();
				
        if( j == -1 )
			System.out.println ( "No Books Available in Library" );
		for ( int x=0; x<=data.length; x++ ) {
			System.out.println ( "Book Id is: " +barr[x].getBid() );
			System.out.println( "Book Name is: " +barr[x].getBname() );
			System.out.println( "Book Author: " +barr[x].getAname() );
			System.out.println();	
		
     	}
	} catch ( Exception e ) {
		System.out.println ( e );
	}
}

	public void addStudent ( Student s ) {
	try {
    	if ( t > 9 )
			System.out.println ( " No Book to issue " ) ;
		else {
			t++;
			Sarr[t] = s;   // Store Student issue books 
		}
		}catch ( Exception e ) {
		System.out.println ( e );
	}		
}
	
	public void issueBooks ( String iid ) {
		try {			
			System.out.print ( "Enter Student Id: " );
			String i = sc.nextLine();
			System.out.print ( "Enter Student Name: " );
			String sname = sc.nextLine();
			System.out.print ( "Enter Student Contact Number: " );
			String sphn = sc.nextLine();
			Student stu = new Student ( iid, i, sname, sphn );
			addStudent ( stu );  // call addStudent function
			FilewriteS();     // Store Student details in File
			deleteBooks ( iid ); // Delete that Book which were Issued
			}catch ( Exception e ) {
		System.out.println ( e );
	}		
}
		
	public void viewIssuedBooks() {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
	try {	
	
			/* Make an Student type of Array data which is null initialized */
			
			Student data[] = null;
			
			/* Make an object of ObjectInputStream to read data from File*/
			
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\StudentDB.txt"));
				
				data=(Student[])oi.readObject();
				
		for ( int x=0; x<data.length; x++ ) {
			System.out.println ( "Book Id is: " +Sarr[x].getIid() );
			System.out.println( "Student Id is: " +Sarr[x].getSid() );
			System.out.println( "Student Name is: " +Sarr[x].getSname() );
			System.out.println( "Student Contact Number is: " +Sarr[x].getScont() );
			System.out.println();	
		}
	} catch ( Exception e ) {
		System.out.println ( e );
	}
}

	public void returnBook ( String sid ) {
		
		/* Make an try block to handle Exception Like FileNotFound Exception */
		
		try {	
		
		/* Make an Student type of Array data which is null initialized */
		
			Student data[] = null;
			
			/* Make an object of ObjectInputStream to read data from File*/
			
			ObjectInputStream oi=new ObjectInputStream(new FileInputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\StudentDB.txt"));
				
				data=(Student[])oi.readObject();
				
            if ( t == -1 )
			System.out.println ( "There is no issued Books" );
		    else {
				
				/*Delete From Issued books List*/
				
		            int x;	
					for ( x=0; x<data.length; x++){
					if( x == 0 && t == 0 ){
					Sarr[x] = null;
					break;
					}
			else if ( Sarr[x].getIid().equals(sid) )
			do {
				Sarr[x] = Sarr[x+1];
				x++;
			}while( x <= t );
		    }
		--t;
		}
	} catch ( Exception e ) {
		System.out.println ( e );
	    }		
	}
			
				public void FilewriteL(){
					
				try{
					
				ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\LibrarianDB.txt"));
				
				oo.writeObject(larr);
				
				}catch(Exception e){
					System.out.println(e);
					}
				
				}
				
				public void FilewriteB(){
					
				try{
					
				ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\BooksDB.txt"));
				
				oo.writeObject(barr);
				
				}catch(Exception e){
					System.out.println(e);
					}
				
				}
				
				public void FilewriteS(){
					
				try{
					
				ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("C:\\Users\\ayush\\Desktop\\Library_Management_System\\StudentDB.txt"));
				
				oo.writeObject(Sarr);
				
				}catch(Exception e){
					System.out.println(e);
					}
				
				}
}	
