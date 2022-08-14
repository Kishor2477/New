Feature: IncidentManagement

Scenario: Get all change Request

Given setup the endpoint
And setup the Authorization
When get all change request
Then verify statuscode as 200
And print the response

@smoke
Scenario: Create a new change Request

Given setup the endpoint
And setup the Authorization
When Create new change request with short description as 'Newly Added Record' and category as 'Software'
Then verify statuscode as 201
And print the response