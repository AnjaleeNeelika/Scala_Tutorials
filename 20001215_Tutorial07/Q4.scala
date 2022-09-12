object Q4 extends App {

    var accounts:List[Account] = List()

    def createAcc(nic: String, accNum: Int):Unit = {
        val acc = new Account(nic, accNum)
        accounts = accounts ::: acc :: Nil
        println(accounts)
    }

    val find = (a:Int, b:List[Account]) => b.filter(account => account.accNum.equals(a))
    val overdraft = (b:List[Account]) => b.filter(account => account.balance < 0.0)
    val totalBalance = (b:List[Account]) => b.foldLeft(0.0)((x, y) => x + y.balance)
    val interest = (b:List[Account]) => b.map(account => if(account.balance > 0) account.balance*0.05 else account.balance*0.1)

    createAcc("1",1)
    createAcc("2",2)

    find(1, accounts)(0).deposit(1000)
    println(find(1, accounts)(0))

    find(1, accounts)(0).transfer(2, 100.0)
    println(find(2, accounts)(0))

    println(overdraft(accounts))

    println(totalBalance(accounts))

    println(interest(accounts))
}

class Account(nic:String, val accNum: Int, var balance: Double = 0.0){

    def withdrow(amount:Double) : Unit = {
        this.balance = this.balance - amount
    }

    def deposit(amount:Double) : Unit = {
        this.balance = this.balance + amount
    }

    def transfer(account:Int, amount:Double) : Unit = {
        val transferAcc = Q4.find(account, Q4.accounts)
        if (balance < 0.0) println("Insufficient balance")
        else {
            this.withdrow(amount)
            transferAcc(0).deposit(amount)
        }
    }

    override def toString = "["+nic+":"+accNum +":"+ balance+"]"
}