<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">

<suit
    <listeners>
        <listener class-name="qReportPakage.IListnerReport"/>
    </listeners>

    <test name="regression">
        <classes>

            <class name="tests1.ManuTesting"/>
            <class name="tests1.SignInTesting"></class>
        </classes>
    </test>





