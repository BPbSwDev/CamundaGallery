# Camunda Gallery
Exercises implemented in Camunda Platform 7 on a Spring Boot project that integrates the camunda machine. Examples of implementation of UserTasks and ServiceTasks.


## Index

1. [Description](#description)
2. [DeployConfiguration](#deploy-configuration)
3. [Prerequisites](#prerequisites)
3. [Usage](#usage)


## Description
Camunda 7 is an open-source BPM platform following the BPMN 2.0 standard. It features a robust process engine for executing workflows, supports user task management, integrates with APIs, and includes a decision engine for rule execution. The platform offers monitoring tools, is extensible through plugins, and has an active community. With user-friendly modeling, it enables organizations to automate, monitor, and optimize their business processes efficiently.

[Camunda Automation Platform 7 Initializr](https://start.camunda.com/) is a tool that facilitates the creation of Spring Boot projects that integrate the Camunda engine, an open source business process engine. Spring Boot is a development framework that simplifies the creation of Java applications, and the Camunda engine enables the execution and management of workflows and business processes. This tool preconfigures the project structure and necessary dependencies, allowing developers to start working on business process automation applications efficiently and quickly.


## Prerequisites

To use this program you need the following:

1. **Version control system**: Install GIT from the [GIT official website](https://git-scm.com/downloads).

2. **IntelliJ IDEA**: To run and/or modify the project, you can download it from the [IntelliJ official website](https://www.jetbrains.com/es-es/idea/download/?section=windows).

3. **Java 17 or higher**: You can get help to download and install the java version by following [this link](https://www.youtube.com/watch?v=oAin-q1oTDw&pp=ygUXY29tbyBjb25maWd1cmFyIGphdmEgMTc%3D)

4. **Maven 3.9**: You can get help to download and install the maven version by following [this link](https://www.youtube.com/watch?v=1QfiyR_PWxU&pp=ygUSaW5zdGFsYXIgbWF2ZW4gMy45)

5. **Camunda Modeler** You can install the Camunda BPMN / DMN Process Modeler from the [Camunda official website](https://camunda.com/download/modeler/)

## Deploy Configuration
Files such as .form and .dmn require a configuration in the spring boot project so that when the program is run, these files are automatically deployed.

The steps for this are:

1. Add the @EnableProcessApplication annotation in Application.java file.
2. In the resources directory create this directory structure: static/form
3. In the resources directory create a subdirectory containing a file named processes.xml with the following configuration:


## Usage

To use the program you must do:

1. Open a terminal in the folder where you want to download the program and clone it with:
   ```
   git clone https://github.com/BPbSwDev/CamundaGallery.git
   ```
2. Open the Camunda-Gallery program with IntelliJ and run it.

3. You can access to the following url and login with the username and password "demo"
   ```
   http://localhost:9000/
   ```
