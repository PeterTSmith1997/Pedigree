import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read implements Runnable {
private Thread t;
private Scanner scan;

	Read(File file){
		try {
			Scanner scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
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
            if (t.getName().equals("a")) {
            Compare.A.add(p);
            }
            else {
				Compare.B.add(p);
			}
            
		}


		
	}

}
