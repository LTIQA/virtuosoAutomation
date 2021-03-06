#!/bin/sh
echo "Executing Shell Scripting"
cd $(echo ${VIRTUOSO_PROJECT_DIR} | tr -d '\r')
git checkout android-master
mvn -DskipTests -P prepare-for-upload package
echo "Executing in AppCenter"
appcenter test run appium --app "VirtuosoTest/Virtuoso-Android" --devices d38e1690 --app-path $(echo ${VIRTUOSO_PROJECT_DIR} | tr -d '\r')/virtuoso.apk  --test-series "login" --locale "en_US" --build-dir target/upload
