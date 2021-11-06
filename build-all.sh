#!/usr/bin/env bash

cd eureka-service || exit
./gradlew clean build -x test

#java -jar build/libs/eureka-service-0.0.1-SNAPSHOT.jar

cd ../config-service || exit
./gradlew clean build -x test

#java -jar build/libs/config-service-0.0.1-SNAPSHOT.jar &

cd ../gateway-service || exit
./gradlew clean build -x test

#java -jar build/libs/gateway-service-0.0.1-SNAPSHOT.jar &

cd ../coupon-service || exit
./gradlew clean build -x test

#java -jar build/libs/coupon-service-0.0.1-SNAPSHOT.jar &

cd ../product-service || exit
./gradlew clean build -x test

#java -jar build/libs/product-service-0.0.1-SNAPSHOT.jar &

cd ..

echo "completed"
