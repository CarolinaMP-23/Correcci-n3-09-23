 PurchaseCarritoCM1
prueba funcional automatizada Prueba E2E, de un flujo de compra en la siguiente página web https://www.demoblaze.com/, que incluya los siguientes escenarios:
    1.	 Agregar dos productos al carrito
    2.	Visualizar el carrito
    3.	Completar el formulario de compra
    4.	Finalizar la compra
Contiene las siguientes caracteristicas:
  -	SerenityBDD con ScreenPlay
  -	Cucumber
  -	Maven: 3.9.1
  -	IDE: IntelliJ IDEA
  -	JDK: 17

Requisitos previos: 
  Versión JAVA:
      C:\Users\link digital>java -version
      java version "17" 2021-09-14 LTS
      Java(TM) SE Runtime Environment (build 17+35-LTS-2724)
      Java HotSpot(TM) 64-Bit Server VM (build 17+35-LTS-2724, mixed mode, sharing)
  
  Versiçon Marven
      C:\Users\link digital>mvn --version
      Apache Maven 3.9.4 (dfbb324ad4a7c8fb0bf182e6d91b0ae20e3d2dd9)
      Maven home: C:\Users\link digital\Downloads\apache-maven-3.9.4
      Java version: 17, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-17
      Default locale: es_ES, platform encoding: Cp1252
      OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
  
  Versión Gradle
      C:\Users\link digital>gradle --version
      
      Welcome to Gradle 7.6.1!
      
      Here are the highlights of this release:
       - Added support for Java 19.
       - Introduced `--rerun` flag for individual task rerun.
       - Improved dependency block for test suites to be strongly typed.
       - Added a pluggable system for Java toolchains provisioning.
      
      For more details see https://docs.gradle.org/7.6.1/release-notes.html
      
      
      ------------------------------------------------------------
      Gradle 7.6.1
      ------------------------------------------------------------
      
      Build time:   2023-02-24 13:54:42 UTC
      Revision:     3905fe8ac072bbd925c70ddbddddf4463341f4b4
      
      Kotlin:       1.7.10
      Groovy:       3.0.13
      Ant:          Apache Ant(TM) version 1.10.11 compiled on July 10 2021
      JVM:          17 (Oracle Corporation 17+35-LTS-2724)
      OS:           Windows 10 10.0 amd64
    

Ejecutar pruebas:
Ejecución desde el CMD: 
   1) Abre el símbolo del sistema.
   2) Asegurar que estás en el directorio raíz (TestSuite.java) del proyecto.
   3) Ejecuta el comando  Maven: mvn clean test
Ejecución desde el RunnerTest:
  Al hacer clic en RunnersTest, se abrirá una ventana donde indique la URL para verificar la ejecución de la prueba: https://repo.maven.apache.org/maven2/net/serenity/serenity.screenplay/2.3.       
  10/serenity.screenplay-2.3.10.pom https://cucumber.io/blog/open-source/annunciando-cucumber-jvm-4-2-0/net/serenity/serenity.screenplay/2.3.10/serenity .guion-2.3.10.pom
