import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Compare {
	//data for tree a
	public static  ArrayList<Person> A = new ArrayList<Person>();
	 // data for tree b
	static ArrayList<Person> B = new ArrayList<Person>();
	
	ArrayList<Person> matches = new ArrayList<Person>();	
	ArrayList<Person> nommatches = new ArrayList<Person>();
	
	//files
	private static String fa = "tree1.csv";
	private static String fb = "tree2.csv";
	private static File fileA = new File(fa);
	private static File fileB = new File(fb);
	private static String macthf = "maches.csv";
	//stuff
	private static Scanner scanA;
	private static Scanner scanB;
    public static Window app;
	private BufferedWriter out;
	public static void main(String[] args) {
		loadfiles();
		app = new Window();
		app.setVisible(true);
		
		//Compare c = new Compare();
		//c.readFiles();

		
		System.err.println("end A");
		for (Person personB : B) {
			System.err.println(personB.toString());
		}
//		c.loop();
//		c.write();
	}
	/**
	 * @return the fa
	 */
	public  String getFa() {
		return fa;
	}
	/**
	 * @return the fb
	 */
	public String getFb() {
		return fb;
	}
	/**
	 * @return the macthf
	 */
	public static String getMacthf() {
		return macthf;
	}
	/**
	 * @param macthf the macthf to set
	 */
	public static void setMacthf(String macthf) {
		Compare.macthf = macthf;
	}
	/**
	 * @param fa the fa to set
	 */
	public  void setFa(String fa) {
		Compare.fa = fa;
	}
	/**
	 * @param fb the fb to set
	 */
	public void setFb(String fb) {
		Compare.fb = fb;
	}
	public void readFiles() {
		try {
			scanA = new Scanner(fileA);
			scanB = new Scanner(fileB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		while (scanA.hasNextLine()) {
			String line = scanA.nextLine();
			String[] person = line.split(",");
			String fname = person[0];
			String lname = person[1];
			Integer year = Integer.parseInt(person[2]);
			String brithCity = person[3];
			String brithCount = person[4];
			String brithcuntory = person[5];
			String deathCity = person[6];
			String deathCount = person [7];
			String deathcuntory = person[8];
			int deathYear = Integer.parseInt(person[9]);
            Person p = new Person(fname, lname, year, brithCity, brithCount, brithcuntory, deathCity, deathCount,
            		deathcuntory, deathYear);
            A.add(p);
            
		}

		while (scanB.hasNextLine()) {
			String line = scanA.nextLine();
			String[] person = line.split(",");
			String fname = person[0];
			String lname = person[1];
			Integer year = Integer.parseInt(person[2]);
			String brithCity = person[3];
			String brithCount = person[4];
			String brithcuntory = person[5];
			String deathCity = person[6];
			String deathCount = person [7];
			String deathcuntory = person[8];
			int deathYear = Integer.parseInt(person[9]);
            Person p = new Person(fname, lname, year, brithCity, brithCount, brithcuntory, deathCity, deathCount,
            		deathcuntory, deathYear);
            A.add(p);
        	}
		scanA.close();
		scanB.close();
	}
	public void doComp() {
		matches = A;
		matches.retainAll(B);
		
		}
	public void write() {
		try {
			out = new BufferedWriter(new FileWriter(getMacthf()));
			if (!matches.isEmpty()) {
				for (int i = 0; i < matches.size() ; i++) {
					out.write(matches.get(i).toString());
					out.newLine();
					System.err.println(matches.get(i).toString());
					
				}
				out.write("Total = " + matches.size());
			}else {
				out.write("No matches");
			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		matches.clear();
		A.clear();
		B.clear();
		
	}
	
	public void openFile(String file) throws Exception, IOException {
		if (!Desktop.isDesktopSupported()) {
			throw new Exception(); 
		}
		File open = new File(file);
		if (open.exists()) {
			try {
				Desktop.getDesktop().open(open);
			} catch (IOException e) {
			 throw new IOException();
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
	private static void loadfiles() {
		if (fileA.exists()) {
			//do nowt
		}
		else {
			File Mfilea = new File(fa);
			try {
				Mfilea.createNewFile();
			//wait(20);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (fileB.exists()) {
			//do nowt
		}
		else {
			File Mfileb = new File(fb);
			try {
				Mfileb.createNewFile();
			//wait(20);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}
