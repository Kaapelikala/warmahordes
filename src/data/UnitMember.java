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
	public SpellBuilder rng (String rng){
		this.rng=rng;
		return this;
	}
	public SpellBuilder aoe (String aoe){
		this.aoe=aoe;
		return this;
	}
	public SpellBuilder pow (String pow){
		this.pow=pow;
		return this;
	}
	public SpellBuilder off (String off){
		this.off=off;
		return this;
	}
	public SpellBuilder upkeep (String upkeep){
		this.upkeep=upkeep;
		return this;
	}
	public SpellBuilder cost (String cost){
		this.cost=cost;
		return this;
	}

}