# LanguagesApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLanguages**](LanguagesApi.md#getLanguages) | **GET** /languages | Get languages


<a name="getLanguages"></a>
# **getLanguages**
> Map&lt;String, String&gt; getLanguages()

Get languages

Obtains a map of languages specifying the language code and the language name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LanguagesApi;

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

LanguagesApi apiInstance = new LanguagesApi();
try {
    Map<String, String> result = apiInstance.getLanguages();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LanguagesApi#getLanguages");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Map&lt;String, String&gt;**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

