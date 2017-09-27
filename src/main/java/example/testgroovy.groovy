package example

class test {
	
	String name
	Integer age = 0

	def increaseAge(Integer years) {
		this.age += years
		println age
		
	}
	def printMyFile(String pathname) {
		
		new File(pathname).withReader('UTF-8') { reader ->
			reader.eachLine {
				println it
			}
		 }
		 
		 def normal = "http://foo bar/"
		 def encoded = URLEncoder.encode(normal, "utf-8")
		 println encoded
		 
		
		
	}
	

}

new test().printMyFile("/Users/nnorman/noexit.txt")




