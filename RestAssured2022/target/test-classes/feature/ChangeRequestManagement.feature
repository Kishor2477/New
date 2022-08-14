Feature: ChangeRequest

Scenario: Get Change Request

Given Setup the Endpoint
And Provide Authorization
When Send the request
Then Validate the response is 200
And Print the response

@DemoRun
Scenario: Get Change Request

Given Setup the Endpoint
And Provide Authorization
When send the request with short_description as 'New Updates' and category as 'Hardware'
Then Validate the response is 201
And Print the response
And response including the following
|result.sys_created_by|admin|
|sys_class_name|change_request|