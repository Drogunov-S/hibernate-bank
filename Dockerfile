FROM tomcat:10.0.23
LABEL authors="sergey"
COPY target/hibernate-bank-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
