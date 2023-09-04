package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IClienteRepository;
import com.example.demo.repository.modelo.Cliente;

import jakarta.transaction.Transactional;

@Service
public class ClienteServiceImpl implements IClienteService{

	
	@Autowired
	private IClienteRepository clienteRepo;

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void registrarC( Cliente cliente) {		
		this.clienteRepo.insertar(cliente);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void actualizarC(Cliente cliente) {
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public Cliente encontrarC(Integer id) {
		return this.clienteRepo.buscar(id);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public void borrarC(Integer id) {
		this.clienteRepo.eliminar(id);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public Cliente encontrarPorCedula(String cedula) {
		return this.clienteRepo.encontrarPorCedula(cedula);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Cliente> encontrarPorCedulaList(String cedula) {
		return this.clienteRepo.encontrarPorCedulaList(cedula);
	}

	@Override
	@Transactional(value = Transactional.TxType.REQUIRED)
	public List<Cliente> buscarTodos() {
		return this.clienteRepo.encontrarTodos();
	}
	
}
