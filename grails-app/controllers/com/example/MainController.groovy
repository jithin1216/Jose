package com.example

class MainController {

    def index() {
		render view:"/main/test"
	}
	
	def save(){
		def person = new Person(params)
		person.save(flush: true)
		render "Success!"
	}
}
