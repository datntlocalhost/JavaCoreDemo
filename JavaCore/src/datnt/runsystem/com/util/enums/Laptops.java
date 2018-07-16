package datnt.runsystem.com.util.enums;

public enum Laptops {
	
	DELL("Dell", 500, "Viet Nam"),
	LENOVO("Lenovo", 700, "Trung Quoc"),
	ASUS("Asus", 600, "Nhat Ban");
	
	
	private String branchName;
	private int    price;
	private String madeIn;
	
	private Laptops(String branchName, int price, String madeIn) {
		this.branchName = branchName;
		this.price      = price;
		this.madeIn     = madeIn;
	}

	public String getBranchName() {
		return branchName;
	}

	public int getPrice() {
		return price;
	}

	public String getMadeIn() {
		return madeIn;
	}
	
	public String getInfo() {
		return this.branchName + " " + this.price + " " + this.madeIn;
	}
}
