# SwagLabs_TCs <br>

**Test_ID 1**<br>
**Test Title**<br>
Verify that user can login using correct username and correct password<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter correct username<br>
3- Click on password field<br>
4- Enter correct password<br>
5- Click on ""login"" button<br>
**Test Data**<br>
username : standard_user<br>
password : secret_sauce<br>
**Expected Result**<br>
User should be able to login successfully<br> 
**Actual Result**<br>
User is logged in successfully<br>
**Status**<br>
Pass<br>

**Test_ID 2**<br>
**Test Title**<br>
Verify that user can not login using incorrect username and correct password<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter incorrect username<br>
3- Click on password field<br>
4- Enter correct password<br>
5- Click on ""login"" button<br>
**Test Data**<br>
username : standard<br>
password : secret_sauce<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password do not match any user in this service""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message appears : <br>
   ""Username and password do not match any user in this service""<br>
**Status**<br>
Pass<br>

**Test_ID 3**<br>
**Test Title**<br>
Verify that user can not login using correct username and incorrect password<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter correct username<br>
3- Click on password field<br>
4- Enter incorrect password<br>
5- Click on ""login"" button<br>
**Test Data**<br>
username : standard_user<br>
password : secret<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password do not match any user in this service""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message appears : <br>
   ""Username and password do not match any user in this service""<br>
**Status**<br>
Pass<br>

**Test_ID 4**<br>
**Test Title**<br>
Verify that user can not login using incorrect username and incorrect password<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
"1- Click on username field<br>
2- Enter correct username<br>
3- Click on password field<br>
4- Enter incorrect password<br>
5- Click on ""login"" button"<br>
**Test Data**<br>
"username : standard<br>
password : secret"<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password do not match any user in this service""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message appears : <br>
   ""Username and password do not match any user in this service""<br>
**Status**<br>
Pass<br>


**Test_ID 5**<br>
**Test Title**<br>
Verify that user can not login with blank username <br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on password field<br>
2- Enter correct password<br>
3- Click on ""login"" button<br>
**Test Data**<br>
password : secret<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username is required""<br>
**Actual Result**<br>
1- User can not be able to login <br>
2- An error message  appears : <br>
   ""Username is required"" <br>
**Status**<br>
Pass<br>

**Test_ID 6** <br>
**Test Title** <br>
Verify that user can not login with blank password<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter correct username <br>
3- Click on ""login"" button<br>
**Test Data**<br>
username : standard_user<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username is required""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message  appears : <br>
   ""Password is required""<br>
**Status**<br>
Pass<br>

**Test_ID 7**<br>
**Test Title**<br>
Verify that user can not login with blank password and blank username <br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter correct username<br>
3- Click on ""login"" button<br>
**Test Data**<br>

**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password is required""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message  appears : <br>
   ""username is required"" <br>
**Status** <br>
Fail <br>

**Test_ID 8**<br>
**Test Title**<br>
Verify that "username" and "Password" is case sensitive <br>
**Pre-condition** <br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Click on username field<br>
2- Enter correct username<br>
3- Click on ""login"" button<br>
**Test Data**<br>
username: Standard_user<br>
password : Secret_sauce<br>
**Expected Result**<br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password do not match any user in this service""<br>
**Actual Result**<br>
"1- User can not be able to login<br>
2- An error message  appears : <br>
   ""Username and password do not match any user in this service"""<br>
**Status**<br>
Pass<br>

**Test_ID 9**<br>
**Test Title**<br>
verify that applying sql injection in "username" and "password"<br>
**Pre-condition**<br>
1- Open the link "https://www.saucedemo.com/"<br>
**Test Steps**<br>
1- Enter correct username<br>
2- Enter correct password<br>
**Test Data**<br>
"username : standard_user<br>
password : secret_sauce"<br>
**Expected Result** <br>
1- User should not be able to login<br>
2- An error message should appear : <br>
   ""Username and password do not match any user in this service""<br>
**Actual Result**<br>
1- User can not be able to login<br>
2- An error message  appears : <br>
   ""Username and password do not match any user in this service""<br>
**Status**<br>
Pass<br>





