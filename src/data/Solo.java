class Solo extends Model{

	public String faction;
	public int health, cost, fa;
 
 
	public Solo (String name, String id, List<String> subtype, List<String> rules, int spd, int str, int mat, int rat, int def, int arm, int cmd, List<Weapon> weapons, String faction, int health, int cost, int fa)
	{
	super(name, id, subtype, rules, spd, str, mat, rat, def, arm, cmd, weapons);
	this.faction=faction;
	this.health=health;
	this.cost=cost;
	this.fa=fa;
	}
}