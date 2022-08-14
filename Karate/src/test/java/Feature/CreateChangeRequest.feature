#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Create Change Request
  

  @tag1
  Scenario: Create Change Request with body as file
    Given url 'https://dev52787.service-now.com/api/now/table/change_request'
    And header Authorization = 'Basic YWRtaW46RGhTJWZYdzlkNEQt'
    And header Content-Type = 'application/json'
   # And header accept ='application/json'
    And request karate.readAsString('CreateChangeRequest.Json')
   #And request {}
    When method post
    Then status 201
    And match responseType == 'json'
    And def sys_id = response.result.sys_id
    And print response

Given url 'https://dev52787.service-now.com/api/now/table/change_request/'+sys_id
And header accept = 'application/json'
When method get
And status 200
And match responseType == 'json'
And print response


@tag2
 Scenario: Create Incident
 Given url 'https://dev52787.service-now.com/api/now/table/change_request'
 And header Authorization = 'Basic YWRtaW46RGhTJWZYdzlkNEQt'
And header accept = 'application/json'
And header content-type = 'application/json'
And request {}
When method post
Then status 201
And match responseType =='json'
And print response

@tag3
Scenario: Get Jira Issues
Given url 'https://testrestapijira.atlassian.net/rest/api/2/search'
And header Authorization = 'Basic a2lzaG9ya3VtYXIyNDc3QGdtYWlsLmNvbTp1RUJaUmNBQ1JmVVJmSllSaWx4MDI1QTI='
And header accept = 'application/json'
And param jql = 'project="proj"'
When method get
Then status 200

Given url 'https://testrestapijira.atlassian.net/rest/api/2/issue/'
And header Authorization = 'Basic a2lzaG9ya3VtYXIyNDc3QGdtYWlsLmNvbTp1RUJaUmNBQ1JmVVJmSllSaWx4MDI1QTI='
And request { "fields": { "project": { "key": "PROJ" }, "summary": "create issue in RA project", "description": "creating of an issue using project keys and issue type names using the REST API", "issuetype": { "name": "Bug" } } }
When method post
Then status 201
And match responseType == 'json'
And def id = response.id
And print response

Given url 'https://testrestapijira.atlassian.net/rest/api/2/issue/'+id
And header Authorization = 'Basic a2lzaG9ya3VtYXIyNDc3QGdtYWlsLmNvbTp1RUJaUmNBQ1JmVVJmSllSaWx4MDI1QTI='
And request { "fields": { "project": { "key": "PROJ" }, "summary": "updating issue in RA project", "description": "Updating of an issue using project keys and issue type names using the REST API", "issuetype": { "name": "Bug" } } }
When method put
And status 204


Given url 'https://testrestapijira.atlassian.net/rest/api/2/issue/'+id
And header Authorization = 'Basic a2lzaG9ya3VtYXIyNDc3QGdtYWlsLmNvbTp1RUJaUmNBQ1JmVVJmSllSaWx4MDI1QTI='
When method delete
And status 204
