## Balancee Rewards API

I would like to begin by expressing my gratitude for the opportunity to showcase my skills with a test like this.

Following the document I was provided with, I implemented the following

- A model called `CustomerRewards` containing the required fields
- Another model called `CashbackHistory` with it's own required fields
- An endpoint `/api/rewards/balance` returning the information regarding a particular user
- An endpoint `/api/rewards/history`
returning the transaction history of a particular user

__NOTE__: The endpoint `/api/rewards/history` indicated to retrieve history regarding a particular customer but no customer id was provided on the document for the `CashbackHistory`. To handle this, I added a foreign key column to retrieve the `CsustomerRewards` customerId column. Apologies if this was a misinterpretation on my part.

I also added a data seeder class to populate the database with records to be retrieved on the respective endpoints of each model as we were not asked to create endpoints to store data.

I did not add JWT Authentication as I am not very comfortable working with spring-security at this moment in time.

I used postgresql as my database of choice and the configuration (database name, username and password) are contained in the application.properties file. Please update as necessary

To install the dependencies, run:

```./mvnw install -f pom.xml```

To run the application, run the command below:

```./mvnw spring-boot:run```