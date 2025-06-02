run-dist:
	chmod +x gradlew  # Убедимся, что gradlew имеет права на выполнение
	./gradlew installDist || bash gradlew installDist  # Попробуем оба варианта запуска
	chmod +x build/install/app/bin/app  # Убедимся, что приложение тоже имеет права
	./build/install/app/bin/app  # Запуск приложения