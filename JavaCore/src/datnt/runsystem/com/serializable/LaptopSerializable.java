package datnt.runsystem.com.serializable;

import java.io.Serializable;

public class LaptopSerializable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nameBranch;
	private long   price;
	private String madeIn;
	
	public LaptopSerializable(String nameBranch, long price, String madein) {
		
		this.nameBranch = nameBranch;
		this.price      = price;
		this.madeIn     = madein;
	}

	public String getNameBranch() {
		return nameBranch;
	}

	public void setNameBranch(String nameBranch) {
		this.nameBranch = nameBranch;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}
	
	public String getInfo() {
		return this.nameBranch + " " + this.price +  " " + this.getMadeIn();
	}
}
