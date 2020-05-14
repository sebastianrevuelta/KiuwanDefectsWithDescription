# ActionPlanReportsApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateReportActionPlanProgress**](ActionPlanReportsApi.md#generateReportActionPlanProgress) | **GET** /actionPlan/progress/export | Get progress report of an action plan
[**generateReportActionPlanSecurity**](ActionPlanReportsApi.md#generateReportActionPlanSecurity) | **GET** /actionPlan/security/export | Get security report of an action plan
[**generateReportActionPlanSecurityProgress**](ActionPlanReportsApi.md#generateReportActionPlanSecurityProgress) | **GET** /actionPlan/security/progress/export | Get security progress report of an action plan


<a name="generateReportActionPlanProgress"></a>
# **generateReportActionPlanProgress**
> File generateReportActionPlanProgress(application, name, creation, type)

Get progress report of an action plan

Get progress report of an action plan or JSON with errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanReportsApi;

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

ActionPlanReportsApi apiInstance = new ActionPlanReportsApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
String type = "PDF"; // String | Type of report
try {
    File result = apiInstance.generateReportActionPlanProgress(application, name, creation, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanReportsApi#generateReportActionPlanProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]
 **type** | **String**| Type of report | [optional] [default to PDF] [enum: CSV, PDF]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, text/csv, application/json

<a name="generateReportActionPlanSecurity"></a>
# **generateReportActionPlanSecurity**
> File generateReportActionPlanSecurity(application, name, creation, type)

Get security report of an action plan

Get security report of an action plan or JSON with errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanReportsApi;

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

ActionPlanReportsApi apiInstance = new ActionPlanReportsApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
String type = "PDF"; // String | Type of report
try {
    File result = apiInstance.generateReportActionPlanSecurity(application, name, creation, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanReportsApi#generateReportActionPlanSecurity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]
 **type** | **String**| Type of report | [optional] [default to PDF] [enum: CSV, PDF]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, text/csv, application/json

<a name="generateReportActionPlanSecurityProgress"></a>
# **generateReportActionPlanSecurityProgress**
> File generateReportActionPlanSecurityProgress(application, name, creation, type)

Get security progress report of an action plan

Get security progress report of an action plan or JSON with errors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ActionPlanReportsApi;

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

ActionPlanReportsApi apiInstance = new ActionPlanReportsApi();
String application = "application_example"; // String | Application name
String name = "name_example"; // String | Action plan name
OffsetDateTime creation = OffsetDateTime.now(); // OffsetDateTime | Action plan creation date
String type = "PDF"; // String | Type of report
try {
    File result = apiInstance.generateReportActionPlanSecurityProgress(application, name, creation, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActionPlanReportsApi#generateReportActionPlanSecurityProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **name** | **String**| Action plan name |
 **creation** | **OffsetDateTime**| Action plan creation date | [optional]
 **type** | **String**| Type of report | [optional] [default to PDF] [enum: CSV, PDF]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, text/csv, application/json

