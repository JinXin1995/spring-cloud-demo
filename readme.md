https://gitee.com/typ1805/springcloud-master

springcloud全家桶实例搭建

eureka-client 可运行多个实例（运行前修改port配置）

多次访问 http://localhost:8083/test1?name=XXX 可观察到返回的端口在配置的多个eureka-client实例的端口中变化，说明负载均衡配置有效