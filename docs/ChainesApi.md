# ChainesApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addChaine**](ChainesApi.md#addChaine) | **PUT** /chains | 
[**getAllFromEnv2**](ChainesApi.md#getAllFromEnv2) | **GET** /chains/env/{env} | 
[**removeChaine**](ChainesApi.md#removeChaine) | **DELETE** /chains/{id} | 
[**runChaine**](ChainesApi.md#runChaine) | **POST** /chains/{id}/run | 
[**updateChaine**](ChainesApi.md#updateChaine) | **PATCH** /chains | 

<a name="addChaine"></a>
# **addChaine**
> ChaineSimpleDto addChaine(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChainesApi;


ChainesApi apiInstance = new ChainesApi();
ChaineDto body = new ChaineDto(); // ChaineDto | 
try {
    ChaineSimpleDto result = apiInstance.addChaine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainesApi#addChaine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChaineDto**](ChaineDto.md)|  |

### Return type

[**ChaineSimpleDto**](ChaineSimpleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllFromEnv2"></a>
# **getAllFromEnv2**
> PageChaineDto getAllFromEnv2(pageable, predicate, env)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChainesApi;


ChainesApi apiInstance = new ChainesApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
Long env = 789L; // Long | 
try {
    PageChaineDto result = apiInstance.getAllFromEnv2(pageable, predicate, env);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainesApi#getAllFromEnv2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |
 **env** | **Long**|  |

### Return type

[**PageChaineDto**](PageChaineDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeChaine"></a>
# **removeChaine**
> removeChaine(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChainesApi;


ChainesApi apiInstance = new ChainesApi();
Long id = 789L; // Long | 
try {
    apiInstance.removeChaine(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainesApi#removeChaine");
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

<a name="runChaine"></a>
# **runChaine**
> JobDto runChaine(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChainesApi;


ChainesApi apiInstance = new ChainesApi();
Long id = 789L; // Long | 
try {
    JobDto result = apiInstance.runChaine(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainesApi#runChaine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**JobDto**](JobDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateChaine"></a>
# **updateChaine**
> ChaineSimpleDto updateChaine(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ChainesApi;


ChainesApi apiInstance = new ChainesApi();
ChaineDto body = new ChaineDto(); // ChaineDto | 
try {
    ChaineSimpleDto result = apiInstance.updateChaine(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChainesApi#updateChaine");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ChaineDto**](ChaineDto.md)|  |

### Return type

[**ChaineSimpleDto**](ChaineSimpleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

