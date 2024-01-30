### Spring Boot Server Deployment Guide
1. Install OpenJDK 21 from https://jdk.java.net/21/
2. Install PostgreSQL database server from https://www.postgresql.org/download/
3. Create user account and database for this project in PostgreSQL.
4. Now set appropriate values in the project's `application.properties` file for database, username & password. The `application.properties` file is in `SharedUtilityServices/src/main/resources/`.
  > Replace `your_database_name`, `your_username` & `your_password` string with actual value.
  > Replace `localhost:5432` with actual the ip:port of PostgreSQL server.
4. Open this repository's directory in command line and execute the following command.
  > `./gradlew bootJar`
3. Find the generated `.jar` file in `build/libs` directory
4. Run the generated `jar` file with the following command.
  >  `java -jar build/libs/SharedUtilityServices-0.0.1.jar`
5. Now, the application is ready to serve API requests.
