class Spell{

public String name="", id="", effect="";
public int rng=0, aoe=0, pow=0, off=0, upkeep=0,cost=0;

	public Spell(String name, String id, String effect, int cost, int rng, int aoe, int pow, inf off, int upkeep)
	{
	this.name=name;
	this.id=id;
	this.effect=effect;
	this.cost=cost;
	this.rng=rng;
	this.aoe=aoe;
	this.pow=pow;
	this.off=off;
	this.upkeep=upkeep;
	}

}
