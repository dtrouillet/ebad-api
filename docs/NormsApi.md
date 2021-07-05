# NormsApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete1**](NormsApi.md#delete1) | **DELETE** /norms/{id} | 
[**getAll1**](NormsApi.md#getAll1) | **GET** /norms | 
[**getAllForList**](NormsApi.md#getAllForList) | **GET** /norms/name | 
[**getOne**](NormsApi.md#getOne) | **GET** /norms/{id} | 
[**save**](NormsApi.md#save) | **PUT** /norms | 
[**update**](NormsApi.md#update) | **PATCH** /norms | 

<a name="delete1"></a>
# **delete1**
> delete1(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
Long id = 789L; // Long | 
try {
    apiInstance.delete1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#delete1");
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

<a name="getAll1"></a>
# **getAll1**
> PageNormeDto getAll1(pageable, predicate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
try {
    PageNormeDto result = apiInstance.getAll1(pageable, predicate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#getAll1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |

### Return type

[**PageNormeDto**](PageNormeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllForList"></a>
# **getAllForList**
> PageNormLabelIdDto getAllForList(pageable, predicate)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
try {
    PageNormLabelIdDto result = apiInstance.getAllForList(pageable, predicate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#getAllForList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageable** | [**Pageable**](.md)|  |
 **predicate** | [**Predicate**](.md)|  |

### Return type

[**PageNormLabelIdDto**](PageNormLabelIdDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getOne"></a>
# **getOne**
> NormeDto getOne(id)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
Long id = 789L; // Long | 
try {
    NormeDto result = apiInstance.getOne(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#getOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |

### Return type

[**NormeDto**](NormeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="save"></a>
# **save**
> NormeDto save(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
NormeDto body = new NormeDto(); // NormeDto | 
try {
    NormeDto result = apiInstance.save(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#save");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NormeDto**](NormeDto.md)|  |

### Return type

[**NormeDto**](NormeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> NormeDto update(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NormsApi;


NormsApi apiInstance = new NormsApi();
NormeDto body = new NormeDto(); // NormeDto | 
try {
    NormeDto result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NormsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NormeDto**](NormeDto.md)|  |

### Return type

[**NormeDto**](NormeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

