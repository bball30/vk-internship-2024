package dev.vasilev.vkinternship.dto.user;

public record Address(String zipCode, Geo geo, String suite, String city, String street) {
}
