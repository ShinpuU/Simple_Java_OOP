public class Employee extends Person{
	
	private String job;
    private int salary;
	
	
	public Employee(String i, String n, String j, int s) {
        super(i,n);
        this.job = j;
        this.salary = s;
    }

    public void setName(String name){
        super.imie = name;
    }
    public String getName(){
        return super.imie;
    }

    public void setLName(String name){
        super.nazwisko = name;
    }
    public String getLName(){
        return super.nazwisko;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getJob() {
        return job;
    }
    
    
    
}
