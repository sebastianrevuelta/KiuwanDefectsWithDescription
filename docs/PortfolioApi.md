# PortfolioApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPortfolioGroups**](PortfolioApi.md#createPortfolioGroups) | **POST** /portfolios | Create or update portfolio definitions
[**existsPortfolioValue**](PortfolioApi.md#existsPortfolioValue) | **GET** /portfolios/{portfolio}/{value}/exists | Get if portfolio and portfolio value exists
[**getPortfolioGroups**](PortfolioApi.md#getPortfolioGroups) | **GET** /portfolios | Get portfolio definitions
[**getPortfolioValuesByName**](PortfolioApi.md#getPortfolioValuesByName) | **GET** /portfolios/{portfolio}/values/list | Get list of portfolio values by portfolio name
[**getUserRolesPortfolio**](PortfolioApi.md#getUserRolesPortfolio) | **GET** /portfolios/{portfolio}/users/roles | Get users roles by portfolio


<a name="createPortfolioGroups"></a>
# **createPortfolioGroups**
> createPortfolioGroups(body)

Create or update portfolio definitions

Creates or update portfolio definitions for an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PortfolioApi;

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

PortfolioApi apiInstance = new PortfolioApi();
PortfolioDefinitionData body = new PortfolioDefinitionData(); // PortfolioDefinitionData | Portfolio to be saved
try {
    apiInstance.createPortfolioGroups(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#createPortfolioGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortfolioDefinitionData**](PortfolioDefinitionData.md)| Portfolio to be saved |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="existsPortfolioValue"></a>
# **existsPortfolioValue**
> Boolean existsPortfolioValue(portfolio, value)

Get if portfolio and portfolio value exists

Check if portfolio and portfolio value exists. This endpoint return an error code 15 if the portfolio name not exists and return true if exists the pair protfolio name and value and false if exists portfolio name but not exists the portfolio value for this portfolio name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PortfolioApi;

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

PortfolioApi apiInstance = new PortfolioApi();
String portfolio = "portfolio_example"; // String | Portfolio name
String value = "value_example"; // String | Portfolio value
try {
    Boolean result = apiInstance.existsPortfolioValue(portfolio, value);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#existsPortfolioValue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | **String**| Portfolio name |
 **value** | **String**| Portfolio value |

### Return type

**Boolean**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioGroups"></a>
# **getPortfolioGroups**
> List&lt;PortfolioDefinitionData&gt; getPortfolioGroups()

Get portfolio definitions

Obtains the portfolio definitions of an account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PortfolioApi;

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

PortfolioApi apiInstance = new PortfolioApi();
try {
    List<PortfolioDefinitionData> result = apiInstance.getPortfolioGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;PortfolioDefinitionData&gt;**](PortfolioDefinitionData.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPortfolioValuesByName"></a>
# **getPortfolioValuesByName**
> List&lt;String&gt; getPortfolioValuesByName(portfolio)

Get list of portfolio values by portfolio name

List all portfolio values asociated to portfolio name. This endpoint return an error code 15 if the portfolio name not exists, in other case, it return the list of portfolio values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PortfolioApi;

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

PortfolioApi apiInstance = new PortfolioApi();
String portfolio = "portfolio_example"; // String | Portfolio name
try {
    List<String> result = apiInstance.getPortfolioValuesByName(portfolio);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getPortfolioValuesByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | **String**| Portfolio name |

### Return type

**List&lt;String&gt;**

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUserRolesPortfolio"></a>
# **getUserRolesPortfolio**
> List&lt;UserPortfolioRoleData&gt; getUserRolesPortfolio(portfolio, username, exactUsername, portfolioValue, exactPortfolioValue)

Get users roles by portfolio

List the users roles for the portfolio. Use &#39;username&#39;, &#39;exactUsername&#39;, &#39;portfolioValue&#39; and &#39;exactPortfolioValue&#39; to filter results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PortfolioApi;

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

PortfolioApi apiInstance = new PortfolioApi();
String portfolio = "portfolio_example"; // String | Portfolio name
String username = "username_example"; // String | 'username' mask to filter results
Boolean exactUsername = true; // Boolean | Indicates if the username must be equals (ignore case). Only apply if username is provided
String portfolioValue = "portfolioValue_example"; // String | 'portfolioValue' mask to filter results
Boolean exactPortfolioValue = true; // Boolean | Indicates if the portfolioValue must be equals (ignore case). Only apply if portfolioValue is provided
try {
    List<UserPortfolioRoleData> result = apiInstance.getUserRolesPortfolio(portfolio, username, exactUsername, portfolioValue, exactPortfolioValue);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PortfolioApi#getUserRolesPortfolio");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolio** | **String**| Portfolio name |
 **username** | **String**| &#39;username&#39; mask to filter results | [optional]
 **exactUsername** | **Boolean**| Indicates if the username must be equals (ignore case). Only apply if username is provided | [optional]
 **portfolioValue** | **String**| &#39;portfolioValue&#39; mask to filter results | [optional]
 **exactPortfolioValue** | **Boolean**| Indicates if the portfolioValue must be equals (ignore case). Only apply if portfolioValue is provided | [optional]

### Return type

[**List&lt;UserPortfolioRoleData&gt;**](UserPortfolioRoleData.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

