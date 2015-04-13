class FeatBuilder{

	private String name, id, effect;
	public FeatBuilder(){}
	
	public FeatBuilder name (String name){
		this.name=name;
		return this;
	}
	
	public FeatBuilder id (String id){
		this.id=id;
		return this;
	}
	public FeatBuilder effect (String effect){
		this.effect=effect;
		return this;
	}
	
	public Feat buildFeat(){
		return new Feat(name, id, effect);
	}

}