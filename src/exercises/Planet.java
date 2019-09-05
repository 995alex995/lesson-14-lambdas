package exercises;

public class Planet {
	
	private int distanceFromSun; 
	private String name;
	private double volume; // I don't quite get it what's volume here xD
	private int satellites;
	
	public Planet(String name, int distanceFromSun, double volume,
			int satellites) {
		super();
		this.name = name;
		this.distanceFromSun = distanceFromSun;
		this.volume = volume;
		this.satellites = satellites;
	}
	public int getDistanceFromSun() {
		return distanceFromSun;
	}

	public String getName() {
		return name;
	}

	public double getVolume() {
		return volume;
	}

	public int getSatellites() {
		return satellites;
	}

	@Override
	public String toString() {
		return "Name of the planet is " + name + ", and it's distance from the Sun is " + distanceFromSun + ", her volume is " + volume + ", and she has  "
				+ satellites + " satellites" + "]" ;
	}
}
