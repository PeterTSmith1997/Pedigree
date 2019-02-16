
public class Person {
	
	String Fname;
	String Lname;
	int brithYear;
	
	public Person(String fname, String lname, int brithYear) {
		Fname = fname;
		Lname = lname;
		this.brithYear = brithYear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + ", brithYear=" + brithYear + "]";
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return Fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return Lname;
	}

	/**
	 * @return the brithYear
	 */
	public int getBrithYear() {
		return brithYear;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		Fname = fname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		Lname = lname;
	}

	/**
	 * @param brithYear the brithYear to set
	 */
	public void setBrithYear(int brithYear) {
		this.brithYear = brithYear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
		result = prime * result + ((Lname == null) ? 0 : Lname.hashCode());
		result = prime * result + brithYear;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (Fname == null) {
			if (other.Fname != null) {
				return false;
			}
		} else if (!Fname.equals(other.Fname)) {
			return false;
		}
		if (Lname == null) {
			if (other.Lname != null) {
				return false;
			}
		} else if (!Lname.equals(other.Lname)) {
			return false;
		}
		if (brithYear != other.brithYear) {
			return false;
		}
		return true;
	}
}