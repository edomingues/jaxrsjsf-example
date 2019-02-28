# jaxrsjsf-example
Example project with 3 modules (POJO model, JAX-RS rest interface, JSF web UI).

## Build

```
mvn install
```

## Run

To start the Rest web services:

```
cd jaxrsjsf_rest
mvn jetty:run
```

To start the JSF web server:

```
cd jaxrsjsf_web
mvn jetty:run
```
