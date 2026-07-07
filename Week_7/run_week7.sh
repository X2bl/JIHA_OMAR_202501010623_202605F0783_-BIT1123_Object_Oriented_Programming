#!/bin/bash
# Compile and run Week_7 Java program
set -e
cd "$(dirname "$0")"
javac *.java
java Main
