# UserGroupApi

All URIs are relative to *https://api.kiuwan.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserGroup**](UserGroupApi.md#createUserGroup) | **POST** /userGroups | Create user group
[**deleteUserGroup**](UserGroupApi.md#deleteUserGroup) | **DELETE** /userGroups/{name} | Delete user group
[**listUserGroups**](UserGroupApi.md#listUserGroups) | **GET** /userGroups | Get list of user groups
[**updateUserGroup**](UserGroupApi.md#updateUserGroup) | **PUT** /userGroups/{name} | Update user group


<a name="createUserGroup"></a>
# **createUserGroup**
> createUserGroup(body)

Create user group

Creates a new user group in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

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

UserGroupApi apiInstance = new UserGroupApi();
UserGroupRequest body = new UserGroupRequest(); // UserGroupRequest | The user group to create
try {
    apiInstance.createUserGroup(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#createUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroupRequest**](UserGroupRequest.md)| The user group to create |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserGroup"></a>
# **deleteUserGroup**
> deleteUserGroup(name)

Delete user group

Deletes a user group of your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

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

UserGroupApi apiInstance = new UserGroupApi();
String name = "name_example"; // String | User group name
try {
    apiInstance.deleteUserGroup(name);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#deleteUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| User group name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json, text/plain
 - **Accept**: application/json

<a name="listUserGroups"></a>
# **listUserGroups**
> List&lt;UserGroupResponse&gt; listUserGroups()

Get list of user groups

List the user groups of your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

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

UserGroupApi apiInstance = new UserGroupApi();
try {
    List<UserGroupResponse> result = apiInstance.listUserGroups();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#listUserGroups");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserGroupResponse&gt;**](UserGroupResponse.md)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateUserGroup"></a>
# **updateUserGroup**
> updateUserGroup(body, name)

Update user group

Modifies the information of an user group in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserGroupApi;

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

UserGroupApi apiInstance = new UserGroupApi();
UserGroupRequest body = new UserGroupRequest(); // UserGroupRequest | The user group to modify
String name = "name_example"; // String | User group name
try {
    apiInstance.updateUserGroup(body, name);
} catch (ApiException e) {
    System.err.println("Exception when calling UserGroupApi#updateUserGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserGroupRequest**](UserGroupRequest.md)| The user group to modify |
 **name** | **String**| User group name |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie), [basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

