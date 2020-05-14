
# AnalysisResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | Analysis code |  [optional]
**label** | **String** | Analysis label |  [optional]
**creationDate** | **String** | Analysis creation date |  [optional]
**qualityModel** | **String** | Quality model |  [optional]
**modelId** | **String** | Model indentifier |  [optional]
**encoding** | **String** | Analysis enconding |  [optional]
**invoker** | **String** | Analysis user invoker |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Analysis status |  [optional]
**errorCode** | **String** | Analysis error code |  [optional]
**unparsedFiles** | [**List&lt;UnparsedFileData&gt;**](UnparsedFileData.md) | Unparsed files list |  [optional]
**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) | Analysis scope |  [optional]
**changeRequest** | **String** | Delivery change request |  [optional]
**changeRequestStatus** | [**ChangeRequestStatusEnum**](#ChangeRequestStatusEnum) | Change request status |  [optional]
**branchName** | **String** | Delivery branch name |  [optional]
**auditResult** | **String** | Delivery audit result |  [optional]
**analysisBusinessValue** | [**AnalysisBusinessValueEnum**](#AnalysisBusinessValueEnum) | Analysis business value |  [optional]
**analysisProvider** | **String** | Analysis provider |  [optional]
**analysisPortfolios** | **Map&lt;String, Object&gt;** | Map of analysis portfolios |  [optional]
**metrics** | **Map&lt;String, Double&gt;** | Map of analysis metrics |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INQUEUE | &quot;INQUEUE&quot;
FAIL | &quot;FAIL&quot;
SUCCESS | &quot;SUCCESS&quot;
RUNNING | &quot;RUNNING&quot;


<a name="AnalysisScopeEnum"></a>
## Enum: AnalysisScopeEnum
Name | Value
---- | -----
BASELINE | &quot;Baseline&quot;
COMPLETE_DELIVERY | &quot;Complete delivery&quot;
PARTIAL_DELIVERY | &quot;Partial delivery&quot;


<a name="ChangeRequestStatusEnum"></a>
## Enum: ChangeRequestStatusEnum
Name | Value
---- | -----
RESOLVED | &quot;Resolved&quot;
IN_PROGRESS | &quot;In progress&quot;


<a name="AnalysisBusinessValueEnum"></a>
## Enum: AnalysisBusinessValueEnum
Name | Value
---- | -----
VERY_LOW | &quot;VERY LOW&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;



