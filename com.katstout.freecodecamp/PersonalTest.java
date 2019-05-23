package com.katstout.freecodecamp;

public class PersonalTest {

        public void shouldReturnHelloWorld(){
            Person marcus = new Person();
            assertEquals("Hello world", marcus.helloWorld() );
        }

        public void shouldReturnHelloMarcus(){
            Person person = new Person();
            assertEquals("Hello Marcus", person.hello("Marcus"));
        }
}
