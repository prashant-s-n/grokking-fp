object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if(names.size > 5) 20
    else if(names.size > 0) 10
    else 0
  }
}

val TwentyPercenters = List("A", "B", "C", "D", "E", "F");
println(TipCalculator.getTipPercentage(TwentyPercenters));

val TenPercenters = List("A");
println(TipCalculator.getTipPercentage(TenPercenters));

val ZeroPercenters = List();
println(TipCalculator.getTipPercentage(ZeroPercenters));