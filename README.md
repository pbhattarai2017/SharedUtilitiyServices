### Spring Boot Server Deployment Guide
1. Install OpenJDK 21 from https://jdk.java.net/21/
2. Set appropriate values for database, username & password in file `SharedUtilityServices/src/main/resources/application.properties`
  > Replace `your_database_name`, `your_username` & `your_password` string with actual value.
4. Open this repository's directory in command line and execute the following command.
  > `./gradlew bootJar`
3. Find the generated `.jar` file in `build/libs` directory
4. Run the generated `jar` file with the following command.
>  `java -jar build/libs/SharedUtilityServices-0.0.1.jar`
5. Now, the application is ready to serve API requests.
