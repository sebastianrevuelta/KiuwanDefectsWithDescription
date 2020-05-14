# AnalysesApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAnalysis**](AnalysesApi.md#deleteAnalysis) | **DELETE** /analysis | Delete analysis
[**getAnalysis**](AnalysesApi.md#getAnalysis) | **GET** /apps/analysis/{code} | Get application analysis
[**getAnalysisDefects**](AnalysesApi.md#getAnalysisDefects) | **GET** /apps/analysis/{code}/defects | Get list of analysis defects
[**getAnalysisDefectsDelta**](AnalysesApi.md#getAnalysisDefectsDelta) | **GET** /apps/analysis/{code}/defects/compare/{previouscode}/{defectstype} | Get the list of new/removed defects in a comparison
[**getAnalysisDelta**](AnalysesApi.md#getAnalysisDelta) | **GET** /apps/analysis/{code}/defects/compare/{previouscode} | Get comparison of the defects found in two different analysis
[**getAnalysisFiles**](AnalysesApi.md#getAnalysisFiles) | **GET** /apps/analysis/{code}/files | Get list of files with metric values and defects for a specific analysis
[**getFiles**](AnalysesApi.md#getFiles) | **GET** /applications/files | Get list of files with metric values and defects of the latest analysis
[**getLastAnalysis**](AnalysesApi.md#getLastAnalysis) | **GET** /applications/last_analysis | Get last analysis
[**listAnalyses**](AnalysesApi.md#listAnalyses) | **GET** /applications/analyses | Get list of all analysis codes for an application
[**listAnalysis**](AnalysesApi.md#listAnalysis) | **GET** /analysis/list | Get list of analysis


<a name="deleteAnalysis"></a>
# **deleteAnalysis**
> List&lt;String&gt; deleteAnalysis(analysisCode)

Delete analysis

Delete the specified analysis. The analysis code parameter can refernce a baseline or a delivery. Runnning or enqueued analyses can be also deleted. Note that when a baseline analysis is specified, all its related deliveries will be deleted as well. This endpoint returns the deleted analyses&#39; codes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String analysisCode = "analysisCode_example"; // String | Analysis code to delete
try {
    List<String> result = apiInstance.deleteAnalysis(analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#deleteAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisCode** | **String**| Analysis code to delete |

### Return type

**List&lt;String&gt;**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalysis"></a>
# **getAnalysis**
> AnalysisResultResponse getAnalysis(code)

Get application analysis

Retrieves analysis results for a concrete analysis specified by code parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String code = "code_example"; // String | Analysis code
try {
    AnalysisResultResponse result = apiInstance.getAnalysis(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |

### Return type

[**AnalysisResultResponse**](AnalysisResultResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalysisDefects"></a>
# **getAnalysisDefects**
> AnalysisDefectsResponse getAnalysisDefects(code, characteristics, languages, priorities, fileContains, orderBy, asc, page, count)

Get list of analysis defects

List analysis defects for a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String code = "code_example"; // String | Analysis code
String characteristics = "characteristics_example"; // String | Comma-separated list of characteristics to filter by
String languages = "languages_example"; // String | Comma-separated list of languages to filter by
String priorities = "priorities_example"; // String | Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by
String fileContains = "fileContains_example"; // String | Use this param to filter defects by file name
String orderBy = "orderBy_example"; // String | Sorting criteria (one of 'priority' or 'effort')
Boolean asc = true; // Boolean | Set to true to sort ascending (default is not set), false for descending
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 500; // Integer | How many defects in each page (defaults to 500)
try {
    AnalysisDefectsResponse result = apiInstance.getAnalysisDefects(code, characteristics, languages, priorities, fileContains, orderBy, asc, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getAnalysisDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |
 **characteristics** | **String**| Comma-separated list of characteristics to filter by | [optional] [enum: Efficiency, Maintainability, Portability, Reliability, Security]
 **languages** | **String**| Comma-separated list of languages to filter by | [optional]
 **priorities** | **String**| Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by | [optional] [enum: Very low, Low, Normal, High, Very high]
 **fileContains** | **String**| Use this param to filter defects by file name | [optional]
 **orderBy** | **String**| Sorting criteria (one of &#39;priority&#39; or &#39;effort&#39;) | [optional] [enum: priority, effort]
 **asc** | **Boolean**| Set to true to sort ascending (default is not set), false for descending | [optional]
 **page** | **Integer**| Number of results page (defaults to 1) | [optional] [default to 1]
 **count** | **Integer**| How many defects in each page (defaults to 500) | [optional] [default to 500]

### Return type

[**AnalysisDefectsResponse**](AnalysisDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalysisDefectsDelta"></a>
# **getAnalysisDefectsDelta**
> DefectsDeltaDetailResponse getAnalysisDefectsDelta(code, previouscode, defectstype)

Get the list of new/removed defects in a comparison

Get the list of new/removed defects in an analysis from the previous analysis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String code = "code_example"; // String | Analysis code
String previouscode = "previouscode_example"; // String | Previous analysis code
String defectstype = "defectstype_example"; // String | Either 'new' or 'removed'
try {
    DefectsDeltaDetailResponse result = apiInstance.getAnalysisDefectsDelta(code, previouscode, defectstype);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getAnalysisDefectsDelta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |
 **previouscode** | **String**| Previous analysis code |
 **defectstype** | **String**| Either &#39;new&#39; or &#39;removed&#39; | [enum: new, removed]

### Return type

[**DefectsDeltaDetailResponse**](DefectsDeltaDetailResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalysisDelta"></a>
# **getAnalysisDelta**
> DefectsDeltaResponse getAnalysisDelta(code, previouscode)

Get comparison of the defects found in two different analysis

Get the net number of new and removed defects and violated rules after comparing 2 given analyses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String code = "code_example"; // String | Analysis code
String previouscode = "previouscode_example"; // String | Previous analysis code
try {
    DefectsDeltaResponse result = apiInstance.getAnalysisDelta(code, previouscode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getAnalysisDelta");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |
 **previouscode** | **String**| Previous analysis code |

### Return type

[**DefectsDeltaResponse**](DefectsDeltaResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnalysisFiles"></a>
# **getAnalysisFiles**
> AnalysisFilesResponse getAnalysisFiles(code)

Get list of files with metric values and defects for a specific analysis

List files with metric values and defects for a specific analysis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String code = "code_example"; // String | Analysis code
try {
    AnalysisFilesResponse result = apiInstance.getAnalysisFiles(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getAnalysisFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |

### Return type

[**AnalysisFilesResponse**](AnalysisFilesResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFiles"></a>
# **getFiles**
> AnalysisFilesResponse getFiles(application)

Get list of files with metric values and defects of the latest analysis

List files with metric values and defects of the latest analysis for the named application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String application = "application_example"; // String | Application name
try {
    AnalysisFilesResponse result = apiInstance.getFiles(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |

### Return type

[**AnalysisFilesResponse**](AnalysisFilesResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLastAnalysis"></a>
# **getLastAnalysis**
> ApplicationAnalysisResponse getLastAnalysis(application)

Get last analysis

Retrieves last analysis for the authenticated user and the application indicated.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String application = "application_example"; // String | Application name
try {
    ApplicationAnalysisResponse result = apiInstance.getLastAnalysis(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#getLastAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |

### Return type

[**ApplicationAnalysisResponse**](ApplicationAnalysisResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAnalyses"></a>
# **listAnalyses**
> List&lt;AnalysisResponse&gt; listAnalyses(application, success, filterPurgedAnalyses, count)

Get list of all analysis codes for an application

List all analysis codes for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String application = "application_example"; // String | Application name
Boolean success = true; // Boolean | Set to true or false to retrieve only succeeded or failed, respectively
Boolean filterPurgedAnalyses = true; // Boolean | Set to true to not retrieve purged analyses
Integer count = 56; // Integer | Limit results
try {
    List<AnalysisResponse> result = apiInstance.listAnalyses(application, success, filterPurgedAnalyses, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#listAnalyses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **success** | **Boolean**| Set to true or false to retrieve only succeeded or failed, respectively | [optional]
 **filterPurgedAnalyses** | **Boolean**| Set to true to not retrieve purged analyses | [optional] [default to true]
 **count** | **Integer**| Limit results | [optional]

### Return type

[**List&lt;AnalysisResponse&gt;**](AnalysisResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAnalysis"></a>
# **listAnalysis**
> List&lt;AnalysisResultResponse&gt; listAnalysis(applicationName, initDate, endDate, status, auditStatus, deliveries, page, count)

Get list of analysis

List analysis with different parameters to filter data. See parameters section.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesApi;

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

AnalysesApi apiInstance = new AnalysesApi();
String applicationName = "applicationName_example"; // String | Application name to filter results
String initDate = "initDate_example"; // String | Initial date to start search
String endDate = "endDate_example"; // String | End date to search
String status = "status_example"; // String | Status to filter analysis
String auditStatus = "auditStatus_example"; // String | Audit status to filter analysis (only apply to analysis that has audits)
Boolean deliveries = true; // Boolean | If the list of analysis must include only deliveries (true) or ignore deliveries (false), if this parameter has not value then all analysis will be returned
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 500; // Integer | How many analysis in each page (defaults to 500)
try {
    List<AnalysisResultResponse> result = apiInstance.listAnalysis(applicationName, initDate, endDate, status, auditStatus, deliveries, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesApi#listAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**| Application name to filter results | [optional]
 **initDate** | **String**| Initial date to start search | [optional]
 **endDate** | **String**| End date to search | [optional]
 **status** | **String**| Status to filter analysis | [optional] [enum: SUCCESS, FAIL, INPROGRESS]
 **auditStatus** | **String**| Audit status to filter analysis (only apply to analysis that has audits) | [optional] [enum: OK, FAIL]
 **deliveries** | **Boolean**| If the list of analysis must include only deliveries (true) or ignore deliveries (false), if this parameter has not value then all analysis will be returned | [optional]
 **page** | **Integer**| Number of results page (defaults to 1) | [optional] [default to 1]
 **count** | **Integer**| How many analysis in each page (defaults to 500) | [optional] [default to 500]

### Return type

[**List&lt;AnalysisResultResponse&gt;**](AnalysisResultResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

