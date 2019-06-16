FROM ubuntu:16.04

RUN apt update
RUN apt install -y cron

COPY task.sh /usr/local/bin/
COPY cron-example /etc/cron.d/
RUN chmod 644 /etc/cron.d/cron-example

# 컨테이너가 종료되는 것을 막기 위함
CMD ["cron", "-f"]
