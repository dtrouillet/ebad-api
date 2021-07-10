# LogApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllLog**](LogApi.md#getAllLog) | **GET** /logs | 
[**getAllLogFromEnv**](LogApi.md#getAllLogFromEnv) | **GET** /logs/{env} | 
[**getAllLogFromEnvBatch**](LogApi.md#getAllLogFromEnvBatch) | **GET** /logs/{env}/{batch} | 
[**getLogFromJobId**](LogApi.md#getLogFromJobId) | **GET** /logs/job/{jobId} | 

<a name="getAllLog"></a>
# **getAllLog**
> PageLogBatchDto getAllLog(predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageLogBatchDto result = apiInstance.getAllLog(predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getAllLog");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageLogBatchDto**](PageLogBatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllLogFromEnv"></a>
# **getAllLogFromEnv**
> PageLogBatchDto getAllLogFromEnv(env, predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
Long env = 789L; // Long | 
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageLogBatchDto result = apiInstance.getAllLogFromEnv(env, predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getAllLogFromEnv");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **Long**|  |
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageLogBatchDto**](PageLogBatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllLogFromEnvBatch"></a>
# **getAllLogFromEnvBatch**
> PageLogBatchDto getAllLogFromEnvBatch(env, batch, predicate, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
Long env = 789L; // Long | 
Long batch = 789L; // Long | 
Predicate predicate = new Predicate(); // Predicate | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageLogBatchDto result = apiInstance.getAllLogFromEnvBatch(env, batch, predicate, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getAllLogFromEnvBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **env** | **Long**|  |
 **batch** | **Long**|  |
 **predicate** | [**Predicate**](.md)|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageLogBatchDto**](PageLogBatchDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLogFromJobId"></a>
# **getLogFromJobId**
> JobStateDto getLogFromJobId(jobId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.LogApi;


LogApi apiInstance = new LogApi();
String jobId = "jobId_example"; // String | 
try {
    JobStateDto result = apiInstance.getLogFromJobId(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LogApi#getLogFromJobId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**|  |

### Return type

[**JobStateDto**](JobStateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

