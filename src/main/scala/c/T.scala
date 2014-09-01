package c

object T {

case class T1(name:String)
case class T2(a:String)

def test(t:Any){
  t match{
    case T1(t)=>
      println(t + " world")
  }
}

def main(args:Array[String]){
	val t1 = T1("hello")
			val t2 = T2("world")
			println(t1.name)
			test(t1)
			
}
}