import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Compare {
	//data for tree a
	static ArrayList<Person> A = new ArrayList<Person>();
	 // data for tree b
	static ArrayList<Person> B = new ArrayList<Person>();
	
	ArrayList<Person> matches = new ArrayList<Person>();	
	ArrayList<Person> nommatches = new ArrayList<Person>();
	
	//files
	private static File fileA = new File("A.txt");
	private static File fileB = new File("B.txt");
	//stuff
	private static Scanner scanA;
	private static Scanner scanB;
//	public static WindowMain app = new WindowMain();
	private BufferedWriter out;
	public static void main(String[] args) {
	//	app.setVisible(true);
		try {
			scanA = new Scanner(fileA);
			scanB = new Scanner(fileB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		Compare c = new Compare();
		c.readFiles();

		for (Person personA : A) {
			System.err.println(personA.toString());
		}
		for (Person personB : B) {
			System.err.println(personB.toString());
		}
		c.loop();
		c.write();
	}
	public void readFiles() {
		while (scanA.hasNextLine()) {
			String fname = scanA.next();
			String lname = scanA.next();
			int year = scanA.nextInt();
            Person p = new Person(fname, lname, year);
            A.add(p);
            
		}

		while (scanB.hasNextLine()) {
			String Bfname = scanB.next();
			String Blname = scanB.next();
			int year = scanB.nextInt();
            Person q = new Person(Bfname, Blname, year);
            B.add(q);
		}
		scanA.close();
		scanB.close();
	}
	public void loop() {
		for (Person personA : A) {
			for (Person personB : B) {
				if (personA.equals(personB)){
						matches.add(personB);
						System.err.println(matches.size());
					}
				}
				
			}
		}
	public void write() {
		try {
			out = new BufferedWriter(new FileWriter("match.txt"));
			for (int i = 0; i < matches.size() ; i++) {
				out.write(matches.get(i).toString() + "\n");
				System.err.println(matches.get(i).toString());
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	
	
		
	}
	
}
