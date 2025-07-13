

```markdown
# 👤 User Management Service

A RESTful API built with **Spring Boot** and **PostgreSQL** for managing users, roles, and authentication.

---

## 🚀 Features

- ✅ User registration and login
- ✅ Role-based access control (Admin/User)
- ✅ JWT authentication
- ✅ CRUD operations for users
- ✅ PostgreSQL database integration
- ✅ Global exception handling
- ✅ Swagger API documentation

---

## 🛠️ Tech Stack

| Layer        | Technology        |
|--------------|------------------|
| Backend      | Spring Boot (v3+) |
| Security     | Spring Security + JWT |
| Database     | PostgreSQL       |
| ORM          | Spring Data JPA  |
| Documentation| Swagger / OpenAPI |
| Build Tool   | Maven            |
| Containerization | Docker (optional) |

---

## 🏗️ Project Structure

```

src/
┣ main/
┃ ┣ java/
┃ ┃ ┗ com/yourcompany/usermanagement/
┃ ┃   ┣ controller/
┃ ┃   ┣ dto/
┃ ┃   ┣ entity/
┃ ┃   ┣ repository/
┃ ┃   ┣ service/
┃ ┃   ┗ security/
┃ ┗ resources/
┃     ┣ application.yml
┃     ┗ static/
┗ test/

````

---

## ⚙️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/user-management-service.git
cd user-management-service
````

### 2. Configure Database

Update your `application.yml`:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/user_dev_db
    username: dev_user
    password: dev_password
```

Or set as environment variables.

---

### 3. Run PostgreSQL with Docker

```bash
docker run --name user-postgres \
  -e POSTGRES_DB=user_dev_db \
  -e POSTGRES_USER=dev_user \
  -e POSTGRES_PASSWORD=dev_password \
  -p 5432:5432 \
  -d postgres:16
```

---

### 4. Build & Run the App

```bash
./mvnw spring-boot:run
```

Or package:

```bash
./mvnw clean install
java -jar target/user-management-service.jar
```

---

## 🔑 API Endpoints

| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| POST   | `/api/auth/register` | Register new user |
| POST   | `/api/auth/login`    | Login & get JWT   |
| GET    | `/api/users`         | Get all users     |
| PUT    | `/api/users/{id}`    | Update user       |
| DELETE | `/api/users/{id}`    | Delete user       |

✅ Protected routes require a valid JWT in the `Authorization: Bearer <token>` header.

---

## 📦 Optional: Docker Compose Setup

```yaml
# docker-compose.yml (simplified)
version: '3.8'
services:
  postgres:
    image: postgres:16
    ports:
      - "5432:5432"
    environment:
      POSTGRES_DB: user_dev_db
      POSTGRES_USER: dev_user
      POSTGRES_PASSWORD: dev_password
```

---

## 📚 Swagger UI

Once the app is running, access documentation at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 🙌 Contributing

Feel free to fork and submit pull requests. Feedback and contributions are always welcome!





