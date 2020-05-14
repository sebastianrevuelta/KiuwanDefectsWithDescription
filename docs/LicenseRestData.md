
# LicenseRestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | License identifier |  [optional]
**license** | **String** | License name |  [optional]
**component** | **String** | Number of components with this license |  [optional]
**spdxCode** | **String** | SPDX code (Software Package Data Exchange) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | License type |  [optional]
**url** | **String** | Link to license description |  [optional]
**risk** | [**RiskEnum**](#RiskEnum) | License risk |  [optional]
**permissions** | **String** | License permissions |  [optional]
**limitations** | **String** | License limitations |  [optional]
**conditions** | **String** | License conditions |  [optional]
**components** | [**List&lt;ComponentSimpleRestData&gt;**](ComponentSimpleRestData.md) | List of components with this license |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
COPYLEFT | &quot;Copyleft&quot;
COPYRIGHTED | &quot;Copyrighted&quot;
NONOPENSOURCE | &quot;NonOpenSource&quot;
PERMISSIVE | &quot;Permissive&quot;
PROPIETARY | &quot;Propietary&quot;
PUBLICDOMAIN | &quot;PublicDomain&quot;
UNKNOWN | &quot;Unknown&quot;
WEAKCOPYLEFT | &quot;WeakCopyleft&quot;


<a name="RiskEnum"></a>
## Enum: RiskEnum
Name | Value
---- | -----
HIGH | &quot;High&quot;
MEDIUM | &quot;Medium&quot;
LOW | &quot;Low&quot;
NONE | &quot;None&quot;
UNKNOWN | &quot;Unknown&quot;



