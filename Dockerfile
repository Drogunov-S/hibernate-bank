FROM tomcat:10.0.23
LABEL authors="sergey"

ENTRYPOINT ["top", "-b"]
