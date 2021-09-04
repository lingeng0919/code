# DubboWithZookeeper
## 直连方式：
- link-usersrvice-provider
- link-usersrvice-consumer

## 服务化最佳实践：
- link-provider
- link-consumer
- link-interface

## 使用注册中心：
- center-provider
- center-consumer
- center-interface

## 版本号测试：
- center-multi-consumer
- center-multi-provider
- center-interface

## 负载均衡配置
<dubbo:service interface="..." loadbalance="roundorbin"/>

或

<dubbo:reference interface="..." loadbalance="roundorbin"/>

Option：
- 随机：loadbalance="random"
- 轮询：loadbalance="roundorbin"
- 最少活跃：loadbalance="leastactive"
- 一致性：loadbalance="consistenthash"
