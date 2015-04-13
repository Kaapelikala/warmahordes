public class ModelBuilder{
	
	private String name, id;
	private List<String> rules=null;
	private List<String> subtype=null;
	private int spd, str, mat=0, rat=0, def, arm, cmd=0;
	private List<Weapon> weapons=null;
	
	public ModelBuilder(){
	this.weapons=new ArrayList<Weapon>;
	this.rules=new ArrayList<String>;
	this.subtype=new ArrayList<String>;
	}
	
	public ModelBuilder name (String name){
		this.name=name;
		return this;
	}
	
	public ModelBuilder id (String id){
		this.id=id;
		return this;
	}
	public ModelBuilder rules (List<String> rules){
		this.rules=rules;
		return this;
	}
	public ModelBuilder faction (String faction){
		this.faction=faction;
		return this;
	}
	public ModelBuilder subtype (List<String> subtype){
		this.subtype=subtype;
		return this;
	}
	public ModelBuilder spd (String spd){
		this.spd=spd;
		return this;
	}
	public ModelBuilder str (String str){
		this.str=str;
		return this;
	}
	public ModelBuilder mat (String mat){
		this.mat=mat;
		return this;
	}
	public ModelBuilder rat (String rat){
		this.rat=rar;
		return this;
	}
	public ModelBuilder def (String def){
		this.def=def;
		return this;
	}
	public ModelBuilder arm (String arm){
		this.arm=arm;
		return this;
	}
	public ModelBuilder cmd (String cmd){
		this.cmd=cmd;
		return this;
	}
	public ModelBuilder weapons (Weapon weapon){
		this.weapons.add(weapon);
		return this;
	}
	
	public ModelBuilder buildModel (){
		return new Model(name, id, subtype, rules, spd, str, mat, rat, def, arm, cmd, weapons);
	}
	

}