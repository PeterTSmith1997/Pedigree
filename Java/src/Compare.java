import java.awt.Desktop;
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
    public static Window app;
	private BufferedWriter out;
	public static void main(String[] args) {
		app = new Window();
		app.setVisible(true);
		try {
			scanA = new Scanner(fileA);
			scanB = new Scanner(fileB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		//Compare c = new Compare();
		//c.readFiles();

		for (Person personA : A) {
			System.err.println(personA.toString());
		}
		System.err.println("end A");
		for (Person personB : B) {
			System.err.println(personB.toString());
		}
//		c.loop();
//		c.write();
	}
	public void readFiles() {
		while (scanA.hasNextLine()) {
			String fname = scanA.next();
			String lname = scanA.next();
			int year = scanA.nextInt();
			String brithCity = scanA.next();
			String brithCount = scanA.next();
			String brithcuntory = scanA.next();
			String deathCity = scanA.next();
			String deathCount = scanA.next();
			String deathcuntory = scanA.next();
			int deathyear = scanA.nextInt();
            Person p = new Person(fname, lname, year, brithCity, brithCount, brithcuntory, deathCity, deathCount,
            		deathcuntory, deathyear);
            A.add(p);
            
		}

		while (scanB.hasNextLine()) {
			String fname = scanB.next();
			String lname = scanB.next();
			int year = scanB.nextInt();
			String brithCity = scanB.next();
			String brithCount = scanB.next();
			String brithcuntory = scanB.next();
			String deathCity = scanB.next();
			String deathCount = scanB.next();
			String deathcuntory = scanB.next();
			int deathYear = scanB.nextInt();
            Person p = new Person(fname, lname, year, brithCity, brithCount, brithcuntory, deathCity, deathCount,
            		deathcuntory, deathYear);
            B.add(p);
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
			if (!matches.isEmpty()) {
				for (int i = 0; i < matches.size() ; i++) {
					out.write(matches.get(i).toString() + "\n");
					System.err.println(matches.get(i).toString());
					out.write("Total = " + matches.size());
				}
			}else {
				out.write("No matches");
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	
	
		
	}
	
	public void openFile(String file) {
		if (!Desktop.isDesktopSupported()) {
			System.err.println("not supported");
			return;
		}
		File open = new File(file);
		if (open.exists()) {
			try {
				Desktop.getDesktop().open(open);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());
			}
			
		}
		else {
			File Mfile = new File(file);
			try {
				Mfile.createNewFile();
			//wait(20);
				openFile(file);
				return;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
