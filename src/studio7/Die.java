package studio7;

import java.util.Random;

public class Die {
	private int sides;
	private Random random;
	
	public Die(int sides) {
		if (sides < 1) {
			throw new IllegalArgumentException("A die must have at least one side");
		}
		this.sides = sides;
		this.random = new Random();
	}
	public int roll() {
		return random.nextInt(sides) + 1; //generates a number between 1 and sides inclusive
	}
	public static void main(String[] args) {
		Die d6 = new Die(6); // Standard 6 sides
		System.out.println("Rolled: " + d6.roll());
		}
	}
