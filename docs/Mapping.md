
# Mapping

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mappingType** | [**MappingTypeEnum**](#MappingTypeEnum) | Mapping type |  [optional]
**vendorOtherType** | **String** | Other type vendor. Required for &#39;OTHER&#39; and &#39;TOOL_VENDOR&#39; mappingType; optional for &#39;CWE&#39; and &#39;CVE&#39; |  [optional]
**value** | **String** | Mapping value (CWE id or Kiuwan rule code) |  [optional]
**primary** | **Boolean** | True depending on whether this is the primary for the mappingType |  [optional]


<a name="MappingTypeEnum"></a>
## Enum: MappingTypeEnum
Name | Value
---- | -----
CWE | &quot;CWE&quot;
CVE | &quot;CVE&quot;
OTHER | &quot;OTHER&quot;
TOOL_VENDOR | &quot;TOOL_VENDOR&quot;



