### 程序间的耦合性
##### 如果我们在service层和dao层都使用了实现接口的方式，那么我们的三层结构，表现层调业务层，业务层调持久层，他们之间会存在强耦合性，也就是都使用了new关键字来创建对象，如何解决这一问题呢？
##### 我们可以考虑工厂模式来解耦，但是这个工厂模式是用来干嘛的呢？
##### 工厂模式用来生产生产bean对象，也就是我们先前强耦合的service和dao对象，要建立工厂，需要两部  
一、创建配置文件，内部有类的全限定类名，以及我们取出时的唯一标识，也就是key-value键值对   
二、在工厂类内部读取配置文件，通过反射创建对象