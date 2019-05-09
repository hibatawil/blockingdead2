/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockingdead2.pkg0;

/**
 *
 * @author tarabay family
 */
public class Player {
    
  private int id;
	private String firstName;
	private String lastName;
	private int health;
	private int hunger;
	
	//Stats
	private int strength;
	private int speed;
	private int intelligence;
	private int threat;
	private int luck;
	private int causeOfDeath;
	
	//Variables
	private boolean isDead;
	
	public Player(int id, String firstName, String lastName, int health, int hunger, int strength, int speed, int intelligence, int threat, int luck){
            this.setId(id);
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setHealth(health);
            this.setHunger(hunger);
		
            this.setStrength(strength);
            this.setSpeed(speed);
            this.setIntelligence(intelligence);
            this.setThreat(threat);
		this.setLuck(luck);
		this.setCauseOfDeath(-1);
		
		this.setIsDead(false);
	}

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @param health the health to set
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * @return the hunger
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * @param hunger the hunger to set
     */
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        this.strength = strength;
    }

    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the intelligence
     */
    public int getIntelligence() {
        return intelligence;
    }

    /**
     * @param intelligence the intelligence to set
     */
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    /**
     * @return the threat
     */
    public int getThreat() {
        return threat;
    }

    /**
     * @param threat the threat to set
     */
    public void setThreat(int threat) {
        this.threat = threat;
    }

    /**
     * @return the luck
     */
    public int getLuck() {
        return luck;
    }

    /**
     * @param luck the luck to set
     */
    public void setLuck(int luck) {
        this.luck = luck;
    }

    /**
     * @return the causeOfDeath
     */
    public int getCauseOfDeath() {
        return causeOfDeath;
    }

    /**
     * @param causeOfDeath the causeOfDeath to set
     */
    public void setCauseOfDeath(int causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    /**
     * @return the isDead
     */
    public boolean isIsDead() {
        return isDead;
    }

    /**
     * @param isDead the isDead to set
     */
    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }
}
