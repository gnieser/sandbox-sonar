Run with:
```
mvn clean verify sonar:sonar -D"sonar.login=<token>" -D"sonar.host.url=<host>" -D"sonar.coverage.jacoco.xmlReportPaths=target/jacoco-report/jacoco.xml"
```