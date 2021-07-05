# JwtApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorize**](JwtApi.md#authorize) | **POST** /authenticate | 

<a name="authorize"></a>
# **authorize**
> UserDto authorize(body)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.JwtApi;


JwtApi apiInstance = new JwtApi();
LoginDto body = new LoginDto(); // LoginDto | 
try {
    UserDto result = apiInstance.authorize(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JwtApi#authorize");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoginDto**](LoginDto.md)|  |

### Return type

[**UserDto**](UserDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

