Real-Time Chat Application

Overview

This is a real-time chat application built with Spring Boot and WebSockets. It allows users to send and receive messages instantly using STOMP over WebSockets.

Features

Real-time messaging using WebSockets

STOMP protocol for message handling

Bootstrap UI for a simple and responsive chat interface

Spring Boot backend for message processing

SockJS fallback for unsupported browsers

Technologies Used

Java (Spring Boot)

WebSockets & STOMP

SockJS & Stomp.js

Bootstrap 5 (for UI styling)

HTML, JavaScript

Installation & Setup

1. Clone the repository

git clone <repo-url>
cd chat_app

2. Run the Spring Boot application

Ensure you have Java 17+ and Maven installed.

mvn spring-boot:run

This starts the backend server at http://localhost:8080.

3. Open the Chat UI

Open the following URL in your browser:

http://localhost:8080/chat

How It Works

When the user opens the chat page, a WebSocket connection is established.

Messages sent are published to the /app/sendMessage endpoint.

The backend broadcasts messages to all subscribed clients on /topic/messages.

Messages appear instantly for all connected users.

API Endpoints

Method

Endpoint

Description

GET

/chat

Serves the chat UI

POST

/app/sendMessage

Sends a message via WebSockets

Project Structure

chat_app/
│── src/main/java/com/chat/chat_app/
│   ├── Entity/
│   │   └── ChatMessage.java
│   ├── Controller/
│   │   └── ChatController.java
│   ├── Config/
│   │   └── WebSocketConfig.java
│── src/main/resources/
│   ├── static/chat.html
│   ├── application.properties

Known Issues & Fixes

If you encounter WebSocket not connecting:

Check the browser console (F12 → Console Tab) for errors.

Ensure the backend is running (mvn spring-boot:run).

Try refreshing the page (Ctrl + Shift + R).

License

This project is open-source and free to use under the MIT License.

Developed by Anjali Singhai 🚀