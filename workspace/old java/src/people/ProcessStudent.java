package people;

public class ProcessStudent {
/*The class processStudents shall store at least 10 student objects to an array. 
 * When the user is querried for a student id, the array should be searched for the 
 * appropriate student record and displayed to console.

When the user enters -1, or any other similar number, 
the user shall not be querried anymore, and the final step should be displaying the 
entire set of student objects to console.

If a student id does not exist than state "Student Record not found."
*/
	
	
	public ProcessStudent(){
		
	}
	public static void ProcessStudent(int _id){
		int id = _id;
		int i = 0;
		int current = 0;
		//for loop that checks each object in the array for the id number.
		for (i = 0; i < Main.ary.length; i++){
			Main.ary[i].ID = current;
			if (current == id){
				Main.ary[i].Puts();
			}
		}
	}
	
/*	public static void puts(int s){
		System.out.print(Main.ary[s].FN + Main.ary[s].LN + Main.ary[s].ID + Main.ary[s].DOB + Main.ary[s].GPA);
		//System.out.print(String.format("found student" + Main.ary));
	}
*/	
		
	
}
