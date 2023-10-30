package com.structural.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Component Interface
interface Coffee {
	String getDescription();

	int getCost();
}

// Concrete Components
class SimpleCoffee implements Coffee {

	@Override
	public String getDescription() {
		return "Simple Coffee";
	}

	@Override
	public int getCost() {
		return 10;
	}

}

// Decorator
abstract class CoffeeDecorator implements Coffee {

	protected Coffee decoratedCoffee;

	public CoffeeDecorator(Coffee coffee) {
		this.decoratedCoffee = coffee;
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription();
	}

	@Override
	public int getCost() {
		return decoratedCoffee.getCost();
	}

}

// Concrete Decorators
class Milk extends CoffeeDecorator {

	public Milk(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Milk";
	}

	@Override
	public int getCost() {
		return decoratedCoffee.getCost() + 5;
	}

}

class Sugar extends CoffeeDecorator {

	public Sugar(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		return decoratedCoffee.getDescription() + ", Sugar";
	}

	@Override
	public int getCost() {
		return decoratedCoffee.getCost() + 5;
	}

}

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		LOGGER.info(coffee.getDescription() + " Cost: " + coffee.getCost());

		coffee = new Milk(coffee);
		LOGGER.info(coffee.getDescription() + " Cost: " + coffee.getCost());

		coffee = new Sugar(coffee);
		LOGGER.info(coffee.getDescription() + " Cost: " + coffee.getCost());
	}

}
