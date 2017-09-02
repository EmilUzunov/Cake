package cakes;

public class Cake extends AbstractWithPrice {
	
	private String name;
	private String description;
	private byte numOfPeaces;
	
	
	public Cake(float price, String name,String Description,byte numOfPeaces) {
		super();
		this.setPrice(price);
		this.name = name;
		this.numOfPeaces = numOfPeaces;
		this.description = Description;
		
	}


	@Override
	public String toString() {
		return "Cake [name=" + name + ", description=" + description + ", numOfPeaces=" + numOfPeaces + ", price="
				+ price + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numOfPeaces;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cake other = (Cake) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numOfPeaces != other.numOfPeaces)
			return false;
		return true;
	}

}
