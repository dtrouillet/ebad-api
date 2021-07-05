# SchedulingApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addScheduling**](SchedulingApi.md#addScheduling) | **PUT** /schedulings | 
[**delete**](SchedulingApi.md#delete) | **DELETE** /schedulings/{schedulingId} | 
[**get**](SchedulingApi.md#get) | **GET** /schedulings/{schedulingId} | 
[**listAll**](SchedulingApi.md#listAll) | **GET** /schedulings | 
[**listByEnvironment**](SchedulingApi.md#listByEnvironment) | **GET** /schedulings/env/{environmentId} | 

<a name="addScheduling"></a>
# **addScheduling**
> SchedulingDto addScheduling(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchedulingApi;


SchedulingApi apiInstance = new SchedulingApi();
CreationSchedulingDto body = new CreationSchedulingDto(); // CreationSchedulingDto | 
try {
    SchedulingDto result = apiInstance.addScheduling(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#addScheduling");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreationSchedulingDto**](CreationSchedulingDto.md)|  |

### Return type

[**SchedulingDto**](SchedulingDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete"></a>
# **delete**
> delete(schedulingId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchedulingApi;


SchedulingApi apiInstance = new SchedulingApi();
Long schedulingId = 789L; // Long | 
try {
    apiInstance.delete(schedulingId);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulingId** | **Long**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="get"></a>
# **get**
> SchedulingDto get(schedulingId)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchedulingApi;


SchedulingApi apiInstance = new SchedulingApi();
Long schedulingId = 789L; // Long | 
try {
    SchedulingDto result = apiInstance.get(schedulingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schedulingId** | **Long**|  |

### Return type

[**SchedulingDto**](SchedulingDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listAll"></a>
# **listAll**
> PageSchedulingDto listAll(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchedulingApi;


SchedulingApi apiInstance = new SchedulingApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageSchedulingDto result = apiInstance.listAll(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#listAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageSchedulingDto**](PageSchedulingDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listByEnvironment"></a>
# **listByEnvironment**
> PageSchedulingDto listByEnvironment(environmentId, pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SchedulingApi;


SchedulingApi apiInstance = new SchedulingApi();
Long environmentId = 789L; // Long | 
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageSchedulingDto result = apiInstance.listByEnvironment(environmentId, pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulingApi#listByEnvironment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **environmentId** | **Long**|  |
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageSchedulingDto**](PageSchedulingDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

