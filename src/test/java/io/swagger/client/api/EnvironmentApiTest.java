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

import io.swagger.client.model.EnvironnementCreationDto;
import io.swagger.client.model.EnvironnementDto;
import io.swagger.client.model.EnvironnementInfoDTO;
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.PageEnvironnementDto;
import io.swagger.client.model.Pageable;
import io.swagger.client.model.Predicate;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnvironmentApi
 */
@Ignore
public class EnvironmentApiTest {

    private final EnvironmentApi api = new EnvironmentApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addEnvironnementTest() {
        EnvironnementCreationDto body = null;
        EnvironnementDto response = api.addEnvironnement(body);

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
    public void changeDateTraitementTest() {
        Long env = null;
        OffsetDateTime dateTraitement = null;
        String response = api.changeDateTraitement(env, dateTraitement);

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
    public void deleteEnvironnementTest() {
        Long idEnv = null;
        api.deleteEnvironnement(idEnv);

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
    public void get1Test() {
        Long env = null;
        EnvironnementDto response = api.get1(env);

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
    public void getEnvironmentsFromAppTest() {
        Long applicationId = null;
        Predicate predicate = null;
        Pageable pageable = null;
        PageEnvironnementDto response = api.getEnvironmentsFromApp(applicationId, predicate, pageable);

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
    public void getInfoTest() {
        Long env = null;
        EnvironnementInfoDTO response = api.getInfo(env);

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
    public void importAllTest() {
        List<EnvironnementDto> response = api.importAll();

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
    public void importEnvAppTest() {
        Long id = null;
        List<EnvironnementDto> response = api.importEnvApp(id);

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
    public void updateEnvironnementTest() {
        EnvironnementDto body = null;
        EnvironnementDto response = api.updateEnvironnement(body);

        // TODO: test validations
    }
}
