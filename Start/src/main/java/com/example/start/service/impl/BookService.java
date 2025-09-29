package com.example.start.service.impl;

import com.example.start.model.Book;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BookService {

    /**
     * @param id The id of the hotel that we want to obtain
     * @return The hotel with the appropriate id
     * //* @throws InvalidHotelIdException when there is no hotel with the given id
     */
    Optional<Book> findById(Long id);

    /**
     * @return List of all hotel in the database
     */
    List<Book> listAll();

    /**
     * This method is used to create a new hotel, and save it in the database.
     *
     * @param title
     * @return The hotel that is created. The id should be generated when the hotel is created.
     */
    Book create(String title, String color);

    Book update(Long id, String title, String color);

    /**
     * @param id
     * @return The reservation that is deleted.
   //  * @throws InvalidReservationIdException when there is no reservation with the given id
     */
    Book delete(Long id);

}
