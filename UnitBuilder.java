class UnitBuilder{


	
	private String name, id, rules, faction;
	private String[] subtype;
	private int sizemin, sizemax, costmin, costmax, fa;
	private UnitMember[] members;

	public UnitBuilder(){}
	
	public UnitBuilder name (String name){
		this.name=name;
		return this;
	}
	
	
	public UnitBuilder faction (String faction){
		this.faction=faction;
		return this;
	}
	
	
	public UnitBuilder subtype (String subtype){
		this.subtype=subtype;
		return this;
	}
	
	
	public UnitBuilder id (String id){
		this.id=id;
		return this;
	}
	public UnitBuilder rules (String rules){
		this.rules=rules;
		return this;
	}
	public UnitBuilder sizemin (String sizemin){
		this.sizemin=sizemin;
		return this;
	}
	public UnitBuilder sizemax (String sizemax){
		this.sizemax=sizemax;
		return this;
	}
	public UnitBuilder costmin (String costmin){
		this.costmin=costmin;
		return this;
	}
	public UnitBuilder costmax (String costmax){
		this.costmax=costmax;
		return this;
	}
	public UnitBuilder fa (String fa){
		this.fa=fa;
		return this;}

}