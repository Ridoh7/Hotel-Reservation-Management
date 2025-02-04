# Hotel-Reservation-Management
This project is a RESTful API for managing hotel bookings, users, rooms, and authentication. It provides endpoints for user registration and login, room management, booking operations, and user profile management.

# Features
Authentication: Secure user registration and login functionality.
Room Management: CRUD operations for rooms, including adding photos, descriptions, and checking availability.
Booking Management: Book rooms, cancel bookings, and search by confirmation codes.
User Management: Retrieve user information and view booking history.
Role-based Authorization: Different access levels for ADMIN and USER.

# Technologies Used  
- **Spring Boot**: Framework for building the application.  
- **Spring Security**: Handles authentication and role-based authorization.  
- **JPA/Hibernate**: Facilitates database interactions.  
- **Lombok**: Reduces boilerplate code.  
- **Java**: Primary programming language for backend development.  
- **AWS S3**: Cloud storage service for storing images.  

# Prerequisites
Java 17 or later
Maven for dependency management
A relational database (e.g., MySQL)

# Configure the Application: 
Update the application.properties file with your database credentials and any other necessary configurations:
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

# Access the API: The API will be available at: http://localhost:8080.

# API Endpoints
# Authentication
HTTP Method	Endpoint	Description	Roles
POST	/auth/register	Register a new user	Public
POST	/auth/login	Login a user	Public

# User Management
HTTP Method	Endpoint	Description	Roles
GET	/users/all	Retrieve all users	ADMIN
GET	/users/get-by-id/{userId}	Retrieve a user by ID	Public
GET	/users/get-logged-in-profile-info	Get logged-in user profile	Public
DELETE	/users/delete/{userId}	Delete a user by ID	ADMIN
GET	/users/get-user-bookings/{userId}	Retrieve user booking history	Public

# Room Management
HTTP Method	Endpoint	Description	Roles
POST	/rooms/add	Add a new room	ADMIN
GET	/rooms/all	Retrieve all rooms	Public
GET	/rooms/types	Retrieve all room types	Public
GET	/rooms/room-by-id/{roomId}	Retrieve room details by ID	Public
GET	/rooms/all-available-rooms	Retrieve all available rooms	Public
GET	/rooms/available-rooms-by-date-and-type	Retrieve available rooms by date and type	Public
PUT	/rooms/update/{roomId}	Update room details	ADMIN
DELETE	/rooms/delete/{roomId}	Delete a room	ADMIN

# Booking Management
HTTP Method	Endpoint	Description	Roles
POST	/bookings/book-room/{roomId}/{userId}	Book a room for a user	ADMIN, USER
GET	/bookings/all	Retrieve all bookings	ADMIN
GET	/bookings/get-by-confirmation-code/{code}	Retrieve booking by confirmation code	Public
DELETE	/bookings/cancel/{bookingId}	Cancel a booking	ADMIN, USER

# Role-Based Authorization
# ADMIN:
Manage rooms
View all bookings and users
Cancel any booking

# USER:
Book rooms
View own booking history
Cancel own bookings
Response Format

# All responses follow a consistent structure:
{
  "statusCode": 200,
  "message": "Success",
  "data": { ... }
}
