# DefectApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDefectNotes**](DefectApi.md#getDefectNotes) | **GET** /defect/{defectId}/notes | Get defect notes
[**getViolatedRuleFileDefectsViaGET**](DefectApi.md#getViolatedRuleFileDefectsViaGET) | **GET** /violatedrules/files/defects | Get defects of file
[**getViolatedRuleFilesViaGET**](DefectApi.md#getViolatedRuleFilesViaGET) | **GET** /violatedrules/files | Get files of a violated rule
[**getViolatedRules**](DefectApi.md#getViolatedRules) | **GET** /violatedrules | Get violated rules of an analysis
[**muteDefect**](DefectApi.md#muteDefect) | **POST** /defect/{defectId}/mute | Create suppresion rule for a defect
[**updateStatus**](DefectApi.md#updateStatus) | **POST** /defect/{defectId}/status | Update the status of a defect


<a name="getDefectNotes"></a>
# **getDefectNotes**
> List&lt;DefectNoteResponse&gt; getDefectNotes(defectId)

Get defect notes

Obtains the list of notes associated to this defect.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
Long defectId = 789L; // Long | Defect identifier
try {
    List<DefectNoteResponse> result = apiInstance.getDefectNotes(defectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#getDefectNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defectId** | **Long**| Defect identifier |

### Return type

[**List&lt;DefectNoteResponse&gt;**](DefectNoteResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getViolatedRuleFileDefectsViaGET"></a>
# **getViolatedRuleFileDefectsViaGET**
> List&lt;DefectLineResponse&gt; getViolatedRuleFileDefectsViaGET(application, analysisCode, ruleCode, file)

Get defects of file

Obtains the list of defects in a file for a concrete violated rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
String ruleCode = "ruleCode_example"; // String | Rule code
String file = "file_example"; // String | File name including path
try {
    List<DefectLineResponse> result = apiInstance.getViolatedRuleFileDefectsViaGET(application, analysisCode, ruleCode, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#getViolatedRuleFileDefectsViaGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |
 **ruleCode** | **String**| Rule code |
 **file** | **String**| File name including path |

### Return type

[**List&lt;DefectLineResponse&gt;**](DefectLineResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getViolatedRuleFilesViaGET"></a>
# **getViolatedRuleFilesViaGET**
> List&lt;FileWithDefectsResponse&gt; getViolatedRuleFilesViaGET(application, analysisCode, ruleCode)

Get files of a violated rule

Obtains the list of files where the violated rule affects.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
String ruleCode = "ruleCode_example"; // String | Rule code
try {
    List<FileWithDefectsResponse> result = apiInstance.getViolatedRuleFilesViaGET(application, analysisCode, ruleCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#getViolatedRuleFilesViaGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |
 **ruleCode** | **String**| Rule code |

### Return type

[**List&lt;FileWithDefectsResponse&gt;**](FileWithDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getViolatedRules"></a>
# **getViolatedRules**
> List&lt;ViolatedRuleResponse&gt; getViolatedRules(application, analysisCode, characteristic, language, priority, vulnerabilityType, tag, onlyCodeSecurity)

Get violated rules of an analysis

Obtains the list of violated rules of an analysis for the authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
String characteristic = "characteristic_example"; // String | CQM characteristic
String language = "language_example"; // String | CQM technology
String priority = "priority_example"; // String | Rule priority
String vulnerabilityType = "vulnerabilityType_example"; // String | Vulnerability type
String tag = "tag_example"; // String | Rule tag
Boolean onlyCodeSecurity = true; // Boolean | Only Code Security rules
try {
    List<ViolatedRuleResponse> result = apiInstance.getViolatedRules(application, analysisCode, characteristic, language, priority, vulnerabilityType, tag, onlyCodeSecurity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#getViolatedRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code | [optional]
 **characteristic** | **String**| CQM characteristic | [optional] [enum: Efficiency, Maintainability, Portability, Reliability, Security]
 **language** | **String**| CQM technology | [optional]
 **priority** | **String**| Rule priority | [optional] [enum: Very low, Low, Normal, High, Very high]
 **vulnerabilityType** | **String**| Vulnerability type | [optional] [enum: 'Permissions, privileges and access controls', 'Injection', 'Error handling and fault isolation', 'Other', 'Encryption and randomness', 'Misconfiguration', 'Design error', 'Initialization and shutdown', 'Control flow management', 'File handling', 'Number handling', 'System element isolation', 'Buffer handling', 'Information leaks', 'Pointer and reference handling']
 **tag** | **String**| Rule tag | [optional]
 **onlyCodeSecurity** | **Boolean**| Only Code Security rules | [optional]

### Return type

[**List&lt;ViolatedRuleResponse&gt;**](ViolatedRuleResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="muteDefect"></a>
# **muteDefect**
> muteDefect(defectId, why, comment)

Create suppresion rule for a defect

Create a suppression rule for this defect.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
Long defectId = 789L; // Long | Defect identifier
String why = "why_example"; // String | Mute reason
String comment = "comment_example"; // String | Mute comment
try {
    apiInstance.muteDefect(defectId, why, comment);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#muteDefect");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defectId** | **Long**| Defect identifier |
 **why** | **String**| Mute reason | [optional] [enum: NONE, FALSE_POSITIVE, TOO_MANY_DEFECTS, GENERATED_CODE, TOO_COMPLEX_CODE, OTHER]
 **comment** | **String**| Mute comment | [optional]

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateStatus"></a>
# **updateStatus**
> updateStatus(defectId, status, note)

Update the status of a defect

Update status of this defect and add a note, possible status are (NONE, TO_REVIEW, REVIEWED)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DefectApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Cookie
ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
Cookie.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Cookie.setApiKeyPrefix("Token");

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DefectApi apiInstance = new DefectApi();
Long defectId = 789L; // Long | Defect identifier
String status = "status_example"; // String | Defect status
String note = "note_example"; // String | Note detail
try {
    apiInstance.updateStatus(defectId, status, note);
} catch (ApiException e) {
    System.err.println("Exception when calling DefectApi#updateStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **defectId** | **Long**| Defect identifier |
 **status** | **String**| Defect status | [enum: NONE, TO_REVIEW, REVIEWED]
 **note** | **String**| Note detail | [optional]

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

