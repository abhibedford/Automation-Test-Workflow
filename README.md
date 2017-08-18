# Automation Test Workflow
Setting up an automation testing workflow using Gradle, JBehave and Serenity BDD with Selenium.

I've recently begun attempting some automation at work and after some random research (I am an absolute rookie to automation), I've come up with a setup that is very easy to replicate and might be useful for others like me.

I'll try to put down my thought process here:

To write some useful automation scripts, I'd need 3 things.
1.  An automation tool,
2.  A framework,
3.  A reporting tool.

Normally, the framework, by itself, should come with a reporting tool. I started off with TestNG and although the report was functional, I simply couldn't hand it to my business people. Then I saw Serenity and fell flat. And the lad who was using Serenity was writing tests in BDD (Jbehave) and I liked that as well. So I did a bit of reading on JBehave and Serenity and found out I liked the way they worked together.

Note: I also considered Cucumber, but since I was working in a Java environment and JBehave was build for java, I decided to use JBehave.

So, my setup now was:
1.  Automation tool :   Selenium
2.  Framework       :   JBehave
2.  Reporting Tool  :   Serenity

Now I had to put these things together.
I did a bit more research and found that most of my colleagues used a build HHHH tool called Maven, which they configured using an .xml file called a POM.xml file. I did not like the way it looked, so I did a bit of googling and found Gradle!
Gradle is awesome. It can be controlled using Groovy and had a configuration file that was sensibly called a build file.
Just like other build tools, gradle lets us specify what we want and from where we want it, and it just does the rest. What I really really liked about it though was the Gradle Wrapper. So in essence, I set up gradle on my system and create a project and create a gradle wrapper. Now I can run the exact same project in another system using the gradle wrapper. The wrapper will download gradle and set up everything you require including the system and Environment variables. Pretty neat, eh? :)
DIE
