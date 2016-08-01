FROM tomcat:7

COPY target/paydock.war /usr/local/tomcat/webapps/

EXPOSE 8080
