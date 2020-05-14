# InsightsApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**insightReportSummary**](InsightsApi.md#insightReportSummary) | **GET** /insights/analysis/summary/export | Get PDF report of insight
[**listInsightsComponents**](InsightsApi.md#listInsightsComponents) | **GET** /insights/analysis/components | Get list of components
[**listLicenses**](InsightsApi.md#listLicenses) | **GET** /insights/analysis/licenses | Get list of licenses
[**listObsolescences**](InsightsApi.md#listObsolescences) | **GET** /insights/analysis/obsolescence | Get list of obsolescences
[**listVulnerabilities**](InsightsApi.md#listVulnerabilities) | **GET** /insights/analysis/security | Get insight security detail list


<a name="insightReportSummary"></a>
# **insightReportSummary**
> File insightReportSummary(application, analysisCode)

Get PDF report of insight

Obtains an insight report for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InsightsApi;

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

InsightsApi apiInstance = new InsightsApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
try {
    File result = apiInstance.insightReportSummary(application, analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightsApi#insightReportSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |

### Return type

[**File**](File.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

<a name="listInsightsComponents"></a>
# **listInsightsComponents**
> ListInsightsComponentsResponse listInsightsComponents(application, analysisCode)

Get list of components

List components in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InsightsApi;

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

InsightsApi apiInstance = new InsightsApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
try {
    ListInsightsComponentsResponse result = apiInstance.listInsightsComponents(application, analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightsApi#listInsightsComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |

### Return type

[**ListInsightsComponentsResponse**](ListInsightsComponentsResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLicenses"></a>
# **listLicenses**
> ListLicensesResponse listLicenses(application, analysisCode)

Get list of licenses

List licenses in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InsightsApi;

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

InsightsApi apiInstance = new InsightsApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
try {
    ListLicensesResponse result = apiInstance.listLicenses(application, analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightsApi#listLicenses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |

### Return type

[**ListLicensesResponse**](ListLicensesResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listObsolescences"></a>
# **listObsolescences**
> ListObsolescencesResponse listObsolescences(application, analysisCode)

Get list of obsolescences

List obsolescences in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InsightsApi;

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

InsightsApi apiInstance = new InsightsApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
try {
    ListObsolescencesResponse result = apiInstance.listObsolescences(application, analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightsApi#listObsolescences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |

### Return type

[**ListObsolescencesResponse**](ListObsolescencesResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listVulnerabilities"></a>
# **listVulnerabilities**
> ListSecuritiesResponse listVulnerabilities(application, analysisCode)

Get insight security detail list

List security in analysis for an application name specified in application parameter and a concrete analysis specified by analysisCode parameter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.InsightsApi;

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

InsightsApi apiInstance = new InsightsApi();
String application = "application_example"; // String | Application name
String analysisCode = "analysisCode_example"; // String | Analysis code
try {
    ListSecuritiesResponse result = apiInstance.listVulnerabilities(application, analysisCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InsightsApi#listVulnerabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **application** | **String**| Application name |
 **analysisCode** | **String**| Analysis code |

### Return type

[**ListSecuritiesResponse**](ListSecuritiesResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

