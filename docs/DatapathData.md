
# DatapathData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Integer** | Datapath index |  [optional]
**kind** | [**KindEnum**](#KindEnum) | Datapath kind |  [optional]
**varname** | **String** | Datapath tainted variable name |  [optional]
**lineNumber** | **Integer** | Line number |  [optional]
**lineText** | **String** | Line text |  [optional]
**indirect** | **Boolean** | If is a indirect datapath |  [optional]
**file** | **String** | Datapath file |  [optional]
**container** | **String** | Container |  [optional]
**localId** | **Integer** | Local id for this vulnerability |  [optional]
**localParentId** | **Integer** | Parent id of this datapath |  [optional]


<a name="KindEnum"></a>
## Enum: KindEnum
Name | Value
---- | -----
ASSIGN | &quot;assign&quot;
CALL | &quot;call&quot;
OTHER | &quot;other&quot;
SINK | &quot;sink&quot;
SOURCE | &quot;source&quot;



