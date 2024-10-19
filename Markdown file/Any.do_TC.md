# Any.do_TCs

## Any.do_LoginPage_TCs
**TC_ID 1**
**Test Title**
Verify That "Continue with Google" button is clickable and redirects to Google login screen
**pre-condition**
User is on the login screen	
**Test steps**
1- Click the "Continue with Google" button
**Expected Result**
1- The Google login page should appear
2- User should be able to log in with a Google account "
**Actual Result**	
1- The Google login page appears
2- User is able to log in with a Google account "	
**Status**
Pass



**TC_ID 2**
**Test Title**
Verify That "Sign in with Apple" button is clickable and redirects to Apple login screen 		
**pre-condition**
User is on the login screen
**Test steps**
1- Click the "Sign in witth Apple" button 
**Expected Result**
1- The Apple login page should appear
2- User should be able to log in with a Apple account
**Actual Result**	
1- The Apple login page appears
2- User is able to log in with a Apple account
**Status**
Pass

**TC_ID 3**
**Test Title**
Verify That "Email" button is clickable and redirects to Email login screen 	
**pre-condition**
User is on the login screen	
**Test steps**
1- Click the "Email" button 
**Expected Result**
1- The Email login page should appear
2- User should be able to log in with credentials
**Actual Result**
1- The Email login page appears
2- User is able to log in with credentials
**Status**
Pass

**TC_ID 4**
**Test Title**
Verify That "Sign in with Facebook" button is clickable and redirects to Facebook login screen	User is on the login screen	 
**pre-condition**
1- Click the "Sign in with Facebookl" button
**Test steps**
1- The Facebook login page should appear
2- User should be able to log in with Facebook account
**Expected Result**

**Actual Result**	
1- The Facebook login page should appear
2- User is not  able to log in with Facebook account
**Status**
Fail


**TC_ID 5**
**Test Title**
Verify That "Why do i need to create an account?" is clickable and redirects to page	
**pre-condition**
User is on the login screen
**Test steps**
1- Click the "Why do i need to create an account?"
**Expected Result**
1- The page containing reasons to create an account should be appeared
**Actual Result**	
The page containing reasons to create an account appeares
**Status**
Pass

**TC_ID 6**
**Test Title**
Verify that "Privacy Policy and Terms" link are clickable and redirects to the appropriate documents
**pre-condition**
User is on the login screen
**Test steps**
1- Click the "Privacy Policy and Terms" link
**Expected Result**
1- The pages of privacy policy and terms should be opened in browser window 
2- All items appear normally

**Actual Result**	
1- The pages of privacy policy and terms is opened in browser window 
2- The title of the page is hidden 
**Status**
Fail

**TC_ID 7**
**Test Title**
Verify that all UI elements are properly aligned and visible			
**pre-condition**
User is on the login screen
**Test steps**
1- Visually inspect the layout
**Expected Result**
1- All elements should be clearly visible and aligned correctly without overlap	
**Actual Result**	
1- All elements clearly visible and aligned correctly without overlap
**Status**
Pass

## Any.do_HomePage_TC

**TC_ID 1**
**Test Title**
Verify that the search bar allows users to search for tasks, events, and notes
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen"
**Test steps**
1- Click on the search bar 
2- Type a task name 
3- Select the task from the list that will be generated
2- User should be in home page screen
**Test Data**
1- Task name : Personal 
**Expected Result**
The relevant Tasks, events , or notes matching the search query should be displayed
**Actual Result**
The relevant Tasks, events , or notes matching the search query is displayed
**Status**
Pass

**TC_ID 2**

**Test Title**
Verify that search not affected with upper and lower case
**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen"
**Test steps**
"1- Click on the search bar 
2- Type a task name starting with uppercase
3- Select the task from the list that will be generated 
4- Click on home page icon
5- Click on the search bar
6- Type a task name starting with lowercase"
**Test Data**
"1- Task name (1st) : Personal 
2- Task name(2nd) : personal"
**Expected Result**
The relevant Tasks, events , or notes matching the search query should be displayed for both tries
**Actual Result**
The relevant Tasks, events , or notes matching the search query is displayed for both tries
**Status**
Pass

**TC_ID 3**
**Test Title**
Verify that clicking on the "+" button allows the user to create a new task list
**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen"
**Test steps**
"1- Click on the ""+"" button under the ""My lists""
2- Enter a name for the new list
3- Click on save "
**Test Data**
List name : Home 
**Expected Result**
A new list should be created and displayed in the "My lists" section 
**Actual Result**
A new list is created and displayed in the "My lists" section 
**Status**
Pass

**TC_ID 4**

**Test Title**
Verify that clicking on the "+" button allows the user to create a new task list as grocery list
**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen"
**Test steps**
"1- Click on the ""+"" button under the ""My lists""
2- Turn on Grocery List button
3- Enter a name for the new list
4- Click on save "
**Test Data**
List name : Home 
**Expected Result**
A new list should be created and displayed in the "My lists" section with grocery icon 
**Actual Result**
A new list is created and displayed in the "My lists" section with grocery icon 
**Status**
Pass

