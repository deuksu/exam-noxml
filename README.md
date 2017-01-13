# exam-noxml
spring none xml project

spring-mvc web 에서 사용되는 web,application,servlet xml 을 java config 으로 작업한 샘플 소스
DB는 EmbeddedDatabaseBuilder을 통한 H2을 사용했으며 Jpa을 기본으로 적용하였음

작업하면서도 느낀거지만 이건 해도 별로 소용이 없는 소스같은 SpringBoot라는 것이 있는데 이렇게 작업한 소스가
필요한 곳이 있을까??

그냥 호기심에 한번 테스트한 소스 임.....

```
1. web.xml								 	-> webApplicationInitializer
2. applicationContext.xml 	-> appConfig
3. servletContext.xml 			-> webConfig
```
