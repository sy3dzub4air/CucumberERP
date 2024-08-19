Feature:
Check Employee creation
@addEmp
Scenario Outline:
Validate Add Employee with Multiple data
Given User Navigate Url "http://orangehrm.qedgetech.com/" in Browser
When user Login as "Admin" in username
And user login as "Qedge123!@#" in password
And  user click login button
When user click pim
When user click add button
And user Enter as "<FirstName>" in fname
And user Enter "<MiddleName>" in mname
And user Enter "<LastName>" in lane
And user Capture EID Before Adding
And user click save button
And user captures EID after adding
Then User validates EID
Then user close browser
Examples:
|FirstName|MiddleName|LastName|
|Akhilesh1|Manual1|Selenium1|
|Akhilesh15|Manual18|Selenium14|
|Akhilesh12|Manual11|Selenium17|
|Akhilesh134|Manual15|Selenium81|
|Akhilesh123|Manual61|Selenium91|
|Akhilesh10|Manual10|Selenium10|
|Akhilesh134|Manual891|Selenium891|
