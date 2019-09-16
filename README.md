# wrapwith
Example of @WrapWith failures in ScalaTest

``` shell
$ sbt
> test
...
> last test
...
[error] Uncaught exception when running com.gregghz.wrapwith.MainSpec: java.lang.NoSuchMethodException: com.gregghz.wrapwith.MainSpec.<init>(scala.collection.immutable.Map)
[error] sbt.ForkMain$ForkError: java.lang.NoSuchMethodException: com.gregghz.wrapwith.MainSpec.<init>(scala.collection.immutable.Map)
[error] 	at java.lang.Class.getConstructor0(Class.java:3082)
[error] 	at java.lang.Class.getConstructor(Class.java:1825)
[error] 	at org.scalatest.ConfigMapWrapperSuite.wrappedSuite$lzycompute(ConfigMapWrapperSuite.scala:84)
[error] 	at org.scalatest.ConfigMapWrapperSuite.wrappedSuite(ConfigMapWrapperSuite.scala:83)
[error] 	at org.scalatest.ConfigMapWrapperSuite.nestedSuites(ConfigMapWrapperSuite.scala:114)
[error] 	at org.scalatest.tools.Framework$ScalaTestTask.registerReporter$1(Framework.scala:477)
[error] 	at org.scalatest.tools.Framework$ScalaTestTask.execute(Framework.scala:479)
[error] 	at sbt.ForkMain$Run.lambda$runTest$1(ForkMain.java:304)
[error] 	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
[error] 	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
[error] 	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
[error] 	at java.lang.Thread.run(Thread.java:748)
...
```
