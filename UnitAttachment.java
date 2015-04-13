<xs:element name="unitattachment">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="name" type="xs:string"/>
      <xs:element name="id" type="xs:string"/>
	  <xs:element name="subtype" type="xs:string"/>
	  <xs:element name="parent" type="xs:string"/>
	  <xs:element name="cost" type="xs:numeric"/>
	  <xs:element name="fa" type="xs:numeric"/>
	  <xs:element name="members" type="xs:string"/>
	  </xs:sequence>
  </xs:complexType>
</xs:element>
