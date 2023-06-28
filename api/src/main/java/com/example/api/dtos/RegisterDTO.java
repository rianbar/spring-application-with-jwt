package com.example.api.dtos;

import com.example.api.enums.RoleEnum;

public record RegisterDTO(String username, String password, RoleEnum role) {
}
