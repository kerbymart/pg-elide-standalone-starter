# Elide Standalone Starter Project

This project serves as a basic setup to kick-start your application using the Elide library.

## Getting Started

Clone the repository to your local machine for development and testing purposes.

## Prerequisites

Ensure you've [Maven](https://maven.apache.org/download.cgi) installed on your machine.

## Installation and Running

To run this project, the following steps must be followed:

1. Navigate to the project directory in your terminal.
2. Compile and package the application using Maven with the following command:
    ```
    mvn package
    ```
3. Once the application is packaged, run the standalone Java application using:
    ```
    mvn exec:java
    ```
## Setting Up Docker

1. [Install Docker](https://docs.docker.com/get-docker/)
2. Run PostgreSQL with Docker using these commands:

    ```bash
    docker pull postgres
    docker run --name postgres-docker -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -d -p 5432:5432 postgres    
   ```

The username and password are set to 'postgres' for compatibility with the `dbconfig.properties` file in this project. 
If you wish to use different credentials, make sure to also update them in the properties file.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

For major changes, please open an issue first to discuss what you would like to change. Please make sure to update tests as appropriate.

## License

Distributed under the [Apache 2.0](http://www.apache.org/licenses/LICENSE-2.0.html) License. See `LICENSE` for more information.

## Contact

Kerby Martino - kerbymart@gmail.com
Project Link: [https://github.com/kerbymart/pg-elide-standalone-starter](https://github.com/kerbymart/pg-elide-standalone-starter)