<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="FindUserByUsername">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FindUserByUsernameResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FindUserByUsernameResult" type="tns:user" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="user">
        <s:sequence>
          <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="password" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="role" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="username" type="s:string" />
        </s:sequence>
      </s:complexType>
      <s:element name="SearchPackage">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="SearchPackageResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="SearchPackageResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="Status">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="name" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="StatusResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="StatusResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FindPackages">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="id" type="s:int" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="FindPackagesResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="FindPackagesResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="FindUserByUsernameSoapIn">
    <wsdl:part name="parameters" element="tns:FindUserByUsername" />
  </wsdl:message>
  <wsdl:message name="FindUserByUsernameSoapOut">
    <wsdl:part name="parameters" element="tns:FindUserByUsernameResponse" />
  </wsdl:message>
  <wsdl:message name="SearchPackageSoapIn">
    <wsdl:part name="parameters" element="tns:SearchPackage" />
  </wsdl:message>
  <wsdl:message name="SearchPackageSoapOut">
    <wsdl:part name="parameters" element="tns:SearchPackageResponse" />
  </wsdl:message>
  <wsdl:message name="StatusSoapIn">
    <wsdl:part name="parameters" element="tns:Status" />
  </wsdl:message>
  <wsdl:message name="StatusSoapOut">
    <wsdl:part name="parameters" element="tns:StatusResponse" />
  </wsdl:message>
  <wsdl:message name="FindPackagesSoapIn">
    <wsdl:part name="parameters" element="tns:FindPackages" />
  </wsdl:message>
  <wsdl:message name="FindPackagesSoapOut">
    <wsdl:part name="parameters" element="tns:FindPackagesResponse" />
  </wsdl:message>
  <wsdl:portType name="userServiceNETSoap">
    <wsdl:operation name="FindUserByUsername">
      <wsdl:input message="tns:FindUserByUsernameSoapIn" />
      <wsdl:output message="tns:FindUserByUsernameSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="SearchPackage">
      <wsdl:input message="tns:SearchPackageSoapIn" />
      <wsdl:output message="tns:SearchPackageSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="Status">
      <wsdl:input message="tns:StatusSoapIn" />
      <wsdl:output message="tns:StatusSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="FindPackages">
      <wsdl:input message="tns:FindPackagesSoapIn" />
      <wsdl:output message="tns:FindPackagesSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="userServiceNETSoap" type="tns:userServiceNETSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="FindUserByUsername">
      <soap:operation soapAction="http://tempuri.org/FindUserByUsername" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchPackage">
      <soap:operation soapAction="http://tempuri.org/SearchPackage" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Status">
      <soap:operation soapAction="http://tempuri.org/Status" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FindPackages">
      <soap:operation soapAction="http://tempuri.org/FindPackages" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="userServiceNETSoap12" type="tns:userServiceNETSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="FindUserByUsername">
      <soap12:operation soapAction="http://tempuri.org/FindUserByUsername" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="SearchPackage">
      <soap12:operation soapAction="http://tempuri.org/SearchPackage" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="Status">
      <soap12:operation soapAction="http://tempuri.org/Status" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="FindPackages">
      <soap12:operation soapAction="http://tempuri.org/FindPackages" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="userServiceNET">
    <wsdl:port name="userServiceNETSoap" binding="tns:userServiceNETSoap">
      <soap:address location="http://localhost:58904/userServiceNET.asmx" />
    </wsdl:port>
    <wsdl:port name="userServiceNETSoap12" binding="tns:userServiceNETSoap12">
      <soap12:address location="http://localhost:58904/userServiceNET.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>