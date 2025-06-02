FROM gradle:8.13.0-jdk21

RUN apt-get update && \
    apt-get install -yq make ruby ruby-dev build-essential && \
    rm -rf /var/lib/apt/lists/*

RUN gem install contracts:0.17
RUN gem install rspec:3.13.0 aruba:2.3.0

WORKDIR /project

# Копируем только необходимые файлы с сохранением прав
COPY --chmod=755 ./app/gradlew ./app/gradlew
COPY ./app/gradle ./app/gradle
COPY ./app/gradlew.bat ./app/
COPY ./app/build.gradle ./app/
COPY ./app/src ./app/src

# Явно устанавливаем права (дополнительная страховка)
RUN chmod +x /project/app/gradlew && \
    cd /project/app && \
    ./gradlew --version