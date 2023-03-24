package ru.uxair.flight.util.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.uxair.flight.entity.Dto.TicketDto;
import ru.uxair.flight.entity.Ticket;
@Component
public class TicketMapper {

    private final ModelMapper modelMapper;
    @Autowired
    public TicketMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public TicketDto convertToTicketDto(Ticket ticket){
        return modelMapper.map(ticket, TicketDto.class);
    }
    public Ticket convertToTicketEntity(TicketDto ticketDto){
        return modelMapper.map(ticketDto, Ticket.class);
    }
}
