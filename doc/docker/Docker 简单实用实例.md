### Docker 简单实用实例

---

###### docker ps

* 显示当前状态下的已经启动的 docker
* -a 表示显示当前的所有容器.包括已经停止的容易

###### docker images

* 显示当前计算机中可以启动的 docker

###### docker run

* -p 8001:8000表示端口映射: 8000是 docker 容器中开启的端口,8001是服务端和其映射的端口
* -t 表示是否开启终端映射,区别在于有- t 可以终端终端,没有的话会被 docker 容器接管,无法关闭
* -d 表示离线运行 docker 容器,此时只会返回一个 dockerid

###### docker stop 

* 表示停止某一个或者某几个 docker 容器的运行

###### docker rm

* 删除某一个停止运行的 docker 容器

###### docker exec -it lasdjflija /bin/sh

* 进入对应 docker 容器的命令行终端界面

###### docker run -v /Users/kinakihiro/workspace/log/this_mac:/test:rw springio/gs-spring-boot-docker

* 启动容器并且将本机的某个目录直接打入对应的容器的目录下层,并且直接新建文件夹

