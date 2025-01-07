//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Can you write a main() function that prints these messages on four separate lines?
    println("Use the val keyword when the value doesn't change.")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    //Fix the code below
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    //Fix the code below
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfKids + numberOfAdults
    println("The total party size is: $total")

    //Fix the code below

    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary ($bonusAmount bonus).")

    //Implement add
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    //Implement Display alert
    val firstUserEmailId = "user_one@gmail.com"

    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    //Implement this function
    println(greaterthan(2,4))

    //Implement this function
    printWeather("Ankara", 27, 31, 82)
    printWeather("Tokyo", 32, 36, 10)
    printWeather("Cape Town", 59, 64, 2)
    printWeather("Guatemala City", 50, 55, 7)

}

fun add(number1: Int, number2: Int):Int
{
    return number1 + number2
}

fun displayAlertMessage(OS: String = "Unkown OS", emailId: String):String{
        return "There's a new sign-in request on $OS for your Google Account $emailId ."
}

fun greaterthan(timeSpentToday:Int, timeSpentYesterday:Int):Boolean{
    return timeSpentToday > timeSpentYesterday
}

fun printWeather(cityName:String, lowTemp:Int, highTemp:Int, chanceOfRain:Int){
    println("City:$cityName")
    println("Low temperature:$lowTemp")
    println("High temperature:$highTemp")
    println("Chance of rain:$chanceOfRain")
    println()

}
