# Empty projects

That's what we're all looking for.
Projects that are empty, do nothing, maybe just say "hello".

* `gradlew` is seriously boring, you can generate it with `gradle init` and couple of Enters.

* `java-hello-world-gw` is `java` project with "Hello world".
It can't be run directly from Gradle, `application` Gradle plugin is better for that.

* `java-junit5-assertj3-gw` uses `java` plugin again and adds dependencies on JUnit 5 and
AssertJ 3.
Using its `build` task actually runs 2 tests.

* `java-openjfx-gw` is `application` using 3rd party `org.openjfx.javafxplugin` plugin.
This proves that JavaFX kinda lives in Java 11 as well.
We can use task `run` to launch the application.
Being so simple, it is fully modularized.