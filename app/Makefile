# Универсальный Makefile для Windows и Docker/Linux
ifeq ($(OS),Windows_NT)
    # Локальная разработка на Windows
    GRADLEW = .\app\gradlew.bat
    APP_PATH = .\app\build\install\app\bin\app.bat
else
    # Сборка в Docker/Linux
    GRADLEW = ./code/app/gradlew
    APP_PATH = ./code/app/build/install/app/bin/app
endif

run-dist:
	chmod +x $(GRADLEW)
	cd $(dir $(GRADLEW)) && $(GRADLEW) installDist
	$(APP_PATH)

setup:
	chmod +x $(GRADLEW)
	cd $(dir $(GRADLEW)) && $(GRADLEW) clean install

.PHONY: run-dist setup