# PDApi

## How to Start
The first step to using PDApi is to add it either through Maven or Gradle

### Maven
~~~
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
~~~
~~~
   <dependencies>
      <dependency>
	     <groupId>com.github.ZodiacCorps</groupId>
	     <artifactId>PDApi</artifactId>
	     <version>1.0.5</version>
	   </dependency>
   </dependencies>
~~~


### Gradle

~~~
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~
~~~
  dependencies{
    implementation 'com.github.ZodiacCorps:PDApi:1.0.5'
	}
~~~
