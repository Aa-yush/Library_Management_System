
/*

- interface just specify the methods declaration (implicitly public and abstract)
  - its all member are by deafult public 
  
Make an interface and declare methods which we have to use in this project to implement

*/
public interface LibraryCrud {
		public void addLibrarian(Librarian l);
		public void viewLibrarian();
		public void deleteLibrarian(String lid);
		public  boolean checkUser();
		public void addBooks(Books b);
    	public void deleteBooks(String bid);
		public void viewBooks();
		public void addStudent(Student s);
		public void issueBooks(String bid);
		public void viewIssuedBooks();
		public void returnBook(String sid);
}