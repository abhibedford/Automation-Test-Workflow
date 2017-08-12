# Automation_Test_Workflow
Setting up an automation testing workflow using Gradle, JBehave and Serenity BDD with Selenium.

I've recently begun attempting some automation at work and after some random research (I am an absolute rookie to automation), I've come up with a setup that is very easy to replicate and might be useful for others like me.

I'll try to put down my thought process here:

To write some useful automation scripts, I'd need 3 things.
1.  An automation tool,
2.  A framework,
3.  A reporting tool.

Normally, the framework, by itself, should come with a reporting tool. I started off with TestNG and although the report was functional, I simply couldn't hand it to my business people. Then I saw Serenity and fell flat. And the lad who was using Serenity was writing tests in BDD (Jbehave) and I liked that as well. So I did a bit of reading on JBehave and Serenity and found out I liked the way they worked together.

Note: I also considered Cucumber, but since I was working in a Java environment and JBehave was build for java, I decided to use JBehave.
