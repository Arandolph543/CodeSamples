def fib(n: Int): Int = {
  @annotation.tailrec
  def loop(n: Int, prev: Int, cur: Int): Int =
    if (n <= 
) prev
    else loop(n - 
, cur, prev + cur)
  loop(n, 0, 1)
}
