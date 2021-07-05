# NewApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete2**](NewApi.md#delete2) | **DELETE** /news/{id} | 
[**getActualityPublished**](NewApi.md#getActualityPublished) | **GET** /news/public | 
[**getAll2**](NewApi.md#getAll2) | **GET** /news | 
[**getOne1**](NewApi.md#getOne1) | **GET** /news/{id} | 
[**save1**](NewApi.md#save1) | **PUT** /news | 
[**update1**](NewApi.md#update1) | **PATCH** /news | 

<a name="delete2"></a>
# **delete2**
> delete2(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete2(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#delete2");
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

<a name="getActualityPublished"></a>
# **getActualityPublished**
> PageActualiteDto getActualityPublished(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageActualiteDto result = apiInstance.getActualityPublished(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#getActualityPublished");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageActualiteDto**](PageActualiteDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAll2"></a>
# **getAll2**
> PageActualiteDto getAll2(pageable)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
Pageable pageable = new Pageable(); // Pageable | 
try {
    PageActualiteDto result = apiInstance.getAll2(pageable);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#getAll2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |

### Return type

[**PageActualiteDto**](PageActualiteDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOne1"></a>
# **getOne1**
> ActualiteDto getOne1(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
Long id = 789L; // Long | 
try {
    ActualiteDto result = apiInstance.getOne1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#getOne1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**ActualiteDto**](ActualiteDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="save1"></a>
# **save1**
> save1(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
ActualiteDto body = new ActualiteDto(); // ActualiteDto | 
try {
    apiInstance.save1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#save1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActualiteDto**](ActualiteDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="update1"></a>
# **update1**
> update1(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NewApi;


NewApi apiInstance = new NewApi();
ActualiteDto body = new ActualiteDto(); // ActualiteDto | 
try {
    apiInstance.update1(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NewApi#update1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActualiteDto**](ActualiteDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

