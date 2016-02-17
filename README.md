# spring boot autoconfiguration 정리

## ConditionalOnMissingBean
```
 @ConditionalOnMissingBean
```
 Bean 이 존재 하지 않을때 실행되는 어노테이션이다.
 bean name(String)으로 설정 할 수 도 있고 class(해보지 않음) 혹은 annotation(이것도 안해봄)등 설정 할 수 있는 모양이다.
```    
예) @ConditionalOnMissingBean(name = "helloConfigSample")
helloConfigSample 존재 하지 않을때 실행하라.
``` 
## ConditionalOnBean

```
@ConditionalOnBean
```
 이 전과 반대로 Bean이 존재 할때 실행 되는 어노테이션이다.
```
예) @ConditionalOnBean(name = "helloConfig")
helloConfig 존재 할때 실행하라.
```
    
## ConditionalOnProperty

```
@ConditionalOnProperty
```
 속성중 prefix라는 속성이 있는데 이 속성의 해당되는 프로퍼티 값이 있다면 실행된다.

```
예) @ConditionalOnProperty(prefix = "autoconfig.sample", name = "id")
```

## EnableConfigurationProperties

```
@EnableConfigurationProperties
```
 위 ConditionalOnProperty 같이 사용하는 어노테이션이다. 프로퍼티의(예를 들어) autoconfig.sample.id 가 있다면 id 값을 저장 해놓기 위한 class가 필요 하다. 그용도로 사용한다.
 EnableConfigurationProperties 만 있어도 사용은 가능하지만 프로퍼티의 autoconfig.sample.id 설정한 값이 없다면 `null` 로 나온다. 만약 사용한다면 위의 어노테이션이랑 사용하길 권장한다.
```
예) @EnableConfigurationProperties(SampleProperties.class)
```
## ConditionalOnWebApplication

```
@ConditionalOnWebApplication
```
 웹인지 아닌지 판단 하는 어노테이션이다. web일경우 실행된다. 별거 없다.
```
예) @ConditionalOnWebApplication
```

## ConditionalOnNotWebApplication

```
@ConditionalOnNotWebApplication
```
 위와 반대로 web이 아닐경우 실행된다.
```
예) @ConditionalOnNotWebApplication
```

## ConditionalOnJava

```
@ConditionalOnJava
```
 자바 버전을 설정 하는 어노테이션이다.
 현재 버전(자신의 버전)이 설정한 버전보다 낮으면 실행된다.
 예를 들어 자신의 버전이 1.8 이고 설정한 버전이 1.8 버전보다 작으면 실행되고 높으면 실행 되지 않는다.
```
예) @ConditionalOnJava(value = ConditionalOnJava.JavaVersion.SIX)
```

## ConditionalOnResource

```
@ConditionalOnResource
```
 리소스 경로에 파일이 있으면 실행되는 어노테이션이다. 특정 경로를 지정해주면 된다.
```
예) @ConditionalOnResource(resources = "classpath:/META-INF/resourcesfile")
```

## ConditionalOnClass

```
@ConditionalOnClass
```
 처음에 bean과 동일하게 class를 지정 해주면 된다.(해보진 않았다. 동일하다고 예상된다. jar로 묶어야 되는데 귀찮)
 name으로 지정시에는 풀 패키지명을 써줘야 된다. 

```
예) @ConditionalOnClass(name = "com.example.annotation.HelloConfig") 이것만 해봐서 예로 달아놨다.
```

## ConditionalOnMissingClass

```
@ConditionalOnMissingClass
```
 위의 어노테이션이랑 반대되는 어노테이션이다. 이것도 해보지않았다. name 으로만 해보았다.

```
예) @ConditionalOnMissingClass(name = "com.example.annotation.HelloConfigMissing")
```

## ConditionalOnExpression

```
@ConditionalOnExpression
```
 표현식으로 나타낼수 있는 어노테이션이다.

```
예) @ConditionalOnExpression(value = "'${spring.application.name}' == 'spring-autoconfig'")
```

#### 위의 어노테션 말고도 몇가지가 더 있는데 자주 쓸만한건 없는거 같다.


이 외에도 `AutoConfigureAfter` 와 `AutoConfigureBefore` 가 존재 하는데 조금 이상하다. 
나중에 다시 확인 해 봐야 되겠다.


