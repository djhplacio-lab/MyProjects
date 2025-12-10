package bpi.oop.activity5;

public abstract class Program {
	
	private String name;
	private boolean isRunning = false;
	
	public Program() {
		
	}
	
	public Program(String name) {
		this.name = name;
	}
	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIsRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public boolean getIsRunning() {
		return isRunning;
	}
	
	abstract void run();
	abstract void stop();

  
  
   
}
