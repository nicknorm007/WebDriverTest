# WebDriverTest

docker run -d -p 4444:4444 --name selenium-hub selenium/hub:3.5.3-astatine


docker run -d --link selenium-hub:hub selenium/node-chrome:3.5.3-astatine

mvn install -U   (to update everything)

mvn test
