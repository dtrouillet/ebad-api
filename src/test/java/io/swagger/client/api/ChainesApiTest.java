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

package io.swagger.client.api;

import io.swagger.client.model.ChaineDto;
import io.swagger.client.model.ChaineSimpleDto;
import io.swagger.client.model.JobDto;
import io.swagger.client.model.PageChaineDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Predicate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ChainesApi
 */
@Ignore
public class ChainesApiTest {

    private final ChainesApi api = new ChainesApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addChaineTest() {
        ChaineDto body = null;
        ChaineSimpleDto response = api.addChaine(body);

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
    public void getAllFromEnv2Test() {
        Pageable pageable = null;
        Predicate predicate = null;
        Long env = null;
        PageChaineDto response = api.getAllFromEnv2(pageable, predicate, env);

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
    public void removeChaineTest() {
        Long id = null;
        api.removeChaine(id);

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
    public void runChaineTest() {
        Long id = null;
        JobDto response = api.runChaine(id);

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
    public void updateChaineTest() {
        ChaineDto body = null;
        ChaineSimpleDto response = api.updateChaine(body);

        // TODO: test validations
    }
}
