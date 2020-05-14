# DocumentationApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRuleDoc**](DocumentationApi.md#getRuleDoc) | **GET** /doc/rule | Get rule&#39;s documentation


<a name="getRuleDoc"></a>
# **getRuleDoc**
> RuleDocumentationResponse getRuleDoc(modelId, code, application)

Get rule&#39;s documentation

Obtains the documentation of a rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DocumentationApi;

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

DocumentationApi apiInstance = new DocumentationApi();
String modelId = "modelId_example"; // String | Model id
String code = "code_example"; // String | Rule code
String application = "application_example"; // String | Application name
try {
    RuleDocumentationResponse result = apiInstance.getRuleDoc(modelId, code, application);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DocumentationApi#getRuleDoc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Model id |
 **code** | **String**| Rule code |
 **application** | **String**| Application name |

### Return type

[**RuleDocumentationResponse**](RuleDocumentationResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

