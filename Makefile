start-db:
	docker run -d \
	--rm=true \
	--name imnotascam-db \
	-e POSTGRES_USER=dj \
	-e POSTGRES_PASSWORD=alizz1624YhelrIoamJ86 \
	-e POSTGRES_DB=imnotascam \
	-p 5666:5432 \
	postgres:12

stop-db:
	docker kill imnotascam-db