
# Finding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nativeId** | **String** | Native id |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Threadfix severity |  [optional]
**nativeSeverity** | **String** | Kiuwan severity |  [optional]
**summary** | **String** | Rule name |  [optional]
**mappings** | [**List&lt;Mapping&gt;**](Mapping.md) | Mapping with different codes as CWE or kiuwan code |  [optional]
**scannerDetail** | **String** | Rule description |  [optional]
**scannerRecommendation** | **String** | Rule remediation |  [optional]
**staticDetails** | [**StaticDetails**](StaticDetails.md) | Violation details |  [optional]
**metadata** | **Map&lt;String, String&gt;** | Metadata information with language, characteristic, vulnerability type, effort, status and muted |  [optional]
**tags** | **List&lt;String&gt;** | Tags list |  [optional]
**comments** | **List&lt;String&gt;** | Comments list |  [optional]


<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
INFO | &quot;INFO&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;



