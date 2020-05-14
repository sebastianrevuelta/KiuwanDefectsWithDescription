
# ApplicationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Application name |  [optional]
**description** | **String** | Application description |  [optional]
**auditName** | **String** | Application audit name |  [optional]
**applicationBusinessValue** | [**ApplicationBusinessValueEnum**](#ApplicationBusinessValueEnum) | Application business value |  [optional]
**applicationProvider** | **String** | Application provider |  [optional]
**applicationPortfolios** | **Map&lt;String, String&gt;** | Map of application portfolios |  [optional]
**qualityModel** | **String** | Application quality model name |  [optional]


<a name="ApplicationBusinessValueEnum"></a>
## Enum: ApplicationBusinessValueEnum
Name | Value
---- | -----
VERY_LOW | &quot;VERY LOW&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;



