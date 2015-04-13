
class Model{

public String name, id;
public List<String> subtype;
public List<String> rules;
public int spd, str, mat, rat, def, arm, cmd;
public List<Weapon> weapons;

	public Model (String name, String id, List<String> subtype, List<String> rules, int spd, int str, int mat, int rat, int def, int arm, int cmd, List<Weapon> weapons)
		{
		this.name=name;
		this.id=id;
		this.subtype=subtype;
		this.rules=rules
		this.spd=spd;
		this.str=str;
		this.mat=mat;
		this.rat=rat;
		this.def=def;
		this.arm=arm;
		this.cmd=cmd;
		this.weapons=weapons;
		}


}


