Rest Api on Spring Boot
Java
Learning 

GET: localhost:{port}/api/customers/ - get all customers
GET: localhost:{port}/api/customers/1 - get customer with ID 1

POST: localhost:{port}/api/customers/
Request body:
{
	"firstName": "name",
	"lastName": "fam",
	"address": "address",
	"budget": "0"
}

PUT: localhost:{port}/api/customers/
Request body:
Request body:
{
	"firstName": "name",
	"lastName": "fam",
	"address": "address",
	"budget": "0"
}


DELETE: localhost:{port}/api/customers/2 - delete customer with ID 2
