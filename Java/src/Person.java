
public class Person {
	
	String Fname;
	String Lname;
	int brithYear;
	String brithCity;
	String brithCount;
	String brithcuntory;
	String deathCity;
	String deathCount;
	String deathcuntory;
	int deathYear;
	/**
	 * @param fname
	 * @param lname
	 * @param brithYear
	 * @param brithCity
	 * @param brithCount
	 * @param brithcuntory
	 * @param deathCity
	 * @param deathCount
	 * @param deathcuntory
	 * @param deathYear
	 */
	public Person(String fname, String lname, int brithYear, String brithCity, String brithCount, String brithcuntory,
			String deathCity, String deathCount, String deathcuntory, int deathYear) {
		Fname = fname;
		Lname = lname;
		this.brithYear = brithYear;
		this.brithCity = brithCity;
		this.brithCount = brithCount;
		this.brithcuntory = brithcuntory;
		this.deathCity = deathCity;
		this.deathCount = deathCount;
		this.deathcuntory = deathcuntory;
		this.deathYear = deathYear;
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
	 * @return the deathCity
	 */
	public String getDeathCity() {
		return deathCity;
	}
	/**
	 * @return the deathCount
	 */
	public String getDeathCount() {
		return deathCount;
	}
	/**
	 * @return the deathcuntory
	 */
	public String getDeathcuntory() {
		return deathcuntory;
	}
	/**
	 * @return the deathYear
	 */
	public int getDeathYear() {
		return deathYear;
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
	/**
	 * @param deathCity the deathCity to set
	 */
	public void setDeathCity(String deathCity) {
		this.deathCity = deathCity;
	}
	/**
	 * @param deathCount the deathCount to set
	 */
	public void setDeathCount(String deathCount) {
		this.deathCount = deathCount;
	}
	/**
	 * @param deathcuntory the deathcuntory to set
	 */
	public void setDeathcuntory(String deathcuntory) {
		this.deathcuntory = deathcuntory;
	}
	/**
	 * @param deathYear the deathYear to set
	 */
	public void setDeathYear(int deathYear) {
		this.deathYear = deathYear;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [");
		if (Fname != null) {
			builder.append("Fname=");
			builder.append(Fname);
			builder.append(", ");
		}
		if (Lname != null) {
			builder.append("Lname=");
			builder.append(Lname);
			builder.append(", ");
		}
		builder.append("brithYear=");
		builder.append(brithYear);
		builder.append(", ");
		if (brithCity != null) {
			builder.append("brithCity=");
			builder.append(brithCity);
			builder.append(", ");
		}
		if (brithCount != null) {
			builder.append("brithCount=");
			builder.append(brithCount);
			builder.append(", ");
		}
		if (brithcuntory != null) {
			builder.append("brithcuntory=");
			builder.append(brithcuntory);
			builder.append(", ");
		}
		if (deathCity != null) {
			builder.append("deathCity=");
			builder.append(deathCity);
			builder.append(", ");
		}
		if (deathCount != null) {
			builder.append("deathCount=");
			builder.append(deathCount);
			builder.append(", ");
		}
		if (deathcuntory != null) {
			builder.append("deathcuntory=");
			builder.append(deathcuntory);
			builder.append(", ");
		}
		builder.append("deathYear=");
		builder.append(deathYear);
		builder.append("]");
		return builder.toString();
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
		result = prime * result + ((deathCity == null) ? 0 : deathCity.hashCode());
		result = prime * result + ((deathCount == null) ? 0 : deathCount.hashCode());
		result = prime * result + deathYear;
		result = prime * result + ((deathcuntory == null) ? 0 : deathcuntory.hashCode());
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
		if (deathCity == null) {
			if (other.deathCity != null)
				return false;
		} else if (!deathCity.equals(other.deathCity))
			return false;
		if (deathCount == null) {
			if (other.deathCount != null)
				return false;
		} else if (!deathCount.equals(other.deathCount))
			return false;
		if (deathYear != other.deathYear)
			return false;
		if (deathcuntory == null) {
			if (other.deathcuntory != null)
				return false;
		} else if (!deathcuntory.equals(other.deathcuntory))
			return false;
		return true;
	}
	
}