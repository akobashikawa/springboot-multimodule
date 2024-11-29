# Multi Module

- [Getting Started | Creating a Multi Module Project](https://spring.io/guides/gs/multi-module)

## Módulos

```
gs-multi-module
|  pom.xml
└── library
|  pom.xml
|  application.properties
└── application
|  pom.xml
|  application.properties
└── applicationdos
   pom.xml
   application.properties
```

- `library` produce un jar pero no es una aplicación
- `application` tiene a `library` como dependencia
- `applicationdos` tiene a `library` como dependencia

## Build

```sh
mvn clean install
```

## Run

```sh
mvn spring-boot:run -pl application
```

- http://localhost:8081/application/home
- http://localhost:8081/application/swagger-ui/index.html

```sh
mvn spring-boot:run -pl applicationdos
```

- http://localhost:8082/applicationdos/home
- http://localhost:8082/applicationdos/swagger-ui/index.html