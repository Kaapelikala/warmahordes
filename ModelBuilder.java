public class ModelBuilder{
	
	private String name, id;
	private List<String> rules;
	private List<String> subtype;
	private int spd, str, mat, rat, def, arm, cmd;
	private List<Weapon> weapons;
	
	public SpellBuilder(){
	this.weapons=new ArrayList<Weapon>;
	this.rules=new ArrayList<String>;
	this.subtype=new ArrayList<String>;
	}
	
	public SpellBuilder name (String name){
		this.name=name;
		return this;
	}
	
	public SpellBuilder id (String id){
		this.id=id;
		return this;
	}
	public SpellBuilder rules (List<String> rules){
		this.rules=rules;
		return this;
	}
	public SpellBuilder faction (String faction){
		this.faction=faction;
		return this;
	}
	public SpellBuilder subtype (List<String> subtype){
		this.subtype=subtype;
		return this;
	}
	public SpellBuilder spd (String spd){
		this.spd=spd;
		return this;
	}
	public SpellBuilder str (String str){
		this.str=str;
		return this;
	}
	public SpellBuilder mat (String mat){
		this.mat=mat;
		return this;
	}
	public SpellBuilder rat (String rat){
		this.rat=rar;
		return this;
	}
	public SpellBuilder def (String def){
		this.def=def;
		return this;
	}
	public SpellBuilder arm (String arm){
		this.arm=arm;
		return this;
	}
	public SpellBuilder cmd (String cmd){
		this.cmd=cmd;
		return this;
	}
	public SpellBuilder weapons (Weapon weapon){
		this.weapons.add(weapon);
		return this;
	}
	
	public SpellBuilder buildModel (){
		return new Model(name, id, subtype, rules, spd, str, mat, rat, def, arm, cmd, weapons);
	}
	

}