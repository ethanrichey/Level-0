
public class Athlete {
String name;
int speed;
int bibNumber;
static int count;
static String location = "New York";
static String startTime = "9:00 A.M.";


	Athlete(String name, int speed){
		this.name = name;
		this.speed = speed;
		count++;
		this.bibNumber = count;
	}

	public static void main(String[] args) {
		
		Athlete John = new Athlete("John", 10);
		Athlete Sarah = new Athlete("Sarah", 11);
		System.out.println(Sarah.name + "'s bib number is " + Sarah.bibNumber);
		System.out.println("The total number of athletes is " + count);
		location = "San Diego";
		System.out.println(John.name + " is running in " + John.location);
		John.location = "Chicago";
		System.out.println(Sarah.name + " is running in " + Sarah.location);
	}
	
	
	
}
