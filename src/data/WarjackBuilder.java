<xs:element name="warjack">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="name" type="xs:string"/>
      <xs:element name="id" type="xs:string"/>
	  <xs:element name="subtype" type="xs:string"/>
	  <xs:element name="faction" type="xs:string"/>
	  <xs:element name="spd" type="xs:numeric"/>
	  <xs:element name="str" type="xs:numeric"/>
	  <xs:element name="mat" type="xs:numeric"/>
	  <xs:element name="rat" type="xs:numeric"/>
	  <xs:element name="def" type="xs:numeric"/>
	  <xs:element name="arm" type="xs:numeric"/>
	  <xs:element name="cmd" type="xs:numeric"/>
	  <xs:element name="foc" type="xs:numeric"/>
	  <xs:element name="cost" type="xs:numeric"/>
	  <xs:element name="fa" type="xs:numeric"/>
	  <xs:element name="weapons" type="xs:string"/>
	  <xs:element name="rules" type="xs:string"/>
	  <xs:element name="health1" type="xs:numeric"/>
	  <xs:element name="health2" type="xs:numeric"/>
	  <xs:element name="health3" type="xs:numeric"/>
	  <xs:element name="health4" type="xs:numeric"/>
	  <xs:element name="health5" type="xs:numeric"/>
	  <xs:element name="health6" type="xs:numeric"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>

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