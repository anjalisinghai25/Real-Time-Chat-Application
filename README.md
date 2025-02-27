# Real-Time Chat Application



## Overview
This project is a real-time chat application built using Spring Boot and WebSockets. It enables users to send and receive messages instantly with a responsive frontend.



## Features
- Real-time messaging using WebSockets
- STOMP protocol for message handling
- Interactive UI with Bootstrap
- Simple and clean architecture



## Technologies Used
### Backend (Server-Side)
- Spring Boot
- Spring WebSocket
- Spring Messaging (STOMP Protocol)
- Thymeleaf

### Frontend (Client-Side)
- Thymeleaf
- JavaScript (ES6)
- SockJS
- STOMP.js
- HTML/CSS
- Bootstrap



## Setup Instructions
1. Clone the repository:
   ```sh
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```sh
   cd chat_app
   ```
3. Build and run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```
4. Open the chat application in your browser at:
   ```sh
   http://localhost:8080/chat
   ```



## API Endpoints
| Method | Endpoint          | Description                 |
|--------|------------------|-----------------------------|
| GET    | /chat            | Serves the chat UI          |
| POST   | /app/sendMessage | Sends a message via WebSockets |



## Project Structure
```
chat_app/
│── src/main/java/com/chat/chat_app/
│   ├── entity/
│   │   └── ChatMessage.java
│   ├── controller/
│   │   └── ChatController.java
│   ├── config/
│   │   └── WebSocketConfig.java
│── src/main/resources/
│   ├── static/
│   │   └── chat.html
│   ├── application.properties
```



## Usage
1. Enter your name in the sender input field.
2. Type a message and click the "Send" button.
3. The message is broadcasted in real-time to all connected users.



## Contributing
Feel free to fork the repository and submit pull requests.



## Author
**Anjali Singhai**

