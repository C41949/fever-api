measure:
	./gradlew build
	docker-compose up -d

up@dev:
	./gradlew build -Dquarkus.package.type=native
	docker-compose -f docker-compose.dev.yml up -d
