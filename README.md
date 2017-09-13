# WebDriverTest

# Standalone Docker, no Zalenium

docker run -d -p 4444:4444 --name selenium-hub selenium/hub:3.5.3-astatine


docker run -d --link selenium-hub:hub selenium/node-chrome:3.5.3-astatine


# Zalenium

docker pull elgalu/selenium

docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /tmp/videos:/home/seluser/videos     --privileged dosel/zalenium start


# Run Tests
mvn install -U   (to update everything)

mvn test

