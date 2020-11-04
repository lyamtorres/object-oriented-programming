package panda;

public class Panda {

    private String name;
    private int necessaryBamboos;
    private int eatenBamboos;
    private int sadDays;
    private boolean isAwake;
    
    

    public Panda (String name, int necessaryBamboos) {
        this.name = name;
        this.necessaryBamboos = necessaryBamboos;
        eatenBamboos = 0;    
        sadDays = 0;
        isAwake = true;
    }

    public void wakeUp () {
        if(!isAwake) {
        	isAwake = true;
        	eatenBamboos = 0;
        }
    }

    public void feed (int m, int b) {
    	if(isAwake) {
    		eatenBamboos =+ m * b;
    	}
    }

    public void sleep () {
    	if(isAwake) {
    		isAwake = false;
	        if (eatenBamboos < necessaryBamboos) {
	            System.out.println(getName() + " S.O.S!");
	            sadDays++;
	        }
	    }
    }

    /* GETTERS */

    public String getName () {
        return name;
    }

    public int getNecessaryBamboos () {
        return necessaryBamboos;
    }

    public int getEatenBamboos () {
        return eatenBamboos;
    }

    public int getSadDays () {
        return sadDays;
    }

    public static void main (String[] args) {
    
    	int meals = 0;
    	int bamboosPerMeal = 0;
    	int stock = 150;
    	int nbDays = 1;
        
    	Panda mei = new Panda("Mei", 11);
    	Panda tao = new Panda("Tao", 9);
    	
    	while (nbDays <= 10 && stock >= 0) {
    		System.out.println("|| DAY "+ nbDays + " ||");
    		
        	meals = ((int)(Math.random() * 3)) + 2;
        	bamboosPerMeal = ((int)(Math.random() * 4)) + 1;
        	
    		mei.wakeUp();
    		tao.wakeUp();
    		
    		mei.feed(meals, bamboosPerMeal);
    		stock -= meals * bamboosPerMeal;
    		tao.feed(meals, bamboosPerMeal);
    		stock -= meals * bamboosPerMeal;
    		
    		mei.sleep();
    		tao.sleep();
    		
    		nbDays += 1;   		
    	}
    	System.out.println("Jours tristes de Mei: " + mei.getSadDays());
    	System.out.println("Jours tristes de Tao: " + tao.getSadDays());
    }
    
}
