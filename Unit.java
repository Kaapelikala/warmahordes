<xs:element name="unit">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="name" type="xs:string"/>
      <xs:element name="id" type="xs:string"/>
	  <xs:element name="subtype" type="xs:string"/>
	  <xs:element name="faction" type="xs:string"/>
	  <xs:element name="sizemin" type="xs:numeric"/>
	  <xs:element name="sizemax" type="xs:numeric"/>
	  <xs:element name="costmin" type="xs:numeric"/>
	  <xs:element name="costmax" type="xs:numeric"/>
	  <xs:element name="fa" type="xs:numeric"/>
	  <xs:element name="rules" type="xs:string"/>
	  <xs:element name="troopers" type="xs:string"/>
	  </xs:sequence>
  </xs:complexType>
</xs:element>
