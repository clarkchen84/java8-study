# Java 8

### 函数式接口

1. 一个接口被@FunctionalInterface是函数式接口

2. 一个接口只有一个抽象方法

   1. default方法不计入抽象方法计数

   2. 覆盖了Object类的抽象方法，也不计入到抽象方法数。

3. 满足2的接口，即使没有被@FunctionalInterface修饰，那么他也是函数式接口。

4. 一个接口被@FunctionalInterface修饰，那么他一定会满足2，否则编译报错。

5. 函数式接口的实例，可以通过lamda表导师，方法引用，构造方法引用来创建

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