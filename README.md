# Interest-Based Real-Time News Reporting System

## Overview
This project involves the development of a cloud-based, interest-based news reporting system that utilizes the publish/subscribe (pub/sub) model along with multicast. The system allows users to subscribe to specific news channels and topics, such as sports, politics, or technology, ensuring they receive timely notifications tailored to their interests. The backend leverages distributed algorithms such as Broadcast, Multicast, Leader Election, Heartbeat Protocols and Mutual Exclusion to manage the dissemination of news articles and updates efficiently.

## Key Features
- **Real-Time Updates**: Users receive immediate notifications for news updates based on their subscribed topics.
- **Personalized News**: Customized news feed tailored to user interests.
- **Scalability**: Utilizes AWS infrastructure for seamless scalability and robust performance.
- **Efficient Resource Management**: Optimizes resource usage with dynamic filtering and multicast communication.
- **High Availability**: Ensures reliable message delivery and system resilience through fault tolerance mechanisms.

## Technologies Used
- **Frontend**: React, JavaScript, HTML, CSS
- **Backend**: Java, Spring Boot, MongoDB
- **Broker**: Express, MySQL, Node.js
- **Cloud Services**: AWS EC2 Instances,VPC
- **Load Testing**: Grafana K6

## Project Components
1. **Publisher Frontend**: Allows publishers to log in, compose, and post news articles.
2. **Publisher Backend**: Handles the saving of messages to the database and communication with the broker.
3. **Broker**: Manages message broadcasting, queue management, and system health checks.
4. **Subscriber Frontend**: Enables users to subscribe to topics and receive notifications.
5. **Subscriber Backend**: Facilitates subscriber authentication and message retrieval.

## System Architecture
The system comprises multiple microservices deployed on AWS EC2 instances, enhancing scalability and availability. The broker component stands between the publisher and subscriber backends, ensuring efficient message dissemination and system reliability through mechanisms like leader election, replication, and heartbeat protocols.

## Performance Metrics
- **Throughput**: Measures the rate of message delivery.
- **Latency**: Measures the time taken for message delivery.
- **Error Rate**: Monitors the rate of message delivery failures.

## Future Improvements
- **Implement Clusters and Replicate Servers**: Enhance efficiency and fault tolerance.
- **Utilize Faster Distributed Database Systems**: Improve data retrieval speeds with technologies like Redis.
- **Implement Distributed Queues**: Streamline job processing and enhance scalability.

## Conclusion
This project successfully demonstrates the implementation of a scalable, reliable, and efficient interest-based real-time news reporting system using cloud computing principles. The system's ability to provide personalized news updates in real-time addresses the growing demand for customized news consumption in today's digital age.


