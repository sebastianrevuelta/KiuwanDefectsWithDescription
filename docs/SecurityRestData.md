
# SecurityRestData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Vulnerability identifier |  [optional]
**cve** | **String** | CVE reference (Common Vulnerabilities and Exposures) |  [optional]
**cwe** | **String** | CWE reference (Common Weakness Enumeration Specification) |  [optional]
**lastModified** | **String** | Last modified date |  [optional]
**exploitabilitySubscore** | **String** | Vulnerability exploitable sub-score |  [optional]
**impactSubscore** | **String** | Vulnerability impact sub-score |  [optional]
**getcVSSv2BaseScore** | **String** | Vulnerability CVSS v2 base score |  [optional]
**securityRisk** | **String** | Component security risk (high, medium, low, none, unknown) |  [optional]
**description** | **String** | Vulnerability description |  [optional]
**components** | [**List&lt;ComponentSimpleRestData&gt;**](ComponentSimpleRestData.md) | Components list affected by this vulnerability |  [optional]



