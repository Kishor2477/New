Feature: IncidentManagement

Scenario: Get all change Request

Given setup the endpoint
And setup the Authorization
When get all change request
Then verify statuscode as 200
And print the response


Scenario: Create a new change Request

Given setup the endpoint
And setup the Authorization
When Create new change request with short description as 'Newly Added Record' and category as 'Software'
Then verify statuscode as 201
And print the response


Scenario: Create a new change Request

Given setup the endpoint
And setup the Authorization
When Create new change request with body in file
Then verify statuscode as 201
And print the response



Scenario Outline: Create a new change Request

Given setup the endpoint
And setup the Authorization
When Create new change request with short description as '<Desc>' and category as '<Cat>'
Then verify statuscode as 201
And print the response

Examples:
|Desc|Cat|
|First Record|Hardware|
|Second Record|Software|

@smoketest
Scenario: Update a new change Request

Given setup the endpoint
And setup the Authorization
When Create new change request with short description as '<Desc>' and category as '<Cat>'
When Update incident with short_description as 'Updated Now recently'
And Delete the updated issue
Then verify statuscode as 204
And print the response

