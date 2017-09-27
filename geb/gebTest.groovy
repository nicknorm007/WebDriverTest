@Grapes([
    @Grab(group='org.gebish', module='geb-core', version='1.1.1'),
    @Grab(group='org.seleniumhq.selenium', module='selenium-chrome-driver', version='3.5.3'),
    @Grab(group='org.seleniumhq.selenium', module='selenium-support', version='3.5.3')
])

import geb.Browser
import org.openqa.selenium.chrome.ChromeDriver


b = new Browser(driver: new ChromeDriver())


b.drive {
    go "http://www.google.com"

    assert title == "Google"
    $("input", name: "q" ) << "the book of geb"
}
