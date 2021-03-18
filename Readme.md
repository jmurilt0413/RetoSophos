## Table of Contents
1. [Informacion general](general-info)
2. [Tecnologias](technologies)
3. [Ejecución](installation)
### General Info
***
Este proyecto fue creado con el fin de poner a prueba la habilidad para automatizar front
y back.

## Technologies
***
Esta es la lista de tecnologias utilizadas:
* [Junit](https://mvnrepository.com/artifact/junit/junit/4.12) 
* [ChromeDriver 88.0.4324.96](https://chromedriver.chromium.org/) 
* [Serenity-Cumcumber](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber/)
* [Serenity-Rest](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-cucumber/)
* [Serenity-WebDriver](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay-webdriver/)
* [Serenity-Core](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-core/)
* [Serenity-ScreenPlay](https://mvnrepository.com/artifact/net.serenity-bdd/serenity-screenplay/)
## Execution
***
Se debe seguir los siguientes pasos 
```
* Validar la version del navegador chrome y agregar en la siguiente ruta 
  la version de chrome driver correspondiente en caso que no corresponda
   "src/test/resources/webdriver/windows/chromedriver.exe"

* Se puede ejecutar todo el proyecto desde la terminal de gradle con el
  comando $gradle clean test


```
