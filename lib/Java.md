# Configuración JAVA

## Descargar la version de JDK 8
https://www.oracle.com/co/java/technologies/javase/javase8-archive-downloads.html

## Descargar el repositorio:
https://bitbucket.org/conseresapl/backend-coranforms/src/main/

## Descargar IDE de JetBrain
https://www.jetbrains.com/idea/download/?section=windows

## Agregar el Jar
Agregar el archivo ojdbc6-11.2.0.3.jar al Maven
mvn install:install-file -Dfile=lib/ojdbc6-11.2.0.3.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
