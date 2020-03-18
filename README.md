## Multi Module Example With Gradle

## Arch
```
.
├── build.gradle
├── module-admin
│   ├── build
│   ├── build.gradle
│   └── src
├── module-api
│   ├── build
│   ├── build.gradle
│   └── src
├── module-clients
│   └── module-aws-client
│   │   ├── build
│   │   ├── build.gradle
│   │   └── src
├── module-common
│   ├── build
│   ├── build.gradle
│   └── src
└── settings.gradle
```

#### issue
- gradle 새로운 buildscript에서는 bootJar : false가 동작하지 않음..
- 대부분 opensource는 buildscript를 사용하고 있음.


## Reference
- <https://github.com/spring-projects/spring-security>
- <https://docs.gradle.org/current/userguide/multi_project_builds.html#sec:cross_project_configuration>
- <https://github.com/thombergs/buckpal>
- <https://reflectoring.io/spring-boot-gradle-multi-module/>
- <https://jojoldu.tistory.com/123>
- <https://gwonsungjun.github.io/articles/2019-04/gradle_multi_module>
- <https://nesoy.github.io/articles/2020-03/grdle-filter-subproject>