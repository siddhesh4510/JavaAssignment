import java.util.*;

public class FindDupsModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> modifiedSet = new TreeSet<String>(COMPARATOR_FOR_IGNORE_CASE);        

	    for (String a : args) {
	           modifiedSet.add(a);
	    }
	    System.out.println(modifiedSet.size() + " distinct and sorted words alphabetically by ignoring case: " + modifiedSet);
		
	}
	static final Comparator<String> COMPARATOR_FOR_IGNORE_CASE = new Comparator<String>() {
	    public int compare(String s1, String s2) {
	        return s1.compareToIgnoreCase(s2);
	    }
	};

}
