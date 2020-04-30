<br/>


Eclipse Implementation of XML Web Services is a Web Services framework that provides tools
and infrastructure to develop Web Services solutions for the end users and middleware developers.

With Eclipse Implementation of XML Web Services, clients and web services have
a big advantage: the platform independence of the Java programming language.

This project is part of [Eclipse Metro](https://projects.eclipse.org/projects/ee4j.metro)

# <a name="Download_Jakarta_XMLS_Release"></a>Download Jakarta XML Web Services Release

The latest release of Jakarta XML Web Services is available for
[download](https://repo1.maven.org/maven2/com/sun/xml/ws/jaxws-ri/2.3.3/jaxws-ri-2.3.3.zip)
as well as for consumption through maven.
```
        <dependencies>
            <dependency>
                <groupId>jakarta.xml.ws</groupId>
                <artifactId>jakarta.xml.ws-api</artifactId>
                <version>2.3.3</version>
            </dependency>
        </dependencies>

        <dependencies>
            <dependency>
                <groupId>com.sun.xml.ws</groupId>
                <artifactId>jaxws-rt</artifactId>
                <version>2.3.3</version>
                <scope>runtime</scope>
            </dependency>
        </dependencies>
```

## Documentation
The release includes the following documentation:
- [Release Notes](2.3.3/docs/ch02.html)
- [Users Guide](2.3.3/docs/ch03.html)
- [Tools](2.3.3/docs/ch04.html)
- [Samples](2.3.3/docs/ch07.html)

The documentation/samples included with Eclipse Implementation of Jakarta XML Web Services
[distribution](https://repo1.maven.org/maven2/com/sun/xml/ws/jaxws-ri/2.3.3/jaxws-ri-2.3.3.zip)
describes how to use Jakarta XML Web Services to develop
and deploy your webservices endpoints in a servlet container.

The samples discussed in [this document](2.3.3/docs/ch07.html) and available as part
of Eclipse Implementation of Jakarta XML Web Services distribution are tested to work
on GlassFish and on Apache Tomcat. The deployment is demonstrated using
Eclipse Implementation of Jakarta XML Web Services specific proprietary deployment
descriptor `sun-jaxws.xml`. 

