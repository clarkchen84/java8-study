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
1. 方法引用是lambda 表达是的一个语法糖，在很多时候， 如果一个lambda 表达式能够实现的功能，如果使用一个方法能够实现， 
   那么就可以 使用方法引用的方式来实现，使方代码更加清晰简洁。 参考例子 `MethodReferenceDemo`
    ``` Java
    // lambda 表达是的方式
    strs.forEach( item -> System.out.println(item));
    // 方法引用的方式
    strs.forEach(System.out::println);
    ```
2. 可以将方法引用看作是一个 【函数指针】，下面是方法引用的分类（一共四类）参考例子`MethodReferenceDemo`
    1. 类名::静态方法名 
    2. 对象::方法名
    3. 类名::实例方法名
    4. 构造方法引用: 类名::new 

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

* 包含的几个重要的default 方法 ,参考`PredicateDefaultMethodDemo`
    ``` java
    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }
     default Predicate<T> negate() {
        return (t) -> !test(t);
    }
    default Predicate<T> or(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }
    ```
#### Supplier
* 表示一个结果的供应者， 不接收参数， 返回一个对象 。参考demo `SupplierDemo`
    * 在实际开发中，经常备用来当作工厂
#### Optional
1. Optional 是一个容器，里面可能包含了一个或这0个元素。如果调用`isPresent()`方法返回`true`，那么调用`get()`方法将返回Optional里面的值， 参考例子`OptionalDemo`
2. Optional根据里面是否存在值还提供了一些额外的方法，如`orElse` 和`ifPresent`。 在真正的开发应用中， 这两个方法会经常用到
3. 使用`Optional` 进行构造的的时候可以使用`of()` 方法和`ofNullable()`  ，但是使用`of()`进行构造的时候要保证参数是非空的，
   否则会抛出NullPointException，实际开发中根据需要，如果取得参数中一定有值，可以使用`of()` 反之用`ofNullable()`构造
   ``` java
   Optional<String> optional = Optional.ofNullable("Hello");
    Optional<String> optional2 = Optional.of("Hello")
   ```
4. Optional 的目标是为了解决空指针异常， java8 之前的方式和java8 的方式的比较参考例子`OptionalCompareDemo`
    * 在java 8 之前 写程序需要向下面这样来防止空指针异常 
      ``` java
      if(null != person){
        Address address = person.getAddress();
        if(null != address){
            ......
        }
      }  
      ```
    * 使用Java 8 的写法
        1. 使用isPresent 和 get方法配合使用， 这种用法和java 8 之前的写法没有区别，所以在生产中基本不会使用这种方法
        ``` java
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
        ```
        2. Optional 推荐使用函数是的编程风格，如下, 这也是在实际开发中经常使用的方法
            1. 提供默认返回值的写法有下面java代码中的两种写法
            ``` java
            // 返回默认值
            System.out.println(optional.orElse("default value"));
            // 使用一个Supplier 当作参数，返回Supplier 提供的值
            optional.orElseGet(() -> "default value");
            ```
            2. 使用`ifPreset`的写法. 如果Optional里面有值， 执行 ifPresent里面的`Consumer` 参数
            ``` java 
                optional.ifPresent(t -> System.out.println(t));
            ```
5. Optional 还有一些方法，例如`Stream`，`map`，`flatMap`与后面介绍的Stream方式相同。 小例子`OptionalOtherUserDemo`。具体使用的方法参考下面的Stream 介绍

    

    



