# Social Media App

This is a full-stack social media application built with a React frontend and a Java (Spring Boot) backend. The application allows users to interact in a social media environment.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Backend Setup](#backend-setup-socialmediaapp)
  - [Frontend Setup](#frontend-setup-socialmediareactpart)
- [API Endpoints](#api-endpoints)

## Project Structure

```
/FaceebookProject
|-- /SocialMediaApp           # Backend (Spring Boot)
|   |-- src/main/java         # Java source code
|   |-- pom.xml               # Maven dependencies
|-- /SocialMediaReactPart     # Frontend (React)
|   |-- /shoping_App          # React app source
|   |   |-- src/
|   |   |-- package.json      # NPM dependencies
|-- README.md
```

## Features

- **User Management**:
  - User Authentication (Login/Register) with JWT
  - Follow and Unfollow Users
  - User Profiles
- **Posts**:
  - Create, Read, Update, and Delete Posts
  - Like and Unlike Posts
  - Comment on Posts
  - Share Posts
- **Reels**:
  - Create and View Reels
- **Stories**:
  - Create and View Stories
  - Like and Unlike Stories
- **Chat**:
  - Real-time Chat Functionality

## Technologies Used

### Backend (SocialMediaApp)

- **Framework**: Spring Boot 3.4.1
- **Language**: Java 17
- **Database**: MySQL with Spring Data JPA
- **Security**: Spring Security & JSON Web Tokens (JWT)
- **Build Tool**: Maven
- **Libraries**:
  - `spring-boot-starter-web`
  - `mysql-connector-java`
  - `modelmapper`
  - `jjwt`

### Frontend (SocialMediaReactPart/shoping_App)

- **Framework**: React 19
- **Build Tool**: Vite
- **State Management**: Redux with Redux Thunk
- **Routing**: React Router
- **Styling**: Material-UI & Tailwind CSS
- **HTTP Client**: Axios
- **Form Handling**: Formik & Yup

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.x
- Node.js (v18 or later recommended)
- npm/yarn
- A running MySQL instance

### Backend Setup (SocialMediaApp)

1.  **Configure Database**:
    Open `src/main/resources/application.properties` and update the `spring.datasource` properties to match your MySQL configuration (URL, username, password).

2.  **Navigate to the backend directory**:
    ```bash
    cd SocialMediaApp
    ```

3.  **Install dependencies**:
    ```bash
    mvn install
    ```

4.  **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

### Frontend Setup (SocialMediaReactPart)

1.  **Navigate to the frontend directory**:
    ```bash
    cd SocialMediaReactPart/shoping_App
    ```

2.  **Install dependencies**:
    ```bash
    npm install
    ```

3.  **Start the development server**:
    ```bash
    npm run dev
    ```

## API Endpoints

(Add a brief overview of your main API endpoints here later)

- `POST /api/auth/signup` - Register a new user
- `POST /api/auth/signin` - Login a user
- `PUT /api/users/follow/{userId}` - Follow a user
- `GET /api/posts` - Get all posts
- `POST /api/posts` - Create a new post
- `POST /api/posts/{postId}/like` - Like a post
- `POST /api/posts/{postId}/comment` - Comment on a post
- `POST /api/reels` - Create a new reel
- `POST /api/stories` - Create a new story
