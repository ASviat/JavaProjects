FROM bellsoft/liberica-openjdk-alpine
COPY ./src ./src
RUN mkdir out
RUN rm -rf /etc/localtime &&\
    ln -s /usr/share/zoneinfo/Europe/Moscow /etc/localtime &&\
    echo "Europe/Moscow" > /etc/timezone
RUN javac -sourcepath ./src -d out src/Program/Main.java
CMD java -cp ./out Program/Main



