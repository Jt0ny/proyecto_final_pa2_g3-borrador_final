package com.example.demo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPagoRepository;
import com.example.demo.repository.modelo.Pago;
import com.example.demo.repository.modelo.Reserva;

import jakarta.transaction.Transactional;

@Service
public class PagoServiceImpl implements IPagoService{


	@Autowired
	private IPagoRepository iPagoRepo;

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void realizarPago(String numTarjeta,Reserva reserva) {
		Pago pago= new Pago();
		pago.setFecha(LocalDate.now());
		pago.setNumTarjeta(numTarjeta);
		pago.setReserva(reserva);

		this.iPagoRepo.insertar(pago);



	}
	
}
