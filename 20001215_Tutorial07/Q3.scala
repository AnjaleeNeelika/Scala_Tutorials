object Q3 extends App {
    import scala.io.StdIn._

    var accounts:List[Account] = List()

    def accCreate(nic:String, accNum: Int):Unit = {
        val acc = new Account(nic, accNum)
        accounts = accounts ::: acc :: Nil
        println(accounts)
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accNum.equals(a))
    
    accCreate("1",1)
    accCreate("2",2)

    print("Enter your account number: ")
    var accNo_0 = readInt()
    print("Enter the account number to transfer money: ")
    var accNo_1 = readInt()
    print("Enter the amount to transfer: ")
    var amount = readDouble()

    find(accNo_0, accounts)(0).transfer(accNo_1, amount)
    println(find(accNo_1, accounts)(0))
}

class Account(nic:String, val accNum: Int, var balance: Double = 5000.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        val transferAcc = Q3.find(account, Q3.accounts)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "["+nic+":"+accNum +":"+ balance+"]"
}