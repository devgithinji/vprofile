FROM tomcat:8-jre11

#remove default web apps
RUN rm -rf /usr/local/tomcat/webapps/*

#copy the built war package to tomcat
COPY target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

#expose port
EXPOSE 8080

CMD ["catalina.sh","run"]

WORKDIR /usr/local/tomcat

VOLUME  /usr/local/tomcat/webapps