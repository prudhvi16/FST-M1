package Activities;

public class Bicycle implements BicycleOperations, BicycleParts {

	public int gears;
    public int currentSpeed;

    public Bicycle(int gears2, int currentSpeed2) {
		// TODO Auto-generated constructor stub
	}

	//the Bicycle class has one constructor
    public void Activity7(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    //Bicycle class has three methods
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Current speed: " + currentSpeed);
    }

    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed: " + currentSpeed);
    }

    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

//Derived class
class MountainBike extends Bicycle {

    //The MountainBike subclass adds one more field
    public int seatHeight;

    //The MountainBike subclass has one constructor
    public MountainBike(int gears, int currentSpeed, int startHeight) {
        //Invoking base-class(Bicycle) constructor
        super(gears, currentSpeed);
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
    }  


//Driver class 
    public class Activity7 {
    public void main(String args[]) {
        MountainBike mb = new MountainBike(3, 0, 25);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(20);
        mb.applyBrake(5);
    }

	}


	public void speedUp(int i) {
		
		
	}

	public void applyBrake(int i) {
		
		
	}
}

