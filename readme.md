Securing Quarkus Prometheus API 
=======================

A simple apps to display how a secure metrics are being provided by Quarkus apps.

## Tools
- IntelliJ IDEA
- Quarkus version 1.6.1.Final

## Endpoints
Health Check for Kubernetes's Liveness and Healthiness Probe
```
http://localhost:8082/health
```

Prometheus Metrics (use admin / password for login to see the result metrics)
```
http://localhost:8082/metrics
```

## Security
Using a basic Quarkus endpoint authorization 
```
https://quarkus.io/guides/security#authorization-of-web-endpoints-using-configuration
```

authorization is based on a plain text user validation
```
https://quarkus.io/guides/security-properties
```