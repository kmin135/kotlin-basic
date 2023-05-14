
import kotlin.properties.Delegates.observable

println("HI")
var count by observable(0) {  property, oldValue, newValue ->
    println("Property: $property old: $oldValue new: $newValue")
}

println("The value of count is: $count")
count++
println("The value of count is: $count")
count--
println("The value of count is: $count")
