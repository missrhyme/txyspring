#!/bin/bash

set -v on

service tomcat7 stop

cd /root/develop/txyspring/install
mysql -uroot -ppassword -v -t < install.sql 

service tomcat7 start

sleep 10

cd /root/develop/txyspring/
mvn tomcat7:redeploy

