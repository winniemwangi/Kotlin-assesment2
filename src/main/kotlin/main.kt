import javax.swing.plaf.ColorUIResource

fun main()
{
    var money = CurrentAccount(4537284, "Winnie Mwangi", 30.0)
    println(money.balance)
    println(money.deposit(3.0))
    println(money.withdraw(20.0))
    var cake = Product("Red velvet",2, 50.0, "brown")
    println(cake.name)
    println(cake.weight)
    println(cake.price)
    println(cake.category)
    println(names("wamere"))


}
class CurrentAccount(var accountNumber: Int, var accountName:String, var balance:Double)
{
    fun deposit(amount:Double): Double {
       balance += amount
        return balance
    }

    fun withdraw(amount:Double): Double {
        balance-= amount
        return balance

    }
    fun details(detail:String){

        println(detail)
    }
}
data class Product(var name:String, var weight:Int, var price:Double, var category:String )

fun names(name:String):String{
    if (name.length %2==0)
        return name

}