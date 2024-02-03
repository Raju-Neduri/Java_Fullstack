//4) WAP to create a class called "Trafficlight" with attributes for color and 
//duration, and red to change the color and check the red or green

package class22_03_Feb;

class TrafficLight {
	String color;
	int duration;

	public void initialize(String initialColor, int initialDuration) {
		color = initialColor;
		duration = initialDuration;
	}

	public void changeColor(String newColor) {
		color = newColor;
		System.out.println("Traffic light changed to " + newColor);
	}

	public boolean isRed() {
		return "Red".equalsIgnoreCase(color);
	}

	public boolean isGreen() {
		return "Green".equalsIgnoreCase(color);
	}

	public void displayStatus() {
		System.out.println("Traffic light color: " + color);
		System.out.println("Duration: " + duration + " seconds");
	}
}

public class Trafficlighttest {
	public static void main(String[] args) {
		TrafficLight trafficLight = new TrafficLight();

		trafficLight.initialize("Red", 30);

		trafficLight.displayStatus();

		System.out.println("Is it red? " + trafficLight.isRed());
		System.out.println("Is it green? " + trafficLight.isGreen());

		trafficLight.changeColor("Green");

		trafficLight.displayStatus();

		System.out.println("Is it red? " + trafficLight.isRed());
		System.out.println("Is it green? " + trafficLight.isGreen());
	}
}
