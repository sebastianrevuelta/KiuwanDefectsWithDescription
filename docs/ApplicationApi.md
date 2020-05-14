# ApplicationApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadSuppressions**](ApplicationApi.md#downloadSuppressions) | **GET** /qualitymodel/suppressions | Get suppression rules
[**getApplications**](ApplicationApi.md#getApplications) | **GET** /applications | Get applications
[**getApplicationsList**](ApplicationApi.md#getApplicationsList) | **GET** /applications/list | Get applications filtered
[**getDefects**](ApplicationApi.md#getDefects) | **GET** /applications/defects | Get list of application defects
[**getDefectsStillOpen**](ApplicationApi.md#getDefectsStillOpen) | **GET** /applications/defects/stillopen | Get Application Defects Still Open since date
[**getMetricsMap**](ApplicationApi.md#getMetricsMap) | **GET** /metrics | Get analysis global metrics
[**getThreadfixFindings**](ApplicationApi.md#getThreadfixFindings) | **GET** /applications/defects/export/threadfix | Get list of application vulnerabilities in Threadfix format


<a name="downloadSuppressions"></a>
# **downloadSuppressions**
> String downloadSuppressions(application)

Get suppression rules

Get suppression rules for application given as parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String application = "application_example"; // String | Application name
try {
    String result = apiInstance.downloadSuppressions(application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#downloadSuppressions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |

### Return type

**String**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getApplications"></a>
# **getApplications**
> List&lt;ApplicationResponse&gt; getApplications()

Get applications

Retrieves applications for the authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
try {
    List<ApplicationResponse> result = apiInstance.getApplications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplications");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ApplicationResponse&gt;**](ApplicationResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getApplicationsList"></a>
# **getApplicationsList**
> List&lt;ApplicationResponse&gt; getApplicationsList(applicationName, exactApplicationName, initDateAnalysis, endDateAnalysis, page, count, orderBy, asc)

Get applications filtered

Retrieves applications for the authenticated user filtered.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String applicationName = "applicationName_example"; // String | Application name to filter
Boolean exactApplicationName = true; // Boolean | Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided
String initDateAnalysis = "initDateAnalysis_example"; // String | Initial date to start search applications that are analyzed after this date
String endDateAnalysis = "endDateAnalysis_example"; // String | End date to start search applications that are analyzed before this date
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 500; // Integer | How many applications in each page (defaults to 500)
String orderBy = "orderBy_example"; // String | 'Order by' for results
Boolean asc = true; // Boolean | Ascending or descending order
try {
    List<ApplicationResponse> result = apiInstance.getApplicationsList(applicationName, exactApplicationName, initDateAnalysis, endDateAnalysis, page, count, orderBy, asc);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getApplicationsList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationName** | **String**| Application name to filter | [optional]
 **exactApplicationName** | **Boolean**| Indicates if the applicationName must be equals (ignore case). Only apply if applicationName is provided | [optional]
 **initDateAnalysis** | **String**| Initial date to start search applications that are analyzed after this date | [optional]
 **endDateAnalysis** | **String**| End date to start search applications that are analyzed before this date | [optional]
 **page** | **Integer**| Number of results page (defaults to 1) | [optional] [default to 1]
 **count** | **Integer**| How many applications in each page (defaults to 500) | [optional] [default to 500]
 **orderBy** | **String**| &#39;Order by&#39; for results | [optional] [enum: applicationName, analysisDate]
 **asc** | **Boolean**| Ascending or descending order | [optional]

### Return type

[**List&lt;ApplicationResponse&gt;**](ApplicationResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDefects"></a>
# **getDefects**
> AnalysisDefectsResponse getDefects(application, characteristics, languages, priorities, fileContains, orderBy, asc, page, count)

Get list of application defects

List application defects for the indicated application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String application = "application_example"; // String | Application name
String characteristics = "characteristics_example"; // String | Comma-separated list of characteristics to filter by
String languages = "languages_example"; // String | Comma-separated list of languages to filter by
String priorities = "priorities_example"; // String | Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by
String fileContains = "fileContains_example"; // String | Use this param to filter defects by file name
String orderBy = "orderBy_example"; // String | Sorting criteria (one of 'priority' or 'effort')
Boolean asc = true; // Boolean | Set to true to sort ascending (default is not set), false for descending
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 500; // Integer | How many defects in each page (defaults to 500)
try {
    AnalysisDefectsResponse result = apiInstance.getDefects(application, characteristics, languages, priorities, fileContains, orderBy, asc, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
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

<a name="getDefectsStillOpen"></a>
# **getDefectsStillOpen**
> DefectsKeptInCommonDetailResponse getDefectsStillOpen(application, sinceDate, sinceAnalysisCode, atAnalysisCode, onlyCodeSecurity, withRuleTags, page, count)

Get Application Defects Still Open since date

Get Application defects still open on latest analysis( or atAnalysisCode if provided) sinceDate (or previous sinceAnalysisCode if provided). Can be filtered by onlySecurity or by withRuleTag. Paginated

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String application = "application_example"; // String | Application Name
String sinceDate = "sinceDate_example"; // String | Defects open since this date
String sinceAnalysisCode = "sinceAnalysisCode_example"; // String | Find defects still open at this analyis
String atAnalysisCode = "atAnalysisCode_example"; // String | Find defects that were already open on this Analysis
Boolean onlyCodeSecurity = true; // Boolean | Only Defects on Code Security rules
String withRuleTags = "withRuleTags_example"; // String | Only Defects Open from the Rules with the matching tags (split by ',')
Integer page = 1; // Integer | Number of results page (defaults to 1)
Integer count = 500; // Integer | How many defects in each page (defaults to 500)
try {
    DefectsKeptInCommonDetailResponse result = apiInstance.getDefectsStillOpen(application, sinceDate, sinceAnalysisCode, atAnalysisCode, onlyCodeSecurity, withRuleTags, page, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getDefectsStillOpen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application Name |
 **sinceDate** | **String**| Defects open since this date | [optional]
 **sinceAnalysisCode** | **String**| Find defects still open at this analyis | [optional]
 **atAnalysisCode** | **String**| Find defects that were already open on this Analysis | [optional]
 **onlyCodeSecurity** | **Boolean**| Only Defects on Code Security rules | [optional]
 **withRuleTags** | **String**| Only Defects Open from the Rules with the matching tags (split by &#39;,&#39;) | [optional]
 **page** | **Integer**| Number of results page (defaults to 1) | [optional] [default to 1]
 **count** | **Integer**| How many defects in each page (defaults to 500) | [optional] [default to 500]

### Return type

[**DefectsKeptInCommonDetailResponse**](DefectsKeptInCommonDetailResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMetricsMap"></a>
# **getMetricsMap**
> Map&lt;String, Object&gt; getMetricsMap(code)

Get analysis global metrics

Obtains the global metrics of indicated analysis.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String code = "code_example"; // String | Analysis code
try {
    Map<String, Object> result = apiInstance.getMetricsMap(code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getMetricsMap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThreadfixFindings"></a>
# **getThreadfixFindings**
> Scan getThreadfixFindings(application, code)

Get list of application vulnerabilities in Threadfix format

List application vulnerabilities in Threadfix format for the given application or analysis code.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ApplicationApi;

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

ApplicationApi apiInstance = new ApplicationApi();
String application = "application_example"; // String | Application name
String code = "code_example"; // String | Analysis code
try {
    Scan result = apiInstance.getThreadfixFindings(application, code);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApplicationApi#getThreadfixFindings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name | [optional]
 **code** | **String**| Analysis code | [optional]

### Return type

[**Scan**](Scan.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

