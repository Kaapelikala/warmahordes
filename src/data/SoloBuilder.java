<xs:element name="solo">
  <xs:complexType>
    <xs:sequence>
	  <xs:element name="subtype" type="xs:string"/>
	  <xs:element name="faction" type="xs:string"/>
	  <xs:element name="spd" type="xs:numeric"/>
	  <xs:element name="str" type="xs:numeric"/>
	  <xs:element name="mat" type="xs:numeric"/>
	  <xs:element name="rat" type="xs:numeric"/>
	  <xs:element name="def" type="xs:numeric"/>
	  <xs:element name="arm" type="xs:numeric"/>
	  <xs:element name="cmd" type="xs:numeric"/>
	  <xs:element name="cost" type="xs:numeric"/>
	  <xs:element name="fa" type="xs:numeric"/>
	  <xs:element name="weapons" type="xs:string"/>
	  <xs:element name="health" type="xs:numeric"/>
	  </xs:sequence>
  </xs:complexType>
</xs:element>


class SpellBuilder{


	public String name, id;
	public List<String> subtype;
	public List<String> rules;
	public int spd, str, mat, rat, def, arm, cmd;
	public List<Weapon> weapons;

	public String faction;
	public int health, cost, fa;

	public SpellBuilder(){
	weapons=new ArrayList<Weapon>;
	subtype=new ArrayList<String>;
	rules=new ArrayList<String>;}
	
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
	
	
	public SpellBuilder spd (int spd){
		this.spd=spd;
		return this;
	}
	
	public SpellBuilder str (int str){
		this.str=str;
		return this;
	}
	public SpellBuilder rat (int rat){
		this.rat=rat;
		return this;
	}
	public SpellBuilder mat (int mat){
		this.mat=mat;
		return this;
	}
	public SpellBuilder def (int def){
		this.def=def;
		return this;
	}
	public SpellBuilder arm (int arm){
		this.arm=arm;
		return this;
	}
	public SpellBuilder cmd (int cmd){
		this.cmd=cmd;
		return this;
	}
	public SpellBuilder cost (int cost){
		this.cost=cost;
		return this;
	}
	public SpellBuilder fa (int fa){
		this.fa=fa;
		return this;
	}
	public SpellBuilder health (int health){
		this.health=health;
		return this;
	}
	public SpellBuilder faction (String faction){
		this.faction=faction;
		return this;
	}
	
	
	public Solo buildSolo(String name, String id, List<String> subtype, List<String> rules, int spd, int str, int mat, int rat, int def, int arm, int cmd, List<Weapon> weapons, String faction, int health, int cost, int fa)
	{
	return new Solo(name, id, subtype, rules, spd, str, mat, rat, def, arm, cmd,  weapons, faction, health, cost, fa);
	}

}