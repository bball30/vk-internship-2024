package dev.vasilev.vkinternship.dto.user;

public record User(String website, Address address, String phone, String name,
                   Company company, Integer id, String email, String username) {
}
