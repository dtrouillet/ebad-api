# NotificationsApi

All URIs are relative to *https://ebad.herokuapp.com/ebad*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUnreadNotification**](NotificationsApi.md#getUnreadNotification) | **GET** /notifications | 
[**markAsReadNotification**](NotificationsApi.md#markAsReadNotification) | **PATCH** /notifications | 

<a name="getUnreadNotification"></a>
# **getUnreadNotification**
> List&lt;NotificationDto&gt; getUnreadNotification()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationsApi;


NotificationsApi apiInstance = new NotificationsApi();
try {
    List<NotificationDto> result = apiInstance.getUnreadNotification();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getUnreadNotification");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;NotificationDto&gt;**](NotificationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="markAsReadNotification"></a>
# **markAsReadNotification**
> markAsReadNotification()



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NotificationsApi;


NotificationsApi apiInstance = new NotificationsApi();
try {
    apiInstance.markAsReadNotification();
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#markAsReadNotification");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

