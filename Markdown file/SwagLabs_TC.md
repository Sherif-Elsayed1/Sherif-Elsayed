# SwagLabs_TCs <br>

**Test_ID 1**<br>
**Test Title**
Verify that user can login using correct username and correct password
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter correct username
3- Click on password field
4- Enter correct password
5- Click on ""login"" button
**Test Data**
username : standard_user
password : secret_sauce
**Expected Result**
User should be able to login successfully 
**Actual Result**
User is logged in successfully
**Status**
Pass

**Test_ID 2**
**Test Title**
Verify that user can not login using incorrect username and correct password
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter incorrect username
3- Click on password field
4- Enter correct password
5- Click on ""login"" button
**Test Data**
username : standard
password : secret_sauce
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password do not match any user in this service""
**Actual Result**
1- User can not be able to login
2- An error message appears : 
   ""Username and password do not match any user in this service""
**Status**
Pass

**Test_ID 3**
**Test Title**
Verify that user can not login using correct username and incorrect password
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter correct username
3- Click on password field
4- Enter incorrect password
5- Click on ""login"" button
**Test Data**
username : standard_user
password : secret
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password do not match any user in this service""
**Actual Result**
1- User can not be able to login
2- An error message appears : 
   ""Username and password do not match any user in this service""
**Status**
Pass

**Test_ID 4**
**Test Title**
Verify that user can not login using incorrect username and incorrect password
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
"1- Click on username field
2- Enter correct username
3- Click on password field
4- Enter incorrect password
5- Click on ""login"" button"
**Test Data**
"username : standard
password : secret"
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password do not match any user in this service""
**Actual Result**
1- User can not be able to login
2- An error message appears : 
   ""Username and password do not match any user in this service""
**Status**
Pass


**Test_ID 5**
**Test Title**
Verify that user can not login with blank username 
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on password field
2- Enter correct password
3- Click on ""login"" button
**Test Data**
password : secret
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username is required""
**Actual Result**
1- User can not be able to login
2- An error message  appears : 
   ""Username is required""
**Status**
Pass

**Test_ID 6**
**Test Title**
Verify that user can not login with blank password
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter correct username
3- Click on ""login"" button
**Test Data**
username : standard_user
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username is required""
**Actual Result**
1- User can not be able to login
2- An error message  appears : 
   ""Password is required""
**Status**
Pass

**Test_ID 7**
**Test Title**
Verify that user can not login with blank password and blank username 
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter correct username
3- Click on ""login"" button
**Test Data**

**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password is required""
**Actual Result**
1- User can not be able to login
2- An error message  appears : 
   ""username is required""
**Status**
Fail

**Test_ID 8**
**Test Title**
Verify that "username" and "Password" is case sensitivr  
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Click on username field
2- Enter correct username
3- Click on ""login"" button
**Test Data**
username: Standard_user
password : Secret_sauce
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password do not match any user in this service""
**Actual Result**
"1- User can not be able to login
2- An error message  appears : 
   ""Username and password do not match any user in this service"""
**Status**
Pass

**Test_ID 9**
**Test Title**
verify that applying sql injection in "username" and "password"
**Pre-condition**
1- Open the link "https://www.saucedemo.com/"
**Test Steps**
1- Enter correct username
2- Enter correct password
**Test Data**
"username : standard_user
password : secret_sauce"
**Expected Result**
1- User should not be able to login
2- An error message should appear : 
   ""Username and password do not match any user in this service""
**Actual Result**
1- User can not be able to login
2- An error message  appears : 
   ""Username and password do not match any user in this service""
**Status**
Pass





