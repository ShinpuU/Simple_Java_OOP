public class VerboseObject {
	private String name;
	
	VerboseObject(String n){
        this.name = n;
        System.out.println("Object: "+ name + " constructed.");
    }

    public void saySomething(){
        System.out.println(name+ " says hello.");
    }
    
    
    @Override
    protected void finalize() throws Throwable{
    	System.out.println(name + " destroyed.");
    }
    
    
}
