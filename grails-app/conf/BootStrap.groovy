import com.example.*
class BootStrap {

    def init = { servletContext ->
		def person=new Person(name : "Tony",age : "26").save(flush: true)
		def person1=new Person(name : "Jithin",age : "28").save(flush: true)
    }  
    def destroy = {            
    }
}
