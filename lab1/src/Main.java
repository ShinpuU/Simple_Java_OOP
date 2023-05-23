import java.util.Scanner;
//zrob wszystkie poza pierwszymi 4
public class Main {
	
    public static void task1(){
        System.out.println("Task 1");
        Person jan = new Person("Jan", "Kowalski");
        Person jan2 = new Person("Jan","Kowalski");
        Person maria = new Person("Maria","Nowak");
        System.out.printf("jan == jan : %b%n", jan == jan);
        System.out.printf("jan == jan2 : %b%n", jan == jan2);
        System.out.printf("jan == maria : %b%n", jan == maria);
        System.out.printf("jan.equals(jan) : %b%n", jan.equals(jan));
        System.out.printf("jan.equals(jan2) : %b%n", jan.equals(jan2));
        System.out.printf("jan.equals(maria) : %b%n", jan.equals(maria));
    }

    
    public static void task3(){
        System.out.println("Task 3");
        Employee kryspin = new Employee("Kryspin","Wisinski","DevOps Engineer",11000);
        Employee michal = new Employee("Michal","SZ","", 8000);
        System.out.println(kryspin.getName()+" "+kryspin.getLName()+" "+kryspin.getJob()+" "+kryspin.getSalary()+"zł");
        kryspin.setLName("Niewisinski");
        System.out.println(kryspin.getName()+" "+kryspin.getLName()+" "+kryspin.getJob()+" "+kryspin.getSalary()+"zł");
        System.out.println(michal.getName()+" "+michal.getLName()+" "+michal.getJob()+" "+michal.getSalary()+"zł");
        michal.setSalary(10000);
        System.out.println(michal.getName()+" "+michal.getLName()+" "+michal.getJob()+" "+michal.getSalary()+"zł");

    }
    
    
    public static void task4(){
        System.out.println("Task 4");
        VerboseObject verbObj1 = new VerboseObject("VerbObj1");
        VerboseObject verbObj2 = new VerboseObject("VerbObj2");
        VerboseObject verbObj3 = new VerboseObject("VerbObj3");

        verbObj1.saySomething();
        verbObj2.saySomething();
        verbObj3.saySomething();
        
        //testowe wykonanie uzywajac innego syntaxu
        {
            VerboseObject verbObj4 = new VerboseObject("VerbObj4");
            verbObj4.saySomething();
        }
        
        
        //finalize usage
        
        for(int i=0; i<999999; i++) {
        	new VerboseObject("VerbObj");
        	
        }
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end){
            System.out.println("Select task num (1-4)");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": {
                    task1();
                    break;
                }
                case "2": {
                    task1();
                    break;
                }
                case "3":{
                    task3();
                    break;
                }
                case "4":{
                    task4();
                    break;
                }
                case "0":{
                    end = true;
                    break;
                }
                default:{
                	break;
                }

            }
        }

    }
}