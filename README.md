# Distributed Key-Value Store

A distributed key-value store built from scratch to explore the fundamentals of distributed systems.  
It implements concepts such as:

- **Consistent Hashing** for partitioning data across nodes  
- **Replication** for fault tolerance  
- **Quorum-based Reads/Writes** for consistency  
- **Leader Election** to coordinate cluster state  
- Support for **different consistency models** (eventual / strong)  

This project is intended as a learning showcase of distributed systems principles rather than a production-ready database.

## Features
- Cluster-aware key-value storage
- Automatic data partitioning and replication
- Fault-tolerant read/write operations
- Configurable consistency guarantees

## Tech Stack
- Java
- gRPC for inter-node communication
- Spring Boot for API layer (optional)

## Getting Started
1. Clone the repo
2. Start multiple nodes to form a cluster
3. Use the REST/gRPC API to store and retrieve data

## Status
🚧 Work in progress — contributions and suggestions are welcome!
