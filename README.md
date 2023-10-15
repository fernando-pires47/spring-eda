# Spring EDA
Project example using EDA Architecture

### Dependencies
* Docker
* Docker Compose
* Java 17

### To Run

Execute in root directory:

```bash
sudo docker-compose up -d 
```

### Produce event

To send message realize post request in url

```bash
http://localhost:8080/
```

Using request body

```bash
{
  "name": "test"
}
```

To see project logs run

```bash
sudo docker-compose logs spring-eda -f
```

## License

This application is available under the
[MIT license](https://opensource.org/licenses/MIT).
