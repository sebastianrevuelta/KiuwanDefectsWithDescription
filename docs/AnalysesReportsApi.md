# AnalysesReportsApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateReportDefects**](AnalysesReportsApi.md#generateReportDefects) | **GET** /applications/analysis/defects/export | Get defects CSV report of an analysis
[**generateReportSummaryCA**](AnalysesReportsApi.md#generateReportSummaryCA) | **GET** /applications/analysis/summary/export | Get PDF report of an analysis
[**generateReportSummaryCS**](AnalysesReportsApi.md#generateReportSummaryCS) | **GET** /applications/analysis/security/summary/export | Get security PDF report of an analysis
[**generateReportVulnerabilities**](AnalysesReportsApi.md#generateReportVulnerabilities) | **GET** /applications/analysis/vulnerabilities/export | Get security CSV/Threadfix report of an analysis


<a name="generateReportDefects"></a>
# **generateReportDefects**
> File generateReportDefects(code, application)

Get defects CSV report of an analysis

Obtains a CSV report of the specified analysis code or the last analysis of the application name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesReportsApi;

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

AnalysesReportsApi apiInstance = new AnalysesReportsApi();
String code = "code_example"; // String | Analysis code
String application = "application_example"; // String | Application name
try {
    File result = apiInstance.generateReportDefects(code, application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesReportsApi#generateReportDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code | [optional]
 **application** | **String**| Application name | [optional]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

<a name="generateReportSummaryCA"></a>
# **generateReportSummaryCA**
> File generateReportSummaryCA(code, application)

Get PDF report of an analysis

Obtains a report of the specified analysis code or the last analysis of the application name in PDF format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesReportsApi;

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

AnalysesReportsApi apiInstance = new AnalysesReportsApi();
String code = "code_example"; // String | Analysis code
String application = "application_example"; // String | Application name
try {
    File result = apiInstance.generateReportSummaryCA(code, application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesReportsApi#generateReportSummaryCA");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code | [optional]
 **application** | **String**| Application name | [optional]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="generateReportSummaryCS"></a>
# **generateReportSummaryCS**
> File generateReportSummaryCS(code, application)

Get security PDF report of an analysis

Obtains a security report of the specified analysis code or the last analysis of the application name in PDF format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesReportsApi;

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

AnalysesReportsApi apiInstance = new AnalysesReportsApi();
String code = "code_example"; // String | Analysis code
String application = "application_example"; // String | Application name
try {
    File result = apiInstance.generateReportSummaryCS(code, application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesReportsApi#generateReportSummaryCS");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code | [optional]
 **application** | **String**| Application name | [optional]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="generateReportVulnerabilities"></a>
# **generateReportVulnerabilities**
> File generateReportVulnerabilities(code, application, type)

Get security CSV/Threadfix report of an analysis

Obtains a security report of the specified analysis code or the last analysis of the application name in CSV or Threadfix format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnalysesReportsApi;

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

AnalysesReportsApi apiInstance = new AnalysesReportsApi();
String code = "code_example"; // String | Analysis code
String application = "application_example"; // String | Application name
String type = "CSV"; // String | type of report
try {
    File result = apiInstance.generateReportVulnerabilities(code, application, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnalysesReportsApi#generateReportVulnerabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code | [optional]
 **application** | **String**| Application name | [optional]
 **type** | **String**| type of report | [optional] [default to CSV] [enum: CSV, THREADFIX]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/json

