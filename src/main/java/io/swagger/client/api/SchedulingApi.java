package io.swagger.client.api;

import io.swagger.client.ApiClient;

import io.swagger.client.model.CreationSchedulingDto;
import io.swagger.client.model.PageSchedulingDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.SchedulingDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-07-10T21:22:29.539Z[GMT]")@Component("io.swagger.client.api.SchedulingApi")
public class SchedulingApi {
    private ApiClient apiClient;

    public SchedulingApi() {
        this(new ApiClient());
    }

    @Autowired
    public SchedulingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param body The body parameter
     * @return SchedulingDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulingDto addScheduling(CreationSchedulingDto body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addScheduling");
        }
        String path = UriComponentsBuilder.fromPath("/schedulings").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<SchedulingDto> returnType = new ParameterizedTypeReference<SchedulingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param schedulingId The schedulingId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void delete(Long schedulingId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'schedulingId' is set
        if (schedulingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulingId' when calling delete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("schedulingId", schedulingId);
        String path = UriComponentsBuilder.fromPath("/schedulings/{schedulingId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param schedulingId The schedulingId parameter
     * @return SchedulingDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SchedulingDto get(Long schedulingId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'schedulingId' is set
        if (schedulingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'schedulingId' when calling get");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("schedulingId", schedulingId);
        String path = UriComponentsBuilder.fromPath("/schedulings/{schedulingId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<SchedulingDto> returnType = new ParameterizedTypeReference<SchedulingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param pageable The pageable parameter
     * @return PageSchedulingDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageSchedulingDto listAll(Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling listAll");
        }
        String path = UriComponentsBuilder.fromPath("/schedulings").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageSchedulingDto> returnType = new ParameterizedTypeReference<PageSchedulingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param environmentId The environmentId parameter
     * @param pageable The pageable parameter
     * @return PageSchedulingDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageSchedulingDto listByEnvironment(Long environmentId, Pageable pageable) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'environmentId' is set
        if (environmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'environmentId' when calling listByEnvironment");
        }
        // verify the required parameter 'pageable' is set
        if (pageable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pageable' when calling listByEnvironment");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("environmentId", environmentId);
        String path = UriComponentsBuilder.fromPath("/schedulings/env/{environmentId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageable", pageable));

        final String[] accepts = { 
            "*/*"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "ebad-api-key", "jwt" };

        ParameterizedTypeReference<PageSchedulingDto> returnType = new ParameterizedTypeReference<PageSchedulingDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
