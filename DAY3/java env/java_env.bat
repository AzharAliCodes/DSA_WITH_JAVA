@echo off
cls
echo Setting up Java Virtual Environment...

:: Get the directory of the current batch file (java env folder)
set JAVA_ENV_DIR=%~dp0

:: Set the Java path for this virtual environment
set JAVA_HOME=%JAVA_ENV_DIR%jdk1.5.0_06
set PATH=%JAVA_HOME%\bin;%PATH%

:: Change to the workspace directory
cd "%JAVA_ENV_DIR%workspace"

echo Java Virtual Environment is now active.
cmd
