FROM openjdk:8-jdk

ARG classpath=.
ENV CLASSPATH=${classpath}

COPY Test.java . 
RUN javac Test.java

CMD ["java", "Test"]
