package newshelf;
import oldshelf.FictionType;

public class NewSelection {

	// TODO: Complete this method 
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		
		return switch(o){
			case Comic (String title,int age)->title;
			case Fiction (String name,FictionType fictionType)->name;	
			case TextBook (String subject)->subject;
			default -> "";
		};
	}

	public static void main(String[] args) {
		
		// TODO: Write a test code here and execute and text.
		TextBook t = new TextBook("Math");
		Comic c = new Comic("Superman", 30);
		Fiction f = new Fiction("Bridget Jones's Diary", FictionType.Comedy);
		System.out.println(NewSelection.getAgeOrTitle(t));
		System.out.println(NewSelection.getAgeOrTitle(c));
		System.out.println(NewSelection.getAgeOrTitle(f));
		
	}
}
