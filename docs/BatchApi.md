# BatchApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addBatch**](BatchApi.md#addBatch) | **PUT** /batchs | 
[**deleteBatch**](BatchApi.md#deleteBatch) | **DELETE** /batchs/{id} | 
[**getByPredicate**](BatchApi.md#getByPredicate) | **GET** /batchs | 
[**runBatch**](BatchApi.md#runBatch) | **GET** /batchs/run/{id} | 
[**streamFlux**](BatchApi.md#streamFlux) | **GET** /batchs/state/{id} | 
[**updateBatch**](BatchApi.md#updateBatch) | **PATCH** /batchs | 

<a name="addBatch"></a>
# **addBatch**
> BatchDto addBatch(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
BatchDto body = new BatchDto(); // BatchDto | 
try {
    BatchDto result = apiInstance.addBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#addBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BatchDto**](BatchDto.md)|  |

### Return type

[**BatchDto**](BatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBatch"></a>
# **deleteBatch**
> deleteBatch(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
Long id = 789L; // Long | 
try {
    apiInstance.deleteBatch(id);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#deleteBatch");
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

<a name="getByPredicate"></a>
# **getByPredicate**
> PageBatchDto getByPredicate(predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageBatchDto result = apiInstance.getByPredicate(predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#getByPredicate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageBatchDto**](PageBatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="runBatch"></a>
# **runBatch**
> JobDto runBatch(id, env, param)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
Long id = 789L; // Long | 
Long env = 789L; // Long | 
String param = "param_example"; // String | 
try {
    JobDto result = apiInstance.runBatch(id, env, param);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#runBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **env** | **Long**|  |
 **param** | **String**|  | [optional]

### Return type

[**JobDto**](JobDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="streamFlux"></a>
# **streamFlux**
> FluxCurrentJobDto streamFlux(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
Long id = 789L; // Long | 
try {
    FluxCurrentJobDto result = apiInstance.streamFlux(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#streamFlux");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**FluxCurrentJobDto**](FluxCurrentJobDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/event-stream

<a name="updateBatch"></a>
# **updateBatch**
> BatchDto updateBatch(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.BatchApi;


BatchApi apiInstance = new BatchApi();
BatchDto body = new BatchDto(); // BatchDto | 
try {
    BatchDto result = apiInstance.updateBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchApi#updateBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BatchDto**](BatchDto.md)|  |

### Return type

[**BatchDto**](BatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

