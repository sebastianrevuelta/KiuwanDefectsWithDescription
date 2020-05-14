
# CheckpointResultData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkpoint** | **String** | Checkpoint |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | Checkpoint result |  [optional]
**name** | **String** | Checkpoint name |  [optional]
**description** | **String** | Checkpont decription |  [optional]
**weight** | **Integer** | Weight |  [optional]
**mandatory** | **Boolean** | Indicates if the checkpoint is mandatory or not |  [optional]
**type** | **String** | Checkpoint type |  [optional]
**score** | **Double** | Checkpoint score |  [optional]
**violatedRules** | [**List&lt;ViolatedRuleResponse&gt;**](ViolatedRuleResponse.md) | List of violated rules |  [optional]


<a name="ResultEnum"></a>
## Enum: ResultEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
FAIL | &quot;FAIL&quot;



