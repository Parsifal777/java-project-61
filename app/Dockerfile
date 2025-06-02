# Используем официальный образ Gradle с JDK 21
FROM gradle:8.13.0-jdk21

# Устанавливаем необходимые пакеты
RUN apt-get update && \
    apt-get install -yq make ruby ruby-dev build-essential && \
    rm -rf /var/lib/apt/lists/*

# Устанавливаем необходимые Ruby gem
RUN gem install contracts:0.17
RUN gem install rspec:3.13.0 aruba:2.3.0

# Создаем рабочую директорию
WORKDIR /project

# Копируем все файлы проекта
COPY . .

# Даем права на выполнение gradlew
RUN chmod +x ./app/gradlew

# Проверяем что Gradle работает
RUN cd app && ./gradlew --version