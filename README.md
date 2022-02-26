# java-cli-sbt-apache-spark-repo-classification-static

## Description
A POC for a java apache spark single node app.
Uses and reads from a flat file a list of
active repos in my github account.

## Tech stack
- java
- sbt
  - apache spark

## Docker stack
- hseeberger/scala-sbt:11.0.2-oraclelinux7_1.3.5_2.12.10

## To run
`sudo ./install.sh -u`

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code concept](https://www.baeldung.com/apache-spark)
