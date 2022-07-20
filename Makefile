.phony: up
up:
	docker build --tag java-lessons .
	docker run java-lessons $(args)