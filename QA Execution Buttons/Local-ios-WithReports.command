#!/bin/sh
echo "Executing Shell Scripting"
cd $(echo ${VIRTUOSO_PROJECT_DIR} | tr -d '\r')
mvn clean test -P local-ios
echo "Generating Allure Reports"
allure serve allure-results
