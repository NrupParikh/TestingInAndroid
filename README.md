# Truth Testing Lib
- Truth is a library for performing assertions in tests
https://truth.dev/

- Adds dependency for test source set
`testImplementation "com.google.truth:truth:1.1.3"`

- Adds dependency for androidTest source set
`androidTestImplementation "com.google.truth:truth:1.1.3"`

### <ins> Difference between implementation, testImplementation and androidTestImplementation </ins>

- **implementation**: The dependency is available in all source sets, including the test source sets.
- **testImplementation**: The dependency is only available in the test source set.
- **androidTestImplementation**: The dependency is only available in the androidTest source set.

# Source Sets
### A SourceSet represents a logical group of Java source and resource files.

- **main**: Contains your app code. This code is shared amongst all different versions of the app you can build (known as build variants)
- **androidTest**: Instrumented Unit Test. On Android Emulator
    - `androidTestImplementation** 'androidx.test.ext:junit:1.1.5'`
- **test**[unit Test]: on JVM. More faster then androidTest. Contains tests known as local tests.
    - `testImplementation** 'junit:junit:4.13.2'`


### **To generate the Test Case class**
<ins> Right click on object→Generate→Test→ select test or androidTest </ins>

- `@Test`
    - The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case. To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method.

- `@Before`
    - When writing tests, it is common to find that several tests need similar objects created before they can run. Annotating a public void method with @Before causes that method to be run before the Test method.

- `@After`
    - If you allocate external resources in a Before method you need to release them after the test runs. Annotating a public void method with @After causes that method to be run after the Test method. All @After methods are guaranteed to run even if a Before or Test method throws an exception.
    
# In Project
- RegistrationUtilTest in test [unitTest] : For validate userName, password, confirmedPassword.
- ResourceCompareTest in androidTest : For compare two string resource.
