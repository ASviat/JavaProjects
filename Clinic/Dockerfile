FROM bellsoft/liberica-openjdk-alpine
COPY ./src/main/java ./src
RUN mkdir out
RUN rm -rf /etc/localtime &&\
    ln -s /usr/share/zoneinfo/Europe/Moscow /etc/localtime &&\
    echo "Europe/Moscow" > /etc/timezone
RUN javac -sourcepath ./src -d out src/program/Main.java
CMD java -cp ./out program/Main