.PHONY: build test run-dist

build:
	chmod +x gradlew
	./gradlew build

test:
	chmod +x gradlew
	./gradlew test

run-dist:
	chmod +x gradlew
	./gradlew installDist || bash gradlew installDist
	chmod +x build/install/app/bin/app
	./build/install/app/bin/app