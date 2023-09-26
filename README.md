# CRUD Products with Java and spring

# How to Run?
- Fork and clone this repository
- Download dependencies; if using IntelliJ, you can trigger Maven to handle this process automatically
- Replace the database credentials (PostgreSQL) in the ``application.yml`` file with your local machine's credentials
- From the ``MyProductsApplication`` file, execute the project; if everything is correct, the API will run on port 8080

## Where can I access the endpoints?
I have shared a workspace in Insomnia with all the endpoints. If you would like to access it, please click on the link below:

https://github.com/DgSantos017/CRUD-de-Products-com-Java-spring-3/blob/master/requestsInsomnia.json
![image](https://github.com/DgSantos017/CRUD-de-Products-com-Java-spring-3/assets/62971277/a0150577-1e36-4134-87b5-ff7f10439a9c)

When accessing this link, click on the red-highlighted download button in the screenshot above, and if you have Insomnia installed on your machine, simply import it

## Requirements to Run Locally
- Java: Version 17 
- PostgreSQL

## API Rest features
### baseUrl -> http://localhost:8080


#### saveProduct -> POST /products
 ### REQUEST
```
{
	"name": "PS6 Console",
	"description": "console mó dahora pra jogar",
	"productType": "Electronics"
}
```
### RESPONSE 
```
{
   "productId": "3ebcdc11-d9f2-4ddd-8b41-7b327bd6b294",
   "name": "PS6 Console",
   "description": "console mó dahora pra jogar",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:16:09Z",
   "lastUpdateDate": "2023-09-24T12:16:09Z"
}
```
#### getAllProducts -> GET /products
### RESPONSE 
```
[
   {
      "productId": "3ebcdc11-d9f2-4ddd-8b41-7b327bd6b294",
      "name": "PS6 Console",
      "description": "console mó dahora pra jogar",
      "productType": "Electronics",
      "creationDate": "2023-09-24T12:16:09Z",
      "lastUpdateDate": "2023-09-24T12:16:09Z"
   },
   {
      "productId": "dea69c6c-b2df-45bd-a9f7-caeb6491a929",
      "name": "Teclado gamer",
      "description": "console mó dahora pra jogar",
      "productType": "Electronics",
      "creationDate": "2023-09-24T12:29:25Z",
      "lastUpdateDate": "2023-09-24T12:29:25Z"
   },
   {
      "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
      "name": "PC Gamer",
      "description": "Gamer mó dahora pra jogar",
      "productType": "Electronics",
      "creationDate": "2023-09-24T12:29:39Z",
      "lastUpdateDate": "2023-09-24T12:29:39Z"
   }
]
```
#### getOneProduct -> GET /products/c5e943d9-d2c1-498a-8bcb-bc3f73557f01
  ### REQUEST
```
{
   "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
   "name": "PC Gamer",
   "description": "Gamer mó dahora pra jogar",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:29:39Z",
   "lastUpdateDate": "2023-09-24T12:29:39Z"
}
```

#### update -> PUT /products/c5e943d9-d2c1-498a-8bcb-bc3f73557f01
  REQUEST
```
{
   "productId": "c5e943d9-d2c1-498a-8bcb-bc3f73557f01",
   "name": "Console Gamer",
   "description": "Gamer editado",
   "productType": "Electronics",
   "creationDate": "2023-09-24T12:29:39Z",
   "lastUpdateDate": "2023-09-24T12:29:39Z"
}
```

## Stacks
- Java 17
- Spring Boot 3
- Spring Data JPA
- PostgreSQL

# Tools
- Linux
- IntelliJ IDE
- Insomnia

Developed by [Diogo Ferreira](https://www.linkedin.com/in/diogo-santos01/)
