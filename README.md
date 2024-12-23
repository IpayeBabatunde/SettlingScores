important Note! 

1. Cross Origin: it allows rest api's to be invoked by resourses that aren't hosted on the same domain
2. Path Variable: it allows to get data out of the URI, it's a critical piece of knowledge in Rest API's and development in spring boot
3. GetMapping: The HTTP protocol, the protocol of the web has about eight different method
and get method is just defined as a way to get information about a resources, it could be a web page we are getting, a picture, etc.
a get invocation is to get information from a server and leave the server unchange

GET: get data from the server
POST: an idempotent opearation, it can update the server
PUT: replace a resource on the server, update all properties of a resource
PATCH: updating one property of a resource in a server
DELETE: removing the resource from the server
HEAD: provides all the headers from the servers
OPTIONS: is a request to make when the server is suppose to signal you which of the HTTP methods the restfull api's supports

PatchMapping: it allows to update just one property of a resource
