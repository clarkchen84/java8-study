# Java 8
### Lambda表达式
1. 什么是Lambda表达式： 在Lisp、Python和Ruby等编程语言中，lambda是一个用于表示匿名函数或闭包的运算符，它遵循lambda演算的用法
2. 为什么需要lambda 表达式
   * 在java 中，无法将函数作为参数传递给一个方法，也无法声明返回一个函数的方法
   * 在 Javascript 中，函数参数是⼀个函数，返回值是另一个函数的情况是非常常见的，javascript就是一门典型的函数式的编程语言
3. java 的匿名内部类
   * 在java 8 之前，为了实现 向一个函数传递一个行为， 一般会采用匿名内部类的这种方式来实现。
   ``` java 
   protected void onCreate(Bundle savedInstanceState) { 
      super.onCreate(savedInstanceState); 
      setContentView(R.layout.activity_main);
      Button firstButton = (Button) findViewById(R.id.first);
      Button secondButton = (Button) findViewById(R.id.second);
      firstButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
         goToFirstActivity(); }
      });
      secondButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
            goToSecondActivity(); }
         });
   }
   ```
   * Lambda表达式 和 匿名内部类的比较参考例子`SwingTest` 
4. lanmbda表达式的基本结构，下面是lambda 表达式的最基本的结构
   1. 参数列表  （param1，param2, param3）
      * 1个参数的时候可以不用括号括起
      * 当java 编译器服务推断出 参数类型的时候要追加参数 （Type1 param1， Type2 param2，Type3 param3）
   2. 箭头 -> 用来分割 参数列表和执行体
   3. 执行体 {}
      * 当执行体中只有一句执行内容的时候， 可以省略`{}` ，但是要同时省略`；`
   4. 演示使用Lambda表达式 遍历一个集合参考 `LoopTest`
   
### 函数式接口

1. 一个接口被@FunctionalInterface是函数式接口

2. 一个接口只有一个精确的抽象方法（java 8  开始， 接口可以有实现方法， 但是实现方法必须以 default开头）

   1. default方法不计入抽象方法计数

   2. 覆盖了Object类的抽象方法，也不计入到抽象方法数。

3. 满足2的定义的接口，即使没有被@FunctionalInterface修饰，那么他也是函数式接口。

4. 一个接口被@FunctionalInterface修饰，那么他一定会满足2的定义，否则编译报错。

5. 函数式接口的实例，可以通过lambda表达式，方法引用，构造方法引用来创建

6. FunctionalInterface 的例子参考`FunctionalInterFaceDefinition`

7. 如何通过自定义的FunctionalInterface 完成Lambda 表达式的使用


### Consumer接口

### Function 接口

1. 接收一个参数，并返回一个结果，与数据的定义相同

2. 包含三个default方法

   ```java
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
           Objects.requireNonNull(before);
           return (V v) -> apply(before.apply(v));
       }
   default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
           Objects.requireNonNull(after);
           return (T t) -> after.apply(apply(t));
       }
   static <T> Function<T, T> identity() {
           return t -> t;
       }
   ```

   

3. 高阶函数

   1. 如果一个函数接收一个函数作为参数，或者返回一个参数当作返回值那个这个函数就是一个高阶函数

      ​	当function为function<x,y>的场合

      * compose 相当于 compose(g< m, x> before 如果 1. y=f(x), 2. x= g(m), 3. y = f(g(m) 
      * andThen 相当于andThen(Function<y, m> after)  如果 1. y=f(x) 2.m=g(y) ,3. m=g(f(x))



### BiFunction



