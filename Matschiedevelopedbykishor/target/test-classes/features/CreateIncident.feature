Feature: Create New Incident
  
  Scenario Outline: Create a new incident with short description
	Given enable logs
	#And short description is added with Added from Cucumber
	When Create new change request in servicenow '<table>'
	Then the status code is 201
	And response includes the following
	# Map => Key, Value 
	#|key|Value|
	|result.sys_created_by|admin|
	|result.sys_class_name|change_request|
Examples:
|table|
|change_request|
	
	@smoletest
	Scenario Outline: Update the Change Request
	Given enable logs
	When Create new change request in servicenow '<table>'
	When Update the Change Request in service now '<name>'
	Then the status code is 200
	
	Examples:
	|name|table|
	|newly updated Value|change_request|
	
	@smoketest
	Scenario Outline: Create new jira incident
	Given enable jira logs
	When Create new issue in Jira
	#Then the jira status code is 201
	#When Update the description jira issue '<update>'
	When Update the created jira issue '<update>'
	Then the jira status code is 204
	When Get All the issues in Jira
	Then the jira status code is 200
	Examples:
	|update|
	|descrition updated successfully|
	
	@Salesforcetest
	Scenario Outline: Create new contact in salesforce
	Given enable salesforcelogs
	When Create new contact in salesforce '<table>'
	When Update the contact Request in Sales Force '<mailingstate>'
	When Verify Mailing State '<mailingstate>'
	And List All the Contacts
	 
	Examples:
	|table|mailingstate|
	|Contact|California|