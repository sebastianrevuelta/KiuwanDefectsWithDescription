
# InsightsComponentRestBean

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Component identifier |  [optional]
**artifact** | **String** | Artifact name |  [optional]
**version** | **String** | Artifact version |  [optional]
**filename** | **String** | File name |  [optional]
**language** | **String** | Technology |  [optional]
**obsolescenceRisk** | [**ObsolescenceRiskEnum**](#ObsolescenceRiskEnum) | Component obsolescence risk (high, medium, low, none, unknown) |  [optional]
**licenseRisk** | [**LicenseRiskEnum**](#LicenseRiskEnum) | Component license risk (high, medium, low, none, unknown) |  [optional]
**securityRisk** | [**SecurityRiskEnum**](#SecurityRiskEnum) | Component security risk (high, medium, low, none, unknown) |  [optional]
**sources** | [**List&lt;SourceRootSimpleRestData&gt;**](SourceRootSimpleRestData.md) | Sources list |  [optional]
**vulnerabilities** | [**List&lt;VulnerabilityRestData&gt;**](VulnerabilityRestData.md) | Vulnerabilities list |  [optional]


<a name="ObsolescenceRiskEnum"></a>
## Enum: ObsolescenceRiskEnum
Name | Value
---- | -----
HIGH | &quot;high&quot;
MEDIUM | &quot;medium&quot;
LOW | &quot;low&quot;
NONE | &quot;none&quot;
UNKNOWN | &quot;unknown&quot;


<a name="LicenseRiskEnum"></a>
## Enum: LicenseRiskEnum
Name | Value
---- | -----
HIGH | &quot;high&quot;
MEDIUM | &quot;medium&quot;
LOW | &quot;low&quot;
NONE | &quot;none&quot;
UNKNOWN | &quot;unknown&quot;


<a name="SecurityRiskEnum"></a>
## Enum: SecurityRiskEnum
Name | Value
---- | -----
HIGH | &quot;high&quot;
MEDIUM | &quot;medium&quot;
LOW | &quot;low&quot;
NONE | &quot;none&quot;
UNKNOWN | &quot;unknown&quot;



