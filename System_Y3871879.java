import javax.swing.JOptionPane;

public class System_Y3871879 {

	String make;
	String model;
	int speed;
	int memorySize; //in MB
	double hardDiskSize; //in GB
	double purchaseCost;
	

	public System_Y3871879(String makeIn, String modelIn, int processorSpeedIn ) {
		// TODO Auto-generated constructor stub
	make = makeIn;
	model = modelIn;
	speed = processorSpeedIn;
	
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	public void setHardDiskSize(double hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}

	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}

	public int getSpeed() {
		return speed;
	}

	public void displayDetails() {
		
		JOptionPane.showMessageDialog(null,
			    "Make: " + make + "\n" + 
			    "Model: " + model + "\n" + 		
			    "Processor Speed: " + speed + "\n" + 
			    "Memory: " + memorySize + "\n" + 
			    "Hard Disk size: " + memorySize + "\n" + 
			    "Purchase Cost: " + purchaseCost
			  
				);
		
	}
	
	public String checkHDStatus() {
		
		if(hardDiskSize < 2)
		{
			return "Low";
		}
		else 
		return "Ok";
		
	}
	
	public Boolean goodMemorySize() {
		
		if (memorySize < 128)
			{return false;
			}
		else 
			return true;
	}
	
	public void diagnoseSystem() {
		System.out.println("Hard Disk Size = " + checkHDStatus());
		System.out.println();
		System.out.println("Memory Size Ok = " + goodMemorySize() );
		
	}
	
	
	


}