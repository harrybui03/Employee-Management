# Employee Management

## Get Started

### Local Development
#### Software & Hardware requirements
- You must install the [Docker Desktop](https://www.docker.com/products/docker-desktop/) and Docker Compose on your local desktop to spin up all systems
- Change your Docker Desktop resource capacity to at least 8GB RAM and 4 vCPU
- Download [Dbeaver](https://dbeaver.io/download/) to interact with Database 

#### Run Database by Docker-Compose

- Start docker and run docker-compose by use your terminal

  ```bash
  docker-compose up
  ```
#### How to test 
- Open Dbeaver and connect MySQL server with information:
    - Database: `employee_management`
    - username: `user`
    - password: `password`  