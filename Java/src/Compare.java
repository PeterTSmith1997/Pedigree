import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Compare {
	//data for tree a
	ArrayList<String> namesA = new ArrayList<String>();
	
	// data for tree b
	ArrayList<String> namesB = new ArrayList<String>();
	
	//files
	private static File fileA = new File("a.txt");
	private static File fileB = new File("a.txt");
	//stuff
	private static Scanner scanA;
	private static Scanner scanB;
	public static void main(String[] args) {
		//WindowMain app = new WindowMain();
		try {
			scanA = new Scanner(fileA);
			scanB = new Scanner(fileB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		Compare c =  new Compare();
		c.readFiles();
		c.loop();
	}
	public void readFiles() {
		while (scanA.hasNextLine()) {
			String name = scanA.next();
			namesA.add(name);
		}
		while (scanB.hasNextLine()) {
			String name = scanB.next();
			namesB.add(name);
		}
	}
	public void loop() {
		for (String nameA : namesA) {
			for (String nameB : namesB) {
				if (nameA.equals(nameB)) {
					System.out.println(nameA);
				}
			}
			
		}
	}
}
