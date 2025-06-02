ifeq ($(OS),Windows_NT)
setup:
	.\app\gradlew.bat clean install

run-dist:
	.\app\gradlew.bat installDist
	.\app\build\install\app\bin\app.bat
else
setup:
	chmod +x ./app/gradlew
	cd ./app && ./gradlew clean install

run-dist:
	./app/gradlew installDist
	./app/build/install/app/bin/app
endif