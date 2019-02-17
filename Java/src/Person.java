
public class Person {
	
	String Fname;
	String Lname;
	int brithYear;
	String brithCity;
	String brithCount;
	String brithcuntory;
	public Person(String fname, String lname, int brithYear, String brithCity, String brithCount, String brithcuntory) {
		Fname = fname;
		Lname = lname;
		this.brithYear = brithYear;
		this.brithCity = brithCity;
		this.brithCount = brithCount;
		this.brithcuntory = brithcuntory;
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
	 * @return the brithCity
	 */
	public String getBrithCity() {
		return brithCity;
	}
	/**
	 * @return the brithCount
	 */
	public String getBrithCount() {
		return brithCount;
	}
	/**
	 * @return the brithcuntory
	 */
	public String getBrithcuntory() {
		return brithcuntory;
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
	/**
	 * @param brithCity the brithCity to set
	 */
	public void setBrithCity(String brithCity) {
		this.brithCity = brithCity;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [Fname=");
		builder.append(Fname);
		builder.append(", Lname=");
		builder.append(Lname);
		builder.append(", brithYear=");
		builder.append(brithYear);
		builder.append(", brithCity=");
		builder.append(brithCity);
		builder.append(", brithCount=");
		builder.append(brithCount);
		builder.append(", brithcuntory=");
		builder.append(brithcuntory);
		builder.append("]");
		return builder.toString();
	}
	/**
	 * @param brithCount the brithCount to set
	 */
	public void setBrithCount(String brithCount) {
		this.brithCount = brithCount;
	}
	/**
	 * @param brithcuntory the brithcuntory to set
	 */
	public void setBrithcuntory(String brithcuntory) {
		this.brithcuntory = brithcuntory;
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
		result = prime * result + ((brithCity == null) ? 0 : brithCity.hashCode());
		result = prime * result + ((brithCount == null) ? 0 : brithCount.hashCode());
		result = prime * result + brithYear;
		result = prime * result + ((brithcuntory == null) ? 0 : brithcuntory.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (Fname == null) {
			if (other.Fname != null)
				return false;
		} else if (!Fname.equals(other.Fname))
			return false;
		if (Lname == null) {
			if (other.Lname != null)
				return false;
		} else if (!Lname.equals(other.Lname))
			return false;
		if (brithCity == null) {
			if (other.brithCity != null)
				return false;
		} else if (!brithCity.equals(other.brithCity))
			return false;
		if (brithCount == null) {
			if (other.brithCount != null)
				return false;
		} else if (!brithCount.equals(other.brithCount))
			return false;
		if (brithYear != other.brithYear)
			return false;
		if (brithcuntory == null) {
			if (other.brithcuntory != null)
				return false;
		} else if (!brithcuntory.equals(other.brithcuntory))
			return false;
		return true;
	} 
}