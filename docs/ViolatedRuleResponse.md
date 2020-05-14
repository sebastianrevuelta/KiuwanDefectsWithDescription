
# ViolatedRuleResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ruleCode** | **String** | Rule code |  [optional]
**modelId** | **Long** | Model identifier |  [optional]
**defectsCount** | **Long** | Number of defects |  [optional]
**suppressedDefectsCount** | **Long** | Number of suppressed defects |  [optional]
**filesCount** | **Long** | Number of files |  [optional]
**effort** | **String** | Rule effort |  [optional]
**characteristic** | [**CharacteristicEnum**](#CharacteristicEnum) | CQM characteristic |  [optional]
**vulnerabilityType** | **String** | Vulnerability type (More info in https://www.kiuwan.com/docs/display/K5/Kiuwan+Vulnerability+Types) |  [optional]
**tags** | **List&lt;String&gt;** | Tags list |  [optional]
**priority** | [**PriorityEnum**](#PriorityEnum) | CQM priority |  [optional]
**language** | **String** | CQM technology (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies) |  [optional]
**files** | [**HrefData**](HrefData.md) | Link to files |  [optional]


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



