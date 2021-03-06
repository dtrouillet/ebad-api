/*
 * EBAD API
 * This documentation describe EBAD API.
 *
 * OpenAPI spec version: 2.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package fr.dtrouillet.api;

import io.swagger.client.model.DirectoryDto;
import java.io.File;
import io.swagger.client.model.FilesDto;
import io.swagger.client.model.PageDirectoryDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Predicate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DirectoryApi
 */
@Ignore
public class DirectoryApiTest {

    private final DirectoryApi api = new DirectoryApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDirectoryTest() {
        DirectoryDto body = null;
        DirectoryDto response = api.addDirectory(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileTest() {
        FilesDto body = null;
        File response = api.downloadFile(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFromEnv1Test() {
        Pageable pageable = null;
        Predicate predicate = null;
        Long env = null;
        PageDirectoryDto response = api.getAllFromEnv1(pageable, predicate, env);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilesFromDirectoryTest() {
        Long id = null;
        Integer page = null;
        Integer perPage = null;
        String subDirectory = null;
        List<FilesDto> response = api.getFilesFromDirectory(id, page, perPage, subDirectory);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeDirectoryTest() {
        DirectoryDto body = null;
        api.removeDirectory(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeFileFromDirectoryTest() {
        FilesDto body = null;
        api.removeFileFromDirectory(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDirectoryTest() {
        DirectoryDto body = null;
        DirectoryDto response = api.updateDirectory(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() {
        Long directory = null;
        File file = null;
        String subDirectory = null;
        api.uploadFile(directory, file, subDirectory);

        // TODO: test validations
    }
}
