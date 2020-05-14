
# ApplicationAnalysisResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Application name |  [optional]
**description** | **String** | Application description |  [optional]
**auditName** | **String** | Application audit name |  [optional]
**applicationBusinessValue** | [**ApplicationBusinessValueEnum**](#ApplicationBusinessValueEnum) | Application business value |  [optional]
**applicationProvider** | **String** | Application provider |  [optional]
**applicationPortfolios** | **Map&lt;String, String&gt;** | Map of application portfolios |  [optional]
**label** | **String** | Analysis label |  [optional]
**date** | **String** | Analysis creation date |  [optional]
**modelId** | **Long** | Analysis model identifier |  [optional]
**encoding** | **String** | Analysis encoding |  [optional]
**analysisCode** | **String** | Analysis code |  [optional]
**analysisURL** | **String** | Kiuwan link to view the analysis detail |  [optional]
**auditResultURL** | **String** | Kiuwan link to view the audit result of the analisys |  [optional]
**analysisBusinessValue** | [**AnalysisBusinessValueEnum**](#AnalysisBusinessValueEnum) | Analysis business value |  [optional]
**analysisProvider** | **String** | Analysis provider |  [optional]
**analysisPortfolios** | **Map&lt;String, String&gt;** | Map of analysis portfolios |  [optional]
**analysisStatus** | [**AnalysisStatusEnum**](#AnalysisStatusEnum) | Analysis status |  [optional]
**languages** | [**List&lt;MetricValueData&gt;**](MetricValueData.md) | Languages metric list |  [optional]
**architecture** | [**MetadataArchitectureData**](MetadataArchitectureData.md) | Architecture detail |  [optional]
**insightsData** | [**MetadataInsightsData**](MetadataInsightsData.md) | Insights metadata |  [optional]
**qualityModel** | **String** | Application quality model name |  [optional]
**orderedBy** | **String** | Analysis user invoker |  [optional]
**riskIndex** | [**MetricValueData**](MetricValueData.md) | Risk index metric |  [optional]
**qualityIndicator** | [**MetricValueData**](MetricValueData.md) | Quality indicator metric |  [optional]
**effortToTarget** | [**MetricValueData**](MetricValueData.md) | Effort to target metric |  [optional]
**mainMetrics** | [**List&lt;MetricValueData&gt;**](MetricValueData.md) | Main metrics list |  [optional]
**security** | **Map&lt;String, Object&gt;** | Map of security metrics |  [optional]


<a name="ApplicationBusinessValueEnum"></a>
## Enum: ApplicationBusinessValueEnum
Name | Value
---- | -----
VERY_LOW | &quot;VERY LOW&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;


<a name="AnalysisBusinessValueEnum"></a>
## Enum: AnalysisBusinessValueEnum
Name | Value
---- | -----
VERY_LOW | &quot;VERY LOW&quot;
LOW | &quot;LOW&quot;
MEDIUM | &quot;MEDIUM&quot;
HIGH | &quot;HIGH&quot;
CRITICAL | &quot;CRITICAL&quot;


<a name="AnalysisStatusEnum"></a>
## Enum: AnalysisStatusEnum
Name | Value
---- | -----
EXECUTING | &quot;EXECUTING&quot;
FINISHED | &quot;FINISHED&quot;
FINISHED_WITH_ERROR | &quot;FINISHED_WITH_ERROR&quot;



