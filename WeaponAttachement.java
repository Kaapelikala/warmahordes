<xs:element name="weaponattachment">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="name" type="xs:string"/>
      <xs:element name="id" type="xs:string"/>
	  <xs:element name="subtype" type="xs:string"/>
	  <xs:element name="parent" type="xs:string"/>
	  <xs:element name="spd" type="xs:numeric"/>
	  <xs:element name="str" type="xs:numeric"/>
	  <xs:element name="mat" type="xs:numeric"/>
	  <xs:element name="rat" type="xs:numeric"/>
	  <xs:element name="def" type="xs:numeric"/>
	  <xs:element name="arm" type="xs:numeric"/>
	  <xs:element name="cmd" type="xs:numeric"/>
	  <xs:element name="weapons" type="xs:string"/>
	  <xs:element name="rules" type="xs:string"/>
	  <xs:element name="health" type="xs:numeric"/>
	  <xs:element name="cost" type="xs:numeric"/>
	  <xs:element name="fa" type="xs:numeric"/>
	  <xs:element name="sizemax" type="xs:numeric"/>
	  </xs:sequence>
  </xs:complexType>
</xs:element>

