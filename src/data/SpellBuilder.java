class SpellBuilder{

	
	private String name, id, effect;
	private int rng, aoe, pow, off, upkeep,cost;

	public SpellBuilder(){}
	
	public SpellBuilder name (String name){
		this.name=name;
		return this;
	}
	
	public SpellBuilder id (String id){
		this.id=id;
		return this;
	}
	public SpellBuilder effect (String effect){
		this.effect=effect;
		return this;
	}
	public SpellBuilder rng (int rng){
		this.rng=rng;
		return this;
	}
	public SpellBuilder aoe (int aoe){
		this.aoe=aoe;
		return this;
	}
	public SpellBuilder pow (int pow){
		this.pow=pow;
		return this;
	}
	public SpellBuilder off (int off){
		this.off=off;
		return this;
	}
	public SpellBuilder upkeep (int upkeep){
		this.upkeep=upkeep;
		return this;
	}
	public SpellBuilder cost (int cost){
		this.cost=cost;
		return this;
	}

}