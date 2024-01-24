Technologies which can be used are
•
Front-End –Angular
•
Back-End –Springboot
•
Database: MySql OR any other database

Functionalities to be completed in this assignment are
-Login
-Insert Project details
-List project details
-Update project status
-Search a project
-Sort the list by any one column selected from dropdown
-Pagination
-Dashboard with status counters
-Graph to show department wise project completion report
-----------------------------------------------------------------------------------------------------
Login page with below functionalities
-UI to support functionality is required.
-UI validation for email format and non empty fields
On clicking the login button the user should be validated with the user details from database
If user is invalid show a message on the screen “Invalid user”
If the user details are valid user should be navigated to the dashboard
-----------------------------------------------------------------------------------------------------------
Insert a new project record
Create the below form to insert project details: User will input project name and use drop for all other values.All drop downs are mandatory. Apply respective validations
Use date picker for Start date and End date.Applyvalidationthatenddatecannot be smaller than start date
The status field is constant with a default value as “Registered”
Implement required UI validations to all fields
-------------------------------------------------------------------------------------------------------
Listing page: All records inserted into the database using the Insert Project screen from earlier page 
should be listed here with additional functionalities as show in the next screen
Functionalities required on the listing page
Status update: On clicking the buttons shown at the right side of each record support below functionality
START –Update the respective records status in database to “Running”
Close –Update the respective records status in database to “Closed”
Cancel –Update the respective records status in the database to “Cancelled”
On updating the status in DB the status should also get reflected on the listing screen in the STATUS column without REFERSHING the page
SEARCH : Should work as a filter to show only those records where the provided filter text is matching completely or partially for text in any column
SORTING: The dropdown should have names of all columns and the list should get sorted if the value in the dropdown is changed
If user selected status sort the whole list in ascending order for status column
If the user selects location sort the whole list with respective to location
PAGINATION: Show 10 records on one page and perform pagination
-------------------------------------------------------------------------------------------------------
Dashboard: Details about the two sections on dashboard are given on next 2 pages
Dashboard Page:
Counters on the top of the dashboard has values as explained below
Total projects entered using the insert project screen
Total projects which has the status as Closed in the project details table
Total projects which has the status as Running in the project detail table
Total projects where the status is Running and the end date is less than todays date
Total projects where the status in the project detail table is Cancelled
Criteria
-Use single API to get all counters
-Use single query in the server side code to fetch all counters except the Closure Delay counter
-Use your own approach while using JsonServer Or Firebase
-------------------------------------------------------------------------------------------------------
Link to the desktop mockup:
Link to the Mobile mockup:
https://projects.invisionapp.com/share/FE1370MZBQ4Z#/screens/472496931_Login

Link to the desktop mockup:
https://projects.invisionapp.com/share/8Q137HREC2UF#/screens/472494770_Login

Images needed for project :
https://drive.google.com/drive/folders/1y9kW-c9CzjTXphA6RCv71utbXlVrBKxh?usp=sharing

-------------------------------------------------------------------------------------------------------

## Links & Contacts : 
- Email : surajyelmate444@gmail.com
- LinkedIn : 
- Portfolio : 
- Resume : 
