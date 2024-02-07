package com.epam.java8;

import java.util.Optional;

// this is class is mainly introduced to handle null values and avoid null pointer exceptions
// optional class is final class
public class OptionalDemo {
    public static void main(String[] args) {
        String email = "gpk@gmail.com";
        // provided empty optional
       Optional<String> emptyOptional =  Optional.empty();
        System.out.println(emptyOptional);
        // of provides a internal null check as it used Objects.nonNull
        Optional<String> emailOptional = Optional.of(email);
        System.out.println(emailOptional);
        // this gives null pointer exception if we pass null
//        Optional<String> emailOptional1 = Optional.of(null);
        // ofNullable-> if value is present it assigns otherwise assigns Optional.empty
        Optional<String> stringOptional = Optional.ofNullable(email);
        System.out.println(stringOptional);
        Optional<String> stringOptionalNull = Optional.ofNullable(null);
        System.out.println(stringOptionalNull);
        // get-> to retrieve value from optional
        String retrievedEmail = stringOptional.get();
        System.out.println(retrievedEmail);
        // if Optional.empty is present throws no such element found exception
//        System.out.println(stringOptionalNull.get());
        // isPresent -> returns true if not Optional.empty is present
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptionalNull.isPresent());
        // isEmpty-> opposite of isPresent
        System.out.println(stringOptionalNull.isEmpty());
        System.out.println(stringOptional.isEmpty());

        // orElse -> to assign default value if not present
        System.out.println(stringOptional.orElse("default@gmail.com"));
        System.out.println(stringOptionalNull.orElse("default@gmail.com"));

        // orElseGet -> takes a suppplier
        System.out.println(stringOptional.orElseGet(()->"default@gmail.com"));
        System.out.println(stringOptionalNull.orElseGet(()-> "default@gmail.com"));

        // orElseThrow -> takes an exception supplier
        System.out.println(stringOptional.orElseThrow(()-> new IllegalArgumentException("null present")));
//        System.out.println(stringOptionalNull.orElseThrow(()-> new IllegalArgumentException("null present")));

        // if present -> takes consumer
        stringOptional.ifPresent( s -> System.out.println("email available"));
        stringOptionalNull.ifPresent(s -> System.out.println("email not available"));

        // filter to perform check, takes predicate
        stringOptional.filter(s -> s.contains("gpk"))
                .ifPresent(s-> System.out.println(s));

        // map -> implements Function apply
        stringOptional.filter(s -> s.contains("gpk"))
                .map(s -> s.toUpperCase())
                .ifPresent(s-> System.out.println(s));
    }

}
