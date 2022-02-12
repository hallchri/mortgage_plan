## Trainee 2022 Codetest

Created in response to Crosskey's preliminary assignment for Trainee 2022 position

## Description
Java application for calculating mortgage plan and outputting respective prospects.<br />
Compiled, built, tested and ran with Gradle. The web interface is made possible with Spring Boot and is hosted on Azure as an App Service.<br />

Please do contact me if anything comes to mind regarding my submission! 😊

###Optional parts done:
- Dockerfile ✅
- Web interface ✅
- Publish application i a public Cloud Service (Azure) ✅

## Running the application

Clone this repository and open it, preferably in IntelliJ IDEA, and run the Main class directly

<b>OR</b>

Run it directly in a terminal by locating yourself in <b>../build/classes/java/main/</b>:
```sh
java com.company.Main
```
<u><b>NOTE</b></u><br />

<b>If you want to ensure that the '€' symbol displays correctly when running the application in the terminal,<br /> you will have to assure that your terminals default codepage is set to UTF-8 or any other encoding that '€' is a part of</b>

## Creating a Docker image of the Java application

Open a terminal in the directory where the Dockerfile is located (project root, i.e "mortgage_plan"), or run the Dockerfile through your IDE

Building the image:
```sh
docker build -t mortgage-plan:1.0 .
```

Running the image in a container:

```sh
docker run mortgage-plan:1.0
```

## Web interface 

[Link to Azure App Service](https://mortgageplan.azurewebsites.net)

I have left the server on as for now, but if the App Service is for some reason unreachable (you never know, especially with Microsoft), please feel free to contact me regarding this.


The web interface is minuscule, simple and for demonstration purposes only. New prospect data isn't actually serialized and are "deleted" on page refresh.<br />
Error handling and such is non-existent for the web application and expects correct input values, I didn't unfortunately have time to implement a more elegant, beautiful and a more complex web application.<br />
(This was my also my first time ever working with Spring Boot)



