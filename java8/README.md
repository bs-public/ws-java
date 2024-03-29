## Java8

### Date/Time APIs
Issues with the Existing Date/Time APIs

**Thread Safety:** The existing Date and Calendar classes are not thread safe, leaving developers to deal with the headache of hard to debug concurrency issues and 
to write additional code to handle thread safety. On the contrary the new Date and Time APIs introduced in Java 8 are immutable and thread safe, 
thus taking that concurrency headache away from developers.

**APIs Design and Ease of Understanding:** The Date and Calendar APIs are poorly designed with inadequate methods to perform day-to-day operations. 
The new Date/Time APIs is ISO centric and follows consistent domain models for date, time, duration and periods. There are a wide variety of utility 
methods that support the commonest operations.

**ZonedDate and Time:** Developers had to write additional logic to handle timezone logic with the old APIs, whereas with the new APIs, 
handling of timezone can be done with Local and ZonedDate/Time APIs.
