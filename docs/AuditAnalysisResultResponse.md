
# AuditAnalysisResultResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditName** | **String** | Audit name |  [optional]
**description** | **String** | Audit description |  [optional]
**approvalThreshold** | **Double** | Audit approval threshold |  [optional]
**overallResult** | [**OverallResultEnum**](#OverallResultEnum) | Audit overall result |  [optional]
**score** | **Double** | Score |  [optional]
**checkpointResults** | [**List&lt;CheckpointResultData&gt;**](CheckpointResultData.md) | List of checkpoint results |  [optional]


<a name="OverallResultEnum"></a>
## Enum: OverallResultEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
FAIL | &quot;FAIL&quot;



