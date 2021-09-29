# Base Controller Example

## Build Run Test

Adjust `run.sh` to reflect your New Relic JAR/config/environment then run it.

Then run `runTests.sh` to hit the `composed` then `inherited` endpoints to see the
behavior.

If shared controller functionality is pulled out and used via `composition` the transactions
will appear as expected.

If they are inherited, transaction naming mechanism will not work correctly.

PLEASE NOTE: If `inherited` endpoints are hit first directly after startup, it will potentially cause issues
with the `composed` endpoints as they cause problems with the internal workings of the New Relic Agent's
Spring controller annotation functionality.

## Parent controller example

Two `XxxChildController` classes inherit a root `GET` mapping in the `...inheritance` package.

```
curl http://localhost:8080/inherited/v1
curl http://localhost:8080/inherited/v2
```

## Controllers sharing functionality via composition

Two `Version#Controller` classes each have a root `GET` mapping in the `...composition` package.

```
curl http://localhost:8080/composed/v1
curl http://localhost:8080/composed/v2
```

The shared functionality has been refactored into a separate utility class `GetStuffAndDoThingsService`

## History

In early days of the Spring Framework the way you make a "controller" was to extend a Spring base controller class.

As this was found to be prohibitive and more designs increasingly chose to *Favor composition over inheritance* they began to use annotations.

*Favor composition over inheritance* is `Item 18` in Joshua Bloch's book *Effective Java, Third Edition*