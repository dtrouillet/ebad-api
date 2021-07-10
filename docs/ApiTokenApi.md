# ApiTokenApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToken**](ApiTokenApi.md#createToken) | **PUT** /api-tokens | 
[**deleteToken**](ApiTokenApi.md#deleteToken) | **DELETE** /api-tokens/{id} | 
[**findToken**](ApiTokenApi.md#findToken) | **GET** /api-tokens | 

<a name="createToken"></a>
# **createToken**
> ApiTokenWithKeyDto createToken(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiTokenApi;


ApiTokenApi apiInstance = new ApiTokenApi();
ApiTokenDto body = new ApiTokenDto(); // ApiTokenDto | 
try {
    ApiTokenWithKeyDto result = apiInstance.createToken(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiTokenApi#createToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ApiTokenDto**](ApiTokenDto.md)|  |

### Return type

[**ApiTokenWithKeyDto**](ApiTokenWithKeyDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteToken"></a>
# **deleteToken**
> deleteToken(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiTokenApi;


ApiTokenApi apiInstance = new ApiTokenApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteToken(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiTokenApi#deleteToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="findToken"></a>
# **findToken**
> PageApiTokenDto findToken(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ApiTokenApi;


ApiTokenApi apiInstance = new ApiTokenApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageApiTokenDto result = apiInstance.findToken(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ApiTokenApi#findToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageApiTokenDto**](PageApiTokenDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

