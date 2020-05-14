# AuditApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateAuditResultReport**](AuditApi.md#generateAuditResultReport) | **GET** /audits/result/export | Get audit result PDF report
[**getAuditDefects**](AuditApi.md#getAuditDefects) | **GET** /auditResult/defects | Get audit result defects
[**getAuditResult**](AuditApi.md#getAuditResult) | **GET** /auditResult | Get audit result
[**getFilesWithGET**](AuditApi.md#getFilesWithGET) | **GET** /audits/checkpoints/violatedrules/files | Get list of files
[**getLinesWithGET**](AuditApi.md#getLinesWithGET) | **GET** /audits/checkpoints/violatedrules/files/defects | Get list of defects of file


<a name="generateAuditResultReport"></a>
# **generateAuditResultReport**
> File generateAuditResultReport(code, application, changeRequest, deliveryLabel)

Get audit result PDF report

Obtains an audit report of the specified delivery in PDF format. It is necessary an analysis code or an application name and change request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

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

AuditApi apiInstance = new AuditApi();
String code = "code_example"; // String | Analysis code
String application = "application_example"; // String | Application name
String changeRequest = "changeRequest_example"; // String | Change request
String deliveryLabel = "deliveryLabel_example"; // String | Delivery label
try {
    File result = apiInstance.generateAuditResultReport(code, application, changeRequest, deliveryLabel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#generateAuditResultReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **code** | **String**| Analysis code | [optional]
 **application** | **String**| Application name | [optional]
 **changeRequest** | **String**| Change request | [optional]
 **deliveryLabel** | **String**| Delivery label | [optional]

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="getAuditDefects"></a>
# **getAuditDefects**
> List&lt;DefectDetailResponse&gt; getAuditDefects(deliveryCode, characteristics, languages, priorities, fileContains, orderBy, asc, limit)

Get audit result defects

Get defects of an audit result

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

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

AuditApi apiInstance = new AuditApi();
String deliveryCode = "deliveryCode_example"; // String | Delivery code
String characteristics = "characteristics_example"; // String | Comma-separated list of characteristics to filter by
String languages = "languages_example"; // String | Comma-separated list of languages to filter by
String priorities = "priorities_example"; // String | Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by
String fileContains = "fileContains_example"; // String | Use this param to filter defects by file name
String orderBy = "orderBy_example"; // String | Sorting criteria: priority/effort
Boolean asc = true; // Boolean | Sort ascending: true/false
Integer limit = 56; // Integer | Max number of defects returned
try {
    List<DefectDetailResponse> result = apiInstance.getAuditDefects(deliveryCode, characteristics, languages, priorities, fileContains, orderBy, asc, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditDefects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryCode** | **String**| Delivery code |
 **characteristics** | **String**| Comma-separated list of characteristics to filter by | [optional] [enum: Efficiency, Maintainability, Portability, Reliability, Security]
 **languages** | **String**| Comma-separated list of languages to filter by | [optional]
 **priorities** | **String**| Comma-separated list of priorities(Very low, Low, Normal, High, Very high) to filter by | [optional] [enum: Very low, Low, Normal, High, Very high]
 **fileContains** | **String**| Use this param to filter defects by file name | [optional]
 **orderBy** | **String**| Sorting criteria: priority/effort | [optional] [enum: priority, effort]
 **asc** | **Boolean**| Sort ascending: true/false | [optional]
 **limit** | **Integer**| Max number of defects returned | [optional]

### Return type

[**List&lt;DefectDetailResponse&gt;**](DefectDetailResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAuditResult"></a>
# **getAuditResult**
> AuditResultResponse getAuditResult(deliveryCode)

Get audit result

Get an audit result with defects count by priority

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

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

AuditApi apiInstance = new AuditApi();
String deliveryCode = "deliveryCode_example"; // String | Delivery code
try {
    AuditResultResponse result = apiInstance.getAuditResult(deliveryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deliveryCode** | **String**| Delivery code |

### Return type

[**AuditResultResponse**](AuditResultResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFilesWithGET"></a>
# **getFilesWithGET**
> List&lt;FileWithDefectsResponse&gt; getFilesWithGET(application, deliveryCode, ruleCode, checkpoint)

Get list of files

List files with a violated rule of an audit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

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

AuditApi apiInstance = new AuditApi();
String application = "application_example"; // String | Application name
String deliveryCode = "deliveryCode_example"; // String | Delivery code
String ruleCode = "ruleCode_example"; // String | Rule code
String checkpoint = "checkpoint_example"; // String | Checkpoint id
try {
    List<FileWithDefectsResponse> result = apiInstance.getFilesWithGET(application, deliveryCode, ruleCode, checkpoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getFilesWithGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **deliveryCode** | **String**| Delivery code |
 **ruleCode** | **String**| Rule code |
 **checkpoint** | **String**| Checkpoint id |

### Return type

[**List&lt;FileWithDefectsResponse&gt;**](FileWithDefectsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLinesWithGET"></a>
# **getLinesWithGET**
> List&lt;DefectLineResponse&gt; getLinesWithGET(application, deliveryCode, ruleCode, file, checkpoint)

Get list of defects of file

List defects in a file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

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

AuditApi apiInstance = new AuditApi();
String application = "application_example"; // String | Application name
String deliveryCode = "deliveryCode_example"; // String | Delivery code
String ruleCode = "ruleCode_example"; // String | Rule code
String file = "file_example"; // String | File name
String checkpoint = "checkpoint_example"; // String | Checkpoint id
try {
    List<DefectLineResponse> result = apiInstance.getLinesWithGET(application, deliveryCode, ruleCode, file, checkpoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getLinesWithGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **deliveryCode** | **String**| Delivery code |
 **ruleCode** | **String**| Rule code |
 **file** | **String**| File name |
 **checkpoint** | **String**| Checkpoint id |

### Return type

[**List&lt;DefectLineResponse&gt;**](DefectLineResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

