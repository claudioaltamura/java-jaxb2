![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/claudioaltamura/java-jaxb2/ci.yml?branch=main)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# java-jaxb2
Java JAXB2 examples

## Solution 1

The generated sources are located in the `target/generated-sources/xjc` directory.
This is the default location for generated sources when using Maven with JAXB2.

## Solution 2

The generated sources are located in the `src/main` directory.
This maybe useful if you want to keep the generated sources in the same directory as your source code.

# Generate sources
To generate the sources, execute the following command:

```
    mvn clean compile
```