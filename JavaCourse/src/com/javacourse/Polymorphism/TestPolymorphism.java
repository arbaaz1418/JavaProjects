package com.javacourse.Polymorphism;

class Movie
{
	private String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
	public String plot()
	{
		return "No plot here";
	}

	public String getName() {
		return name;
	}
	
}
class Jaws extends Movie
{
	public Jaws()
	{
		super("Jaws");
	}
	
	public String plot()
	{
		return "A shark eats lot of people";
	}
}
class IndependenceDay extends Movie
{
	public IndependenceDay()
	{
		super("IndependenceDay");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Aliens Take over the Earth";
	}
	
}
class MazeRunner extends Movie
{
	public MazeRunner()
	{
		super("Maze Runner");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Kidds escape the maze";
	}
	
}
class StarWars extends Movie
{
	public StarWars()
	{
		super("Starwars");
	}

	@Override
	public String plot() {
		// TODO Auto-generated method stub
		return "Imperial forces try to takeover te universe";
	}
	
}
class Forgetable extends Movie
{
	public Forgetable()
	{
		super("Forgetable Movie");
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {

		for(int i=1;i<11;i++)
		{
			Movie movie=randomMovie();
			System.out.println("Movie #"+i+" : "+movie.getName()+"\n"+
					"Plot :"+movie.plot()+"\n");
		}
	}

	public static Movie randomMovie()
	{
		int randomNumber=(int)(Math.random()* 5)+1;
		System.out.println("Random number generated is :"+randomNumber);
		
		switch(randomNumber)
		{
		case 1:
			return new Jaws();
		case 2:
			return new IndependenceDay();
		case 3:
			return new MazeRunner();
		case 4:
			return new StarWars();
		case 5:
			return new Forgetable();
			
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
