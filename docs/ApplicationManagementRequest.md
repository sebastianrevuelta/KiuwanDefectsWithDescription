
# ApplicationManagementRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Application name | 
**model** | **String** | Application model name |  [optional]
**description** | **String** | Application description |  [optional]
**portfolios** | [**List&lt;PortfolioData&gt;**](PortfolioData.md) | Application portfolios list |  [optional]
**targets** | **Map&lt;String, Double&gt;** | Application targets map |  [optional]
**newName** | **String** | New application name |  [optional]
**businessValue** | [**BusinessValueEnum**](#BusinessValueEnum) | Application business value |  [optional]
**provider** | **String** | Application provider |  [optional]
**modelId** | **Long** | Application model identifier |  [optional]
**newModelId** | **Long** | New model identifier |  [optional]


<a name="BusinessValueEnum"></a>
## Enum: BusinessValueEnum
Name | Value
---- | -----
VERY_LOW | &quot;VERY LOW&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;



