# Добавляем цель для установки прав (если на Linux/Mac)
setup-permissions:
	chmod +x gradlew  # Для Unix-систем

# Запуск сборки и установки (Windows)
run-dist:
	./gradlew installDist  # Для Unix (если ./gradlew не работает, попробуйте bash gradlew)
	./build/install/app/bin/app  # Запуск приложения (Unix)

# Альтернатива для Windows (если .\gradlew.bat не работает)
run-dist-win:
	.\gradlew.bat installDist
	.\build\install\app\bin\app.bat