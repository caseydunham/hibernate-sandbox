#!/usr/bin/env bash

add-apt-repository ppa:openjdk-r/ppa
apt-get update

DEBIAN_FRONTEND=noninteractive apt-get install -y maven openjdk-8-jdk mysql-server-5.5

mysqladmin -u root password test123

mysql -uroot -ptest123 < /vagrant/setup.sql