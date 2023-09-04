package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IVehiculoRepository;
import com.example.demo.repository.modelo.Reserva;
import com.example.demo.repository.modelo.Vehiculo;

import jakarta.transaction.Transactional;


@Service
public class VehiculoServiceImpl implements IVehiculoService{


	@Autowired
	private IVehiculoRepository iVehiculoRepo;

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void ingresarV(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.insertar(vehiculo);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void actualizarV(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.actualizar(vehiculo);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public Vehiculo buscarV(Integer id) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrar(id);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void borrarV(Integer id) {
		// TODO Auto-generated method stub
		this.iVehiculoRepo.eliminar(id);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> buscarVehiDisponibles() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrarVehiDisponibles();
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> buscarTodosVehi() {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrarTodosVehi();
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> buscarMarcaModelo(String marca, String modelo) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrarMarcaModelo(marca, modelo)
				;
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public Vehiculo encontrarPlaca(String placa) {
		return this.iVehiculoRepo.encontrarPlaca(placa);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> encontrarPlacaList(String placa) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrarPlacaList(placa);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> buscarVehiculoVip(String fecha) {
		// TODO Auto-generated method stub
		return this.iVehiculoRepo.encontrarVehiculoVip(fecha);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Vehiculo> buscarMarcayModeloList(String placa, String modelo) {
		return this.iVehiculoRepo.encontrarMarcayModeloList(placa, modelo);
	}

}
