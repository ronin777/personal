# personal
Spring Re-Active to Oracle


Descargar jar ojdbc6.jar y ejecutar el siguiente comando en la carpeta donde se encuentra el jar

mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0.3 -Dpackaging=jar -Dfile=ojdbc6.jar -DgeneratePom=true


Luego se agregar la siguiente dependencia al pom del proyecto / igual si el comando puede ser omitdo y localo en la carpeta de repositorio .m2 de manera manual
<dependency>
    <groupId>com.oracle</groupId>
    <artifactId>ojdbc6</artifactId>
    <version>11.2.0.3</version>
</dependency>
