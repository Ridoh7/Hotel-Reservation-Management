package com.ridoh.Hotel_Reservation_Management.service.Interface;


import com.ridoh.Hotel_Reservation_Management.dto.LoginRequest;
import com.ridoh.Hotel_Reservation_Management.dto.Response;
import com.ridoh.Hotel_Reservation_Management.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}