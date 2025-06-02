run-dist:
	chmod +x app/gradlew
	cd app && ./gradlew installDist
	./app/build/install/app/bin/app

setup:
	chmod +x app/gradlew
	cd app && ./gradlew clean install

.PHONY: run-dist setup