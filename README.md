## Register User (Test Case 1-5)
**Scenario: Register User (Test Case 1)**
1.	Launch browser and navigate to url
2.	Click on 'Signup / Login' button
3.	Verify 'New User Signup!' is visible
4.	Enter name and email address
5.	Click 'Signup' button
6.	Verify that 'ENTER ACCOUNT INFORMATION' is visible
7.	Fill details: Title, Name, Email, Password, Date of birth
8.	Select checkbox 'Sign up for our newsletter!'
9.	Select checkbox 'Receive special offers from our partners!'
10.	Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
11.	Click 'Create Account button'

**Scenario: Register User With Existing Email (Test Case 5)**
1.	Launch browser and navigate to url
2.	Verify that home page is visible successfully
3.	Click on 'Signup / Login' button
4.	Verify 'New User Signup!' is visible
5.	Enter name and already registered email address
6.	Click 'Signup' button
7.	Verify error 'Email Address already exist!' is visible

## Login User (Test Case 2-3)
**Scenario: Correct Login User**
1.	Launch browser and navigate to url
2.	Verify that home page is visible successfully
3.	Click on 'Signup / Login' button
4.	Verify 'Login to your account' is visible
5.	Enter correct email address and password
6.	Click 'login' button
7.	Verify that 'Logged in as username' is visible

**Scenario: Incorrect Login User**
1.	Launch browser and navigate to url
2.	Verify that home page is visible successfully
3.	Click on 'Signup / Login' button
4.	Verify 'Login to your account' is visible
5.	Enter incorrect email address and password
6.	Click 'login' button
7.	Verify error 'Your email or password is incorrect!' is visible

## Logout User (Test Case 4)
1.	Launch browser and navigate to url
2.	Verify that home page is visible successfully
3.	Click on 'Signup / Login' button
4.	Verify 'Login to your account' is visible
5.	Enter correct email address and password
6.	Click 'login' button
7.	Verify that 'Logged in as username' is visible
8.	Click 'Logout' button

## General Pages (Test Case 67-8-9-10-11-25-26)
**Scenario: Contact Us Form (Test Case 6)**
1.	Launch browser navigate to url
2.	Click on 'Contact Us' button
3.	Verify 'GET IN TOUCH' is visible
4.	Enter name, email, subject and message
5.	Upload file
6.	Click 'Submit' button
7.	Click OK button
8.	Verify success message 'Success! Your details have been submitted successfully.' is visible

**Scenario: Verify Test Cases Page (Test Case 7)**
1.	Launch browser navigate to url
2.	Click on 'Test Cases' button
3.	Verify user is navigated to test cases page successfully

**Scenario: Verify All Products Page (Test Case 8)**
1.	Launch browser navigate to url
2.	Click on 'Products' button
3.	Verify user is navigated to ALL PRODUCTS page successfully

**Scenario: Verify Search Products Page (Test Case 9)**
1.	Launch browser navigate to url
2.	Click on 'Products' button
3.	Verify user is navigated to ALL PRODUCTS page successfully
4.	Enter product name in search input and click search button
5.	Verify 'SEARCHED PRODUCTS' is visible
6.	Verify all the products related to search are visible

**Scenario: Verify Subscription in home page (Test Case 10)**
1.	Launch browser navigate to url
2.	Scroll down to footer
3.	Verify text 'SUBSCRIPTION'
4.	Enter email address in input and click arrow button
5.	Verify success message 'You have been successfully subscribed!' is visible

**Scenario: Verify Subscription in Cart page (Test Case 11)**
1.	Launch browser navigate to url
2.	Click 'Cart' button
3.	Scroll down to footer
4.	Verify text 'SUBSCRIPTION'
5.	Enter email address in input and click arrow button
6.	Verify success message 'You have been successfully subscribed!' is visible

**Scenario: Verify Scroll Up using 'Arrow' button and Scroll Down functionality (Test Case 25)**
1.	Launch browser navigate to url
2.	Scroll down page to bottom
3.	Verify 'SUBSCRIPTION' is visible
4.	Click on arrow at bottom right side to move upward
5.	Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

**Scenario: Verify Scroll Up without 'Arrow' button and Scroll Down functionality (Test Case 26)**
1.	Launch browser navigate to url
2.	Scroll down page to bottom
3.	Verify 'SUBSCRIPTION' is visible
4.	Scroll up page to top
5.	Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

## Product (Test Case 12-13-17-18-19-21-22)
**Scenario: Add Products in Cart (Test Case 12)**
1.	Launch browser navigate to url
2.	Click 'Products' button
3.	Hover over first product and click 'Add to cart'
4.	Click 'Continue Shopping' button
5.	Hover over second product and click 'Add to cart'
6.	Click 'View Cart' button
7.	Verify both products are added to Cart
8.	Verify total quantity 
9.	Verify total price

**Scenario: Verify Product quantity in Cart (Test Case 13)**
1.	Launch browser navigate to url
2.	Click 'View Product' 
3.	Increase quantity to 4
4.	Click 'Add to cart' button
5.	Click 'View Cart' button
6.	Verify total quantity 
7.	Verify total price

**Scenario: Remove Products From Cart (Test Case 17)**
1.	Launch browser navigate to url
2.	Add products to cart
3.	Click 'Cart' button
4.	Verify that cart page is displayed
5.	Click 'X' button corresponding to particular product
6.	Verify that product is removed from the cart

