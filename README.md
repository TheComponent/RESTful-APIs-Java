# RESTful API with Java and Spring boot 🫛
Just a sample about how to build a RESTful API

![image](https://github.com/user-attachments/assets/57998a3a-a8df-42e7-a93e-74530eaa2435)

### Technology
- Java 21
- Spring 3.3.4
- Maven 3.3.4
- Swagger
- H2 database

### How to run and test API
- Open project and run
- Open Postman to check the APIs
- APIs:

Create product:

```
POST:
localhost:8080/products
Body:
{
    "name": "Product",
    "description": "A product",
    "price": 10.0
}
```

Get product:

```
GET:
localhost:8080/products/1
```

Update product:

```
PUT:
localhost:8080/products/1
Body:
{
    "name": "Product updated",
    "description": "A product",
    "price": 10.0
}
```

Delete product:

```
DELETE:
localhost:8080/products/1
```

Get all products:

```
GET:
localhost:8080/products
```
  
We learn, we do, we discuss, we improve! 🍁
