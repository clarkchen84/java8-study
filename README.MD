# Java 8
### Lambda表达式
1. 什么是Lambda表达式： 在Lisp、Python和Ruby等编程语言中，lambda是一个用于表示匿名函数或闭包的运算符，它遵循lambda演算的用法
   * Java Lambda表达式是⼀种匿名函数;它是没有声明的方法，即没有访问修饰符、返回值声明和名字

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
4. lambda表达式的基本结构，下面是lambda 表达式的最基本的结构
   1. Java Lambda结构 ⼀个 Lambda 表达式可以有零个或多个参数
   2. 参数的类型既可以明确声明，也可以根据上下文来推断。例如:(int a)与(a)效果相同 
   3. 有参数需包含在圆括号内，参数之间⽤用逗号相 隔。例例如:(a, b) 或 (int a, int b) 或 (String a, int b, float c) 空圆括号代表参数集为空。例如:() -> 42
   4. 当只有⼀个参数，且其类型可推导时，圆括号（）可省 略。例如：a -> return a*a 
   5. Lambda 表达式的主体可包含零条或多条语句 
   6. 如果 Lambda 表达式的主体只有⼀条语句，花括号{}可 省略。匿名函数的返回类型与该主体表达式⼀致 
   7. 如果 Lambda 表达式的主体包含⼀条以上语句，则表达 式必须包含在花括号{}中（形成代码块）。匿名函数的返 回类型与代码块的返回类型⼀致，若没有返回则为空
   8. 具体说明
      * Java Lambda基本语法 Java中的Lambda表达式基本语法
        * (argument) -> { body} 比如说
              * (arg1, arg2...) -> { body }
              * (type1 arg1, type2 arg2...) -> { body }

      * Java Lambda示例例
          * Lambda示例例说明
            * (int a, int b) -> { return a + b; }
            * () -> System.out.println("Hello World"); 
            * (String s) -> { System.out.println(s); }
            * () -> 42
            * () -> { return 3.1415 }; 
       
      * 演示使用Lambda表达式 遍历一个集合参考 `LoopTest`
5. lambda表达式的作用
   * Lambda表达式为Java添加了缺失的函数式编程特性，使我们能将函数当做⼀等公⺠看待
   * 在将函数作为⼀等公⺠的语⾔中，Lambda表达式 的类型是函数。
     * 但在Java中，Lambda表达式是对象，他们必须依附于类特别的对象类型函数式接⼝(functional interface)
   * 传递行为，不仅仅是值
      * 提升抽象的层次
      * API 重用性更好， 更加灵活
### 函数式接口

1. 一个接口被@FunctionalInterface是函数式接口
   * java.lang.FunctionalInterface 
   * 标识所声明的接⼝为函数式接⼝ 
   * 如果不满⾜函数式接⼝的要求，则编译器报错 
   * 并⾮必须，但凡满⾜函数式接⼝条件的接⼝， 编译器均将其看作是函数式接⼝，即便没有添 加FunctionalInterface注解亦如此
   
2. 一个接口只有一个精确的抽象方法（java 8  开始， 接口可以有实现方法， 但是实现方法必须以 default开头）
   1. default方法不计入抽象方法计数

   2. 覆盖了Object类的抽象方法，也不计入到抽象方法数。

3. 满足2的定义的接口，即使没有被@FunctionalInterface修饰，那么他也是函数式接口。

4. 一个接口被@FunctionalInterface修饰，那么他一定会满足2的定义，否则编译报错。

5. 函数式接口的实例，可以通过lambda表达式，方法引用，构造方法引用来创建

6. FunctionalInterface 的例子参考`FunctionalInterFaceDefinition`

7. 如何通过自定义的FunctionalInterface 完成Lambda 表达式的使用参考`FunctionalInterfaceTest`

### 方法引用


### 常用的FunctionalInterface
#### Consumer接口
1. 顾名思义， Consumer 就是一个消费接口， 接受参数，并消费掉，不返回任何结果。
2. 最常用的例子就是`Iterable#foreach`

#### Function 接口
1. 接收一个参数，并返回一个结果，与数学的定义相同 
   * 参考例子`FunctionTest`
2. 包含两个default方法和一个静态方法
   ``` java
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
   * 如果一个函数接收一个函数作为参数，或者返回一个参数当作返回值那个这个函数就是一个高阶函
      * compose  参考例子`FunctionTest`
         1. y=f(x)  : 相当于 Function 接口中的 apply 方法
         2. x=g(m) ： 相当于  Function 接口中 compose 方法接受的参数
         3. y = f(g(m))  最后的执行结果
      * andThen  参考例子`FunctionTest`
         1. y=f(x)  ：相当于 Function 接口中的 apply 方法
         2. m=g(y) ：相当于  Function 接口中 andThen 方法接受的参数 
         3. m=g(f(x)) 最后的执行结果

#### BiFunction
   * 一个函数有两个输入一个输出，它是`Function`，他是function 接口的一个特化形式 (参考 `BiFunctionDemo`)
#### Predicate 
   * 意思是断言（谓词），接受一个参数， 返回一个布尔值 参考`PredicateDemo`

    



