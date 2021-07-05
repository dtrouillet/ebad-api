# AccountApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateAccount1**](AccountApi.md#activateAccount1) | **GET** /activate | 
[**changePassword**](AccountApi.md#changePassword) | **POST** /account/change_password | 
[**getAccount**](AccountApi.md#getAccount) | **GET** /account | 
[**getCsrf**](AccountApi.md#getCsrf) | **GET** /csrf | 
[**isAuthenticated**](AccountApi.md#isAuthenticated) | **GET** /authenticate | 
[**saveAccount**](AccountApi.md#saveAccount) | **POST** /account | 

<a name="activateAccount1"></a>
# **activateAccount1**
> String activateAccount1(key)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String key = "key_example"; // String | 
try {
    String result = apiInstance.activateAccount1(key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#activateAccount1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **key** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="changePassword"></a>
# **changePassword**
> changePassword(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
String body = "body_example"; // String | 
try {
    apiInstance.changePassword(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#changePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**String**](String.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAccount"></a>
# **getAccount**
> UserAccountDto getAccount()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
try {
    UserAccountDto result = apiInstance.getAccount();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getAccount");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UserAccountDto**](UserAccountDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCsrf"></a>
# **getCsrf**
> getCsrf()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
try {
    apiInstance.getCsrf();
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#getCsrf");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="isAuthenticated"></a>
# **isAuthenticated**
> String isAuthenticated()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
try {
    String result = apiInstance.isAuthenticated();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#isAuthenticated");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="saveAccount"></a>
# **saveAccount**
> saveAccount(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AccountApi;


AccountApi apiInstance = new AccountApi();
UserAccountDto body = new UserAccountDto(); // UserAccountDto | 
try {
    apiInstance.saveAccount(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountApi#saveAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UserAccountDto**](UserAccountDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

