
# DefectDetailResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defectId** | **Long** | Defect identifier |  [optional]
**file** | **String** | Defect file |  [optional]
**line** | **Integer** | Defect line |  [optional]
**code** | **String** | Code |  [optional]
**muted** | **Boolean** | Indicates if the defect is muted |  [optional]
**vulnerabilityType** | **String** | Vulnerability type (More info in https://www.kiuwan.com/docs/display/K5/Kiuwan+Vulnerability+Types) |  [optional]
**explanation** | **String** | Defect explanation |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Defect status |  [optional]
**cweId** | **Integer** | CWE identifier |  [optional]
**ruleCode** | **String** | Rule code |  [optional]
**rule** | **String** | Broken rule |  [optional]
**language** | **String** | Technology (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies) |  [optional]
**characteristic** | [**CharacteristicEnum**](#CharacteristicEnum) | Characteristic |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | Priority |  [optional]
**effort** | **String** | Effort |  [optional]
**modelId** | **Long** | Model identifier |  [optional]
**securityDetail** | [**VulnerabilityData**](VulnerabilityData.md) | Security detail |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
TO_REVIEW | &quot;To review&quot;
REVIEWED | &quot;Reviewed&quot;


<a name="CharacteristicEnum"></a>
## Enum: CharacteristicEnum
Name | Value
---- | -----
EFFICIENCY | &quot;Efficiency&quot;
MAINTAINABILITY | &quot;Maintainability&quot;
PORTABILITY | &quot;Portability&quot;
RELIABILITY | &quot;Reliability&quot;
SECURITY | &quot;Security&quot;


<a name="PriorityEnum"></a>
## Enum: PriorityEnum
Name | Value
---- | -----
VERY_LOW | &quot;Very Low&quot;
LOW | &quot;Low&quot;
NORMAL | &quot;Normal&quot;
HIGH | &quot;High&quot;
VERY_HIGH | &quot;Very High&quot;



