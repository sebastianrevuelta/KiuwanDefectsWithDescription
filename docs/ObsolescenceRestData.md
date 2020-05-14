
# ObsolescenceRestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | Component name |  [optional]
**language** | **String** | Technology (List of supported technologies in https://www.kiuwan.com/docs/display/K5/Kiuwan+Supported+Technologies) |  [optional]
**usedVersion** | **String** | Component used version |  [optional]
**dateUsed** | **String** | Component used version date |  [optional]
**lastVersion** | **String** | Component last version |  [optional]
**dateLast** | **String** | Component last version date |  [optional]
**release** | **String** | Number of releases between used and last version |  [optional]
**outOfDate** | **String** | Number of days between used and last version |  [optional]
**timeInactivity** | **String** | Number of days from last version date |  [optional]
**obsolescenceRisk** | **String** | Component obsolescence risk number, between 0-10 |  [optional]
**risk** | [**RiskEnum**](#RiskEnum) | Component obsolescence risk (High, Medium, Low) |  [optional]
**description** | **String** | Component description |  [optional]


<a name="RiskEnum"></a>
## Enum: RiskEnum
Name | Value
---- | -----
HIGH | &quot;High&quot;
MEDIUM | &quot;Medium&quot;
LOW | &quot;Low&quot;



