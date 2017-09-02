package cakes;

public abstract class AbstractWithNameAndPhone {
	private String name;
	private String phone;

	public AbstractWithNameAndPhone(String name, String phone) {
		if (name.trim().length() > 0&&phone.trim().length()>0) {
			try {
				this.name = name;
			} catch (NullPointerException e) {
				System.out.println("You will have to provide name!");
			}
		
			try{
		this.phone = phone;
			}catch(NullPointerException e){
				System.out.println("You will have to provide phone!");
			}
		}
	}
}
