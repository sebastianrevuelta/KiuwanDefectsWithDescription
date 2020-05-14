# GlobalStatsApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStats**](GlobalStatsApi.md#getStats) | **GET** /stats | Get the user information


<a name="getStats"></a>
# **getStats**
> List&lt;GlobalCounterResponse&gt; getStats()

Get the user information

Obtains the user&#39;s global information about locs, files and analysis as JSON.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalStatsApi;

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

GlobalStatsApi apiInstance = new GlobalStatsApi();
try {
    List<GlobalCounterResponse> result = apiInstance.getStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalStatsApi#getStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GlobalCounterResponse&gt;**](GlobalCounterResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

