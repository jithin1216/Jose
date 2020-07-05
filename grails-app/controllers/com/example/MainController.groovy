package com.example
import wslite.soap.*
class MainController {

    def index() {
		render view:"/main/test"
	}
	
	def save(){
		def url = "https://www.q88.com/WS/Q88WSInternal.asmx"
		def soapClient = new SOAPClient(url)
		def person = new Person(params)
		person.save(flush: true)
		render "Success!"
	}
}
