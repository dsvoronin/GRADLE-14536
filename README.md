Reproducer for [GRADLE-14536](https://github.com/gradle/gradle/issues/14536)

`./gradlew help` is ok  
`./gradlew help --scan` fails with "Cannot mutate content repository descriptor 'Gradle Central Plugin Repository' after repository has been used"