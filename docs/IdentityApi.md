# IdentityApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addIdentity**](IdentityApi.md#addIdentity) | **PUT** /identities | 
[**deleteIdentity**](IdentityApi.md#deleteIdentity) | **DELETE** /identities/{identityId} | 
[**getAllIdentities**](IdentityApi.md#getAllIdentities) | **GET** /identities | 
[**getOneIdentity**](IdentityApi.md#getOneIdentity) | **GET** /identities/{id} | 
[**updateIdentity**](IdentityApi.md#updateIdentity) | **PATCH** /identities | 

<a name="addIdentity"></a>
# **addIdentity**
> CompleteIdentityDto addIdentity(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
CompleteIdentityDto body = new CompleteIdentityDto(); // CompleteIdentityDto | 
try {
    CompleteIdentityDto result = apiInstance.addIdentity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#addIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompleteIdentityDto**](CompleteIdentityDto.md)|  |

### Return type

[**CompleteIdentityDto**](CompleteIdentityDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteIdentity"></a>
# **deleteIdentity**
> deleteIdentity(identityId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
Long identityId = 789L; // Long | 
try {
    apiInstance.deleteIdentity(identityId);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#deleteIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllIdentities"></a>
# **getAllIdentities**
> PagePublicIdentityDto getAllIdentities(applicationId, predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
Long applicationId = 789L; // Long | 
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PagePublicIdentityDto result = apiInstance.getAllIdentities(applicationId, predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#getAllIdentities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **applicationId** | **Long**|  |
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PagePublicIdentityDto**](PagePublicIdentityDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOneIdentity"></a>
# **getOneIdentity**
> CompleteIdentityDto getOneIdentity(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
Long id = 789L; // Long | 
try {
    CompleteIdentityDto result = apiInstance.getOneIdentity(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#getOneIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**CompleteIdentityDto**](CompleteIdentityDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateIdentity"></a>
# **updateIdentity**
> CompleteIdentityDto updateIdentity(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IdentityApi;


IdentityApi apiInstance = new IdentityApi();
CompleteIdentityDto body = new CompleteIdentityDto(); // CompleteIdentityDto | 
try {
    CompleteIdentityDto result = apiInstance.updateIdentity(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdentityApi#updateIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CompleteIdentityDto**](CompleteIdentityDto.md)|  |

### Return type

[**CompleteIdentityDto**](CompleteIdentityDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