**Scenario: View Category Products (Test Case 18)**
1.	Launch browser navigate to url
2.	Verify that categories are visible on left side bar
3.	Click on 'Women' category
4.	Click on any category link under 'Women' category, for example: Dress
5.	Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
6.	On left side bar, click on any sub-category link of 'Men' category
7.	Verify that user is navigated to that category page

**Scenario: View & Cart Brand Products (Test Case 19)**
1.	Launch browser navigate to url
2.	Click on 'Products' button
3.	Verify that Brands are visible on left side bar
4.	Click on any brand name
5.	Verify that user is navigated to brand page and brand products are displayed
6.	On left side bar, click on any other brand link
7.	Verify that user is navigated to that brand page and can see products

**Scenario: Search Products and Verify Cart After Login (Test Case 20)**
1.	Launch browser navigate to url
2.	Click on 'Products' button
3.	Verify user is navigated to ALL PRODUCTS page successfully
4.	Enter product name in search input and click search button
5.	Verify 'SEARCHED PRODUCTS' is visible
6.	Verify all the products related to search are visible
7.	Add those products to cart
8.	Click 'Cart' button and verify that products are visible in cart
9.	Click 'Signup / Login' button and submit login details
10.	Again, go to Cart page
11.	Verify that those products are visible in cart after login as well

**Scenario: Add review on product (Test Case 21)**
1.	Launch browser navigate to url
2.	Click on 'Products' button
3.	Verify user is navigated to ALL PRODUCTS page successfully
4.	Click on 'View Product' button
5.	Verify 'Write Your Review' is visible
6.	Enter name, email and review
7.	Click 'Submit' button
8.	Verify success message 'Thank you for your review.'

**Scenario: Add to cart from Recommended items (Test Case 22)**
1.	Launch browser navigate to url
2.	Scroll to bottom of page
3.	Verify 'RECOMMENDED ITEMS' are visible
4.	Click on 'Add To Cart' on Recommended product
5.	Click on 'View Cart' button
6.	Verify that product is displayed in cart page

## Order (Test Case 14-15-16)
**Scenario: Place Order: Register while Checkout (Test Case 14)**
1.	Launch browser navigate to url
2.	Add products to cart
3.	Click 'Cart' button
4.	Click Proceed To Checkout
5.	Click 'Register / Login' button
6.	Fill all details in Signup and create account
7.	Verify 'ACCOUNT CREATED!' and click 'Continue' button
8.	Verify ' Logged in as username' at top
9.	Click 'Cart' button
10.	Click 'Proceed To Checkout' button
11.	Verify Address Details and Review Your Order
12.	Enter description in comment text area 
13.	Click 'Place Order'
14.	Enter payment details: Name on Card, Card Number, CVC, Expiration date
15.	Click 'Pay and Confirm Order' button
16.	Verify success message 'Your order has been placed successfully!'

**Scenario: Place Order: Register Before Checkout (Test Case 15)**
1.	Launch browser navigate to url
2.	Click 'Signup / Login' button
3.	Fill all details in Signup and create account
4.	Verify 'ACCOUNT CREATED!' and click 'Continue' button
5.	Verify ' Logged in as username' at top
6.	Add products to cart
7.	Click 'Cart' button
8.	Verify that cart page is displayed
9.	Click Proceed To Checkout
10.	Verify Address Details and Review Your Order
11.	Enter description in comment text area and click 'Place Order'
12.	Enter payment details: Name on Card, Card Number, CVC, Expiration date
13.	Click 'Pay and Confirm Order' button
14.	Verify success message 'Your order has been placed successfully!'

**Scenario: Place Order: Login Before Checkout (Test Case 16)**
1.	Launch browser navigate to url
2.	Click 'Signup / Login' button
3.	Fill email, password and click 'Login' button
4.	Verify 'Logged in as username' at top
5.	Add products to cart
6.	Click 'Cart' button
7.	Verify that cart page is displayed
8.	Click Proceed To Checkout
9.	Verify Address Details and Review Your Order
10.	Enter description in comment text area and click 'Place Order'
11.	Enter payment details: Name on Card, Card Number, CVC, Expiration date
12.	Click 'Pay and Confirm Order' button
13.	Verify success message 'Your order has been placed successfully!'

## Payment Page (Test Case 23)
**Scenario: Verify address details in checkout page (Test Case 23)**
1.	Launch browser navigate to url
2.	Click 'Signup / Login' button
3.	Enter correct email address and password
4.	Click 'login' button
5.	Verify that 'Logged in as username' is visible
6.	Add products to cart
7.	Click 'Cart' button
8.	Verify that cart page is displayed
9.	Click Proceed To Checkout
10.	Verify that the delivery address is same address filled at the time registration of account
11.	Verify that the billing address is same address filled at the time registration of account

**Scenario: Download Invoice after purchase order (Test Case 24)**
1.	Launch browser navigate to url
2.	Add products to cart
3.	Click 'Cart' button
4.	Verify that cart page is displayed
5.	Click Proceed To Checkout
6.	Click 'Register / Login' button
7.	Enter correct email address and password
8.	Click 'login' button
9.	Verify that 'Logged in as username' is visible
10.	Click 'Cart' button
11.	Click 'Proceed To Checkout' button
12.	Verify Address Details and Review Your Order
13.	Enter description in comment text area and click 'Place Order'
14.	Enter payment details: Name on Card, Card Number, CVC, Expiration date
15.	Click 'Pay and Confirm Order' button
16.	Verify success message 'Your order has been placed successfully!'
17.	Click 'Download Invoice' button and verify invoice is downloaded successfully.
18.	Click 'Continue' button 