**TC_ID 5**

**Test Title**
Verify that user can delete any List from "My lists" 
**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen"
**Test steps**
"1- Click on any List from ""My list""
2- Click on triple dot icon up right the app
3- Click on ""Delete"""
**Test Data**
**Expected Result**
1- Tasks in the apple reminders app should appear in this list and stay sync with changes made
**Actual Result**
1- Tasks in the apple reminders app is appear in this list and stay sync with changes made
**Status**
Pass


**TC_ID 6**

**Test Title**
Verify that clicking each list (personal, Work, Grocery List) displays the correct tasks under that category
**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen
3- User has tasks saved in each list"
**Test steps**
"1- Click on ""Personal"" List
2- Click on ""Work"" List
3- Click on ""Grocery"" List
3- View each list "
**Test Data**

**Expected Result**
1- The tasks for the selected list should be displayed correctly
**Actual Result**
1- The tasks for the selected list is displayed correctly
**Status**
Pass

**TC_ID 7**

**Test Title**
Verify that the "Shared Space" section is clickcable and redirects the user to shared space when 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
**Test steps**
1- Click on  "shared Space" section 
**Test Data**

**Expected Result**
1- ""shared space"" should be clickable
2- User should be redirect to ""shared Space"" option when clicking "
**Actual Result**
1- ""shared space"" is clickable
2- User is redirect to ""shared Space"" option when clicking "
**Status**
Pass

**TC_ID 8**

**Test Title**
Verify that the bottom navigation options (My Day, Next 7 Days, All Tasks, Calendar) correctly filter and display tasks.
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User has tasks assigned with varying due dates
**Test steps**
1- Click “My Day” and verify tasks due today are displayed.
2-Click “Next 7 Days” and verify tasks for the next week are displayed.
3- Click “All Tasks” and verify all tasks are displayed.
4- Click “Calendar” and verify tasks are shown in calendar view.
**Test Data**

**Expected Result**
1- Each filter should correctly display the appropriate tasks
**Actual Result**
1- Each filter is correctly display the appropriate tasks
**Status**
Pass

**TC_ID 9**
**Test Title**
Verify that the lock icon will lock the list from any edit will be applied 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
**Test steps**
1- Click on lock icon 
**Test Data**

**Expected Result**
1- "My list" should be locked when click on lock icon
**Actual Result**
1- "My list" should be locked when click on lock icon
**Status**
Pass

**TC_ID 10**
**Test Title**
Verify that app ask for credentials when user try to unlock "My lists"
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
**Test steps**
1- Click on Lock icon
2- Try to unlock ""My lists""
**Test Data**

**Expected Result**
1- The app should asked for credentials to unlock the "My lists"
**Actual Result**
1- The app is not asked for credentials to unlock the "My lists"
**Status**
Fail

**TC_ID 11**
**Test Title**
Verify that app send a push notification when a task is due
**pre-condition**
1-User has set a due date for a task
**Test steps**
1- Set a task with a due date and wait until the time arrives.
**Test Data**

**Expected Result**
1- The user should recieve a push notification at the correct time 
**Actual Result**
1- The user should recieve a push notification at the correct time 
**Status**
Pass



**TC_ID 12**
**Test Title**
Verify that all "My lists" section counts the inside tasks successfully
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- Create task inside each section of ""My lists""
**Test steps**
1- Click on ""Work"" under ""My list"" section 
2- Add tasks to it
3- Click on home icon
**Test Data**

**Expected Result**
1- App should count all task inside "work" successfully
**Actual Result**
1- App should count all task inside "work" successfully
**Status**
Pass

## Any.do_bottomBar_TC

**TC_ID 1**
**Test Title**
Verify that a user can create a new task by using the input box at the bottom of the screen.

**pre-condition**
"1- User should be sign in successfully 
2- User should be in home page screen
3- User is on the “My Day” screen."
**Test steps**
1- Click on the text input box that says “I want to…”.
2- Type a new task.
3- Press the arrow to create the Task
**Test Data**
task name : Task_1
**Expected Result**
The new task (Task_1) should appear in the “My day" list 
**Actual Result**
The new task (Task_1) appears in the “My day" list 
**Status**  
Pass

**TC_ID 2**
**Test Title**
Verify that created tasks can be selected to mark as compeleted
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on the “My Day” screen.
4- Tasks are created 

**Test steps**
1- Click the circle next to the task
**Test Data**

**Expected Result**
1- The task should be selected
2- The selected task should be Crossed out
**Actual Result**
1- The task is selected
2- The selected task is Crossed out
**Status** 
Pass

**TC_ID 3**
**Test Title**
Verify that clicking the checkmark on a completed task will unmarks it 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on the “My Day” screen.
4- Tasks are created 
5- Task is marked as compeled
**Test steps**
1- Click the checked circle next to the task
**Test Data**

**Expected Result**
"1- The task should be marked as incomplete
2- The text should no longer be crossed out."
**Actual Result**
"1- The task is marked as incomplete
2- The text is no longer be crossed out."
**Status**
Pass

**TC_ID 4**
**Test Title**
Verify that clicking the “X” button removes the task from the list
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on the “My Day” screen.
4- Tasks are created 
5- Task is marked as compeled
**Test steps**
1- Click the “X” button next to a task 
**Test Data**

**Expected Result**
1- The task should be removed from the list.
**Actual Result**
1- The task is removed from the list.
**Status**
Pass

**TC_ID 5**
**Test Title**

**pre-condition**

**Test steps**

**Test Data**

**Expected Result**

**Actual Result**

**Status**  

**TC_ID 6**
**Test Title**
Verify that completed tasks automatically sort below uncompleted tasks.
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User has completed task
4- User has incomplete tasks 
**Test steps**
1- Click on circle next to task 
**Test Data**

**Expected Result**
1- The completed task should move to the bottom of the list 
**Actual Result**
1- The completed task is moved to the bottom of the list 
**Status**  
Pass

**TC_ID 7**
**Test Title**
Verify that tasks in the “My Day” list can be reordered by dragging and dropping.
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on the “My Day” screen with multiple tasks
**Test steps**
1- Press and hold a task 
2- Drag it to a different position.
**Test Data**
**Expected Result**
1- The task should be reordered successfully.
**Actual Result**
1- The task is reordered successfully.
**Status** 
Pass

**TC_ID 8**
**Test Title**
Verify that the created task in "next 7 Days" list on today section will appear in "My Day" list
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
**Test steps**
1- Click on ""Next 7 Days""
2- Click on ""+"" of ""Today"" section 
3- Enter your task name
4- Click on home icon
5- Click on ""My Day""
**Test Data**
task name : test_11
**Expected Result**
1- The task (test_11) should be appear on "My Day list 
**Actual Result**
1- The task (test_11) is not  appear on "My Day list 
**Status**  
Fail

**TC_ID 9**
**Test Title**
Verify that user can clear all the completed tasks 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on ""My Day"" screen
4- Tasks are created 
5- There are some completed task
**Test steps**
1- Click on triple dot up right the app
2- Select ""clear""
**Test Data**

**Expected Result**
1- The completed task should be removed
**Actual Result**
1- The completed task should be removed
**Status** 
Pass

**TC_ID 10**
**Test Title**
Verify that user can add task to the last day in "Next 7 Days" list 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- User is on ""Next 7 Days"" list
4- Tasks are created to full the screen 
**Test steps**
1- Click on "+" of the last day in "Next 7 Days" list
**Test Data**

**Expected Result**
1- User should be able to add task in last day in "Next 7 Days" list
**Actual Result**
1- User is not  able to add task in last day in "Next 7 Days" list
**Status**  
Pass


**TC_ID 11**
**Test Title**
Verify that user can delete his account
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- Use select any buttom list
**Test steps**
1- Click on triple dot up right the app
2- Select ""settings""
3- Select ""Profile""
4- Select ""delete account"" 
5- Select ""i'm sure""
6- Enter your Password
7- Click on ""Delete account""

**Test Data**

**Expected Result**
1- App should ask user for his password 
2- Password should be appear as hidden icon like(*) when user typ the password in password field
3- Accound should be deleted successfully

**Actual Result**
1- App should ask user for his password 
2- Password should be appear as hidden icon like(*) when user typ the password in password field
2- Accound should be deleted successfully
**Status**  
Fail

**TC_ID 12**
**Test Title**
Verify that when apple account user can delete his account
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- Use select any buttom list
**Test steps**
1- Click on triple dot up right the app
2- Select ""settings""
3- Select ""Profile""
4- Select ""delete account"" 
5- Select ""i'm sure""
6- Enter your Password
7- Click on ""Delete account""
**Test Data**

**Expected Result**
1- App should ask user for his password 
2- Password should be appear as hidden icon like(*) when user typ the password in password field
3- Accound should be deleted successfully

**Actual Result**
1- App should ask user for his password 
2- Password should be appear as hidden icon like(*) when user typ the password in password field
2- Accound should be deleted successfully
**Status** 
Fail

**TC_ID 13**
**Test Title**
Verify that user can move between "Updates" , "News" and help icon smoothly
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- Use select any buttom list
**Test steps**
1- Click on square icon in the top left the app
2- Click on help icon 
3- Swap down the screen 
4- Click on help icon again
**Test Data**

**Expected Result**
 App should open the help icon again smoothly 
**Actual Result**
 Help icon is not opened agian
**Status** 
Fail

**TC_ID 14**
**Test Title**
Verity that user can use "setting" in notification when ever he want 
**pre-condition**
1- User should be sign in successfully 
2- User should be in home page screen
3- Use select any buttom list
**Test steps**
1- Click on square icon in the top left the app 
2- Click on triple dot up right the app
3- Select ""All""
**Test Data**

**Expected Result**
User should be able to select triple dot again
**Actual Result**
Triple dot will disappear
**Status** 
Fail





























