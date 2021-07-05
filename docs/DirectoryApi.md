# DirectoryApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addDirectory**](DirectoryApi.md#addDirectory) | **PUT** /directories | 
[**downloadFile**](DirectoryApi.md#downloadFile) | **POST** /directories/files/read | 
[**getAllFromEnv1**](DirectoryApi.md#getAllFromEnv1) | **GET** /directories/env/{env} | 
[**getFilesFromDirectory**](DirectoryApi.md#getFilesFromDirectory) | **GET** /directories/files/{id} | 
[**removeDirectory**](DirectoryApi.md#removeDirectory) | **POST** /directories/delete | 
[**removeFileFromDirectory**](DirectoryApi.md#removeFileFromDirectory) | **POST** /directories/files/delete | 
[**updateDirectory**](DirectoryApi.md#updateDirectory) | **PATCH** /directories | 
[**uploadFile**](DirectoryApi.md#uploadFile) | **POST** /directories/files/upload | 

<a name="addDirectory"></a>
# **addDirectory**
> DirectoryDto addDirectory(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
DirectoryDto body = new DirectoryDto(); // DirectoryDto | 
try {
    DirectoryDto result = apiInstance.addDirectory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#addDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryDto**](DirectoryDto.md)|  |

### Return type

[**DirectoryDto**](DirectoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> downloadFile(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
FilesDto body = new FilesDto(); // FilesDto | 
try {
    apiInstance.downloadFile(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getAllFromEnv1"></a>
# **getAllFromEnv1**
> PageDirectoryDto getAllFromEnv1(pageable, predicate, env)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
Pageable pageable = new Pageable(); // Pageable | 
Predicate predicate = new Predicate(); // Predicate | 
Long env = 789L; // Long | 
try {
    PageDirectoryDto result = apiInstance.getAllFromEnv1(pageable, predicate, env);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#getAllFromEnv1");
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

[**PageDirectoryDto**](PageDirectoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFilesFromDirectory"></a>
# **getFilesFromDirectory**
> List&lt;FilesDto&gt; getFilesFromDirectory(id, page, perPage, subDirectory)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
Long id = 789L; // Long | 
Integer page = 56; // Integer | 
Integer perPage = 56; // Integer | 
String subDirectory = "subDirectory_example"; // String | 
try {
    List<FilesDto> result = apiInstance.getFilesFromDirectory(id, page, perPage, subDirectory);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#getFilesFromDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**|  |
 **page** | **Integer**|  | [optional]
 **perPage** | **Integer**|  | [optional]
 **subDirectory** | **String**|  | [optional]

### Return type

[**List&lt;FilesDto&gt;**](FilesDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDirectory"></a>
# **removeDirectory**
> removeDirectory(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
DirectoryDto body = new DirectoryDto(); // DirectoryDto | 
try {
    apiInstance.removeDirectory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#removeDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryDto**](DirectoryDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="removeFileFromDirectory"></a>
# **removeFileFromDirectory**
> removeFileFromDirectory(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
FilesDto body = new FilesDto(); // FilesDto | 
try {
    apiInstance.removeFileFromDirectory(body);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#removeFileFromDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FilesDto**](FilesDto.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="updateDirectory"></a>
# **updateDirectory**
> DirectoryDto updateDirectory(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
DirectoryDto body = new DirectoryDto(); // DirectoryDto | 
try {
    DirectoryDto result = apiInstance.updateDirectory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#updateDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DirectoryDto**](DirectoryDto.md)|  |

### Return type

[**DirectoryDto**](DirectoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> uploadFile(directory, body, subDirectory)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DirectoryApi;


DirectoryApi apiInstance = new DirectoryApi();
Long directory = 789L; // Long | 
Body body = new Body(); // Body | 
String subDirectory = "subDirectory_example"; // String | 
try {
    apiInstance.uploadFile(directory, body, subDirectory);
} catch (ApiException e) {
    System.err.println("Exception when calling DirectoryApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **directory** | **Long**|  |
 **body** | [**Body**](Body.md)|  | [optional]
 **subDirectory** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

