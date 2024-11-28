# Multi Module

- [Getting Started | Creating a Multi Module Project](https://spring.io/guides/gs/multi-module)

## Módulos

```
└── library
└── application
```

- `library` produce un jar pero no es una aplicación
- `application` tiene a `library` como dependencia

## Run

```sh
mvn clean install
mvn spring-boot:run -pl application
```