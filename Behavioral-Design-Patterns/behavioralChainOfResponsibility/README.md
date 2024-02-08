## Chain of Responsibility
### Definition
- Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. 
Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

### Example
- Image a race registration system to validate runners registrations, the system should validate the runner's age, the runner's 
health condition, and the payment status. A runner can register to a race by providing his age , health condition and payment status `Registration` Class,

- We have the interface `RegistrationHandler` that has the method `processRegistration` that takes a `Registration` object and 
process it or pass it to the next handler in the chain.

- The utility of this pattern is to have a decoupled system, where we can add or remove handlers without affecting the client code.


[Chain of Responsibility Refactoring Guru](https://refactoring.guru/design-patterns/chain-of-responsibility)
