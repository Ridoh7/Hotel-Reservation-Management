package com.ridoh.Hotel_Reservation_Management.service.Interface;

import com.ridoh.Hotel_Reservation_Management.dto.Response;
import com.ridoh.Hotel_Reservation_Management.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}