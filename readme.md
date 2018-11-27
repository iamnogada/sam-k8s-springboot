<pre>
                                                                        
                                                                        
88d888b. .d8888b. .d8888b. .d8888b. 88d888b. .d8888b. dP   .dP .d8888b. 
88'  `88 88'  `88 88'  `88 88'  `88 88'  `88 88'  `88 88   d8' 88'  `88 
88    88 88.  .88 88.  .88 88.  .88 88    88 88.  .88 88 .88'  88.  .88 
dP    dP `88888P' `8888P88 `88888P8 dP    dP `88888P' 8888P'   `88888P8 
                       .88                                              
                   d8888P                

http://patorjk.com/software/taag/#p=display&f=Nancyj&t=noganova                   
</pre>


## location of spring's <application properties> file
> official URL: https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html

1. explicit define file(path) in command line : java -jar app.jar --spring.config.location=[path]
2. locate properties file in src/main/resources/application-[profile].properties
3. A `/config' subdirectory of the current directory
4. The current directory
5. A classpath `/config`
6. The classpath root
7. example with default file name
   - file:./config/
   - file:./
   - classpath:/config/
   - classpath:/

