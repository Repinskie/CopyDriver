# Cloud File Storage

Cloud File Storage is a multi-user file cloud that allows users to upload and store files online. The project provides functionality for managing files and folders.

## Main Features

- **User Management**: Registration, authorization, logout.
- **File and Folder Operations**: Uploading and creating files and folders, deleting, renaming, downloading.
- **Search and Navigation**: Searching files by name, navigating the directory structure, breadcrumb navigation.
- **Data Protection and Session Management**: User authentication with Spring Security and session storage in Redis for resilience and automatic expiration of sessions.

## Technology Stack

- **Backend**: Java, Spring Boot, Spring Security, Spring Sessions, Thymeleaf, Spring Data JPA.
- **Frontend**: HTML, CSS, Bootstrap.
- **Data Storage**: SQL (MySQL) for user data and S3 (MinIO) for file storage.
- **Containerization and Deployment**: Docker, Docker Compose.
- **Testing and Migration Tools**: JUnit, Testcontainers, Liquibase.

## Development Plan

1. Set up Docker Compose for running MySQL.
2. Implement user registration and authorization using Spring Security.
3. Add functionality for uploading, displaying, renaming, and deleting files and folders.
4. Integrate Minio Java SDK for managing files in S3-compatible storage.
5. Implement session storage in Redis.
6. Prepare and deploy the project to a cloud server.

