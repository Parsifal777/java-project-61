SRC_FILES := $(shell find src -type f -name '*.java')
BUILD_DIR := build

.PHONY: test run-dist clean

build: $(SRC_FILES)
	chmod +x gradlew
	./gradlew build

test: build
	./gradlew test

run-dist: build
	./gradlew installDist
	chmod +x $(BUILD_DIR)/install/app/bin/app
	./$(BUILD_DIR)/install/app/bin/app

clean:
	./gradlew clean