FROM openjdk:17
LABEL authors="moon"

#设置时区
ENV TZ=Asia/Shanghai
ENV LANG C.UTF-8
RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

VOLUME /tmp

#设置包名
ARG APP_PKG_PATH=./target/*.jar
#拷贝对应路径Jar包至容器内
ADD ./$APP_PKG_PATH /app.jar

#设置环境变量（后期可通过赋值JAVA_OPTS达到不改动镜像修改运行参数）
ENV JAVA_OPTS="-Xms512m -Xmx1024m -Dfile.encoding=UTF-8 -Dsun.jnu.encoding=UTF-8"
ENV JAVA_PARA="--application.name=springboot3-demo"

#默认为直接启动Jar包，如有特殊参数，在启动项中添加即可
CMD java -jar $JAVA_OPTS /app.jar $JAVA_PARA