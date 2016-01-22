#!/bin/sh

echo 
./scripts/glassfish3/glassfish/bin/asadmin undeploy ksiegarnia
echo 
mvn package
echo 
./scripts/glassfish3/glassfish/bin/asadmin deploy target/ksiegarnia.war
