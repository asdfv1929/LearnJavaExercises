## SupermarketManagementSystem
ArrayList的简单使用    
2018.05.21

## EmployeeExtends
抽象类、继承的简单应用学习    
2018.05.23

## ComputerInterface
接口、多态的学习    
2018.05.24

## HotelExample
抽象类、接口 空参构造、有参构造 继承、实现 等的学习     
2018.05.27

## CommonAPI
常用API的学习：
- Object
  - equals  基本数据类： 比较的是内容(值)；引用数据类型：比较的是内存地址值
  - toString
- String
  - substring(int start ,int end );   包含头，不包含尾。 截取一段字符
  - substring(int start);             从某一位到尾
  - startsWith(String str)            判断以什么开头
  - endsWith(String str)                        判断以什么结尾    
  - contains(String str)               判断是否包含
  - indexOf（String str）      
  - charAt(int index)
  - equals()                           注意：要区分大小写
  - equalsIgnoreCase                   不区分大小写
  - getBytes（）    
  - toCharArray()
- StringBuffer
  - append
  - delete(int start,int end)
  - insert(int index, 任意类型)
  - replace(int start, int end, String str)
  - reverse
  - toString
- StringBuilder
- Regex正则
  - matches   邮箱验证："[a-zA-Z0-9_]+@[0-9a-z]+(\\.[a-z]+)+"
  - split
  - replaceAll
- Date
  - setTime
  - getTime
- DateFormate
  - SimpleDateFormate
  - format
  - parse
- Calendar
  - Calendar.getInstance()
  - get
  - set
- Integer
  - parseInt
  - toString
  - intValue
  - MAX_VALUE
  - MIN_VALUE
  - toBinaryString
  - toOctalString
  - toHexString
  - 自动装箱、自动拆箱
- System
  - currentTimeMillis
  - exit(0)
  - gc()
  - getProperties()
  - arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
- Math
  - abs
  - ceil
  - floor
  - pow
  - sqrt
  - random
  - round
- Arrays
  - sort
  - binarySearch
  - toString
- BigInteger
  - BigInteger b = new BigInteger("233432545345345345345342346576");
  - add
  - subtract
  - multiply
  - divide
- BigDecimal
  - add
  - subtract
  - multiply
  - divide(BigDecimal divisor, int scale, int roundingMode)

2018.05.29

## CollectionFrame
- ArrayList
  - add
  - size

集合
-Collection
  - contains
  - clear
  - remove

迭代器
- Iterator
  - hasNext
  - next

泛型
- 通配符 ?
- 限定
  - ? extends Employee 限制的是父类, 上限限定, 可以传递Employee,传递他的子类对象
  - ? super   Employee 限制的是子类, 下限限定, 可以传递Employee,传递他的父类对象

2018.05.30


# 异常
- Throwable
  - Exception
    - RuntimeException
  - Error
- throws 定义在方法的声明上，后边跟的是异常的类型 后边同时可以跟多个数据类型
- throw 定义在方法中，后边跟的是异常对象 同时只能抛出一个异常对象
- try{} catch{} finally{}
